/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ui;

import com.cice.model.Eficiencia;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author AVECH3H
 */
public class EficienciasComboModel extends DefaultComboBoxModel<String>{
    
    private List<Eficiencia> eficiencias;
    
    public EficienciasComboModel(List<Eficiencia> eficiencias){
        this.eficiencias = eficiencias;
    }
    
    @Override
    public int getSize() {
        return eficiencias.size();
    }

    @Override
    public String getElementAt(int index) {
        return eficiencias.get(index).getcEnergetica();
    }
    
    public String getCEnergetica(int index){
        return eficiencias.get(index).getcEnergetica();
    }
}
