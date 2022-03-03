package estrutura;

import java.util.Scanner;

public class Nota {
	public void nota() {
		try (Scanner scan = new Scanner(System.in)) {
			int nota;

			System.out.println("nota: ");
			nota = scan.nextInt();

			while (nota < 0 || nota > 10) {
				System.out.println("nota invalida! digite novamente ");

				nota = scan.nextInt();

				
				int num = 5, count = 1;
		        while(count <= 3) {
		            ++count;
		            num += count;
		        }
		        System.out.println(num);
				
				
				
			}
		}
	}
}