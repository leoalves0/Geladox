package fabricas;

import entidades.Loja;

public class FabricaLoja {
	
	public FabricaLoja(){
		
	}
	public Loja criarLoja(String nome, String endereco, String cnpj, String imagem){
		return Loja.CriarLoja(nome,endereco,cnpj,imagem);
    }
}
