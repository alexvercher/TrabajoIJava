/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
