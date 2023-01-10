package POOHeranca;

public class Cachorro extends Animal {

	private String acao = "corre";
	private String som = "\" au au au au\"";

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

}
