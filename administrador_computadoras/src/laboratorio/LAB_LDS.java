/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JLabel;

/**
 *
 * @author fabian
 */
public class LAB_LDS extends javax.swing.JFrame {
    
    static PreparedStatement ps;
    static ResultSet ress;
    static ResultSetMetaData ressmd;
    private final Connection cn;

    /**
     * Creates new form nuevolaboratorio
     */
    public LAB_LDS() {
        this.cn = img.CConexion_BD.getConection();
        initComponents();
        Consultas_EquiposPC();
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
        LDS01 = new javax.swing.JLabel();
        LDS02 = new javax.swing.JLabel();
        LDS03 = new javax.swing.JLabel();
        LDS04 = new javax.swing.JLabel();
        LDS05 = new javax.swing.JLabel();
        LDS06 = new javax.swing.JLabel();
        LDS07 = new javax.swing.JLabel();
        LDS09 = new javax.swing.JLabel();
        LDS10 = new javax.swing.JLabel();
        LDS08 = new javax.swing.JLabel();
        LDS11 = new javax.swing.JLabel();
        LDS12 = new javax.swing.JLabel();
        LDS13 = new javax.swing.JLabel();
        LDS14 = new javax.swing.JLabel();
        LDS15 = new javax.swing.JLabel();
        LDS16 = new javax.swing.JLabel();
        LDS17 = new javax.swing.JLabel();
        LDS18 = new javax.swing.JLabel();
        LDS19 = new javax.swing.JLabel();
        LDS20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        INICIO = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        LAB_LDM = new javax.swing.JMenuItem();
        LAB_LDS = new javax.swing.JMenuItem();
        LAB_LAS = new javax.swing.JMenuItem();
        LAB_LPG = new javax.swing.JMenuItem();
        LAB_LSO = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laboratorio de Desarrollo de Software", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N

        LDS01.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS02.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS03.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS04.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS05.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS06.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS07.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS09.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS10.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS08.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS11.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS12.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS13.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS14.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS15.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS16.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS17.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS18.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS19.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        LDS20.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabian\\Desktop\\estancia\\compu.png")); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/color.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LDS01)
                                .addGap(18, 18, 18)
                                .addComponent(LDS02)
                                .addGap(26, 26, 26)
                                .addComponent(LDS03)
                                .addGap(27, 27, 27)
                                .addComponent(LDS04))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(LDS17)
                                            .addGap(26, 26, 26)
                                            .addComponent(LDS18)
                                            .addGap(27, 27, 27)
                                            .addComponent(LDS19))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(LDS13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LDS14)
                                            .addGap(26, 26, 26)
                                            .addComponent(LDS15))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(LDS09)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LDS11)))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LDS16)
                                        .addComponent(LDS20)
                                        .addComponent(LDS12)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LDS10)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(LDS05)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LDS06)))
                                    .addGap(26, 26, 26)
                                    .addComponent(LDS07)
                                    .addGap(27, 27, 27)
                                    .addComponent(LDS08))))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LDS04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LDS03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LDS02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LDS01))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LDS05)
                    .addComponent(LDS06)
                    .addComponent(LDS07)
                    .addComponent(LDS08))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LDS11)
                            .addComponent(LDS09)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LDS12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDS10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LDS13)
                    .addComponent(LDS14)
                    .addComponent(LDS15)
                    .addComponent(LDS16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LDS17)
                    .addComponent(LDS18)
                    .addComponent(LDS19)
                    .addComponent(LDS20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        INICIO.setText("Inicio");
        INICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIOActionPerformed(evt);
            }
        });
        jMenu1.add(INICIO);

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
        LAB_LAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAB_LASActionPerformed(evt);
            }
        });
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIOActionPerformed
        // TODO add your handling code here:
        login.Paneldecontrol OPEN = new login.Paneldecontrol();
        OPEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_INICIOActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        login.Paneldecontrol OPEN = new login.Paneldecontrol();
        OPEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void LAB_LDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LDMActionPerformed
        // TODO add your handling code here:
        laboratorio.LAB_LDM OPEN = new laboratorio.LAB_LDM();
        OPEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LAB_LDMActionPerformed

    private void LAB_LDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LDSActionPerformed
        // TODO add your handling code here:ç
        laboratorio.LAB_LDS OPEN = new laboratorio.LAB_LDS();
        OPEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LAB_LDSActionPerformed

    private void LAB_LASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LASActionPerformed
        laboratorio.LAB_LAS OPEN = new laboratorio.LAB_LAS();
        OPEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LAB_LASActionPerformed

    private void LAB_LPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LPGActionPerformed
        laboratorio.LAB_LPG OPEN = new laboratorio.LAB_LPG();
        OPEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LAB_LPGActionPerformed

    private void LAB_LSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_LSOActionPerformed
        laboratorio.LAB_LSO OPEN = new laboratorio.LAB_LSO();
        OPEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LAB_LSOActionPerformed

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
            java.util.logging.Logger.getLogger(LAB_LDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LAB_LDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LAB_LDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LAB_LDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LAB_LDS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem INICIO;
    private javax.swing.JMenuItem LAB_LAS;
    private javax.swing.JMenuItem LAB_LDM;
    private javax.swing.JMenuItem LAB_LDS;
    private javax.swing.JMenuItem LAB_LPG;
    private javax.swing.JMenuItem LAB_LSO;
    private javax.swing.JLabel LDS01;
    private javax.swing.JLabel LDS02;
    private javax.swing.JLabel LDS03;
    private javax.swing.JLabel LDS04;
    private javax.swing.JLabel LDS05;
    private javax.swing.JLabel LDS06;
    private javax.swing.JLabel LDS07;
    private javax.swing.JLabel LDS08;
    private javax.swing.JLabel LDS09;
    private javax.swing.JLabel LDS10;
    private javax.swing.JLabel LDS11;
    private javax.swing.JLabel LDS12;
    private javax.swing.JLabel LDS13;
    private javax.swing.JLabel LDS14;
    private javax.swing.JLabel LDS15;
    private javax.swing.JLabel LDS16;
    private javax.swing.JLabel LDS17;
    private javax.swing.JLabel LDS18;
    private javax.swing.JLabel LDS19;
    private javax.swing.JLabel LDS20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

  private String Clave_PC;
  private int  PkID_PC;
private String Estatus_PC;

  private String Lab_EquipoPc;

    public String getClave_PC() {
        return Clave_PC;
    }

    public void setClave_PC(String Clave_PC) {
        this.Clave_PC = Clave_PC;
    }

    public int getPkID_PC() {
        return PkID_PC;
    }

    public void setPkID_PC(int PkID_PC) {
        this.PkID_PC = PkID_PC;
    }

    public String getEstatus_PC() {
        return Estatus_PC;
    }

    public void setEstatus_PC(String Estatus_PC) {
        this.Estatus_PC = Estatus_PC;
    }

    public String getLab_EquipoPc() {
        return Lab_EquipoPc;
    }

    public void setLab_EquipoPc(String Lab_EquipoPc) {
        this.Lab_EquipoPc = Lab_EquipoPc;
    }
  
  
  
    public void M_tblEquiposPC_Consulta_Estatus(String _Clave_PC) {
        System.out.println("M_tblEquiposPC_Consulta_Estatus() >>>>>>>>>>>>>>>> " + "CLAVE PC " + " [ " + _Clave_PC + " ] ");
        try {

            PreparedStatement s = cn.prepareStatement("select pkID_PC,Clave_PC,Estatus_PC,Lab_EquipoPC FROM tblEquiposPC WHERE Clave_PC=?");
            s.setString(1, _Clave_PC);
            ress = s.executeQuery();
            ressmd = ress.getMetaData();
            while (ress.next()) {
                setPkID_PC(ress.getInt("pkID_PC"));
                setClave_PC(ress.getString("Clave_PC"));
                setEstatus_PC(ress.getString("Estatus_PC"));
                setLab_EquipoPc(ress.getString("Lab_EquipoPC"));

            }
        } catch (SQLException e) {
            System.out.println("ERROR:: M_tblEquiposPC_Consulta_Estatus()::" + e.toString());
        }       
    }

    
    
       public void Consultas_EquiposPC() {
        //PC
        try {

            //Models.M_tblEquiposPC tbl_EquiposPC = new Models.M_tblEquiposPC();

            String EquiposLDS[] = {"LDS01", "LDS02", "LDS03", "LDS04", "LDS05", "LDS06", "LDS07", "LDS08", "LDS09", "LDS10", "LDS11", "LDS12", "LDS13", "LDS14", "LDS15", "LDS16", "LDS17", "LDS18", "LDS19", "LDS20"};

            JLabel[] etiquetas_JL = {LDS01, LDS02, LDS03, LDS04, LDS05, LDS06, LDS07, LDS08, LDS09, LDS10, LDS11, LDS12, LDS13, LDS14, LDS15, LDS16, LDS17, LDS18, LDS19, LDS20};

            for (int E = 0; E < EquiposLDS.length; E++) {
                System.out.println(">>>>>> " + EquiposLDS[E]);
                String VALM = EquiposLDS[E];
                M_tblEquiposPC_Consulta_Estatus(VALM);
                for (JLabel etiquetas_JL1 : etiquetas_JL) {
                    System.out.println("ENVIO JLABEL");
                    Pintar_Estatus(getClave_PC(), getEstatus_PC(), etiquetas_JL[E]);
                }
            }
        } catch (Exception e) {
            System.out.println(":::" + e.toString());

        }
    }

  public void Pintar_Estatus(String Clave_PC, String Estatus_PC, JLabel PintaEst) {
        System.out.println("");
        System.out.println("APP_Usuarios::Pintar_Estatus");
        System.out.println("");
        System.out.println("" + Clave_PC + "::::::" + Estatus_PC);
        //PC
        if (Clave_PC.equals(Clave_PC)) {
            System.out.println(Clave_PC + ">>> Existe");

            if (null != Estatus_PC) {
                switch (Estatus_PC) {
                    case "Disponible":

                        System.out.println(Clave_PC + ">>> Disponible");
                        PintaEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_equiposPC/Disponible_EquipoPC.png")));
//                        pintarImagen(PintaEst, img_EPC.PC_Disponible);

                        break;
                    case "Ocupado":

                        System.out.println(Clave_PC + ">>> Ocupado");
                        PintaEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_equiposPC/Ocupado_EquipoPC.png")));
//                        pintarImagen(PintaEst, img_EPC.PC_Ocupado);

                        break;
                    case "Manteniento":

                        System.out.println(Clave_PC + ">>> Manteniento");
                        PintaEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_equiposPC/Mantenimiento_EquipoPC.png")));
//                        pintarImagen(PintaEst, img_EPC.PC_Mantenimiento);

                        break;
                    default:
                        break;
                }
            }
        }
    }

}
