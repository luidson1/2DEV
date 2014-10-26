package fafica.org.br.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fafica.org.br.Fachada.Facade;
import fafica.org.br.Modelo.Servicos;
import fafica.org.br.Modelo.Usuario;

/**
 * Servlet implementation class EditarServicos_Servlet
 */
@WebServlet("/EditarServicos_Servlet")
public class EditarServicos_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditarServicos_Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int codigo = Integer.parseInt(request.getParameter("codigo_servico"));
		String titulo_servico = request.getParameter("titulo_servico");
		float orcamento = Float.parseFloat(request.getParameter("orcamento"));
		String duracao = request.getParameter("duracao");
		String desc_trabalho = request.getParameter("descricao_trabalho");

		Servicos s = new Servicos();

		Facade f = new Facade();

		try {
			s.setCodigo(codigo);
			s.setTitulo_servico(titulo_servico);
			s.setOrcamento(orcamento);
			s.setDuracao(duracao);
			s.setDescricao_serv(desc_trabalho);

			f.alterarServicos(s);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
