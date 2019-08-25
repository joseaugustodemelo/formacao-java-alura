package br.alura.bytebank.view;

import br.alura.bytebank.model.Cliente;
import br.alura.bytebank.model.Conta;

public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta(1337, 24226);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		conta.setAgencia(1232123);

		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");

		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());

		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");

		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		System.out.println(Conta.getTotal());

	}

}
