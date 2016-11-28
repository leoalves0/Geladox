package servicos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import agregadores.LojaProduto;
import entidades.Loja;
import entidades.Produto;

import repositoryDAO.LojaDAO;

public class ServicoFachada {
	ServicoLoja servicoLoja = new ServicoLoja();
	ServicoProduto servicoProduto = new ServicoProduto();
	ServicoLojaProduto servicoLojaProduto = new ServicoLojaProduto();

	public ServicoFachada() {

	}

	public Loja solicitarServicoLoja(String nome, String endereco, String cnpj, String imagem) {
		//LojaDAO dao = new LojaDAO();
		Loja loja = servicoLoja.solicitarCriacaoLoja(nome, endereco, cnpj, imagem);
		//dao.adiciona(loja);

		

		return loja;

	}
/*
	public ArrayList<Loja> buscarTodasLojas() {
		return servicoLoja.buscarTodos();

	}*/

	public Produto solicitarServicoProduto(String nome, String modelo, String fabricante, String caracteristicas,
			String cor, String imagem) {
		Produto produto = servicoProduto.solicitarCriacaoProduto(nome, modelo, fabricante, caracteristicas, cor,
				imagem);
	
		return produto;
	}

	/*public ArrayList<Produto> buscarTodosProdutos() {
		PreparedStatement stmt = connection
				
		return servicoProduto.buscarTodos();
	}*/
		
	

	public LojaProduto solicitarServicoLojaProduto(Loja loja, Produto produto) {
		LojaProduto lojaProduto = servicoLojaProduto.solicitarCriacaoLoja(loja, produto);
		return lojaProduto;
	}
	
	
	
/*	public List<Contato> getLista() throws SQLException{
		PreparedStatement stmt = this.connection.prepareStatement("select * from contacts");
		ResultSet rs = stmt.executeQuery();
		
		List<Contato> contatos = new ArrayList<>();
		
		while (rs.next()){
			Contato contato = new Contato();
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataNascimento"));
			contato.setDataNascimento(data);
			contato.setTecnologias(rs.getString("tecnologias"));
			contato.setConhecimento(rs.getString("conhecimento"));
			contato.setComentario(rs.getString("comentarios"));
			contatos.add(contato);
		}
		
		rs.close();
		stmt.close();
		return contatos;
	}*/

/*
	public ArrayList<LojaProduto> buscarLojaProduto() {
		return servicoLojaProduto.buscarTodos();
	}*/
}
