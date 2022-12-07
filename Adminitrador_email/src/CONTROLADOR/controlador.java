package CONTROLADOR;

import javax.swing.JButton;
import javax.swing.JTable;

import CLASES.Email;

public class controlador {
	Email email;
	conexion cone;
	private int c= 0;
	public controlador(String nombre,String apellidos) {
		email = new Email(nombre,apellidos);
		cone = new conexion();
		cone.conexion();
	}
	public String[] Validar(boolean radio[]) {
		
		String msg[] = new String[2];
		String chel = email.setDepartamento(radio);
		if( chel == "error") {
			msg[0] = "error";
			return msg;
		}else {
			msg[0] = email.getEmail();
			msg[1] = email.getPassword();
			return msg;
			
		}
	}
	
	public void guardar(String nombre,String apellido,String correo,String password) {
		c++;
		cone.registrarCuenta(c,nombre, apellido, correo, password);
		
	}
	public void eliminar(String correo) {
		cone.eliminarCuenta(correo);
	}
	public void mostrar(JButton bt) {
		cone.MostraTabla(bt);
	}

}
