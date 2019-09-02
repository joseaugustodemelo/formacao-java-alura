package pilha.view;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");

		metodo2();

		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");

		metodo2();

		System.out.println("Fim do metodo2");
	}

}
