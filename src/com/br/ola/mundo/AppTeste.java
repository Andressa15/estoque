package com.br.ola.mundo;
import java.util.Scanner;
public class AppTeste {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println(" qual é quantidade maxima do estoque");
		int maximaDoProduto = s.nextInt();

		System.out.println(" Qual é quantidade minima do estoque");
		int	minimaDeProduto = s.nextInt();
		
		System.out.println(" qual estoque atual");
		int qMedia = (maximaDoProduto + minimaDeProduto) / s.nextInt();

		System.out.println(" quantidade media é " + qMedia);

	}

}
