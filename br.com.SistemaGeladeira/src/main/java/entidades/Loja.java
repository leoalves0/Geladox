package entidades;

public class Loja {
	private String nome;
	private String endereco;
	private String cnpj;
	private String imagem;
	

	
	private Loja(String nome, String endereco, String cnpj, String imagem){
		this.nome=nome;
		this.endereco=endereco;
		this.cnpj=cnpj;
		this.imagem=imagem;
	}
	public static Loja CriarLoja(String nome, String endereco, String cnpj, String imagem){
		return new Loja(nome,endereco,cnpj,imagem);
	}
	
    public String getNome(){
    	return nome;
    }
    public void setNome(String nome){
    	this.nome=nome;
    }
    public String getEndereco(){
    	return endereco;
    }
    public void setEndereco(String endereco){
    	this.endereco=endereco;
    }
    public String getCnpj(){
    	return cnpj;
    }
    public void setCnpj(String cnpj){
    	this.cnpj=cnpj;
    }
    public String getImagem(){
    	return imagem;
    }
    public void setImagem(String imagem){
    	this.imagem=imagem;
    }
}
