package exercicio1;

import java.util.Scanner;

import exercicio1.Cliente;

public class ObjetoCliente {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Cliente people = new Cliente("Raimundo", "\nCPF: 400289220-55", "\nRua Clélia, 115");
		
		System.out.println(people.mostraTela());
		
		leia.close();
	}

}