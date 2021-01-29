import java.util.Scanner;

public class conta {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double saldo = 0.00;
		char operacao;
		
		System.out.println("Bem vindo a sua conta poupança.");
		System.out.println("Qual o movimento? \n1 - Creditar\n2 - Debitar");
		operacao = ler.next().charAt(0);
		
		if (operacao == '1')
		{
			System.out.println("Quanto deseja creditar de sua conta poupança? ");
			saldo = ler.nextDouble() *-1;
		}
			else if (operacao == '2')
		{
			System.out.println("Quanto deseja debitar de sua conta poupança? ");
			saldo = ler.nextDouble();
		}
		
		
		
		saldo = saldo + (saldo*0.005);
		
		
		System.out.println("Fim de programa!!!");
	
	
	
	
		}
	}

