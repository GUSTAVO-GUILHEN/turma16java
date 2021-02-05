package Hierarquia;

public class Cachorro extends Animal {
		
		//CONSTRUTOR
		public Cachorro(String nome, int idade) {
				super(nome, idade);
			}
		
		public String som() {
			return "Latir";
		}
		
	}