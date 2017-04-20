package controller;

import view.CreateView;
import view.LogView;
import view.MenuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by joanfito on 20/4/17.
 */
public class ButtonControl implements ActionListener{

    private LogView logView;
    private MenuView menuView;
    private CreateView createView;

    public ButtonControl(LogView logView) {
        this.logView = logView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        switch (button) {
            case "Connectar":
                if(logUser()) {
                    menuView = new MenuView();
                    menuView.linkController(this);
                    logView.setVisible(false);
                    menuView.setVisible(true);
                } else JOptionPane.showMessageDialog(null, "Credencials incorrectes",
                        "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case "Crea usuari":
                createView = new CreateView();
                createView.linkController(this);
                menuView.setVisible(false);
                createView.setVisible(true);
                break;
            case "Insereix dades":
                break;
            case "Crea":
                break;
        }
    }

    private boolean logUser() {
        boolean ok = false;

        //if()
        return ok;
    }
}
