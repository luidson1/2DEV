package fafica.org.br.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fafica.org.br.Fachada.Facade;
import fafica.org.br.Modelo.Usuario;

/**
 * Servlet implementation class Login_Servlet
 */
@WebServlet("/Login_Servlet")
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login_Servlet() {
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
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		String usuarioSalvo = getServletContext().getInitParameter("email");
		String senhaSalva = getServletContext().getInitParameter("senha");
		
		Facade f = new Facade();

		boolean autenticado = f.Login(email, senha);

		if (autenticado  && email != null && senha != null && email != "" && senha != "") {

			// pega a sessão, caso não exista cria uma nova
			HttpSession session = request.getSession(true);
			// cria um atributo de sessão
			session.setAttribute("user", f.retornarusuario(email, senha));

			// redireciona para outra servlet
			response.sendRedirect("home");
		} else {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/Error2.html");
			dispatcher.forward(request, response);
		}

	}

}
