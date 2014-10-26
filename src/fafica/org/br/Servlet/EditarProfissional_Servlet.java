package fafica.org.br.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fafica.org.br.Fachada.Facade;
import fafica.org.br.Modelo.Profissionais;

/**
 * Servlet implementation class EditarProfissional_Servlet
 */
@WebServlet("/EditarProfissional_Servlet")
public class EditarProfissional_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProfissional_Servlet() {
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
		// TODO Auto-generated method stub
		int codigo1 = Integer.parseInt(request.getParameter("codigo1"));
		String profissao = request.getParameter("profissao");
		String desc_profissional = request
				.getParameter("descricao_profissional");
		String desc_experiencia = request.getParameter("descricao_experiencia");
		Profissionais p = new Profissionais();
		Facade f = new Facade();

		try {

			p.setCodigo1(codigo1);
			p.setProfissao(profissao);
			p.setDescricao_profissional(desc_profissional);
			p.setDescricao_experiencia(desc_experiencia);
			
			f.alterarProfissional(p);

		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}

}
