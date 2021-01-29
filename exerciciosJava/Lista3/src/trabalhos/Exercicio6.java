package trabalhos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
	Scanner ler= new Scanner(System.in);
	int n, soma3=0;
	do {
		System.out.println("Digite um número. Para sair digite 0(zero)");
		n=ler.nextInt();
		if(n%3==0) {
			soma3+=n;
		}
	}while(n!=0);
	
	System.out.println("A soma dos números múltiplos de 3 é "+soma3);
}
}

