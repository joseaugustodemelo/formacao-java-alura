package br.com.alura.java.io.teste;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		String s = "ç";
		System.out.println(s.codePointAt(0));

		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);

		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII, ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		bytes = s1.getBytes(utf8);
		String s2 = new String(bytes, utf8);
		System.out.println(s2);

		// Construtor passando o encode que deseja utilizar
		PrintWriter ps = new PrintWriter("lorem2,txt", "UTF-8");
		
	}

}
