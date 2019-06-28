/*
 * Interfaz para la construcción de la gestión de la tabla Marcas.
 * Se compone de 1 método:
 * - Recupera las marcas
 */
package com.cice.interfaces;

import com.cice.model.Marca;
import java.util.List;

/**
 *
 * @author AVECH3H
 */
public interface IMarcaDAO {

    public List<Marca> getMarcas() throws Exception;    
}
