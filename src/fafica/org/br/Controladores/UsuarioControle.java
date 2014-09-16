package fafica.org.br.Controladores;

import fafica.org.br.Modelo.Usuario;
import fafica.org.br.Repositorios.UsuarioRepositorio;

public class UsuarioControle {
	
	public UsuarioRepositorio  us = null;

	 public UsuarioControle() {
		// TODO Auto-generated constructor stub
		 this.us = new UsuarioRepositorio();
		}
	 
	 public void cadastrarUsuario (Usuario u) {
		 us.cadastrarUsuario(u);

	}

	


}
