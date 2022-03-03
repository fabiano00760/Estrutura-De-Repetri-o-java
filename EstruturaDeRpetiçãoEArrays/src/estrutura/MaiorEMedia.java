package estrutura;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


/*
 faça um programa q leia 5 numero
 
  e informe o maior 
 e a media desse numero .
 */

public class MaiorEMedia {
	public void MediaEMaior() {


Scanner scan = new Scanner(System.in);
        int maior ;
		String numero;
		int count = 0;
		do {
			System.out.println("numero: ");
			// JOptionPane.showConfirmDialog(null, "digite um numero ");
			Integer.parseInt(numero = JOptionPane.showInputDialog("digite um numero"));
			JOptionPane.showInternalMessageDialog(null, numero);
			System.out.println(numero);
			
	
			 count = count + 1;
			
				 
			 
		} while (count < 5);
	}
	 
	
}
