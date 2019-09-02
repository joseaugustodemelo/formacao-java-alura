package br.alura.java.parte4.services;

import br.alura.java.parte4.interfaces.Tributavel;

public class CalculadorDeImposto {

	private Double totalImposto = 0.0;
	
	public void registra(Tributavel tributavel) {
		this.totalImposto += tributavel.getValorImposto();
	}
	
	public Double getTotalImposto() {
		return totalImposto;
	}
}
