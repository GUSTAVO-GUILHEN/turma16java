package TestaAnimal;

import Hierarquia.Cachorro;
import Hierarquia.Cavalo;
import Hierarquia.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro a1 = new Cachorro("Dog", 7);
		a1.emitirSom();
		a1.correr();

		Cavalo a2 = new Cavalo("Cavalo", 7);
		a2.emitirSom();
		a2.correr();
		
		Preguica a3 = new Preguica("Preguica", 7);
		a3.emitirSom();
		a3.subirArvore();
	}

}

