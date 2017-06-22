package view;

import controller.ButtonControl;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by joanfito on 20/6/17.
 */
public class ApplicationView extends JFrame{

    private JLabel jlMedallion;
    private JTextField jtfMedallion;
    private JLabel jlHackLicense;
    private JTextField jtfHackLicense;
    private JLabel jlVendorId;
    private JTextField jtfVendorId;
    private JLabel jlTarifa;
    private JTextField jtfTarifa;
    private JLabel jlStrFwd;
    private JTextField jtfStrFwd;
    private JLabel jlInici;
    private JTextField jtfInici;
    private JLabel jlFi;
    private JTextField jtfFi;
    private JLabel jlPassatgers;
    private JTextField jtfPassatgers;
    private JLabel jlTemps;
    private JTextField jtfTemps;
    private JLabel jlDistancia;
    private JTextField jtfDistancia;
    private JLabel jlLatInici;
    private JTextField jtfLatInici;
    private JLabel jlLonInici;
    private JTextField jtfLonInici;
    private JLabel jlLatFi;
    private JTextField jtfLatFi;
    private JLabel jlLonFi;
    private JTextField jtfLonFi;
    private JLabel jlDataRecollida;
    private JTextField jtfDataRecollida;
    private JLabel jlTipusPagament;
    private JTextField jtfTipusPagament;
    private JLabel jlPreu;
    private JTextField jtfPreu;
    private JLabel jlRecarrec;
    private JTextField jtfRecarrec;
    private JLabel jlTaxaMTA;
    private JTextField jtfTaxaMTA;
    private JLabel jlPropina;
    private JTextField jtfPropina;
    private JLabel jlPeatge;
    private JTextField jtfPeatge;
    private JLabel jlPreuTotal;
    private JTextField jtfPreuTotal;
    private JButton jbAfegir;

