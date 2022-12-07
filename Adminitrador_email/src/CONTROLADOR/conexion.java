package CONTROLADOR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class conexion {
	Connection cn;
	
	public void conexion() {
		String url = "jdbc:sqlite:src\\BBDA\\data.db";
		
		try {
			cn = DriverManager.getConnection(url);
			if(cn != null) {
			}
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, ex.toString());
		}
	}
	public static void main(String[] args) {
		
		conexion co = new conexion();
		co.conexion();
		
	}
	
	public void registrarCuenta(int n,String nombre,String apellidos,String correo,String password){
		try{
			PreparedStatement ps = cn.prepareStatement("insert into cuenta values(?,?,?,?,?)");
			ps.setInt(1, n++);
			ps.setString(2,nombre);
			ps.setString(3,apellidos);
			ps.setString(4,correo);
			ps.setString(5,password);
			ps.executeUpdate();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	
	public void eliminarCuenta(String correo) {
		try {
			PreparedStatement ps = cn.prepareStatement("DELETE FROM cuenta WHERE correo = ?");
			ps.setString(1, correo);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "fue eliminado correctamente");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public void eliminarCuenta2(int id) {
		try {
			PreparedStatement ps = cn.prepareStatement("DELETE FROM cuenta WHERE id_cuenta = ?");
			ps.setInt(1, id);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "fue eliminado correctamente");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void MostraTabla(JButton bt) {
    	
		try {
			Statement st = cn.createStatement();
			
			//mostrando libros
			ResultSet rs = st.executeQuery("SELECT * FROM cuenta");
			
			String cadena = ":::::::::::::::::CUENTAS CREADAS::::::::::::::::::::::::\n";
			
			
				while(rs.next()) {
					
					cadena += "Codigo  NOMBRE  APELLIDOS\n"+rs.getInt(1)+"      "+rs.getString(2)+" "+rs.getString(3)+"\nCORREO: "+rs.getString(4)+"\nPASSWORD:"+rs.getString(5)+"\n\n";
			
			}
			
			
			JOptionPane.showMessageDialog(bt,cadena);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
	

}
