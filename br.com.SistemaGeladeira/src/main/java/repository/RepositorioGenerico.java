package repository;

import java.util.ArrayList;

import entidades.Loja;

public interface RepositorioGenerico<T> {
	ArrayList<T>select(T t);
	void insert(T t);
	ArrayList<T>delete();
	ArrayList<T> findall();
	T find(T obj);
	Loja find(Loja obj);
	

}
