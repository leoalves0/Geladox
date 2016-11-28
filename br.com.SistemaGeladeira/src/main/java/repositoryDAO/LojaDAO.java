package repositoryDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import entidades.Loja;

public class LojaDAO {
	
	private Connection connection;
	
	public LojaDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Loja loja){
		String sql = "insert into loja (nome,endereco,cnpj, imagem)" +
				"values(?,?,?,?)";
		
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, loja.getNome());
			stmt.setString(2, loja.getEndereco());
			stmt.setString(3, loja.getCnpj());
			stmt.setString(4, loja.getImagem());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	}

