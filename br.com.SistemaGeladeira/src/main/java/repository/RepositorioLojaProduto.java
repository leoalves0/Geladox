package repository;

import java.util.ArrayList;

import agregadores.LojaProduto;
import entidades.Loja;


public class RepositorioLojaProduto implements RepositorioGenerico<LojaProduto> {

	ArrayList<LojaProduto> lojaProduto = new ArrayList<LojaProduto>();
	
	@Override
	public ArrayList<LojaProduto> select(LojaProduto t) {
		return null;
	}

	@Override
	public void insert(LojaProduto lojaProduto) {
		this.lojaProduto.add(lojaProduto);
	}

	@Override
	public ArrayList<LojaProduto> delete() {
		return null;
	}

	@Override
	public ArrayList<LojaProduto> findall() {
		return this.lojaProduto;
	}

	@Override
	public LojaProduto find(LojaProduto obj) {
		return null;
	}

	@Override
	public Loja find(Loja obj) {
		return null;
	}

}
