package br.alura.java.parte3.view;

import br.alura.java.parte3.model.ContaCorrente;
import br.alura.java.parte3.model.SeguroDeVida;
import br.alura.java.parte3.services.CalculadorDeImposto;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100.0);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(contaCorrente);
		calc.registra(seguroDeVida);
		
		System.out.println(calc.getTotalImposto());
	}
}
