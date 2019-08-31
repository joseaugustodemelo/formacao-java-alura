package br.alura.java.parte3.controller;

import br.alura.java.parte3.model.Funcionario;

public class ControleBonificacao {

	private double soma;

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;

    }
    
    public double getSoma() {
		return soma;
	}
}
