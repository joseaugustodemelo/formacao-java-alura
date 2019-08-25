package br.alura.bytebank.view;

import br.alura.bytebank.model.Conta;

public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(200);
		System.out.println(primeiraConta.getSaldo());

		primeiraConta.setSaldo(100);
		System.out.println(primeiraConta.getSaldo());

		Conta segundaConta = new Conta();
		segundaConta.setSaldo(300);

		System.out.println("primeira conta tem " + primeiraConta.getSaldo());
		System.out.println("segunda conta tem " + segundaConta.getSaldo());

		segundaConta.setAgencia(146);
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());

		System.out.println(segundaConta.getAgencia());

		segundaConta.setAgencia(146);
		System.out.println("agora a segunda conta está na setAgencia() " + segundaConta.getAgencia());

		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
