package fafica.org.br.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fafica.org.br.Fachada.Facade;
import fafica.org.br.Modelo.Usuario;

/**
 * Servlet implementation class EditarUsuario_Servlet
 */
@WebServlet("/EditarUsuario_Servlet")
public class EditarUsuario_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditarUsuario_Servlet() {
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
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String cidade = request.getParameter("cidade");
		String uf = request.getParameter("uf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Usuario u = new Usuario();
		Facade f = new Facade();

		try {
			u.setNome(nome);
			u.setEndereco(endereco);
			u.setCidade(cidade);
			u.setUf(uf);
			u.setEmail(email);
			u.setSenha(senha);

			f.alterarUsuario(u);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
