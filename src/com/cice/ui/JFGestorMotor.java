/*
 * Marco principal de la aplicación que englobará todos los paneles
 */
package com.cice.ui;

import java.awt.CardLayout;

/**
 *
 * @author AVECH3H
 */
public class JFGestorMotor extends javax.swing.JFrame {

    private JPBuscar jpBuscar;
    private JPInicio jpInicio = new JPInicio();
    private JPAltaModelo jpAltaModelo = new JPAltaModelo();

    /**
     * Creates new form JFGestorMotor
     */
    public JFGestorMotor() {
        initComponents();
        jpBuscar = new JPBuscar(this);
        setTitle("Gestor Motor");
        setBounds(300, 200, 800, 600); //Asigna la posición y el tamaño del JFrame
        getContentPane().add(jpInicio, "PanelInicio");
        getContentPane().add(jpBuscar, "PanelBuscar");
        getContentPane().add(jpAltaModelo, "PanelAltaModelo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiBuscar = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiInsertar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jMenu1.setText("Inicio");

        jmiBuscar.setText("Buscar");
        jmiBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBuscar);

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jmiInsertar.setText("Insertar Modelo");
        jmiInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInsertarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiInsertar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarActionPerformed
        cambiarPanel("PanelBuscar");
        jpBuscar.inicializarCombo();
    }//GEN-LAST:event_jmiBuscarActionPerformed

    private void jmiInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInsertarActionPerformed
        cambiarPanel("PanelAltaModelo");
    }//GEN-LAST:event_jmiInsertarActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        salir();
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void salir() {
        System.exit(0);
    }

    public void instanciaLista (int idMarca, JFGestorMotor jfg){
        JPListaModelos jpListaModelos = new JPListaModelos(idMarca, jfg);
        getContentPane().add(jpListaModelos, "PanelListaModelos");
    }
    
    public void cambiarPanel(String nombrePanel) {
        ((CardLayout) (getContentPane().getLayout())).show(getContentPane(), nombrePanel);
    }

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
            java.util.logging.Logger.getLogger(JFGestorMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGestorMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGestorMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGestorMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGestorMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiBuscar;
    private javax.swing.JMenuItem jmiInsertar;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
