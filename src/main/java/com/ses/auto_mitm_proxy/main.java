package com.ses.auto_mitm_proxy;


import com.formdev.flatlaf.FlatDarkLaf;
import com.ses.auto_mitm_proxy.ui.UI1;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import viewmodel.ErrorDialog;

public class main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( UnsupportedLookAndFeelException e ) {
            ErrorDialog.showError("Hata olustu");
            System.out.println(e);
        }
        
        // Pencereyi oluştur ve görünür hale getir
        java.awt.EventQueue.invokeLater(() -> {
            UI1 ui = new UI1();
            ui.setVisible(true);
            
            ui.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent windowEvent) {
                    
                }
            });
        });
    }
    
}