    public ApplicationView() {

        JPanel jpAux = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        jpAux.setBorder(new EmptyBorder(0,10,0,10));

        jlMedallion = new JLabel("Medallion: ");

        constraints.gridx = 0;
        constraints.gridy = 0;
        jpAux.add(jlMedallion, constraints);

        jlHackLicense = new JLabel("Hack license: ");

        constraints.gridy = 1;
        jpAux.add(jlHackLicense, constraints);

        jlVendorId = new JLabel("Vendor ID: ");

        constraints.gridy = 2;
        jpAux.add(jlVendorId, constraints);

        jlTarifa = new JLabel("Tarifa: ");

        constraints.gridy = 3;
        jpAux.add(jlTarifa, constraints);

        jlStrFwd = new JLabel("Store & Forward flag: ");

        constraints.gridy = 4;
        jpAux.add(jlStrFwd, constraints);

        jlInici = new JLabel("Inici: ");

        constraints.gridy = 5;
        jpAux.add(jlInici, constraints);

        jlFi = new JLabel("Fi: ");

        constraints.gridy = 6;
        jpAux.add(jlFi, constraints);

        jlPassatgers = new JLabel("Passatgers: ");

        constraints.gridy = 7;
        jpAux.add(jlPassatgers, constraints);

        jlTemps = new JLabel("Temps: ");

        constraints.gridy = 8;
        jpAux.add(jlTemps, constraints);

        jlDistancia = new JLabel("Distancia: ");

        constraints.gridy = 9;
        jpAux.add(jlDistancia, constraints);

        jlLatInici = new JLabel("Lat Inici: ");

        constraints.gridy = 10;
        jpAux.add(jlLatInici, constraints);

        jlLonInici = new JLabel("Lon Inici: ");

        constraints.gridy = 11;
        jpAux.add(jlLonInici, constraints);

        jlLatFi = new JLabel("Lat Fi: ");

        constraints.gridy = 12;
        jpAux.add(jlLatFi, constraints);

        jlLonFi = new JLabel("Lon Fi: ");

        constraints.gridy = 13;
        jpAux.add(jlLonFi, constraints);

        jlDataRecollida = new JLabel("Data recollida: ");

        constraints.gridy = 14;
        jpAux.add(jlDataRecollida, constraints);

        jlTipusPagament = new JLabel("Tipus pagament: ");

        constraints.gridy = 15;
        jpAux.add(jlTipusPagament, constraints);

        jlPreu = new JLabel("Preu: ");

        constraints.gridy = 16;
        jpAux.add(jlPreu, constraints);

        jlRecarrec = new JLabel("Recarrec: ");

        constraints.gridy = 17;
        jpAux.add(jlRecarrec, constraints);

        jlTaxaMTA = new JLabel("Taxa MTA: ");

        constraints.gridy = 18;
        jpAux.add(jlTaxaMTA, constraints);

        jlPropina = new JLabel("Propina: ");

        constraints.gridy = 19;
        jpAux.add(jlPropina, constraints);

        jlPeatge = new JLabel("Peatge: ");

        constraints.gridy = 20;
        jpAux.add(jlPeatge, constraints);

        jlPreuTotal = new JLabel("Preu total: ");

        constraints.gridy = 21;
        jpAux.add(jlPreuTotal, constraints);

        jtfMedallion = new JTextField();

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        jpAux.add(jtfMedallion, constraints);

        jtfHackLicense = new JTextField();

        constraints.gridy = 1;
        jpAux.add(jtfHackLicense, constraints);

        jtfVendorId = new JTextField();

        constraints.gridy = 2;
        jpAux.add(jtfVendorId, constraints);

        jtfTarifa = new JTextField();

        constraints.gridy = 3;
        jpAux.add(jtfTarifa, constraints);

        jtfStrFwd = new JTextField();

        constraints.gridy = 4;
        jpAux.add(jtfStrFwd, constraints);

        jtfInici = new JTextField();

        constraints.gridy = 5;
        jpAux.add(jtfInici, constraints);

        jtfFi = new JTextField();

        constraints.gridy = 6;
        jpAux.add(jtfFi, constraints);

        jtfPassatgers = new JTextField();

        constraints.gridy = 7;
        jpAux.add(jtfPassatgers, constraints);

        jtfTemps = new JTextField();

        constraints.gridy = 8;
        jpAux.add(jtfTemps, constraints);

        jtfDistancia = new JTextField();

        constraints.gridy = 9;
        jpAux.add(jtfDistancia, constraints);

        jtfLatInici = new JTextField();

        constraints.gridy = 10;
        jpAux.add(jtfLatInici, constraints);

        jtfLonInici = new JTextField();

        constraints.gridy = 11;
        jpAux.add(jtfLonInici, constraints);

        jtfLatFi = new JTextField();

        constraints.gridy = 12;
        jpAux.add(jtfLatFi, constraints);

        jtfLonFi = new JTextField();

        constraints.gridy = 13;
        jpAux.add(jtfLonFi, constraints);

        jtfDataRecollida = new JTextField();

        constraints.gridy = 14;
        jpAux.add(jtfDataRecollida, constraints);

        jtfTipusPagament = new JTextField();

        constraints.gridy = 15;
        jpAux.add(jtfTipusPagament, constraints);

        jtfPreu = new JTextField();

        constraints.gridy = 16;
        jpAux.add(jtfPreu, constraints);

        jtfRecarrec = new JTextField();

        constraints.gridy = 17;
        jpAux.add(jtfRecarrec, constraints);

        jtfTaxaMTA = new JTextField();

        constraints.gridy = 18;
        jpAux.add(jtfTaxaMTA, constraints);

        jtfPropina = new JTextField();

        constraints.gridy = 19;
        jpAux.add(jtfPropina, constraints);

        jtfPeatge = new JTextField();

        constraints.gridy = 20;
        jpAux.add(jtfPeatge, constraints);

        jtfPreuTotal = new JTextField();

        constraints.gridy = 21;
        jpAux.add(jtfPreuTotal, constraints);

        jbAfegir = new JButton("Afegir");

        this.getContentPane().add(new JScrollPane(jpAux));
        this.getContentPane().add(jbAfegir, BorderLayout.SOUTH);
        this.setSize(new Dimension(500,500));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Insercio dades");
    }

    public void linkController(ButtonControl controller) {
        jbAfegir.addActionListener(controller);
    }

    public String getJtfMedallion() {
        return jtfMedallion.getText();
    }

    public void setJtfMedallion(String jtfMedallion) {
        this.jtfMedallion.setText(jtfMedallion);
    }

    public String getJtfHackLicense() {
        return jtfHackLicense.getText();
    }

