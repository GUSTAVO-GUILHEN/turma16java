package BANK16;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		char op;
		double valor;
		//Conta conta1 = new Conta()
		System.out.println("Digite o numero da conta: ");
		String numero = leia.next();
		System.out.println("Digite o cpf: ");
		String cpf = leia.next();
		
		Conta conta1 = new Conta(numero, cpf);
		
		for (int x=1 ; x<10; x++)
		{
			System.out.println("Digite D-debito ou C-credito: ");
			op=leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o valor: ");
			valor = leia.nextDouble();
			
			if(op == 'D')
			{
				
			} else if (op == 'C')
			{
				
			} else
			{
				System.out.println("Opção invalida!!!");
			}
		}
		
		
		
		
		
	}
}
