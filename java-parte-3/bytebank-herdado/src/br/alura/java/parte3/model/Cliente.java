package br.alura.java.parte3.model;

import br.alura.java.parte3.interfaces.Autenticavel;
import br.alura.java.parte3.util.AutenticacaoUtil;

public class Cliente implements Autenticavel {

	private AutenticacaoUtil util;

    public Cliente() {
        this.util = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }

}
