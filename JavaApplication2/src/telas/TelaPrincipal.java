/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Senai
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        btnProdutos1 = new javax.swing.JButton();
        btnCArnes = new javax.swing.JButton();
        btnCArnes1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProdutos1.setBackground(new java.awt.Color(153, 153, 153));
        btnProdutos1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnProdutos1.setText("Ver mais");
        btnProdutos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 730, 250, 60));

        btnCArnes.setBackground(new java.awt.Color(153, 153, 153));
        btnCArnes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCArnes.setText("Ver mais");
        btnCArnes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCArnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCArnesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCArnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 730, 250, 60));

        btnCArnes1.setBackground(new java.awt.Color(153, 153, 153));
        btnCArnes1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCArnes1.setText("Ver mais");
        btnCArnes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCArnes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCArnes1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCArnes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 730, 250, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/ReTelaPrincipal.png"))); // NOI18N
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCArnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCArnesActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCArnesActionPerformed

    private void btnProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdutos1ActionPerformed

    private void btnCArnes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCArnes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCArnes1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCArnes;
    private javax.swing.JButton btnCArnes1;
    private javax.swing.JButton btnProdutos1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}