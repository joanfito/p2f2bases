package model.utils;

import java.sql.*;

/**
 * Created by joanfito on 19/6/17.
 */
public class ConnectionHelper {

    private String username;
    private String password;
    private String db;
    private int port;
    private String url;
    private Connection conn = null;
    private static ConnectionHelper instance = null;

    private ConnectionHelper(String username, String password, String db, int port) {
        this.url = "jdbc:mysql://localhost:3306/";
        this.username = username;
        this.password = password;
        this.db = db;
        this.port = port;
        this.url += db;
    }

    public static ConnectionHelper getInstance(String userName, String password, String db, int port) {
        if(instance == null) instance = new ConnectionHelper(userName, password, db, port);

        return instance;
    }

    public boolean connect() {
        try {
            Class.forName("com.mysql.jdbc.Connection");

            conn = (Connection) DriverManager.getConnection(url, username, password);

            if (conn != null) {
                System.out.println("Conexio a base de dades "+url+" ... Ok");
                return true;

            } else return false;

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println("Problema al connecta-nos a la BBDD --> "+url);
            e.printStackTrace();
            return false;
        }
    }

    public void insertQuery(String query) throws SQLException{
        Statement s = null;

        s = conn.createStatement();
        s.executeUpdate(query);
    }

    public ResultSet selectQuery(String query) throws SQLException{
        ResultSet rs = null;
        Statement s = null;

        s = conn.createStatement();
        rs = s.executeQuery (query);

        return rs;
    }

    public void disconnect(){
        try {
            if(conn != null) conn.close();
            instance = null;

        } catch (SQLException e) {
            System.out.println("Problema al tancar la connexi� --> " + e.getSQLState());
        }
    }
}
