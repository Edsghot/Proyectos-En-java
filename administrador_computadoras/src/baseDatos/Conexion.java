package baseDatos;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Conexion {
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/adminitracioncomputadoras";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	
	private PreparedStatement preparedStatement = null;
	private ResultSet resulSet = null;
	
	private DefaultTableModel model; 
	
	static {
		try {
			Class.forName(CONTROLADOR);
		}catch(ClassNotFoundException e){
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}

	public static Connection conectar() {
		Connection cn = null;
		try {
			
			cn = (Connection) DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexión OK");

		}catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return cn;
	}
	
	
	//agregar usuarios
	public void agregarUsuarios(String id,String nombre,String contrasena,String rol) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into usuarios(ID_Usuarios,Nombre,Contrasena,Rol) values(?,?,?,?)");
			
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, nombre);
			preparedStatement.setString(3, contrasena);
			preparedStatement.setString(4, rol.toLowerCase());
			
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro cone exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		
		}catch(SQLException k){
			System.out.println(k);
		}
	}
	//agregar Clases
	public void agregarClases(String id,String idMaterias,String idLaboratorio,String dia,String asistencia) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into clases values(?,?,?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, idMaterias);
			preparedStatement.setString(3, idLaboratorio);
			preparedStatement.setString(4, dia);
			preparedStatement.setString(5, asistencia);
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
	}
	
	//agregando EQUIPOS PC
	
	public void agregarEquipos(String id,String hadware,String software,String estatus) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into equipospc values(?,?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, hadware);
			preparedStatement.setString(3, software);
			preparedStatement.setString(4, estatus);
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
	}
	
	//agregando Horarios
	public void agregarHorario(String id,String idMaterias,String idLaboratorio,String dia,String asistencia) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into horarios values(?,?,?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, idMaterias);
			preparedStatement.setString(3, idLaboratorio);
			preparedStatement.setString(4, dia);
			preparedStatement.setString(5, asistencia);
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
		
	}
	
	public void actualizarEquipo(String estatus,String id) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("update equipospc set Estatus = ? where ID_EquiposPC = ?");
			preparedStatement.setString(1, estatus);
			preparedStatement.setString(2, id);

			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se actualizo la tabla equipo con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se actaulizo");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
		
	}
	
	
	//agregando mantenimientos
	public void agregarMantenimientos(String id,String idEquipo,String idUsuario,String fechaI,String fechaF) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into mantenimientos values(?,?,?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, idEquipo);
			preparedStatement.setString(3, idUsuario);
			preparedStatement.setString(4, fechaI);
			preparedStatement.setString(5, fechaF);
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
	}
	//agregando laboratorio
	public void agregarLaboratorio(String id,String nombre,String estatus) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into laboratorio values(?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, nombre);
			preparedStatement.setString(3, estatus);
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
	}
	//agregando Materias
	public void agregarMaterias(String id,String nombre,String idUsuario,String idperiodos) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into materias values(?,?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, nombre);
			preparedStatement.setString(3, idUsuario);
			preparedStatement.setString(4, idperiodos);
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
	}
	//agregando Observaciones
	public void agregarObservaciones(String id,String idEquipo,String idUsuarios,String fechaO,String observacion,String Estatus) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into observaciones values(?,?,?,?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, idEquipo);
			preparedStatement.setString(3, idUsuarios);
			preparedStatement.setString(4, fechaO);
			preparedStatement.setString(5, observacion);
			preparedStatement.setString(6, Estatus);
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
	}
	//agregar reserva
	public void agregarReservaciones(String id,String idEquipo,String idlab,String descripcion,String Avisos,String estatus) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into reservaciones values(?,?,?,?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, idEquipo);
			preparedStatement.setString(3, idlab);
			preparedStatement.setString(4, descripcion);
			preparedStatement.setString(5, Avisos);
			preparedStatement.setString(6, estatus);
			
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
	}
	//agregando periodos
	public void agregarPeriodos(String id,String clave,String periodo) {
		try {
			Connection cn = conectar();
			preparedStatement = (PreparedStatement) cn.prepareStatement("Insert into periodos values(?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, clave);
			preparedStatement.setString(3, periodo);
			int resultado = preparedStatement.executeUpdate();
			if(resultado > 0) {
				JOptionPane.showMessageDialog(null, "Se registro con exito!");
			}else {
				JOptionPane.showMessageDialog(null, "no se pudo registrar");
			}
		}catch(SQLException k){
			System.out.println(k);
		}
	}

	//mostrando la tabla de periodos
	public DefaultTableModel mostrarPeriodo() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[10];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdPeriodo");
		model.addColumn("clave");
		model.addColumn("periodo");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM periodos");
			while(rs.next()) {	
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				model.addRow(fila);
			}		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return model;
	}
	
	//mostrando la tabla observaciones
	public DefaultTableModel mostrarObservaciones() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[10];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdObservacion");
		model.addColumn("IdEquipo");
		model.addColumn("IdUsuario");
		model.addColumn("fechaO");
		model.addColumn("Observacion");
		model.addColumn("Estatus");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM observaciones");
			while(rs.next()) {	
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				fila[3] = rs.getString(4);
				fila[4] = rs.getString(5);
				fila[5] = rs.getString(6);
				model.addRow(fila);
			}		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return model;
	}
	//mostrando tabla materias
	public DefaultTableModel mostrarMaterias() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[10];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdMateria");
		model.addColumn("nombre");
		model.addColumn("IdUsuario");
		model.addColumn("IdPeriodo");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM materias");
			while(rs.next()) {	
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				fila[3] = rs.getString(4);
				model.addRow(fila);
			}		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return model;
	}
	//mostrando tabla laboratorio
	public DefaultTableModel mostrarLaboratorio() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[10];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdLaboratorio");
		model.addColumn("nombre");
		model.addColumn("estatus");

		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM laboratorio");
			while(rs.next()) {	
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				model.addRow(fila);
			}		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return model;
	}
	
	
	//mostrar tabla mantenimientos
	public DefaultTableModel mostrarMantenimientos() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[10];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdMantenimiento");
		model.addColumn("IdEquipo");
		model.addColumn("IdUsuario");
		model.addColumn("FechaInicial");
		model.addColumn("FechaFinal");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM mantenimientos");
			while(rs.next()) {	
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				fila[3] = rs.getString(4);
				fila[4] = rs.getString(5);
				model.addRow(fila);
			}		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return model;
	}
	//mostrar tabla horarios
	public DefaultTableModel mostrarHorarios() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[10];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdHorario");
		model.addColumn("IdMateria");
		model.addColumn("IdLaboratorio");
		model.addColumn("Dia");
		model.addColumn("Asistencia");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM horarios");
			while(rs.next()) {	
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				fila[3] = rs.getString(4);
				fila[4] = rs.getString(5);
				model.addRow(fila);
			}		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return model;
	}
	//mpstrar tabla de equipos
	
	public DefaultTableModel mostrarEquipos() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[10];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdEquipo");
		model.addColumn("Hadware");
		model.addColumn("Software");
		model.addColumn("Estatus");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("SELECT * FROM equipospc");
			
			while(rs.next()) {
				
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				fila[3] = rs.getString(4);
				model.addRow(fila);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return model;
	}
	
	//mostrar tabla Clases
	public DefaultTableModel mostrarClases() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[10];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdClases");
		model.addColumn("IdMateria");
		model.addColumn("IdLaboratorio");
		model.addColumn("dia");
		model.addColumn("Asistencia");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("SELECT * FROM clases");
			
			while(rs.next()) {
				
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				fila[3] = rs.getString(4);
				fila[4] = rs.getString(5);
				model.addRow(fila);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return model;
	}
	
	//mostrar tabla Usuarios
	public DefaultTableModel mostrarUsuarios() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[4];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdUser");
		model.addColumn("Nombre");
		model.addColumn("Contrasena");
		model.addColumn("Rol");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("SELECT * FROM usuarios");
			
			while(rs.next()) {
				String idUsuario = rs.getString(1);
				String usuario = rs.getString(2);
				String clave = rs.getString(3);
				String rol = rs.getString(4);
				
				fila[0] = idUsuario;
				fila[1] = usuario;
				fila[2] = clave;
				fila[3] = rol;
				model.addRow(fila);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return model;
	}
	
	
	//mostrar reserva
	public DefaultTableModel mostrarReserva() {
		Statement stm = null;
		ResultSet rs = null;
		Object[] fila = new Object[8];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID de reserva");
		model.addColumn("Nombre Lab");
		model.addColumn("id Equipo");
		model.addColumn("descripcion");
		model.addColumn("Avisos");
		model.addColumn("Estatus");
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("select Id_Reserva,l.nombre,Id_equipo,Descripcion,avisos,reservaciones.estatus from reservaciones inner join laboratorio as l on reservaciones.Id_laboratorio = l.ID_Laboratorio");
			
			while(rs.next()) {				
				fila[0] = rs.getString(1);
				fila[1] = rs.getString(2);
				fila[2] = rs.getString(3);
				fila[3] = rs.getString(4);
				fila[4] = rs.getString(5);
				fila[5] = rs.getString(6);
				model.addRow(fila);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return model;
	}
	
	//
	public String getIdLab(String nomLab) {
		Statement stm = null;
		ResultSet rs = null;


		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("select * from laboratorio");
			
			while(rs.next()) {				
				if(rs.getString(2).equals(nomLab)) {
					return rs.getString(1);
				}
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return "";
	}
	public String getEquipoEstatus(String id) {
		Statement stm = null;
		ResultSet rs = null;


		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("select * from equipospc");
			
			while(rs.next()) {				
				if(rs.getString(1).equals(id)) {
					return rs.getString(4);
				}
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return "";
	}
	
	//mostrar nombres de laboratorio
	
	public String[] MostrarNombreLab() {
		Statement stm = null;
		ResultSet rs = null;
		int tam =1;
		int c = 0;

		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("SELECT Nombre FROM laboratorio");
			
			while(rs.next()) {
				tam++;
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		String[] fila = new String[tam];
		
		try {
			Connection cn = conectar();
			stm = (Statement) cn.createStatement();
			
			rs = stm.executeQuery("SELECT Nombre FROM laboratorio");
			
			while(rs.next()) {
				String nombre = rs.getString(1);
				fila[c] = nombre;
				c++;
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return fila;
	}

	
	
	
	
	
}
