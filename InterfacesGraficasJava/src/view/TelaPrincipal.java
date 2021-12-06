/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author daia_
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

        jMenuBar = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemCad = new javax.swing.JMenuItem();
        jMenuItemAlt = new javax.swing.JMenuItem();
        jMenuItemExc = new javax.swing.JMenuItem();
        jMenuItemPesq = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemCad1 = new javax.swing.JMenuItem();
        jMenuItemAlt1 = new javax.swing.JMenuItem();
        jMenuItemExc1 = new javax.swing.JMenuItem();
        jMenuItemPesq1 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jMenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page.png"))); // NOI18N
        jMenuArquivo.setText("Arquivos");

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar.add(jMenuArquivo);

        jMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jMenuUsuarios.setText("Usuarios");

        jMenuItemCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        jMenuItemCad.setText("Cadastrar");
        jMenuItemCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemCad);

        jMenuItemAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
        jMenuItemAlt.setText("Alterar");
        jMenuUsuarios.add(jMenuItemAlt);

        jMenuItemExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
        jMenuItemExc.setText("Excluir");
        jMenuUsuarios.add(jMenuItemExc);

        jMenuItemPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        jMenuItemPesq.setText("Pesquisar");
        jMenuItemPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesqActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemPesq);

        jMenuBar.add(jMenuUsuarios);

        jMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        jMenuClientes.setText("Clientes");

        jMenuItemCad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_add.png"))); // NOI18N
        jMenuItemCad1.setText("Cadastrar");
        jMenuClientes.add(jMenuItemCad1);

        jMenuItemAlt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_edit.png"))); // NOI18N
        jMenuItemAlt1.setText("Alterar");
        jMenuClientes.add(jMenuItemAlt1);

        jMenuItemExc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_delete.png"))); // NOI18N
        jMenuItemExc1.setText("Excluir");
        jMenuClientes.add(jMenuItemExc1);

        jMenuItemPesq1.setText("Pesquisar");
        jMenuClientes.add(jMenuItemPesq1);

        jMenuBar.add(jMenuClientes);

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        jMenuSobre.setText("Sobre");
        jMenuBar.add(jMenuSobre);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadActionPerformed

    private void jMenuItemPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPesqActionPerformed

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
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuItemAlt;
    private javax.swing.JMenuItem jMenuItemAlt1;
    private javax.swing.JMenuItem jMenuItemCad;
    private javax.swing.JMenuItem jMenuItemCad1;
    private javax.swing.JMenuItem jMenuItemExc;
    private javax.swing.JMenuItem jMenuItemExc1;
    private javax.swing.JMenuItem jMenuItemPesq;
    private javax.swing.JMenuItem jMenuItemPesq1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenu jMenuUsuarios;
    // End of variables declaration//GEN-END:variables
}
