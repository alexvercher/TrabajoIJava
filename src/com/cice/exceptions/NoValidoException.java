/**
 * Clase de excepción para lanzar cuando haya algún error de datos de entrada
 */

package com.cice.exceptions;

public class NoValidoException extends Exception {
	private String nombreParametro;

	public NoValidoException(String nombreParametro) {
            this.nombreParametro = nombreParametro;
	}

	public String getNombreParametro() {
            return nombreParametro;
	}
}
