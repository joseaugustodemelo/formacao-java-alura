package pilha.view;

import pilha.exception.MyException;
import pilha.model.Conta;

public class TestaContaComExcecaoChecked {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MyException e) {
			System.out.println("Tratamento...");
		}
	}
}
