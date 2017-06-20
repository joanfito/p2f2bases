package controller;

import model.utils.ConnectionHelper;
import view.ApplicationView;
import view.CreateView;
import view.LogView;
import view.MenuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by joanfito on 20/4/17.
 */
public class ButtonControl implements ActionListener{

    private static final String DB_NAME = "OLTP_fase1";
    private LogView logView;
    private MenuView menuView;
    private CreateView createView;
    private ApplicationView applicationView;
    private ConnectionHelper helper;

    public ButtonControl(LogView logView) {
        this.logView = logView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        switch (button) {
            case "Connectar":
                if(logUser(logView.getJtfNomUsuari(), logView.getJtfContrasenya())) {
                    menuView = new MenuView();

                    menuView.linkController(this);
                    logView.setVisible(false);
                    menuView.setVisible(true);

                    logView.setJtfNomUsuari("");
                    logView.setJtfContrasenya("");

                } else {
                    JOptionPane.showMessageDialog(null, "Credencials incorrectes",
                            "Error", JOptionPane.ERROR_MESSAGE);

                    helper.disconnect();
                }
                break;

            case "Crea usuari":
                createView = new CreateView();
                createView.linkController(this);
                menuView.setVisible(false);

                createView.setVisible(true);

                break;

            case "Insereix dades":
                applicationView = new ApplicationView();

                applicationView.linkController(this);
                menuView.setVisible(false);
                applicationView.setVisible(true);
                break;

            case "Afegir":
                if(addData(applicationView.getJtfMedallion(), applicationView.getJtfHackLicense(),
                        applicationView.getJtfVendorId(), applicationView.getJtfTarifa(),
                        applicationView.getJtfStrFwd(), applicationView.getJtfInici(),
                        applicationView.getJtfFi(), applicationView.getJtfPassatgers(),
                        applicationView.getJtfTemps(), applicationView.getJtfDistancia(),
                        applicationView.getJtfLatInici(), applicationView.getJtfLonInici(),
                        applicationView.getJtfLatFi(), applicationView.getJtfLonFi(),
                        applicationView.getJtfDataRecollida(),applicationView.getJtfTipusPagament(),
                        applicationView.getJtfPreu(), applicationView.getJtfRecarrec(),
                        applicationView.getJtfTaxaMTA(), applicationView.getJtfPropina(),
                        applicationView.getJtfPeatge(), applicationView.getJtfPreuTotal())) {

                    applicationView.setVisible(false);
                    menuView.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error a l'inserir",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }

                break;


            case "Crear":
                if(createUser(createView.getJtfNomUsuari(), createView.getJtfContrasenya())) {
                    //menuView = new MenuView();

                    menuView.linkController(this);
                    createView.setVisible(false);
                    menuView.setVisible(true);

                    createView.setJtfNomUsuari("");
                    createView.setJtfContrasenya("");
                } else {
                    JOptionPane.showMessageDialog(null, "No s'ha creat l'usuari",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }

    private boolean logUser(String user, String password) {
        boolean ok = false;

        helper = ConnectionHelper.getInstance(user, password, DB_NAME, 3306);
        ok = helper.connect();

        return ok;
    }

    private boolean createUser(String user, String password) {
        boolean ok = false;

        StringBuilder createQuery = new StringBuilder();

        createQuery.append("CREATE USER ");
        createQuery.append(user);
        createQuery.append("@localhost IDENTIFIED BY '");
        createQuery.append(password);
        createQuery.append("'");

        StringBuilder grantQuery = new StringBuilder();

        grantQuery.append("GRANT ALL ON OLTP_fase1.* TO ");
        grantQuery.append(user);
        grantQuery.append("@localhost;\nGRANT CREATE USER ON *.* TO ");
        grantQuery.append(user);
        grantQuery.append("@localhost");

        System.out.println("Query: "+ grantQuery.toString());


        try {
            if(helper != null) {

                helper.insertQuery(createQuery.toString());
                helper.insertQuery(grantQuery.toString());

                ok = true;
            }
        } catch (SQLException e) {
            ok = false;
        }

        return ok;
    }

    private boolean addData(String medallion, String hackLicense, String vendorId, String tarifa,
                            String strAndFwd, String inici, String fi, String passatgers, String temps,
                            String distancia, String latInici, String lonInici, String latFinal, String lonFinal,
                            String dataRecollida, String tipusPagament, String preu, String recarrec,
                            String taxaMTA, String propina, String peatge, String preuTotal) {
        boolean ok = false;

        StringBuilder addQuery = new StringBuilder();

        addQuery.append("call insercio('");
        addQuery.append(medallion);
        addQuery.append("','");
        addQuery.append(hackLicense);
        addQuery.append("','");
        addQuery.append(vendorId);
        addQuery.append("','");
        addQuery.append(tarifa);
        addQuery.append("','");
        addQuery.append(strAndFwd);
        addQuery.append("','");
        addQuery.append(inici);
        addQuery.append("','");
        addQuery.append(fi);
        addQuery.append("','");
        addQuery.append(passatgers);
        addQuery.append("','");
        addQuery.append(temps);
        addQuery.append("','");
        addQuery.append(distancia);
        addQuery.append("','");
        addQuery.append(latInici);
        addQuery.append("','");
        addQuery.append(lonInici);
        addQuery.append("','");
        addQuery.append(latFinal);
        addQuery.append("','");
        addQuery.append(lonFinal);
        addQuery.append("','");
        addQuery.append(dataRecollida);
        addQuery.append("','");
        addQuery.append(tipusPagament);
        addQuery.append("','");
        addQuery.append(preu);
        addQuery.append("','");
        addQuery.append(recarrec);
        addQuery.append("','");
        addQuery.append(taxaMTA);
        addQuery.append("','");
        addQuery.append(propina);
        addQuery.append("','");
        addQuery.append(peatge);
        addQuery.append("','");
        addQuery.append(preuTotal);
        addQuery.append("')");

        try {
            if(helper != null) {
                helper.insertQuery("use "+ DB_NAME);
                helper.insertQuery(addQuery.toString());

                ok = true;
            }
        } catch (SQLException e) {
            ok = false;
        }

        return ok;
    }
}
