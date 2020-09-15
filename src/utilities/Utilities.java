package utilities;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Utilities {

    public static void openUrl(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL("https://" + urlString+ "/").toURI());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "URL unknown");
            e.printStackTrace();
        }

    }
}
