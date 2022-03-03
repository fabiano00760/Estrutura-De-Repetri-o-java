package estrutura;

/*
 * crie um vetor de 6 numero inteiros
 *  e mostre-os na ordem inversa.
 */
public class Vetor {
	
	public static void Vetor() {
		int[] vetor = {-5,-6,15,50,8,4};
		
	
		
		System.out.print("vetor: ");
		
		int count =0;
		while (count <= (vetor.length-1)) {
			System.out.print(vetor[count]+ " ");
			count =count+1;
		}
		System.out.print("\nvetor: ");
		for (int i = (vetor.length - 1);i == 0; i =i-1);
		int i = 0;
		System.out.print(vetor[i] + "");
		
	}

}
