/*
 * Interfaz para la construcción de la gestión de la tabla Eficiencias.
 * Se compone de 1 método:
 * - Recupera las eficiencias
 */
package com.cice.interfaces;

import com.cice.model.Eficiencia;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public interface IEficienciaDAO {
    
        public List<Eficiencia> getEficiencias() throws Exception;    
}
