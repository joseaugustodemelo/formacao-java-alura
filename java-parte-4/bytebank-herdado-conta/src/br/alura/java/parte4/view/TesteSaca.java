package br.alura.java.parte4.view;

import br.alura.java.parte4.exceptions.SaldoInsuficienteException;
import br.alura.java.parte4.model.Conta;
import br.alura.java.parte4.model.ContaCorrente;

public class TesteSaca {
	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta contaCorrente = new ContaCorrente(123, 321);
		
		contaCorrente.deposita(200.0);
		contaCorrente.saca(200.0);
		
		System.out.println(contaCorrente.getSaldo());
		
	}
}
