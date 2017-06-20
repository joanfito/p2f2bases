package view;

import controller.ButtonControl;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by joanfito on 20/4/17.
 */
public class CreateView extends JFrame{

    private JLabel jlNomUsuari;
    private JTextField jtfNomUsuari;
    private JLabel jlContrasenya;
    private JPasswordField jtfContrasenya;
    private JButton jbCrear;

    public CreateView() {
        JPanel jpAux = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        jpAux.setBorder(new EmptyBorder(0,10,0,10));

        jlNomUsuari = new JLabel("Nom usuari: ");

        constraints.gridx = 0;
        constraints.gridy = 0;
        jpAux.add(jlNomUsuari, constraints);

        jlContrasenya = new JLabel("Contrasenya: ");

        constraints.gridy = 1;
        jpAux.add(jlContrasenya, constraints);

        jtfNomUsuari = new JTextField();

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        jpAux.add(jtfNomUsuari, constraints);

        jtfContrasenya = new JPasswordField();

        constraints.gridy = 1;
        jpAux.add(jtfContrasenya, constraints);

        jbCrear = new JButton("Crear");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.LINE_END;
        jpAux.add(jbCrear, constraints);

        this.getContentPane().add(jpAux);
        this.setSize(new Dimension(500,150));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Creacio d'usuari");
    }

    public void linkController(ButtonControl controller) {
        jbCrear.addActionListener(controller);
    }

    public String getJtfNomUsuari() {
        return jtfNomUsuari.getText();
    }

    public void setJtfNomUsuari(String nomUsuari) {
        this.jtfNomUsuari.setText(nomUsuari);
    }

    public String getJtfContrasenya() {
        return jtfContrasenya.getText();
    }

    public void setJtfContrasenya(String contrasenya) {
        this.jtfContrasenya.setText(contrasenya);
    }
}
