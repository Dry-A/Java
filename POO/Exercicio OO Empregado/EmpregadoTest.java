package POO;

public class EmpregadoTest {

	public static void main(String[] args) {

		Empregado[] lista = new Empregado[3];

		lista[0] = new Empregado("Dry Alb", 35000);
		lista[1] = new Empregado("Bernardo Oliver", 15000);
		lista[2] = new Empregado("Rafaelli Normam", 45750);

		for (Empregado roda : lista) {// criei um laço de repetição para rodar a classe Empregado
			// com uma variável de loop chamada roda e vai imprir as informações dos
			// Empregados
			// da primeira posição até a última posição da minha lista

			roda.imprimir();
		}

		System.out.println("******************************************************");
		for (Empregado roda : lista) {
			roda.aumentarSalario(20);
			roda.imprimir();
		}

	}

}
