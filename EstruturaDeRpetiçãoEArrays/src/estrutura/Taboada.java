package estrutura;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.security.auth.x500.X500Principal;

public class Taboada {

	public static void LaçoFor() {
		Scanner scan = new Scanner(System.in);
	
	int	Count = 0;
	int quantNumero;
	
	System.out.println("quantidade de vezes q executara a tabuada" );
	 quantNumero = scan.nextInt();
	
	 do {
			System.out.println("tabuada: ");
			int taboada = scan.nextInt();

			System.out.println("taboada de " + taboada);

			for (int i = 1; i <= 10; i++) {

				System.out.println(taboada + " x " + i + " = " + (taboada * i));
			}
				 
				Count = Count + 1;
			}while (Count < quantNumero);
	

			
	
	
			}

}
