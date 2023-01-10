package POOHeranca;

public class Animal {

	/*
	 * Herança
	 * 
	 * 01) Crie uma hierarquia de classes os atributos e comportamentos descritos,
	 * utilize os seus conhecimentos e distribua as características de forma que
	 * tudo o que for comum a todos os animais fique na classe Animal:
	 * 
	 * Cachorro:  			Cavalo: 				Preguiça:
	 * 
	 * Possui nome,			Possui nome,			Possui nome,
	 * possui idade,		possui idade,			possui idade,
	 * deve emitir som,		deve emitir som,		deve emitir som,
	 * deve correr,			deve correr,			deve subir em árvore*/

		private String nome;
		private int idade;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
			
	}
