package agregadores;

import entidades.Loja;
import entidades.Produto;

public class LojaProduto {
	Produto produto;
	Loja loja;

	private LojaProduto(Loja loja, Produto produto) {
		this.produto = produto;
		this.loja = loja;
	}

	public LojaProduto() {
		// TODO Auto-generated constructor stub
	}

	public static LojaProduto CriarLojaProduto(Loja loja, Produto produto) {
		return new LojaProduto(loja, produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

}
