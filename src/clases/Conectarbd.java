package clases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectarbd {

    Connection con = null;
    String database = "postulante";//nombre de la base datos
    String url = "jdbc:oracle:thin:@//localhost:1521/orcl";

//nombre de usuario de la base datos
    String username = "postulante";

//contraseña de la base de datos
    String password = "postulante";

    public Connection Conectar() throws SQLException {

        con = DriverManager.getConnection(url, username, password);

        return con;
    }
}
