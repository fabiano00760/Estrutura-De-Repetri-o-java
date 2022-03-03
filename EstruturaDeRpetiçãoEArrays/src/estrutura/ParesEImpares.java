package estrutura;

import java.util.Scanner;

/*
 faça um programa que peça n  numero interiro
 clacule e mostre a quantidade de numero paraes 
 e a qualquidade de numero impares 
 */
public class ParesEImpares {
	public static void ParesImpares() {
		Scanner scan = new Scanner(System.in);

		int numero;
		int quatNumero;
		int quantPares = 0, quantImpares = 0;

		System.out.println("quantidade de numero :  ");
		quatNumero = scan.nextInt();

		int count = 0;
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
		
			
			if (numero % 2 == 0) quantImpares ++;  
			else quantImpares++;
			
			count ++ ;

		} while (count < quatNumero);
		
		System.out.println("quantidadde par: " + quantImpares);
		System.out.println("quantidade de impares: " + quantImpares);

	}

}
