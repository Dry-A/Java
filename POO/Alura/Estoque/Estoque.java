package POO;

public class Estoque {
	// Colocar aqui os atributos

	private String produto;
	private int quantidade;

	// aqui fica o construtor da classe

	public void ProdutoNoEstoque(String nome, int quantidade, String produto) {
			super();

			this.produto = produto;
			this.quantidade = quantidade;

		}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// usando aqui o polimorfismo

	@Override
	public String toString() {
		return "Produto: " + produto + " | Quantidade: " + quantidade;
	}

}