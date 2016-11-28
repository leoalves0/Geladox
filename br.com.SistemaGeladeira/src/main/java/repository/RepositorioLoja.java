package repository;

import java.util.ArrayList;

import entidades.Loja;

public class RepositorioLoja implements RepositorioGenerico<Loja> {
	ArrayList<Loja> loja = new ArrayList<Loja>();

	public RepositorioLoja() {

	}

	@Override
	public ArrayList<Loja> select(Loja loja) {
		return select(loja);
	}

	@Override
	public void insert(Loja loja) {
		this.loja.add(loja);

	}

	@Override
	public ArrayList<Loja> delete() {
		return null;
	}

	@Override
	public ArrayList<Loja> findall() {
		return this.loja;
	}

	@Override
	public Loja find(Loja obj) {
		return null;
	}

}
