package Trabalhos;

import java.util.Scanner;

public class Programação1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String agenda[][] = new String [24][31]; //0-23 e 0-30
		String nome;
		int dia=0, hora=0;
		char opcao;
		// aqui vai ter o inicio do loop
		System.out.println("Digite o seu nome: ");
		nome = ler.next();
		
		do
		{
			System.out.print("\nESCOLHA UM DIA PARA CADASTRO [1/31]: ");
			// usuario digitou entre 1 e 31*
			dia = ler.nextInt();
			while (dia <=0 || dia >= 31)
			{
				System.out.print("\nData informada incorreta, escolha uma data entre 1 e 31:");
				dia = ler.nextInt(); //saida do loop
			}
			//dia = dia - 1 //
			dia -= 1; //ajuste para evitar o estouro da matriz
			System.out.print("SELECIONE A HORA DO EVENTO[0-23]: "); //usuario digitou entre 0 e 23
			hora = ler.nextInt();
			while( hora < 0 || hora >= 23 )
			{
				System.out.print("\nHora informada incorreta, escolha entre 0 e 23 h: ");
				hora = ler.nextInt();
			}
			System.out.print("\nInforme a tarefa nesta data e hora:");
			(agenda[hora][dia - 1]) = ler.next();
			System.out.print("Continua 1-sim ou 2-não:");
			opcao = ler.next().charAt(0);
			
			} 
		while (opcao=='N');
		/*for (int x= 0; x<24; x++) 
		{
			for(int y=0; y<31;y++)
			{
				if (agenda[x][y]==null)
				{
					System.out.printf("\nDia: %d - hora %d - Tarefa: %s\n",y,x,agenda[x][y]);	
				}
				*/
				for (String[] i: agenda)
				{
					for (String j : i)
					{
						System.out.println(j);
					}
				}
			}
		
	}
