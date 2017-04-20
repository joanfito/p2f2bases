package view;

import controller.ButtonControl;

import javax.swing.*;
import java.awt.*;

/**
 * Created by joanfito on 20/4/17.
 */
public class MenuView extends JFrame {

    private JButton jbCrearUsuari;
    private JButton jbInserirDades;

    public MenuView() {
        this.getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        jbCrearUsuari = new JButton("Crea usuari");

        constraints.gridx = 0;
        constraints.gridy = 0;
        this.getContentPane().add(jbCrearUsuari, constraints);

        jbInserirDades = new JButton("Insereix dades");
        constraints.gridy = 1;
        this.getContentPane().add(jbInserirDades, constraints);

        this.setSize(new Dimension(500,200));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Menu");
    }

    public void linkController(ButtonControl controller) {
        jbCrearUsuari.addActionListener(controller);
        jbInserirDades.addActionListener(controller);
    }
}
