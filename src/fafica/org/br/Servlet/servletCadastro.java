package fafica.org.br.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fafica.org.br.Fachada.Fachada;
import fafica.org.br.Modelo.Servicos;

/**
 * Servlet implementation class servletCadastro
 */
@WebServlet("/servletCadastro")
public class servletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fachada f = new Fachada();
		String titulo = request.getParameter("titulo");
		String categoria = request.getParameter("categoria");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String orcamento = request.getParameter("txtOrcamento");
		String descricao_serv = request.getParameter("txtAreaOrcamento");

		Servicos servico = new Servicos();
		servico.setTitulo_servico(titulo);
		servico.setCategoria(Integer.parseInt(categoria));
		servico.setCidade(cidade);
		servico.setEstado(estado);
		servico.setOrcamento(Integer.parseInt(orcamento));
		servico.setDescricao_serv(descricao_serv);

		f.cadastrarservico(servico);

		request.setAttribute("msg", "Serviço lançado!");

		response.sendRedirect("http://localhost:8085/2DEVS/Entrou.html");
	}

}
