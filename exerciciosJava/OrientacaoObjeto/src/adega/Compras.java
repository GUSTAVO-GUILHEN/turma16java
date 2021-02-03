package adega;

import java.util.Scanner;
import adegaClasse.compradores;

public class Compras {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int continuar;
		
		
		
		System.out.println("Olá, seja bem vindo a AdeGusta!\nPara continuar, tecle 1, para sair, tecle 2: ");
		continuar = leia.nextInt();
		
		compradores comprador1 = new compradores();
		System.out.print("\nInforme seu nome: ");
		/* nome = ler.nextLine();
		System.out.print("Informe seu sexo [M/F/O]: ");
		sexo = ler.next().toUpperCase().charAt(0);
		while (!(sexo == 'M' || sexo == 'F' || sexo == 'O'))
		{
			System.out.print("Informe seu sexo [M/F/O]: ");
			sexo = ler.next().toUpperCase().charAt(0);
		}	
		*/
		
		System.out.println("Obrigado, volte sempre!");
	}
	
	

}
