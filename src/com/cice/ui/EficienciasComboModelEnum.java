/**
 * Clase para el tratamiento del Combo de eficiencias.
 * Generará una lista de eficiencias que se desplegará en pantalla
 */
package com.cice.ui;

import com.cice.controller.EnumEficiencias;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class EficienciasComboModelEnum extends DefaultComboBoxModel<String> {

    private ArrayList<EnumEficiencias> eficiencias;

    public EficienciasComboModelEnum(ArrayList<EnumEficiencias> eficiencias) {
        this.eficiencias = eficiencias;
    }

    @Override
    public int getSize() {
        return this.eficiencias.size();
    }

    @Override
    public String getElementAt(int index) {
        return eficiencias.get(index).getTexto();
    }
    
    public String getLetra(int index){
       if (index < 0){
            return  " ";
        }        
        return eficiencias.get(index).getLetra();
    }
}
