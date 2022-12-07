import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestConexion {
	
	public static void main(String[] args) {
		Conexion conexion1 = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion1.conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("SELECT * FROM usuarios");
			
			while(rs.next()) {
				String idUsuario = rs.getString(1);
				String usuario = rs.getString(2);
				String clave = rs.getString(3);
				String rol = rs.getString(4);
				System.out.println("Idusuario: "+idUsuario+"\nUsuario: "+usuario+"\nClave: "+clave+"\nRol: "+rol);
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
