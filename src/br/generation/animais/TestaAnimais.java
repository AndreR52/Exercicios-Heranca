package br.generation.animais;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Pregui�a sloth = new Pregui�a();
				
		dog.setNome("Coragem");
		dog.setIdade(8);
		
		horse.setNome("P� de Pano");
		horse.setIdade(12);
		
		sloth.setNome("Flecha");
		sloth.setIdade(4);
		
		System.out.println("Nome do cachorro: " + dog.getNome());
		System.out.println("Idade do cachorro: " + dog.getIdade() + " anos");
		System.out.println();
		
		dog.emitirSom();
		dog.correr();
		System.out.println();
		
		System.out.println("Nome do cavalo: " + horse.getNome());
		System.out.println("Idade do cavalo: " + horse.getIdade() + " anos");
		System.out.println();
		
		horse.emitirSom();
		horse.correr();
		System.out.println();
		
		System.out.println("Nome da pregui�a: " + sloth.getNome());
		System.out.println("Idade da pregui�a: " + dog.getIdade() + " anos");
		System.out.println();
		
		sloth.emitirSom();
		sloth.subirEmArvore();	
	}

}
