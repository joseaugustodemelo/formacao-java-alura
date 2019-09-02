package br.alura.java.parte4.model;

import br.alura.java.parte4.exceptions.SaldoInsuficienteException;
import br.alura.java.parte4.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		try {
			super.saca(valorASacar);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public Double getValorImposto() {
		return super.saldo * 0.01;
	}
}
