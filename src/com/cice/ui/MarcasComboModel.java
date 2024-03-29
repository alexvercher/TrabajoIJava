/**
 * Clase para el tratamiento del Combo de marcas.
 * Generará una lista de marcas que se desplegará en pantalla 
 */

package com.cice.ui;

import com.cice.model.Marca;
import java.util.List;
import javax.swing.DefaultComboBoxModel;


public class MarcasComboModel extends DefaultComboBoxModel<String>{
    private List<Marca> marcas = null;
    
    public MarcasComboModel(List<Marca> marcas){
        this.marcas = marcas;
    }
    
    @Override
    public int getSize() {
        return marcas.size();
    }

    @Override
    public String getElementAt(int index) {
        return marcas.get(index).getDescMarca();
    }
    
    public int getIdMarca(int index){
        if (index < 0){
            return 0;
        }
        return marcas.get(index).getIdMarca();
    }
}
