package model;

import java.io.File;
import javax.swing.JFileChooser;

public class FileOperations {
    
    public String fileChooser() {
        
        // Dosya seçiciyi oluşturuyoruz.
        JFileChooser fileChooser = new JFileChooser();

        // Sadece dizinleri seçmesini sağlıyoruz.
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Dosya seçici penceresini açıyoruz ve kullanıcının seçimini alıyoruz.
        int returnValue = fileChooser.showOpenDialog(null);

        // Kullanıcı bir dosya seçtiyse devam ediyoruz.
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        } else {
            return null;
        }
    }
    
}
