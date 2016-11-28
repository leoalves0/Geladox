package repository;

import java.util.ArrayList;

import entidades.Loja;
import entidades.Produto;

public class RepositorioProduto implements RepositorioGenerico<Produto> {
	ArrayList<Produto> produto = new ArrayList<Produto>();

	public RepositorioProduto() {

	}

	@Override
	public ArrayList<Produto> select(Produto produto) {
		return null;
	}

	@Override
	public void insert(Produto produto) {
		this.produto.add(produto);

	}

	@Override
	public ArrayList<Produto> delete() {
		return null;
	}

	@Override
	public ArrayList<Produto> findall() {
		return this.produto;
	}

	@Override
	public Loja find(Loja obj) {
		return null;
	}

	@Override
	public Produto find(Produto obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
