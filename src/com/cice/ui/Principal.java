package com.cice.ui;

import com.cice.controller.GestorMarcas;
import com.cice.model.Marca;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AVECH3H
 */
public class Principal {

    public static void main(String[] args) {

        GestorMarcas marcas = new GestorMarcas();
        List<Marca> lista = new ArrayList<>();

        try {
            lista = marcas.getMarcas();
            for (Marca mar : lista) {
                System.out.println(mar.getDescMarca());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
