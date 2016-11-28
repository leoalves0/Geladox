package entidades;

public class Produto {
	
private	String nome;
private	String modelo;
private	String fabricante;
private	String caracteristicas;
private	String cor;
private	String imagem;
	
	public Produto(String nome, String modelo, String fabricante, String caracteristicas,String cor,String imagem) {
		this.nome=nome;
		this.modelo=modelo;
		this.fabricante=fabricante;
		this.caracteristicas=caracteristicas;
		this.imagem=imagem;
		this.cor=cor;
	}
	public static Produto criarProduto(String nome, String modelo, String fabricante, String caracteristicas,String cor,String imagem){
		return new Produto(nome, modelo, fabricante,caracteristicas,cor,imagem);
	}
	public String getNome() {
		return nome;
	}
	public String getModelo() {
		return modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public String getCor() {
		return cor;
	}
	public String getImagem() {
		return imagem;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
    
    
    
    
    
    
    
    
}
   