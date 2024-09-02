package model;

import java.io.FileWriter;
import java.io.IOException;
import viewmodel.ErrorDialog;

public class WriteArgs {
    public void writeArgs(String data, String argsPath){
        // JSON verilerini args.json dosyasına yaz
        try (FileWriter file = new FileWriter(argsPath)) {
            file.write(data);  // JSON verilerini 4 boşluk ile girintile
            file.flush();
            System.out.println("JSON verileri başarıyla yazıldı.");
        } catch (IOException e) {
            ErrorDialog.showError("Hata olustu");
        }
    }
}
