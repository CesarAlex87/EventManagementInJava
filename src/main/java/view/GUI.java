package view;

import controller.GuiController;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private ButtonsSide buttonsSide;
    private ColorDisplaySide colorDisplaySide;

    public GUI() {
        initComponents();
    }

    private void initComponents() {
        GuiController guiController = new GuiController(this);
        this.setSize(800, 600);
        JPanel contentPane = new JPanel(new GridLayout(1, 2));
        this.setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);

        buttonsSide = new ButtonsSide(guiController);
        colorDisplaySide = new ColorDisplaySide();

        contentPane.add(buttonsSide);
        contentPane.add(colorDisplaySide);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public ButtonsSide getButtonsSide() {
        return buttonsSide;
    }

    public ColorDisplaySide getColorDisplaySide() {
        return colorDisplaySide;
    }
}
