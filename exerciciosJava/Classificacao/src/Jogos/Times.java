package Jogos;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String times [] = {"CORINTHIANS","PALMEIRAS","SANTOS","SPFC"};
		
		int pontos[]= new int[4];
		String resposta;
		int matriz[][] = new int[4][4];
		
			for(int x=0; x<4 ;x++);
			{
				System.out.println("Rodada ");
				for(int y=0;y<4;y++)
				{
					System.out.printf(times[y],"G - Ganhou P - Perdeu ou E - Empatou [G/P/E]: ");
					
					resposta = ler.next().toUpperCase();
					if (resposta =="G")
					{
						pontos[y] = pontos[y]+3;
					}
					else if (resposta == "E")
					{
						pontos[y] = pontos[y]+1;
					}
					else if(resposta == "P")
					{
						pontos[y] = pontos[y]+0;
					}
				}
				System.out.print("\n");
			}
		System.out.print("\n");
		for(int z = 0; z<4; z++)
		{
			System.out.printf(times[z],"finalizou com ",pontos[z]," pontos.\n");
		}
		
	}

}
