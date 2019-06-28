/*
 * Panel de alta de modelo.
 * Insertando los valores correspondientes se dará de alta el modelo
 * en la BBDD
 */
package com.cice.ui;

import com.cice.controller.EnumEficiencias;
import com.cice.controller.GestorEficiencias;
import com.cice.controller.GestorMarcas;
import com.cice.controller.GestorModelos;
import com.cice.exceptions.NoValidoException;
import com.cice.model.Eficiencia;
import com.cice.model.Modelo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AVECH3H
 */
public class JPAltaModelo extends javax.swing.JPanel {

    //Constantes
    private static final String INFO_MODELO = "MODEL CREADO CORRECTAMENTE";
    private static final String ERR_NUMEROS = "Ingresar solo números";
    private static final String ERR_CARACTER = "Carácter inválido";
    private static final String ERR_ID_MARCA = "Elija una marca de la lista";
    private static final String ERR_CONSUMO = "Inserte valor de consumo";
    private static final String ERR_EMISIONES = "Inserte valor de emisiones";
    private static final String ERR_MODELO = "Debe introducir un modelo";
    //Variables de la clase
    private float consumo = 0;
    private float emision = 0;
    private GestorMarcas gm = new GestorMarcas();
    private GestorEficiencias ge = new GestorEficiencias();
    private ArrayList<EnumEficiencias> eficienciasArray = new ArrayList<>();
    /**
     * Creates new form JPAltaModelo
     */
    public JPAltaModelo() {
        initComponents();
        inicializarCampos();
    }

    public void inicializarCampos() {
        try {
            MarcasComboModel mcm = new MarcasComboModel(gm.getMarcas());
            EficienciasComboModel ecm = new EficienciasComboModel(ge.getEficiencias());
            cargarArrayListEficiencias();
            EficienciasComboModelEnum ecme = new EficienciasComboModelEnum(eficienciasArray);
            jcbListaMarcas.setModel(mcm);
            jcbEficiencia.setModel(ecme);
            jtfModelo.setText("");
            jtfConsumo.setText("");
            jtfEmisiones.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void cargarArrayListEficiencias(){
        eficienciasArray.add(EnumEficiencias.CA);
        eficienciasArray.add(EnumEficiencias.CB); 
        eficienciasArray.add(EnumEficiencias.CC);
        eficienciasArray.add(EnumEficiencias.CD);
        eficienciasArray.add(EnumEficiencias.CE);
        eficienciasArray.add(EnumEficiencias.CF);
        eficienciasArray.add(EnumEficiencias.CG);
        eficienciasArray.add(EnumEficiencias.NA);        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jtfConsumo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbAlta = new javax.swing.JButton();
        jcbListaMarcas = new javax.swing.JComboBox<>();
        jcbEficiencia = new javax.swing.JComboBox<>();
        jtfEmisiones = new javax.swing.JTextField();

        jLabel1.setText("Marca");

        jLabel2.setText("Modelo");

        jLabel3.setText("Consumo");

        jLabel4.setText("Emisiones");

        jtfConsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfConsumoKeyTyped(evt);
            }
        });

        jLabel5.setText("Certificacion Energética");

        jbAlta.setText("ALTA MODELO");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jcbListaMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcbEficiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtfEmisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmisionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbListaMarcas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfModelo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfEmisiones, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addComponent(jcbEficiencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAlta)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbListaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEmisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEmisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmisionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmisionesActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed

        int selectedMarca = jcbListaMarcas.getSelectedIndex();
        int selectedEficiencia = jcbEficiencia.getSelectedIndex();

        int idMarcaSelected = ((MarcasComboModel) jcbListaMarcas.getModel()).getIdMarca(selectedMarca);
        //String cEnergetica = ((EficienciasComboModel) jcbEficiencia.getModel()).getCEnergetica(selectedEficiencia);
        String cEnergetica = ((EficienciasComboModelEnum) jcbEficiencia.getModel()).getLetra(selectedEficiencia);
        
        if(jtfConsumo.getText().trim().length() != 0){
            consumo = Float.parseFloat(jtfConsumo.getText());
        }
        
        if (jtfEmisiones.getText().trim().length() != 0){
            emision = Float.parseFloat(jtfEmisiones.getText());
        }

        try {
            Modelo modelo = new Modelo(idMarcaSelected, jtfModelo.getText(), consumo, emision, cEnergetica);
            GestorModelos gm = new GestorModelos();
            gm.addModelo(modelo);
            showDialog(INFO_MODELO);
            inicializarCampos();
        } catch (NoValidoException ex) {
            showDialog(ex.getNombreParametro());
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jtfConsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfConsumoKeyTyped

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(jtfEmisiones, ERR_NUMEROS);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 45 
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 245) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(jtfEmisiones, ERR_CARACTER);
        }
    }//GEN-LAST:event_jtfConsumoKeyTyped

    private void showDialog(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAlta;
    private javax.swing.JComboBox<String> jcbEficiencia;
    private javax.swing.JComboBox<String> jcbListaMarcas;
    private javax.swing.JTextField jtfConsumo;
    private javax.swing.JTextField jtfEmisiones;
    private javax.swing.JTextField jtfModelo;
    // End of variables declaration//GEN-END:variables
}
