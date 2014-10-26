package fafica.org.br.Controladores;

import java.util.ArrayList;

import fafica.org.br.Modelo.Usuario;
import fafica.org.br.Repositorios.UsuarioRepositorio;

public class UsuarioControle {

	public UsuarioRepositorio us = null;

	public UsuarioControle() {
		// TODO Auto-generated constructor stub
		this.us = new UsuarioRepositorio();
	}

	// cadastrar usuario no repositório
	public void cadastrarUsuario(Usuario u) {
		us.cadastrarUsuario(u);

	}

	// validar login no repositório
	public boolean Login(String email, String senha) {
		return this.us.Login(email, senha);

	}

	// retornando os dados do usuario
	public Usuario retornarUsuario(String email, String senha) {
		// TODO Auto-generated method stub
		return this.us.retornarUsuario(email, senha);
	}

	// deletar usuario no repositorio
	public void deletarUsuario(String email) {
		// TODO Auto-generated method stub
		this.us.deletarUsuario(email);
	}

	// alterar usuario no repositorio
	public void alterarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		this.us.alterarUsuario(u);

	}

	public ArrayList<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return this.us.listarUsuarios();
	}

}
