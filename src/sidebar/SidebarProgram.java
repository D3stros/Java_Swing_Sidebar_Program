package sidebar;

import elements.ButtonPaneUrl;
import elements.DigitalClock;

import javax.swing.*;
import java.awt.*;

public class SidebarProgram {

    JFrame sidebarJFrame = null;

    private final int SIDEBARWIDTH = 150;
    private final int SIDEBARHEIGHT = 600;

    private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    private DigitalClock digitalClock;
    private ButtonPaneUrl buttonPaneUrl;

    public SidebarProgram() {
        sidebarJFrame = new JFrame("Sidebar");
        sidebarJFrame.setSize(SIDEBARWIDTH, SIDEBARHEIGHT);
        sidebarJFrame.setResizable(false);
        sidebarJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        digitalClock = new DigitalClock();
        buttonPaneUrl = new ButtonPaneUrl();
        setLayout();

        sidebarJFrame.setVisible(true);
    }

    private void setLayout() {
        System.out.println("Breite vom Bildschirm" + dimension.width);
        System.out.println("Höhe vom Bildschirm" + dimension.height);

        sidebarJFrame.setLocation(dimension.width - SIDEBARWIDTH, 0);
        sidebarJFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        sidebarJFrame.getContentPane().add(digitalClock.getTimeLabel());
        sidebarJFrame.getContentPane().add(buttonPaneUrl.getButtonUrlJPanel());
    }

    public static void main(String[] args) {
    new SidebarProgram();
    }
}
