package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TestePrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		// PrintStream ps = new PrintStream(new File("lorem2.txt"));

		PrintWriter pw = new PrintWriter("lorem2.txt");

		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		pw.println();
		pw.println("asfasdfsafdas dfs sdf asf assd");
		pw.close();
	}
}
