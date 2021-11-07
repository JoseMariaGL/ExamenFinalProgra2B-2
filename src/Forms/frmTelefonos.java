package Forms;

import Data.aTelefonos;
import Logic.bTelefonos;
import Setting.Conect;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmTelefonos extends javax.swing.JFrame {
    
    Conect conect = new Conect();
    Connection cn = conect.ConectS();
    
    public frmTelefonos() {
        initComponents();
        this.setLocationRelativeTo(null);
        Show("");
        Disable();
    }
    private String accion = "Guardar";
    
    void Show(String Search){
        try {
            DefaultTableModel model;
            bTelefonos func = new bTelefonos();
            model = func.Show(Search);
            
            jTableTelefonos.setModel(model);
            jLabelTotalRecords.setText("Total registrados "+Integer.toString(func.TotalRecords));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void Disable(){
        jLabelIDTelefono.setEnabled(false);
        jTextFieldIMEI.setEnabled(false);
        jTextFieldModelo.setEnabled(false);
        jTextFieldMarca.setEnabled(false);
        jTextFieldMACAdress.setEnabled(false);
    
        jLabelIDTelefono.setText("");
        jTextFieldIMEI.setText("");
        jTextFieldModelo.setText("");
        jTextFieldMarca.setText("");
        jTextFieldMACAdress.setText("");
        
        jButtonGuardar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
    }
    void Enable(){
        jTextFieldIMEI.setEnabled(true);
        jTextFieldModelo.setEnabled(true);
        jTextFieldMarca.setEnabled(true);
        jTextFieldMACAdress.setEnabled(true);
    
        jLabelIDTelefono.setText("");
        jTextFieldIMEI.setText("");
        jTextFieldModelo.setText("");
        jTextFieldMarca.setText("");
        jTextFieldMACAdress.setText("");
        
        jButtonGuardar.setEnabled(true);
        jButtonEliminar.setEnabled(true);
    }
    void InsertEdit(){
        if (jTextFieldIMEI.getText().equals("") || jTextFieldModelo.getText().equals("") || jTextFieldMarca.getText().equals("") || jTextFieldMACAdress.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            aTelefonos dts = new aTelefonos();
            bTelefonos func = new bTelefonos();
            
            dts.setIMEI(jTextFieldIMEI.getText());
            dts.setModelo(jTextFieldModelo.getText());
            dts.setMarca(jTextFieldMarca.getText());
            dts.setMACAdress(jTextFieldMACAdress.getText());
            
            if (accion.equals("Guardar")) {
                if (func.Insert(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "Registrado correctamente");
                    Show("");
                    Disable();
                }
            }else if (accion.equals("Editar")){
                dts.setIDTelefono(Integer.parseInt(jLabelIDTelefono.getText()));
                JOptionPane.showMessageDialog(rootPane, "Editado correctamente");
                if (func.Edit(dts)) {
                    Show("");
                    Disable();
                }
            }
        }
    }
    void Delete(){
        if (!jLabelIDTelefono.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "Seguro de eliminar?","Confirmar",2);
            if (confirmacion == 0) {
                aTelefonos dts = new aTelefonos();
                bTelefonos func = new bTelefonos();
                
                dts.setIDTelefono(Integer.parseInt(jLabelIDTelefono.getText()));
                func.Delete(dts);
                Show("");
                Disable();
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTelefonos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIMEI = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldMACAdress = new javax.swing.JTextField();
        jButtonNuevo = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancenlar = new javax.swing.JButton();
        jLabelTotalRecords = new javax.swing.JLabel();
        jLabelIDTelefono = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teléfonos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableTelefonosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTelefonos);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Teléfonos");

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("IMEI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("MAC Adress");

        jTextFieldIMEI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldMACAdress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonCancenlar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancenlar.setText("Cancelar");
        jButtonCancenlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancenlarActionPerformed(evt);
            }
        });

        jLabelIDTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIDTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIMEI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonGuardar)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCancenlar)
                                .addGap(95, 95, 95)
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMACAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTotalRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIDTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabelIDTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIMEI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMACAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancenlar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        Enable();
        jButtonEliminar.setEnabled(false);
        jButtonGuardar.setText("Guardar");
        accion = "Guardar";
        jTextFieldIMEI.requestFocus();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        InsertEdit();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Delete();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonCancenlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancenlarActionPerformed
        Disable();
    }//GEN-LAST:event_jButtonCancenlarActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        Show(jTextFieldSearch.getText());
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jTableTelefonosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTelefonosMousePressed
        jButtonGuardar.setText("Editar");
        Enable();
        jButtonEliminar.setEnabled(true);
        accion = "Editar";
        int Row = jTableTelefonos.rowAtPoint(evt.getPoint());
        
        jLabelIDTelefono.setText(jTableTelefonos.getValueAt(Row, 0).toString());
        jTextFieldIMEI.setText(jTableTelefonos.getValueAt(Row, 1).toString());
        jTextFieldModelo.setText(jTableTelefonos.getValueAt(Row, 2).toString());
        jTextFieldMarca.setText(jTableTelefonos.getValueAt(Row, 3).toString());
        jTextFieldMACAdress.setText(jTableTelefonos.getValueAt(Row, 4).toString());
    }//GEN-LAST:event_jTableTelefonosMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTelefonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTelefonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTelefonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTelefonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTelefonos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancenlar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelIDTelefono;
    private javax.swing.JLabel jLabelTotalRecords;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTelefonos;
    private javax.swing.JTextField jTextFieldIMEI;
    private javax.swing.JTextField jTextFieldMACAdress;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
