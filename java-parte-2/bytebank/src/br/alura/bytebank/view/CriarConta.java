package br.alura.bytebank.view;

import br.alura.bytebank.model.Conta;

public class CriarConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();	
		primeiraConta.setSaldo(200);
	    System.out.println(primeiraConta.getSaldo());
	    
	    primeiraConta.setSaldo( primeiraConta.getSaldo() + 100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.setSaldo(50);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());
	}

}
