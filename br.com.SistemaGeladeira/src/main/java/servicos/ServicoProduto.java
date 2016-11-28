package servicos;

import java.util.ArrayList;


import entidades.Produto;
import fabricas.FabricaProduto;
import repository.RepositorioProduto;
import repositoryDAO.ProdutoDAO;

public class ServicoProduto {
	ProdutoDAO dao = new ProdutoDAO();
	FabricaProduto fabricaProduto = new FabricaProduto();
	//RepositorioProduto repositorioProduto = new RepositorioProduto();

	public ServicoProduto() {
	}

	public Produto solicitarCriacaoProduto(String nome, String modelo, String fabricante, String caracteristicas,
			String cor, String imagem) {
		Produto produto = fabricaProduto.criarProduto(nome, modelo, fabricante, caracteristicas, cor, imagem);
		dao.adicionaProduto(produto);
		return produto;
	}
/*
	public ArrayList<Produto> buscarTodos() {
		return repositorioProduto.findall();
	}*/
}
