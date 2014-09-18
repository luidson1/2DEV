package fafica.org.br.Fachada;

import fafica.org.br.Controladores.ProfissionaisControle;
import fafica.org.br.Controladores.ServicosControle;
import fafica.org.br.Controladores.UsuarioControle;
import fafica.org.br.Modelo.Profissionais;
import fafica.org.br.Modelo.Servicos;
import fafica.org.br.Modelo.Usuario;

public class Fachada {
	private static Fachada instance = null;

	public Fachada() {
	}

	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return instance;
	}

	// Cadastrar usuário
	public void cadastrarUsuario(Usuario usuario) {
		UsuarioControle usuariocontrol = new UsuarioControle();
		usuariocontrol.cadastrarUsuario(usuario);
	}

	// validar login usuario
	public boolean Login(String email, String senha) {
		UsuarioControle control = new UsuarioControle();
		return control.Login(email, senha);
	}

	// retornar o usuario depois que é validado o login
	public Usuario retornarusuario(String email, String senha) {
		// TODO Auto-generated method stub
		UsuarioControle controlu = new UsuarioControle();
		return controlu.retornarUsuario(email, senha);
	}

	// cadastrar serviços
	public void cadastrarservico(Servicos servicos) {
		ServicosControle control = new ServicosControle();
		control.cadastrarservico(servicos);
	}

		// cadastrar profissional
		public void cadastrarprofissional(Profissionais profissionais) {
			// TODO Auto-generated method stub
			ProfissionaisControle control = new ProfissionaisControle();
			control.cadastrar(profissionais);		
		
		
	}
}