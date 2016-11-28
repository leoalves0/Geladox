package servicos;

import java.util.ArrayList;

import entidades.Loja;
import fabricas.FabricaLoja;
import repository.RepositorioLoja;
import repositoryDAO.LojaDAO;

public class ServicoLoja {
	LojaDAO dao = new LojaDAO();
	FabricaLoja fabricaLoja = new FabricaLoja();
	//RepositorioLoja repositorioLoja = new RepositorioLoja();

	public ServicoLoja() {

	}

	public Loja solicitarCriacaoLoja(String nome, String endereco, String cnpj, String imagem) {
		Loja loja = fabricaLoja.criarLoja(nome, endereco, cnpj, imagem);
		dao.adiciona(loja);
		return loja;
		
		
		
	}
/*
	public ArrayList<Loja> buscarTodos() {
		return repositorioLoja.findall();
	}*/
}
