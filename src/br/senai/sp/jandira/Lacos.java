package br.senai.sp.jandira;

import java.util.Scanner;

public class Lacos {

	public static void main(String[] args) {
		
//		int repeticao = 1; 
//		
//		while(repeticao <= 50) {
//		
//		System.out.println(repeticao + " - Camila Alves Pinheiro");
//		repeticao ++;
//		}
		
		// Calcúlo de fibonacci
		
		int valor = 8; 
		int fibonacci = valor * (valor - 1);
		
		
		while(valor > 2 ) {
			valor--;
			fibonacci = fibonacci * (valor - 1);
			//System.out.println(fibonacci);
			
			
		}
		System.out.println(fibonacci);
	
		Scanner leitor = new Scanner(System.in);
		String resposta = "s";
		
		
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Legal, mais uma volta. Uhuu!!");
			System.out.println("Mais uma volta (s/n)?");
			resposta = leitor.next();
			
		}
		System.out.println("A brincadeira acabou!");
		
		
	}

}
