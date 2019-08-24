package br.alura.java.parte1;

public class TestaLacos2 {

	public static void main(String[] args) {
		
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
