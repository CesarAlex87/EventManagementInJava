package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import controller.GuiController;
import utils.ButtonConstants;
import model.Button;

public class ButtonsSide extends JPanel {

    private final GuiController guiController;
    private ArrayList<JButton> buttonsDisplayed;

    public ButtonsSide(GuiController guiController) {
        this.guiController = guiController;
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(5, 2));
        buttonsDisplayed = new ArrayList<>();

        for (int i = 0; i < ButtonConstants.BUTTON_NAMES.length; i++) {
            Button button = new Button(ButtonConstants.BUTTON_NAMES[i], ButtonConstants.BUTTON_COLORS[i]);

            JButton newButton = new JButton(button.getName());
            newButton.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.WHITE, 6),
                    BorderFactory.createEmptyBorder(5, 5, 10, 10)));

            newButton.addActionListener(guiController);
            buttonsDisplayed.add(newButton);
            add(newButton);
        }
    }

    public ArrayList<JButton> getButtonsDisplayed() {
        return buttonsDisplayed;
    }

    public void setButtonsDisplayed(ArrayList<JButton> buttonsDisplayed) {
        this.buttonsDisplayed = buttonsDisplayed;
    }
}
