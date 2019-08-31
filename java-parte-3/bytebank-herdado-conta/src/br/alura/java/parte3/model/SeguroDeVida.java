package br.alura.java.parte3.model;

import br.alura.java.parte3.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public Double getValorImposto() {
		return 42.0;
	}

}
