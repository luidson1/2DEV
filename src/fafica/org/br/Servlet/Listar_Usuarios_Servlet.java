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
import fafica.org.br.Modelo.Usuario;

/**
 * Servlet implementation class Listar_Usuarios_Servlet
 */
@WebServlet("/Listar_Usuarios_Servlet")
public class Listar_Usuarios_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listar_Usuarios_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Facade f = new Facade();
		ArrayList<Usuario> usuarios = f.listarUsuarios();
		String mensagem = "";

		if (usuarios == null || usuarios.isEmpty()) {

			mensagem = "Nada Cadastrado";

			request.setAttribute("mensagem", mensagem);
			RequestDispatcher rd = request.getRequestDispatcher("/Error.html");
			rd.forward(request, response);

		} else {

			request.setAttribute("usuarios", usuarios);

			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/ListarUsuario.jsp");
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
