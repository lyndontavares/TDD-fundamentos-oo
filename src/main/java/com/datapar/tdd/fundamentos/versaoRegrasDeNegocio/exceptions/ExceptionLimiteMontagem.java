package com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.exceptions;

public class ExceptionLimiteMontagem extends Exception {
	private static final long serialVersionUID = 1L;
	public ExceptionLimiteMontagem(String msg) {
		super(msg);
		System.err.println(msg);
	}

}
