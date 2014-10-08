package fafica.org.br.Repositorios;

import java.sql.SQLException;

import fafica.org.br.Modelo.Usuario;

public interface IUsuarioRepositorio {
	public void cadastrarUsuario(Usuario u);
	public boolean Login(String email, String senha);
	public Usuario retornarUsuario(String email,String senha);
	public Usuario buscarUsuario(Usuario usuario) throws SQLException;
	public void deletarUsuario(String email, String senha);
	public void alterarUsuario(Usuario u) ;
}
