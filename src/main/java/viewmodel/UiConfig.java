package viewmodel;

import java.awt.Container;
import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;
import model.WriteArgs;
import org.json.JSONObject;

public class UiConfig {
    
    public void visibleChanger(JCheckBox url_checkbox, Container[] url_textfield, Boolean mode){
        if (url_checkbox.isSelected()){
            for(Container textfield: url_textfield){
                textfield.setEnabled(mode);
            }
        }else{
            for(Container textfield: url_textfield){
                textfield.setEnabled(!mode);
            }
        }
    }
    
    public void startVisible(Container[] view, Boolean visible){
        for (Container cont : view){
            cont.setEnabled(visible);
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
    
    public void writeFileArgs(String[] urls, String argsPath) {
        WriteArgs write = new WriteArgs();

        // Boş olan URL'leri "disable" olarak ayarlayın
        for (int i = 0; i < urls.length; i++) {
            if (urls[i].isEmpty()) {
                urls[i] = "disable";
            }
        }
        // JSON verilerini oluştur
        JSONObject json = new JSONObject();
        json.put("url1", urls[0]);
        json.put("url2", urls[1]);
        json.put("url3", urls[2]);
        json.put("url4", urls[3]);
        json.put("url5", urls[4]);
        json.put("url6", urls[5]);
        // URLs'i dosyaya yaz
        write.writeArgs(json.toString(4), argsPath);
    }
    
    public void writeUrlArgs(String[] urls, String argsPath, boolean all, String allTargetUrl) {
        WriteArgs write = new WriteArgs();

        // Boş olan URL'leri "disable" olarak ayarlayın
        for (int i = 0; i < urls.length; i++) {
            if (urls[i].isEmpty()) {
                urls[i] = "disable";
            }
        }

        // all parametresi ve hedef URL'yi oluşturun
        String allParam = all ? "true,," + allTargetUrl : "false";

        // JSON verilerini oluştur
        JSONObject json = new JSONObject();
        json.put("all", allParam);
        json.put("url1", urls[0]);
        json.put("url2", urls[1]);
        json.put("url3", urls[2]);
        json.put("url4", urls[3]);
        json.put("url5", urls[4]);
        json.put("url6", urls[5]);
        
        // URLs'i dosyaya yaz
        write.writeArgs(json.toString(4), argsPath);
    }
    
    public Boolean startFileControl(String[] urls, Boolean[] checkBoxBool, String[] ipElements) {
        if (Arrays.stream(urls).noneMatch(url -> !url.isEmpty())) {
            ErrorDialog.showError("En az bir yönlendirme URL'si giriniz.");
            return false;
        }

        if (Arrays.stream(checkBoxBool).noneMatch(Boolean::booleanValue)) {
            ErrorDialog.showError("En az bir yönlendirme URL'sini aktif ediniz.");
            return false;
        }

        if (Arrays.stream(ipElements).anyMatch(String::isEmpty)) {
            ErrorDialog.showError("Boş girdi bırakmayınız.");
            return false;
        }

        return true;
    }
    
    public Boolean startUrlControl(
        String[] ipElements,
        Boolean redirectAllUrlsBool,
        String redirectAllUrl,
        Boolean[] enableRedirect,
        String[] sourceUrls,
        String[] redirectUrls
    ) {
        if (Arrays.stream(ipElements).anyMatch(String::isEmpty)) {
            ErrorDialog.showError("Boş girdi bırakmayınız.");
            return false;
        }

        if (redirectAllUrlsBool) {
            if (redirectAllUrl.isEmpty()) {
                ErrorDialog.showError("Tüm URL'leri yönlendirme seçeneği aktifse yönlendirme URL'si boş olamaz.");
                return false;
            }
        } else {
            boolean atLeastOneRedirectCheckbox = Arrays.stream(enableRedirect).anyMatch(Boolean::booleanValue);
            if (!atLeastOneRedirectCheckbox) {
                ErrorDialog.showError("En az bir yönlendirme URL'si aktif olmalıdır.");
                return false;
            }

            for (int i = 0; i < enableRedirect.length; i++) {
                if (enableRedirect[i] && (sourceUrls[i].isEmpty() || redirectUrls[i].isEmpty())) {
                    ErrorDialog.showError("Aktif yönlendirme URL'leri boş olamaz.");
                    return false;
                }
            }
        }

        return true;
    }
    
    public String extractIPAddresses(String input) {
        StringBuilder ipAddresses = new StringBuilder();
        Pattern ipPattern = Pattern.compile("\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b");
        Matcher matcher = ipPattern.matcher(input);

        while (matcher.find()) {
            if (ipAddresses.length() > 0) {
                ipAddresses.append(",");
            }
            ipAddresses.append(matcher.group());
        }

        return ipAddresses.toString();
    }
    
    public String extractServerUrls(String input) {
        // Regex to match the URLs with http or https
        String urlPattern = "https?://[\\d.]+:\\d+";
        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(input);

        List<String> urls = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            urls.add(matcher.group());
        }

        // Join the URLs in the required format
        return String.join(",", urls);
    }

    public String getPath(String file) {
        return new File(file).getAbsolutePath();
    }
    
}