    public void setJtfHackLicense(String jtfHackLicense) {
        this.jtfHackLicense.setText(jtfHackLicense);
    }

    public String getJtfVendorId() {
        return jtfVendorId.getText();
    }

    public void setJtfVendorId(String jtfVendorId) {
        this.jtfVendorId.setText(jtfVendorId);
    }

    public String getJtfTarifa() {
        return jtfTarifa.getText();
    }

    public void setJtfTarifa(String jtfTarifa) {
        this.jtfTarifa.setText(jtfTarifa);
    }

    public String getJtfStrFwd() {
        return jtfStrFwd.getText();
    }

    public void setJtfStrFwd(String jtfStrFwd) {
        this.jtfStrFwd.setText(jtfStrFwd);
    }

    public String getJtfInici() {
        return jtfInici.getText();
    }

    public void setJtfInici(String jtfInici) {
        this.jtfInici.setText(jtfInici);
    }

    public String getJtfFi() {
        return jtfFi.getText();
    }

    public void setJtfFi(String jtfFi) {
        this.jtfFi.setText(jtfFi);
    }

    public String getJtfPassatgers() {
        return jtfPassatgers.getText();
    }

    public void setJtfPassatgers(String jtfPassatgers) {
        this.jtfPassatgers.setText(jtfPassatgers);
    }

    public String getJtfTemps() {
        return jtfTemps.getText();
    }

    public void setJtfTemps(String jtfTemps) {
        this.jtfTemps.setText(jtfTemps);
    }

    public String getJtfDistancia() {
        return jtfDistancia.getText();
    }

    public void setJtfDistancia(String jtfDistancia) {
        this.jtfDistancia.setText(jtfDistancia);
    }

    public String getJtfLatInici() {
        return jtfLatInici.getText();
    }

    public void setJtfLatInici(String jtfLatInici) {
        this.jtfLatInici.setText(jtfLatInici);
    }

    public String getJtfLonInici() {
        return jtfLonInici.getText();
    }

    public void setJtfLonInici(String jtfLonInici) {
        this.jtfLonInici.setText(jtfLonInici);
    }

    public String getJtfLatFi() {
        return jtfLatFi.getText();
    }

    public void setJtfLatFi(String jtfLatFi) {
        this.jtfLatFi.setText(jtfLatFi);
    }

    public String getJtfLonFi() {
        return jtfLonFi.getText();
    }

    public void setJtfLonFi(String jtfLonFi) {
        this.jtfLonFi.setText(jtfLonFi);
    }

    public String getJtfDataRecollida() {
        return jtfDataRecollida.getText();
    }

    public void setJtfDataRecollida(String jtfDataRecollida) {
        this.jtfDataRecollida.setText(jtfDataRecollida);
    }

    public String getJtfTipusPagament() {
        return jtfTipusPagament.getText();
    }

    public void setJtfTipusPagament(String jtfTipusPagament) {
        this.jtfTipusPagament.setText(jtfTipusPagament);
    }

    public String getJtfPreu() {
        return jtfPreu.getText();
    }

    public void setJtfPreu(String jtfPreu) {
        this.jtfPreu.setText(jtfPreu);
    }

    public String getJtfRecarrec() {
        return jtfRecarrec.getText();
    }

    public void setJtfRecarrec(String jtfRecarrec) {
        this.jtfRecarrec.setText(jtfRecarrec);
    }

    public String getJtfTaxaMTA() {
        return jtfTaxaMTA.getText();
    }

    public void setJtfTaxaMTA(String jtfTaxaMTA) {
        this.jtfTaxaMTA.setText(jtfTaxaMTA);
    }

    public String getJtfPropina() {
        return jtfPropina.getText();
    }

    public void setJtfPropina(String jtfPropina) {
        this.jtfPropina.setText(jtfPropina);
    }

    public String getJtfPeatge() {
        return jtfPeatge.getText();
    }

    public void setJtfPeatge(String jtfPeatge) {
        this.jtfPeatge.setText(jtfPeatge);
    }

    public String getJtfPreuTotal() {
        return jtfPreuTotal.getText();
    }

    public void setJtfPreuTotal(String jtfPreuTotal) {
        this.jtfPreuTotal.setText(jtfPreuTotal);
    }
}
