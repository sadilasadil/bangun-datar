/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
    import logic.lingkaran;
/**
 *
 * @author Salsadila
 */
public class lingkaranView extends javax.swing.JFrame {
    lingkaran control;
    /**
     * Creates new form lingkaranView
     */
    public lingkaranView() {
        initComponents();
        control = new lingkaran();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtjari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label_luas = new javax.swing.JLabel();
        label_keliling = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kelilingg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        luass = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\pic\\0fb9e438bf292df2141c58fe0751ebd1.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtjari);
        txtjari.setBounds(100, 30, 170, 30);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 30, 80, 30);

        jLabel2.setText("Keliling :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 60, 30);
        getContentPane().add(label_luas);
        label_luas.setBounds(100, 70, 0, 30);
        getContentPane().add(label_keliling);
        label_keliling.setBounds(100, 110, 0, 30);

        jLabel5.setText("Jari-Jari");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 30, 50, 30);

        kelilingg.setText("0");
        getContentPane().add(kelilingg);
        kelilingg.setBounds(120, 110, 130, 30);

        jLabel4.setText("Luas :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 70, 50, 30);

        luass.setText("0");
        getContentPane().add(luass);
        luass.setBounds(120, 70, 150, 30);

        jButton5.setText("Kembali");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(300, 170, 80, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 150, 400, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\pic\\0fb9e438bf292df2141c58fe0751ebd1.jpg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-140, -40, 560, 300);

        setBounds(0, 0, 416, 247);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double luas=0;
        double keliling=0;
        double jari=Double.parseDouble(txtjari.getText());
        control.setJari(jari);
        luas = control.hitungLuas();
        keliling = control.hitungKeliling();
        luass.setText(String.valueOf(luas));
        kelilingg.setText(String.valueOf(keliling));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new mainView().show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new mainView().show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(lingkaranView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lingkaranView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lingkaranView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lingkaranView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lingkaranView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel kelilingg;
    private javax.swing.JLabel label_keliling;
    private javax.swing.JLabel label_luas;
    private javax.swing.JLabel luass;
    private javax.swing.JTextField txtjari;
    // End of variables declaration//GEN-END:variables
}
