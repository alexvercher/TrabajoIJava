/*
 * Panel de lista de modelos.
 * Contiene la lista de los modelos de una marca seleccionada desde el panel
 * buscar.
 */
package com.cice.ui;

import com.cice.controller.GestorModelos;
import com.cice.model.Modelo;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author AVECH3H
 */
public class JPListaModelos extends javax.swing.JPanel {

    //Constantes
    private static final String PANEL_BUSCAR = "PanelBuscar";
    private static final String ERR_FILA = "Seleccione la fila a borrar";
    private static final String PREGUNTA = "¿Estás seguro que quiere eliminar el modelo?";
    private static final String BORRADO_MODELO = "Borrado de Modelo";
    //Variables
    private JFGestorMotor jfg;
    private int idMarca = 0;

/**
 * 
 * @param idMarca: Marca seleccionada
 * @param jfg: Isntancia del marco principal
 */
    public JPListaModelos(int idMarca, JFGestorMotor jfg) {
        initComponents();
        this.jfg = jfg;
        this.idMarca = idMarca;
        cargarDatos(idMarca);
    }

    public void cargarDatos(int idMarca) {
        GestorModelos gm = new GestorModelos();
        List<Modelo> modelos = null;
        ModelosTableModel mtm = null;

        try {
            modelos = gm.getModelosMarca(idMarca);
            mtm = new ModelosTableModel(modelos);
            jTableModelos.setModel(mtm);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }

    private void showDialog(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModelos = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-25.png"))); // NOI18N
        jButton1.setToolTipText("Eliminar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-google-web-search-25.png"))); // NOI18N
        jButton2.setToolTipText("Nueva Búsqueda");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jTableModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MODELO", "CONSUMO", "EMISIONES", "C_ENERGETICA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Short.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableModelos);
        if (jTableModelos.getColumnModel().getColumnCount() > 0) {
            jTableModelos.getColumnModel().getColumn(2).setResizable(false);
            jTableModelos.getColumnModel().getColumn(3).setResizable(false);
            jTableModelos.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt : Evento de borrado del modelo seleccionado
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (confirmarBorrado()) {
            borrarModelo();
            cargarDatos(idMarca);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jfg.cambiarPanel(PANEL_BUSCAR);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void borrarModelo() {
        int filaSeleccionada = jTableModelos.getSelectedRow();

        if (filaSeleccionada == -1) {
            showDialog(ERR_FILA);
        } else {
            try {
                GestorModelos gm = new GestorModelos();
                int idModelo = (int) jTableModelos.getModel().getValueAt(filaSeleccionada, 4);
                gm.deleteModelo(idModelo);
            } catch (Exception ex) {
                showDialog(ex.getMessage());
            }
        }
    }

    private boolean confirmarBorrado() {
        int n = JOptionPane.showConfirmDialog(
                this, 
                PREGUNTA, 
                BORRADO_MODELO,
                JOptionPane.YES_NO_OPTION);
        return (n == JOptionPane.OK_OPTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModelos;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
