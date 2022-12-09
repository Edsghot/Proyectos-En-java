package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import administrador.Clases;
import administrador.EquiposPC;
import administrador.Horarios;
import administrador.Laboratorio;
import administrador.Mantenimientos;
import administrador.Materias;
import administrador.Observaciones;
import administrador.Periodos;
import administrador.Usuarios;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelAdmi extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelAdmi frame = new PanelAdmi();
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
	public PanelAdmi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(106, 90, 205));
		contentPane.setForeground(new Color(138, 43, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PANEL DE CONTROL DE ADMINISTRADOR");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(111, 11, 498, 56);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Clases clases = new Clases();
				clases.setVisible(true);
			}
		});
		lblNewLabel_1.setBounds(62, 114, 95, 98);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\clasess.png"));
		
		lblNewLabel_2 = new JLabel("Clases");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_2.setBounds(72, 213, 106, 28);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\equiposPc.png"));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				EquiposPC eq = new EquiposPC();
				eq.setVisible(true);
			}
		});
		lblNewLabel_3.setBounds(211, 114, 106, 98);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Equipos");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_4.setBounds(211, 213, 106, 28);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\horarios.png"));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Horarios h = new Horarios();
				h.setVisible(true);
			
			}
		});
		lblNewLabel_5.setBounds(348, 114, 95, 98);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Horarios");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_6.setBounds(358, 213, 106, 28);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\laboratorio.png"));
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Laboratorio lab = new Laboratorio();
				lab.setVisible(true);
				
			}
		});
		lblNewLabel_7.setBounds(488, 114, 95, 98);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Laboratorio");
		lblNewLabel_8.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_8.setBounds(498, 213, 125, 28);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\materias.png"));
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Materias m = new Materias();
				m.setVisible(true);
			}
		});
		lblNewLabel_9.setBounds(633, 91, 116, 121);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Materias");
		lblNewLabel_10.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_10.setBounds(643, 213, 106, 28);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\mantenimientos.png"));
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Mantenimientos m = new Mantenimientos();
				m.setVisible(true);
			}
		});
		lblNewLabel_11.setBounds(41, 283, 95, 98);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Mantenimientos");
		lblNewLabel_12.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblNewLabel_12.setBounds(23, 382, 159, 28);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\observaciones.png"));
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Observaciones o = new Observaciones();
				o.setVisible(true);
			}
		});
		lblNewLabel_13.setBounds(201, 283, 116, 98);
		contentPane.add(lblNewLabel_13);
		
		
		lblNewLabel_14 = new JLabel("Observaciones");
		lblNewLabel_14.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblNewLabel_14.setBounds(201, 382, 147, 28);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\periodos.png"));
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Periodos p = new Periodos();
				p.setVisible(true);
			}
		});
		lblNewLabel_15.setBounds(348, 283, 116, 98);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Periodos");
		lblNewLabel_16.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_16.setBounds(358, 382, 106, 28);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\usuarios.png"));
		lblNewLabel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Usuarios u = new Usuarios();
				u.setVisible(true);
			}
		});
		lblNewLabel_17.setBounds(488, 283, 116, 98);
		contentPane.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("Usuarios");
		lblNewLabel_18.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_18.setBounds(498, 382, 106, 28);
		contentPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\administrador_computadoras\\src\\img\\reserva.png"));
		lblNewLabel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Paneldecontrol p = new Paneldecontrol();
				p.setVisible(true);
			}
		});
		lblNewLabel_19.setBounds(633, 283, 95, 98);
		contentPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("Reservar Lab");
		lblNewLabel_20.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_20.setBounds(622, 373, 127, 47);
		contentPane.add(lblNewLabel_20);
	}
}
