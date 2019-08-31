package br.alura.java.parte3.model;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
        return 200;
	}

}
