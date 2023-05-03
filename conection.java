import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conection {
    // URL de la base de datos y credenciales de acceso
    static final String URL = "jdbc:mysql://localhost:3306/rentcarlondra";
    static final String USUARIO = "root";
    static final String CONTRASENA = "";

    public static void main(String[] args) {
        Connection conexion = null;

        try {
            // Registra el controlador JDBC com.mysql.cj.jdbc.Driver
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");

            // Establece la conexión a la base de datos
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

            // Imprime un mensaje si la conexión se ha establecido con éxito
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos Siuuuuuuu!");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha encontrado el controlador JDBC: " + e.getMessage());
        } finally {
            // Cierra la conexión a la base de datos
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión a la base de datos: " + e.getMessage());
            }
        }
    }
}
