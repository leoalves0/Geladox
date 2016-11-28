package servlet;

import java.io.*;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


import entidades.Loja;

import servicos.ServicoFachada;

@WebServlet("/ServletLojista")
public class ServletLojista extends HttpServlet {

	private static final long serialVersionUID = 1L;

	ServicoFachada servicoFachada = new ServicoFachada();

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Loja parametros
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String cnpj = request.getParameter("cnpj");
		String imagem = request.getParameter("imagem");
		

		// Criar Loja
		@SuppressWarnings("unused")
		Loja loja = servicoFachada.solicitarServicoLoja(nome, endereco, cnpj, imagem);
		
		
        //System.out.println("deu certo");
/*
		// Lista Lojas
		ArrayList<Loja> ListLoja = servicoFachada.buscarTodasLojas();
*/
		
		  RequestDispatcher rd = request.getRequestDispatcher("ViewProduto.jsp");
		  rd.forward(request, response);
		 
	}
}