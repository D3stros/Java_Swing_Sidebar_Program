package elements;

import listener.UrlOpenerListener;
import model.IconButton;

import javax.swing.*;
import java.awt.*;

public class ButtonPaneUrl {

    private JPanel buttonUrlJPanel;

    private final String[] iconStrings = {"facebook", "twitter", "amazon", "youtube"};

    public ButtonPaneUrl() {
        buttonUrlJPanel = new JPanel();
        Container panel;
        BoxLayout boxLayout = new BoxLayout(buttonUrlJPanel, BoxLayout.PAGE_AXIS);
        buttonUrlJPanel.setLayout(boxLayout);

        for(String iconName : iconStrings) {
            IconButton iconButton = new IconButton(iconName, "1", iconName);

            iconButton.addMouseListener(new UrlOpenerListener());

            buttonUrlJPanel.add(iconButton);
        }

    }

    public JPanel getButtonUrlJPanel() {
        return buttonUrlJPanel;
    }

    public void setButtonUrlJPanel(JPanel buttonUrlJPanel) {
        this.buttonUrlJPanel = buttonUrlJPanel;
    }

}
