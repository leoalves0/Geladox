package fabricas;

import entidades.Produto;

public class FabricaProduto {
	
	public FabricaProduto() {

	}

	public Produto criarProduto(String nome, String modelo, String fabricante, String caracteristicas,String cor,String imagem) {
		return Produto.criarProduto(nome,modelo,fabricante,caracteristicas,cor,imagem);
	}

}
