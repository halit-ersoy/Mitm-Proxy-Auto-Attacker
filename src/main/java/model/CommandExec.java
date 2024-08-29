package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import viewmodel.ErrorDialog;

public class CommandExec extends Thread {
    
    private DataListener dataListener;
    Process process;
    private final String rootPass;
    private String command;
    
    public CommandExec(String rootPass, String command){
        this.rootPass = rootPass;
        this.command = command;
    }
    
    public void setDataListener(DataListener dataListener) {
        this.dataListener = dataListener;
    }
    
    @Override
    public void run() {
        exec();
    }
    
    public void stopExec(String stopCommandGrep) {
        try {
            String stopCommand = "ps -ef | grep " + stopCommandGrep;
            
            if (!"".equals(rootPass) && rootPass != null){
                stopCommand = "echo " + rootPass + " | sudo -S " + stopCommand;
            }
            
            // 1. Komutu çalıştır: ps -ef | grep resources/py/mitm.py
            ProcessBuilder psProcessBuilder = new ProcessBuilder("bash", "-c", stopCommand);
            Process psProcess = psProcessBuilder.start();

            // Çıktıyı oku
            BufferedReader reader = new BufferedReader(new InputStreamReader(psProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                // 2. PID'yi alma
                if (!line.contains("grep")) { // grep sürecini hariç tut
                    String[] tokens = line.split("\\s+");
                    String pid = tokens[1]; // PID ikinci sütunda olur genellikle
                    System.out.println("Bulunan PID: " + pid);

                    // 3. Süreci sonlandırma: kill komutunu çalıştır
                    ProcessBuilder killProcessBuilder = new ProcessBuilder("bash", "-c", "kill " + pid);
                    Process killProcess = killProcessBuilder.start();
                    killProcess.waitFor(); // Komutun tamamlanmasını bekle
                    System.out.println("PID " + pid + " başarıyla sonlandırıldı.");
                }
            }

            int exitCode = psProcess.waitFor();
            System.out.println("ps komutunun çıkış kodu: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void exec() {
        
        if (!"".equals(rootPass) && rootPass != null){
            command = "echo " + rootPass + " | sudo -S " + command;
        }
        
        try {
            // ProcessBuilder kullanarak komutu çalıştır
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("bash", "-c", command);

            // Komutu çalıştır ve sonucu al
            process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                if (dataListener != null) {
                    dataListener.onOutput(line);
                }
            }

            // Hata akışını kontrol et
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errorReader.readLine()) != null) {
                System.err.println(line); // Hata mesajlarını yazdır
            }

            int exitCode = process.waitFor(); // Komutun bitmesini bekle
            System.out.println("\nKomut çıkış kodu: " + exitCode);

        } catch (IOException | InterruptedException e) {
            ErrorDialog.showError("Hata olustu");
        }
    }
}
