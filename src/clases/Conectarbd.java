
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectarbd {

    Connection con = null;
    String database = "usuarios";//nombre de la base datos
    String url = "jdbc:mysql://localhost/" + database + "?serverTimezone=UTC";

//nombre de usuario de la base datos
    String username = "root";

//contraseña de la base de datos
    String password = "root";

    public Connection Conectar() throws SQLException {

        con = DriverManager.getConnection(url, username, password);

        return con;
    }
}
