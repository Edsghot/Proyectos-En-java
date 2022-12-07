import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexion {
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/adminitracioncomputadoras";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	
	
	
	static {
		try {
			Class.forName(CONTROLADOR);
		}catch(ClassNotFoundException e){
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}

	public static Connection conectar() {
		Connection conexion = null;
		
		try {
			
			conexion = (Connection) DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexi�n OK");

		}catch (SQLException e) {
			System.out.println("Error en la conexi�n");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	
	
	
}
