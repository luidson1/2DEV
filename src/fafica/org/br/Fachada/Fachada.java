package fafica.org.br.Fachada;

import fafica.org.br.Controladores.UsuarioControle;
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
	public void cadastrarUsuario(Usuario usuario){
		UsuarioControle usuariocontrol = new UsuarioControle();
		usuariocontrol.cadastrarUsuario(usuario);

	}

}
