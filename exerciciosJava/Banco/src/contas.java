import java.util.Scanner;

public class contas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
int opcaoExterna = 1;
		
		int opcao = 0;
		double saldo;
		
		while (opcaoExterna == 1) {
		
			while (true) {
			
				System.out.print("NOME DO BANCO G#"
						+ "\nSLOGAN - FRASE"
						+ "\n"
						+ "\n"
						+ "1 - CONTA POUPAN�A\n"
						+ "2 - CONTA CORRENTE\n"
						+ "3 - CONTA ESPECIAL\n"
						+ "4 - CONTA EMPRESA\n"
						+ "5 - CONTA ESTUDANTIL\n"
						+ "6 - SAIR\n\n"
						+ "SELECIONE O TIPO DE CONTA: ");
				
				opcao = ler.nextInt();
				
				if (opcao == 1)
				{
					System.out.print("op��o1");
				}
				else if (opcao == 2)
				{
					System.out.print("op��o2");
				}
				else if (opcao == 3)
				{
					System.out.print("op��o3");
				}
				else if (opcao == 4)
				{
					System.out.print("op��o4");
				}
				else if (opcao == 5)
				{
					System.out.print("op��o5");
				}
				else if (opcao == 6)
				{
					System.out.print("Saindo da sua conta ...");
					break; //sai do loop
				}
				System.out.println("\n\n\n");
			}
			System.out.println("\nDeseja acessar a conta com outro usu�rio? [1 - sim / 2 - n�o]");
			opcaoExterna = ler.nextInt();
		}
		
		ler.close();
		
	}
}
