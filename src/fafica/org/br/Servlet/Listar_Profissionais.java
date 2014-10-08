package fafica.org.br.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fafica.org.br.Fachada.Facade;
import fafica.org.br.Modelo.Profissionais;
import fafica.org.br.Modelo.Servicos;

/**
 * Servlet implementation class Listar_Profissionais
 */
@WebServlet("/Listar_Profissionais")
public class Listar_Profissionais extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listar_Profissionais() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Facade f = new Facade();
		ArrayList<Profissionais> profissionais = f.listarProfissionais();
		String mensagem = "";

		if (profissionais.isEmpty()) {

			mensagem = "Nada Cadastrado";

			request.setAttribute("mensagem", mensagem);
			RequestDispatcher rd = request.getRequestDispatcher("/Entrou.html");
			rd.forward(request, response);

		} else {

			request.setAttribute("profissionais", profissionais);

			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/ListarProfissionais.jsp");
			requestDispatcher.forward(request, response);

		}
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
