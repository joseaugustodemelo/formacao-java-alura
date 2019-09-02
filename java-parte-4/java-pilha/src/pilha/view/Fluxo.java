package pilha.view;

import pilha.exception.MyException;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MyException {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MyException {
		System.out.println("Ini do metodo2");
		throw new MyException("deu muito errado."); 
	}

}
