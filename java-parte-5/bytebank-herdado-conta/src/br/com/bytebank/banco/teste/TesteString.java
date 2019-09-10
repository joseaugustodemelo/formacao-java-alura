package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura"; // object literal
		// String outroNome = new String("Alura");

		System.out.println(nome.contains("Al"));
		
		String vazio = " ";
		System.out.println(vazio.trim().isEmpty());
		
		System.out.println(nome.length());
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String substring = nome.substring(1);
		System.out.println(substring);
		
		int indexOf = nome.indexOf("ur");
		System.out.println(indexOf);
		
		char charAt = nome.charAt(2);
		System.out.println(charAt);

		char c = 'A';
		char d = 'a';
		String replace = nome.replace(c, d);
		System.out.println(replace);

		String outroNome = nome.toLowerCase();

		System.out.println(outroNome);
	}

}
