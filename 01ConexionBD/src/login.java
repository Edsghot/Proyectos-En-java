import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtContra;
	private JTextField txtRol;
	PreparedStatement preparedStatement = null;
	Connection conexion = null;
	ResultSet resulSet = null;
	private JTable table;
	private void limpiarCuadroTexto() {
		txtId.setText(null);
		txtNombre.setText(null);
		txtContra.setText(null);
		txtRol.setText(null);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amdinistracion de computadoras");
		lblNewLabel.setBounds(29, 24, 171, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idusuario: ");
		lblNewLabel_1.setBounds(30, 85, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(29, 110, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contrase\u00F1a: ");
		lblNewLabel_2_1.setBounds(29, 135, 78, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Rol: ");
		lblNewLabel_2_2.setBounds(29, 161, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		txtId = new JTextField();
		txtId.setBounds(85, 82, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(85, 110, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtContra = new JTextField();
		txtContra.setBounds(95, 132, 86, 20);
		contentPane.add(txtContra);
		txtContra.setColumns(10);
		
		txtRol = new JTextField();
		txtRol.setBounds(61, 160, 86, 20);
		contentPane.add(txtRol);
		txtRol.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(226, 81, 89, 23);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 287, 468, 133);
		contentPane.add(scrollPane);
		
		contentPane.add(btnBuscar);
		model = new DefaultTableModel();
		table = new JTable();
		table.setModel(model);
		
		
		model.addColumn("IdUser");
		model.addColumn("Nombre");
		model.addColumn("Contrasena");
		model.addColumn("Rol");
		
		scrollPane.setViewportView(table);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conexion = Conexion.conectar();
				
				try {
					preparedStatement = (PreparedStatement) conexion.prepareStatement("Insert into usuarios(ID_Usuarios,Nombre,Contrasena,Rol) values(?,?,?,?)");
					
					preparedStatement.setString(1, txtId.getText());
					preparedStatement.setString(2, txtNombre.getText());
					preparedStatement.setString(3, txtContra.getText());
					preparedStatement.setString(4, txtRol.getText());
					
					int resultado = preparedStatement.executeUpdate();
					if(resultado > 0) {
						JOptionPane.showMessageDialog(null, "Se registro cone exito!");
						limpiarCuadroTexto();
						conexion.close();
					}else {
						JOptionPane.showMessageDialog(null, "no se pudo registrar");
					}
				
				}catch(SQLException k){
					System.out.println(k);
				}
				llenarTabla();
				
			}
			
		});
		btnAgregar.setBounds(61, 226, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(180, 226, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(305, 226, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.setBounds(427, 226, 89, 23);
		contentPane.add(btnSalir);
		
	
		
		
	}
	DefaultTableModel model;
	
	public void llenarTabla() {
		Object[] fila = new Object[4];
		fila[0] = txtId.getText();
		fila[1] = txtNombre.getText();
		fila[2] = txtContra.getText();
		fila[3] = txtRol.getText();
		model.addRow(fila);
	}
}
