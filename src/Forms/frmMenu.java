package Forms;

public class frmMenu extends javax.swing.JFrame {
    
    public frmMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemTelefonos = new javax.swing.JMenuItem();
        jMenuItemMarcas = new javax.swing.JMenuItem();
        jMenuItemModelos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menú");

        jMenuItemTelefonos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItemTelefonos.setText("Teléfonos");
        jMenuItemTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemTelefonosMousePressed(evt);
            }
        });
        jMenu1.add(jMenuItemTelefonos);

        jMenuItemMarcas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItemMarcas.setText("Marcas");
        jMenuItemMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemMarcasMousePressed(evt);
            }
        });
        jMenu1.add(jMenuItemMarcas);

        jMenuItemModelos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItemModelos.setText("Modelos");
        jMenuItemModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemModelosMousePressed(evt);
            }
        });
        jMenu1.add(jMenuItemModelos);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Información de Estudiante");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemModelosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemModelosMousePressed
        frmModelos verfrmModelos = new frmModelos();
        verfrmModelos.show();
    }//GEN-LAST:event_jMenuItemModelosMousePressed

    private void jMenuItemMarcasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemMarcasMousePressed
        frmMarcas verfrmMarcas = new frmMarcas();
        verfrmMarcas.show();
    }//GEN-LAST:event_jMenuItemMarcasMousePressed

    private void jMenuItemTelefonosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemTelefonosMousePressed
        frmTelefonos verfrmTelefonos = new frmTelefonos();
        verfrmTelefonos.show();
    }//GEN-LAST:event_jMenuItemTelefonosMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        studentinfo verstudentinfo = new studentinfo();
        verstudentinfo.show();
    }//GEN-LAST:event_jMenuItem1MousePressed
    
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemMarcas;
    private javax.swing.JMenuItem jMenuItemModelos;
    private javax.swing.JMenuItem jMenuItemTelefonos;
    // End of variables declaration//GEN-END:variables
}
