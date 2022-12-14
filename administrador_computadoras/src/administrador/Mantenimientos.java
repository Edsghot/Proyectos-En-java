/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import baseDatos.Conexion;
import login.PanelAdmi;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author fabian
 */
public class Mantenimientos extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_alumnos
     */
    public Mantenimientos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMantenimientos = new javax.swing.JLabel();
        txtID_EquiposPC = new javax.swing.JLabel();
        ID_EquiposPC = new javax.swing.JTextField();
        txtID_Usuarios = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        txtFechaM_F = new javax.swing.JLabel();
        ID_Usuarios = new javax.swing.JTextField();
        FechaM_I = new javax.swing.JTextField();
        FechaM_F = new javax.swing.JTextField();
        txtID_Mantenimientos = new javax.swing.JLabel();
        ID_Mantenimientos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        txtMantenimientos.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtMantenimientos.setText("Mantenimientos");

        txtID_EquiposPC.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtID_EquiposPC.setText("ID_EquiposPC");

        txtID_Usuarios.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtID_Usuarios.setText("ID_Usuarios");

        txt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txt.setText("FechaM_I");

        txtFechaM_F.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtFechaM_F.setText("FechaM_F");

        FechaM_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaM_IActionPerformed(evt);
            }
        });

        FechaM_F.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        txtID_Mantenimientos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtID_Mantenimientos.setText("ID_Mantenimientos");
        
        btnNewButton = new JButton("regresar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		PanelAdmi ad = new PanelAdmi();
        		ad.setVisible(true);
        	}
        });
        
        scrollPane = new JScrollPane();
        
        btnNewButton_1 = new JButton("Agregar");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cn.agregarMantenimientos(ID_Mantenimientos.getText(),ID_EquiposPC.getText(),ID_Usuarios.getText(),FechaM_I.getText(),FechaM_F.getText());
				model = cn.mostrarMantenimientos();
				table.setModel(model);
        	}
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(278)
        					.addComponent(txtMantenimientos))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(45)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(ID_EquiposPC, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtID_Usuarios, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtID_EquiposPC, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txt)
        								.addComponent(txtFechaM_F, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtID_Mantenimientos))
        							.addGap(41)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(ID_Mantenimientos, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        								.addComponent(ID_Usuarios, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        								.addComponent(FechaM_F, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        								.addComponent(FechaM_I, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))))
        					.addGap(53)
        					.addComponent(btnNewButton_1))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(20)
        					.addComponent(btnNewButton))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(54)
        					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(19)
        			.addComponent(btnNewButton)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtMantenimientos, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtID_Mantenimientos, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addComponent(ID_Mantenimientos, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnNewButton_1))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtID_EquiposPC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addComponent(ID_EquiposPC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtID_Usuarios, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(ID_Usuarios, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txt)
        				.addComponent(FechaM_I, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(txtFechaM_F)
        				.addComponent(FechaM_F, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
        			.addGap(37))
        );
        
        model = new DefaultTableModel();
		table = new JTable();
		model = cn.mostrarMantenimientos();
		table.setModel(model);
        scrollPane.setViewportView(table);
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FechaM_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaM_IActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaM_IActionPerformed

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
            java.util.logging.Logger.getLogger(Mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FechaM_F;
    private javax.swing.JTextField FechaM_I;
    private javax.swing.JTextField ID_EquiposPC;
    private javax.swing.JTextField ID_Mantenimientos;
    private javax.swing.JTextField ID_Usuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txtFechaM_F;
    private javax.swing.JLabel txtID_EquiposPC;
    private javax.swing.JLabel txtID_Mantenimientos;
    private javax.swing.JLabel txtID_Usuarios;
    private javax.swing.JLabel txtMantenimientos;
    private JButton btnNewButton;
    private JScrollPane scrollPane;
    private JTable table;
    private JButton btnNewButton_1;
	DefaultTableModel model;
	Conexion cn = new Conexion();

    // End of variables declaration//GEN-END:variables
}
