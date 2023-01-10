package POOPolimorfismo;

public class TestarAnimais {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("\n#### Exemplos de animais que emitem som e se movimentam de maneiras distintas: ####\n");
		
		cachorro.som();
		cachorro.movimento();
		System.out.println();
		cavalo.som();
		cavalo.movimento();
		System.out.println();
		preguica.som();
		preguica.movimento();
		
		
		/*
		Os 3 objetos (cachorro, cavalo e preguica) são do tipo Animal,
		isso pode ser confirmado através do uso do instanceo que retorna true para os 3 objetos
		
		System.out.println(cachorro instanceof Animal);
		System.out.println(cavalo instanceof Animal);
		System.out.println(preguica instanceof Animal);*/
		
				
	}
}