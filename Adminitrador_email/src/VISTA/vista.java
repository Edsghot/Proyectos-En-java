package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONTROLADOR.controlador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class vista extends JFrame {

	private JPanel contentPane;
	private JLabel fondo;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblApellido;
	private JLabel lblNewLabel_2;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JRadioButton rt1;
	private boolean radioButon[] = new boolean[4];
	private controlador control;
	private JPanel panel_1;
	private JButton bt;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblCorreo;
	private JLabel lblPass;
	private JPanel desliss;
	private JLabel perfil;
	private int cont =0;
	private JButton Ingresar;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	int cf = 0;
	int cc= 1;
	private JButton btnBOM;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
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
	public vista() {
		setResizable(false);
		setType(Type.POPUP);
		setForeground(Color.DARK_GRAY);
		setFont(new Font("Dialog", Font.ITALIC, 16));
		setTitle("Adminitrador de Email (creado por Ed soto)");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(vista.class.getResource("/img_extras/logo mensaje.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblRegistrado = new JLabel("Registrado!!");
		
		btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(Color.GREEN);
			}
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(Color.WHITE);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				control.guardar(txtNombre.getText(), txtApellido.getText(), lblCorreo.getText(), lblPass.getText());
				
				lblRegistrado.setVisible(true);
				lblRegistrado.setBackground(Color.BLUE);
				cc++;
			}
		});
		
		lblRegistrado.setForeground(Color.CYAN);
		lblRegistrado.setBounds(489, 303, 77, 14);
		contentPane.add(lblRegistrado);
		btnNewButton_1.setBounds(486, 322, 94, 32);
		contentPane.add(btnNewButton_1);
		lblRegistrado.setVisible(false);
		
		desliss = new JPanel();
		desliss.setVisible(false);
		desliss.setBounds(0, 44, 192, 334);
		contentPane.add(desliss);
		desliss.setLayout(null);
		
		perfil = new JLabel("icon");
		perfil.setIcon(new ImageIcon(vista.class.getResource("/img_extras/perfil.png")));
		perfil.setBounds(45, 23, 104, 100);
		desliss.add(perfil);
		
		bt = new JButton("");
		
		bt.setVerifyInputWhenFocusTarget(false);
		bt.setIcon(new ImageIcon("C:\\Users\\erick\\Pictures\\IMAGENES PROYECTOS\\administrador de email\\avanceRapido.gif"));
		bt.setBounds(10, 12, 40, 32);
		contentPane.add(bt);
		
		
		panel_1 = new JPanel();
		panel_1.setBounds(380, 46, 238, 131);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("correo:");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblNewLabel_1.setBounds(82, 11, 66, 25);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("password:");
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblNewLabel_3.setBounds(72, 64, 87, 25);
		panel_1.add(lblNewLabel_3);
		
		lblCorreo = new JLabel("...");
		lblCorreo.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblCorreo.setBounds(32, 33, 196, 20);
		panel_1.add(lblCorreo);
		
		lblPass = new JLabel("...");
		lblPass.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblPass.setBounds(32, 93, 196, 20);
		panel_1.add(lblPass);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(-316, -122, 416, 334);
		panel_1.add(panel_2);
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("LISTA DE CORREOS CREADOS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setBounds(39, 23, 258, 14);
		panel_2.add(lblNewLabel_4);
		
		btnBOM = new JButton("New button");
		btnBOM.setVisible(false);
		btnBOM.setBounds(317, 57, 89, 23);
		panel_2.add(btnBOM);
		
		panel = new JPanel();
		panel.setIgnoreRepaint(true);
		panel.setBounds(10, 55, 244, 312);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel.setVisible(true);
		
		lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 30, 68, 14);
		panel.add(lblNewLabel);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblApellido.setBounds(10, 65, 68, 14);
		panel.add(lblApellido);
		
		lblNewLabel_2 = new JLabel("Departamento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(10, 114, 117, 20);
		panel.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(89, 29, 145, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(88, 64, 145, 20);
		panel.add(txtApellido);
		JRadioButton rt3 = new JRadioButton("para Contabilidad\r\n");
		JRadioButton rt4 = new JRadioButton("para ningunos");
		rt1 = new JRadioButton("para Ventas");
		
		JRadioButton rt2 = new JRadioButton("para Desarrollador");
		rt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rt1.setSelected(false);
				rt3.setSelected(false);
				rt4.setSelected(false);
			}
		});
		rt2.setBounds(89, 177, 144, 23);
		panel.add(rt2);
		
		
		rt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rt1.setSelected(false);
				rt2.setSelected(false);
				rt4.setSelected(false);	
			}
		});
		rt3.setBounds(89, 203, 131, 23);
		panel.add(rt3);
		
		
		rt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rt1.setSelected(false);
				rt2.setSelected(false);
				rt3.setSelected(false);
			
			}
		});
		rt4.setBounds(89, 229, 109, 23);
		panel.add(rt4);
		
		
		rt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rt2.setSelected(false);
				rt3.setSelected(false);
				rt4.setSelected(false);
			}
		});
		rt1.setBounds(89, 151, 109, 23);
		panel.add(rt1);

		JButton btnGenerador = new JButton("Generador");
		btnGenerador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGenerador.setBackground(Color.GREEN);
			}
			public void mouseExited(MouseEvent e) {
				btnGenerador.setBackground(Color.white);
			}
		});
		btnGenerador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control = new controlador(txtNombre.getText(),txtApellido.getText());

				radioButon[0] = rt1.isSelected();
				radioButon[1] = rt2.isSelected();
				radioButon[2] = rt3.isSelected();
				radioButon[3] = rt4.isSelected();
				String[] msg = control.Validar(radioButon);
				if(msg[0] == "error") {
					JOptionPane.showMessageDialog(btnGenerador, "escoja un departamento!!");
				}else {
					lblCorreo.setText(msg[0]);
					lblPass.setText(msg[1]);
				}
				
				lblRegistrado.setVisible(false);
				lblRegistrado.setBackground(Color.BLUE);
				
			}
			
		});
		btnGenerador.setBounds(60, 267, 102, 34);
		panel.add(btnGenerador);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cont %2 == 0) {
					panel.setVisible(false);
					desliss.setVisible(true);
				}else {
					panel.setVisible(true);
					desliss.setVisible(false);
				}
				cont++;
			}
		});
		
		fondo = new JLabel("New label");
		fondo.setIcon(new ImageIcon(vista.class.getResource("/img_extras/fondo.jpg")));
		fondo.setBounds(0, -11, 628, 400);
		contentPane.add(fondo);
		
		regulador(bt,"src\\img_extras\\avanceRapido.gif");
		regulador2(perfil,"src\\img_extras\\perfil.png");
		
		Ingresar = new JButton("Ingresar a otra cuenta");
		Ingresar.setBounds(25, 145, 141, 23);
		desliss.add(Ingresar);
		
		btnNewButton_2 = new JButton("Eliminar correos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String correo = JOptionPane.showInputDialog("Digite el correo que desea eliminar: ");
				control.eliminar(correo);
			}
		});
		btnNewButton_2.setBounds(25, 213, 141, 23);
		desliss.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_3.setBounds(60, 285, 89, 23);
		desliss.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Correos creados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cf++;
				if(cf %2 == 0) {
					panel_2.setVisible(false);
					
				}else {
					panel_2.setVisible(true);
					control.mostrar(btnBOM);
				}
				
				
			}
		});
		btnNewButton.setBounds(25, 179, 141, 23);
		desliss.add(btnNewButton);
	}
	
	private void regulador(JButton label,String root) {
		ImageIcon image = new ImageIcon(root);
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icon);
		label.repaint();
	}
	private void regulador2(JLabel label,String root) {
		ImageIcon image = new ImageIcon(root);
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icon);
		label.repaint();
	}
}
