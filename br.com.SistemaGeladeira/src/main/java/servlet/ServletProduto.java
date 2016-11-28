package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Produto;
import repositoryDAO.ProdutoDAO;
import servicos.ServicoFachada;


@WebServlet("/ServletProduto")

public class ServletProduto extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	ServicoFachada servicoFachada = new ServicoFachada();
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws
    IOException, ServletException {
		
		//Produto parametros
        String nomeProduto = request.getParameter("nome");
    	String modeloProduto = request.getParameter("modelo") ;
    	String fabricanteProduto = request.getParameter("fabricante");
    	String caracteristicasProduto = String.join(", ", request.getParameter("caracteristicas"));
    	String corProduto = request.getParameter("cor");
    	String imagemProduto= request.getParameter("imagem");
    	
    	//Criar Produto
    	
    	@SuppressWarnings("unused")
		Produto produto = servicoFachada.solicitarServicoProduto(nomeProduto, modeloProduto, fabricanteProduto, caracteristicasProduto, corProduto, imagemProduto);
        System.out.println("deu certo");
    	//Lista Produtos
    	//ArrayList<Produto> ListProduto = servicoFachada.buscarTodosProdutos();
		
        RequestDispatcher rd = request.getRequestDispatcher("index.html");
		 rd.forward(request, response);

	}
       
   
}
