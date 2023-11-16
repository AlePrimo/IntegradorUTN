package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String URL = "jdbc:mariadb://localhost/";
    private static String DB = "IntegradorUTN";
    private static String USER = "root";
    private static String PSW = "";
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USER, PSW);

                JOptionPane.showMessageDialog(null, "Conexión exitosa");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error de carga de driver : " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión a la BD: " + ex.getMessage());
            }
        }
        return connection;
    }

}
