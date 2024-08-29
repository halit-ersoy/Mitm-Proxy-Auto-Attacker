package viewmodel;

import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UiConfig {
    
    public void rootPassConf(JCheckBox root_pass_checkbox, JPasswordField root_pass_textfield){
        if (root_pass_checkbox.isSelected()){
            root_pass_textfield.setText("");
            root_pass_textfield.setEnabled(true);
        }else{
            root_pass_textfield.setText("");
            root_pass_textfield.setEnabled(false);
        }
    }
    
    public void urlConf(JCheckBox enable_url_1_checkbox, JTextField enable_url_1_textfield){
        if (enable_url_1_checkbox.isSelected()){
            enable_url_1_textfield.setEnabled(true);
        }else{
            enable_url_1_textfield.setEnabled(false);
        }
    }
    
    public int subnetMaskCalculation(String subnetMask){
        String[] parts = subnetMask.split("\\.");
        int cidr = 0;

        for (String part : parts) {
            int octet = Integer.parseInt(part);
            cidr += Integer.bitCount(octet);
        }

        return cidr;
    }
    
}
