package fafica.org.br.Controladores;

import fafica.org.br.Modelo.Usuario;
import fafica.org.br.Repositorios.UsuarioRepositorio;

public class UsuarioControle {

	public UsuarioRepositorio us = null;

	public UsuarioControle() {
		// TODO Auto-generated constructor stub
		this.us = new UsuarioRepositorio();
	}
// chamando o metodo cadastrar usuario no repositório
	public void cadastrarUsuario(Usuario u) {
		us.cadastrarUsuario(u);
		
	}
// chamando o metodo validar login no repositório
	public boolean Login(String email, String senha) {
		return this.us.Login(email, senha);

	}
// retornando os dados do usuario
	public Usuario retornarUsuario(String email, String senha) {
		// TODO Auto-generated method stub
		return this.us.retornarUsuario(email, senha);
	}
// chamando metodo deletar usuario no repositorio
	public void deletarUsuario(String cpf, String senha) {
		// TODO Auto-generated method stub
		this.us.deletarUsuario(cpf, senha);
	}
// chamando metodo alterar usuario no repositorio
	public void alterarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		this.us.alterarUsuario(u);
		
	}

}
