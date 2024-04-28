package view;

import javax.swing.*;
import java.awt.*;

public class ColorDisplaySide extends JPanel {

    private JPanel colorDisplay;

    public ColorDisplaySide() {
        initComponents();
    }

    private void initComponents() {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        setLayout(new BorderLayout());

        colorDisplay = new JPanel();
        colorDisplay.setBackground(Color.yellow);

        add(colorDisplay, BorderLayout.CENTER);
    }

    public void setColor(Color color) {
        colorDisplay.setBackground(color);
    }
}
