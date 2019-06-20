/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ui;

import com.cice.model.Modelo;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author AVECH3H
 */
public class ModelosTableModel implements TableModel{

    private List<Modelo> modelos;
    private String[] nombresColumna = {"Modelo", "Consumo", "Emisiones", "C_Energetica"};
    private Class[] tipos = {String.class, Short.class, Short.class, String.class};
    
    public ModelosTableModel(List<Modelo> modelos){
        this.modelos = modelos;
    }
    
    @Override
    public int getRowCount() {
        return modelos.size();
    }

    @Override
    public int getColumnCount() {
        return nombresColumna.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return nombresColumna[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipos[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Modelo modelo = modelos.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return modelo.getModelo();
            case 1:
                return modelo.getConsumo();
            case 2:
                return modelo.getEmisiones();
            case 3:
                return modelo.getcEnergetica();
            default:
                return "Error";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
    
}
