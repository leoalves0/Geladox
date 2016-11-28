package repositoryDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Produto;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionaProduto(Produto produto){
		String sql = "insert into produto (nome,modelo,fabricante, cor, caracteristicas)"+
					"values(?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getModelo());
			stmt.setString(3, produto.getFabricante());
			stmt.setString(4, produto.getCor());
			stmt.setString(5, produto.getCaracteristicas());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw  new RuntimeException(e);
		}		
			
		
		
				
	}

}
