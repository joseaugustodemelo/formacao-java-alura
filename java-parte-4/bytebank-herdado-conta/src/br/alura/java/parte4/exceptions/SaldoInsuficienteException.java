package br.alura.java.parte4.exceptions;

public class SaldoInsuficienteException extends Exception /*RuntimeException*/ {

	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
