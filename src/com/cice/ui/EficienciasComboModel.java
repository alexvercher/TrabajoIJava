/*
 * Clase para el tratamiento del Combo de eficiencias.
 * Generará una lista de eficiencias que se desplegará en pantalla
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
        return eficiencias.get(index).getDescripcion();
    }
    
    public String getCEnergetica(int index){
       if (index < 0){
            return  " ";
        }        
        return eficiencias.get(index).getcEnergetica();
    }
}
