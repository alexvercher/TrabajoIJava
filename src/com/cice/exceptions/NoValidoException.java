package com.cice.registrador.exceptions;

public class NoValidoException extends Exception {
	private String nombreParametro;

	public NoValidoException(String nombreParametro) {
		super("Error en los parámetros");
		this.nombreParametro = nombreParametro;
	}

	public String getNombreParametro() {
		return nombreParametro;
	}
}
