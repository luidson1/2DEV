package fafica.org.br.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fafica.org.br.Fachada.Facade;
import fafica.org.br.Modelo.Usuario;

/**
 * Servlet implementation class ServletAutenticar_Usuario
 */
@WebServlet("/ServletAutenticar_Usuario")
public class ServletAutenticar_Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAutenticar_Usuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
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
		try {
			Usuario u = new Usuario();
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");

			String nomeSalvo = getServletContext().getInitParameter("nome");
			String senhaSalva = getServletContext().getInitParameter("senha");

			if (nome != null && email != null && senha != null
					&& nome.equals(nomeSalvo) && senha.equals(senhaSalva)) {
				Facade f = new Facade();
				u.setNome(nome);
				u.setEmail(email);
				u.setSenha(senha);
				f.cadastrarUsuario(u);
				// pega a sessão, caso não exista cria uma nova
				HttpSession session = request.getSession(true);
				// cria um atributo de sessão
				session.setAttribute("user", new Usuario());

				// redireciona para outra servlet
				response.sendRedirect("http://localhost:8085/2DEVS/Entrou.html");
			} else {

				RequestDispatcher dispatcher = request
						.getRequestDispatcher("http://localhost:8085/2DEVS/Erro_cadastro.html");
				dispatcher.forward(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
