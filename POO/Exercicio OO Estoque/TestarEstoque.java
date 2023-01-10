package POO;


	import java.util.ArrayList;
	import java.util.Scanner;
	
public class TestarEstoque {
		
		public static void main(final String[] args) {

			try (Scanner input = new Scanner(System.in)) {
				try (Scanner sc = new Scanner(System.in)) {
					ArrayList<ProdutoNoEstoque> estoque = new ArrayList<>();

					int opcao = 0;

					System.out.println();
					System.out.println("                     Estoque da Dry                    ");

					do {

						System.out.println("\n  ___________________________________________________");
						System.out.println("  |                                                 |");
						System.out.println("  |      1 - Apresentar os produtos em estoque      |");
						System.out.println("  |      2 - Adicionar um novo produto              |");
						System.out.println("  |      3 - Atualizar um produto por posição       |");
						System.out.println("  |      4 - Remover um produto por posição         |");
						System.out.println("  |      0 - Sair do Sistema                        |");
						System.out.println("  |_________________________________________________|");
						System.out.println("  |                                                 |");
						System.out.println("  |       [Digite uma das opções acima]             |");
						System.out.println("  |_________________________________________________|\n");

						opcao = sc.nextInt();

						System.out.println();
						switch (opcao) {

						case 1:

							System.out.println("LISTA DE PRODUTOS NO ESTOQUE: \n");
							for (int i = 0; i < estoque.size(); i++) {
								System.out.printf("Posição %d - %s\n", i, estoque.get(i));
							}
							if (estoque.size() < 1) {
								System.out.println("Nenhum produto em estoque.");

							}
							opcao = 0;
							break;

						case 2:
							System.out.print("INFORME QUANTOS PRODUTOS DESEJA INSERIR: ");

							int qtd = input.nextInt();
							input.nextLine();

							for (int i = 0; i < qtd; i++) {

								System.out.print("\nInsira o nome do " + (i + 1) + "º produto: ");
								final String nome = input.nextLine();
								System.out.print("Insira a quantidade que será adicionada ao estoque: ");
								int quantidade = sc.nextInt();
								estoque.add(new ProdutoNoEstoque(nome, quantidade));

							}
							opcao = 0;
							break;

						case 3:

							if (estoque.size() < 1) {
								System.out.println("Nenhum produto em estoque.");
							}

							else {
								System.out.println("LISTA DE PRODUTOS EM ESTOQUE: \n");
								for (int i = 0; i < estoque.size(); i++) {
									System.out.printf("Posição %d - %s\n", i, estoque.get(i));
								}

								System.out.printf("\nINFORME O NÚMERO DA POSIÇÃO DO PRODUTO QUE SERÁ ATUALIZADO:\n");
								int i = input.nextInt();

								try {
									System.out.print("\nInsira o nome do produto: ");
									final String nome = input.next();
									System.out.print("Insira a quantidade em estoque: ");
									int quantidade = sc.nextInt();

									estoque.set(i, new ProdutoNoEstoque(nome, quantidade));

								} catch (IndexOutOfBoundsException e) {

									System.out.printf("\nErro: posição inválida (%s).", e.getMessage());
								}

							}
							opcao = 0;
							break;

						case 4:
							if (estoque.size() < 1) {
								System.out.println("Nenhum produto em estoque.");
							}

							else {
								System.out.println("LISTA DE PRODUTOS EM ESTOQUE: \n");
								for (int i = 0; i < estoque.size(); i++) {
									System.out.printf("Posição %d - %s\n", i, estoque.get(i));
								}

								System.out.printf("\nINFORME O NÚMERO DA POSIÇÃO DO PRODUTO QUE SERÁ EXCLUÍDO:\n");
								int i = input.nextInt();

								try {
									estoque.remove(i);
								} catch (IndexOutOfBoundsException e) {

									System.out.printf("\nErro: posição inválida (%s).", e.getMessage());
								}

							}

							opcao = 0;
							break;

						case 0:
							System.out.println("              SISTEMA ENCERRADO ");
							System.exit(0);
						default:
							System.out.print(" Essa não é uma opcao Válida ");
							break;
						}

					} while (true);
				}
			}

		}

	}
