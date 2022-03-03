package estrutura;

import java.util.Scanner;

public class NomeEIdade {
	public void NomeEIdade() {
		Scanner scan = new Scanner(System.in);

		String nome;
		int idade;

		while (true) {

			System.out.println("nome: ");
			nome = scan.next();
			if (nome.equals("0"))
				break;

			System.out.println("idade: ");
			idade = scan.nextInt();

			if (idade == 35)
				break;

		}

	}

	
}