
package login;

import baseDatos.Conexion;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Paneldecontrol extends javax.swing.JFrame {

   
    public Paneldecontrol() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idEquipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cblaboratorio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAvisos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        cblaboratorio1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnbuscar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        LAB_LDM = new javax.swing.JMenuItem();
        LAB_LDS = new javax.swing.JMenuItem();
        LAB_LAS = new javax.swing.JMenuItem();
        LAB_LPG = new javax.swing.JMenuItem();
        LAB_LSO = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Laboratorios");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva de Laboratorios"));

        jLabel2.setText("Id de equipo");

        jLabel3.setText("Laboratorio:");

        cblaboratorio1.setModel(new javax.swing.DefaultComboBoxModel<>(cn.MostrarNombreLab()));

        jLabel4.setText("Estado:");

        jLabel5.setText("Descripcion:");

        txtAvisos.setColumns(20);
        txtAvisos.setRows(5);
        jScrollPane1.setViewportView(txtAvisos);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel6.setText("Avisos:");

        cblaboratorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ocupado", "disponible","mantenimiento"}));
        
        JLabel lblNewLabel = new JLabel("Id reserva");
        
        idReserva = new JTextField();
        idReserva.setColumns(10);
        
        JButton btnNewButton = new JButton("Reservar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		System.out.println(cn.getEquipoEstatus(idEquipo.getText()));
        		if((cn.getEquipoEstatus(idEquipo.getText()).equals("ocupado") )) {
        			JOptionPane.showMessageDialog(null, "El equipo seleccionado por el momento no esta disponible");
        		}else if(cn.getEquipoEstatus(idEquipo.getText()).equals("mantenimiento")){
        			JOptionPane.showMessageDialog(null, "El equipo seleccionado por el momento esta en mantenimiento");
        		}else {
        			cn.agregarReservaciones(idReserva.getText(), idEquipo.getText(), cn.getIdLab(""+cblaboratorio1.getSelectedItem()),txtDescripcion.getText(), txtAvisos.getText(),(""+cblaboratorio.getSelectedItem()));
    				cn.actualizarEquipo((""+cblaboratorio.getSelectedItem()), idEquipo.getText());
            		model = cn.mostrarReserva();
    				jTable1.setModel(model);
        		}
        		
				
				
        	}
        });
        
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(idEquipo, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        			.addGap(70, 288, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(cblaboratorio1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(14)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(lblNewLabel)
        							.addGap(35)
        							.addComponent(idReserva, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(cblaboratorio, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap(158, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(391, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(105)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(172, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(123)
        			.addComponent(btnNewButton)
        			.addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(idEquipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cblaboratorio1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        					.addGap(128)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        					.addGap(29)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(cblaboratorio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(107)
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(107)
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel)
        				.addComponent(idReserva, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addComponent(btnNewButton)
        			.addGap(39))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Computadoras"));

        model = new DefaultTableModel();
		//table = new JTable();
		model = cn.mostrarReserva();
		jTable1.setModel(model);
        jScrollPane3.setViewportView(jTable1);

        btnbuscar.setText("Listar equipos");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        
        lblLista = new JLabel("Lista de Reservas");
        lblLista.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        btnNewButton_1 = new JButton("Listar Reservas");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblLista.setText("Lista De Reservaciones");
        		model = cn.mostrarReserva();
        		jTable1.setModel(model);
        	}
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(36)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblLista)
        				.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(74, Short.MAX_VALUE))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(48)
        			.addComponent(btnNewButton_1)
        			.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
        			.addComponent(btnbuscar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
        			.addGap(72)
        			.addComponent(btnsalir)
        			.addGap(93))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnsalir)
        				.addComponent(btnbuscar, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnNewButton_1))
        			.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
        			.addComponent(lblLista)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
        			.addGap(18))
        );
        jPanel2.setLayout(jPanel2Layout);

        jMenu1.setText("Inicio");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Laboratorios");

        LAB_LDM.setText("LDM");
        LAB_LDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAB_LDMActionPerformed(evt);
            }
        });
        jMenu2.add(LAB_LDM);

        LAB_LDS.setText("LDS");
        LAB_LDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAB_LDSActionPerformed(evt);
            }
        });
        jMenu2.add(LAB_LDS);

        LAB_LAS.setText("LAS");
        jMenu2.add(LAB_LAS);

        LAB_LPG.setText("LPG");
        LAB_LPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAB_LPGActionPerformed(evt);
            }
        });
        jMenu2.add(LAB_LPG);

        LAB_LSO.setText("LSO");
        LAB_LSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAB_LSOActionPerformed(evt);
            }
        });
        jMenu2.add(LAB_LSO);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
    	lblLista.setText("Lista De equipos");
    	model = cn.mostrarEquipos();
		jTable1.setModel(model);
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void LAB_LDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LDMActionPerformed
        // TODO add your handling code here:
        laboratorio.LAB_LDM OPEN = new laboratorio.LAB_LDM();
        OPEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LAB_LDMActionPerformed

    private void LAB_LDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LAB_LDSActionPerformed

    private void LAB_LSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LSOActionPerformed
        laboratorio.LAB_LSO OPEN = new laboratorio.LAB_LSO();
        OPEN.setVisible(true);
        this.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_LAB_LSOActionPerformed

    private void LAB_LPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LPGActionPerformed
laboratorio.LAB_LPG OPEN = new laboratorio.LAB_LPG();
        OPEN.setVisible(true);
        this.setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_LAB_LPGActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        Paneldecontrol OPEN = new Paneldecontrol();
        OPEN.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paneldecontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paneldecontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paneldecontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paneldecontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paneldecontrol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LAB_LAS;
    private javax.swing.JMenuItem LAB_LDM;
    private javax.swing.JMenuItem LAB_LDS;
    private javax.swing.JMenuItem LAB_LPG;
    private javax.swing.JMenuItem LAB_LSO;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cblaboratorio;
    private javax.swing.JComboBox<String> cblaboratorio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtAvisos;
    private javax.swing.JTextField idEquipo;
    
    //instanciando la conexion
    Conexion cn = new Conexion();
    private JTextField idReserva;
    DefaultTableModel model;
    private JLabel lblLista;
    private JButton btnNewButton_1;
}
