package exercicio6;

import exercicio6.ClasseCB;

public class ObjetoCB {

	public static void main(String[] args) {

		ClasseCB jose = new ClasseCB("Conta Poupança", "Itau", "457896-856");
		
		System.out.println("Tipo da Conta:	Agencia:  Conta: ");
		System.out.println(jose.descrição + " \t" + jose.agencia+ "\t" + jose.codigo + "\t");
		
	}

}

