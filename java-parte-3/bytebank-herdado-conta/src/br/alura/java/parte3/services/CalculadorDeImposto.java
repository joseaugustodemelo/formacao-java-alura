package br.alura.java.parte3.services;

import br.alura.java.parte3.interfaces.Tributavel;

public class CalculadorDeImposto {

	private Double totalImposto = 0.0;
	
	public void registra(Tributavel tributavel) {
		this.totalImposto += tributavel.getValorImposto();
	}
	
	public Double getTotalImposto() {
		return totalImposto;
	}
}
