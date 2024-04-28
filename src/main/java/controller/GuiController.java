package controller;
import view.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.ButtonConstants;

public class GuiController implements ActionListener {

    GUI gui;

    public GuiController(GUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int colorIndex = gui.getButtonsSide().getButtonsDisplayed().indexOf(e.getSource());
        gui.getColorDisplaySide().setColor(ButtonConstants.BUTTON_COLORS[colorIndex]);
    }
}
