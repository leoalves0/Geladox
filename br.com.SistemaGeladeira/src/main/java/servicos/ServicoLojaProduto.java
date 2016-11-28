package servicos;

import java.util.ArrayList;

import agregadores.LojaProduto;
import entidades.Loja;
import entidades.Produto;
import repository.RepositorioLojaProduto;



public class ServicoLojaProduto {
	LojaProduto lojaProduto = new LojaProduto();
	RepositorioLojaProduto repositorioLojaProduto = new RepositorioLojaProduto();
	

	public ServicoLojaProduto() {

	}

	public LojaProduto solicitarCriacaoLoja(Loja loja,Produto produto) {
		LojaProduto lojaproduto = LojaProduto.CriarLojaProduto(loja,produto);
		repositorioLojaProduto.insert(lojaProduto);
		return lojaproduto;
	}

	public ArrayList<LojaProduto> buscarTodos() {
		return repositorioLojaProduto.findall();
	}
}
