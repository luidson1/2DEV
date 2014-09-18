package fafica.org.br.Repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import fafica.org.br.Conexao.ConexaoMySql;
import fafica.org.br.Modelo.Usuario;

public class UsuarioRepositorio {
	// preparando a conex�o;
	private ConexaoMySql conexao = null;

	public UsuarioRepositorio() {
		conexao = ConexaoMySql.getInstance();
	}

	// inserindo um novo usuario no banco
	public void cadastrarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO usuario (nome, email, senha) VALUES (?,?,?)";
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setString(1, u.getNome());
			pstmt.setString(2, u.getEmail());
			pstmt.setString(3, u.getSenha());
			pstmt.execute();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro!!!!  " + e.getMessage());

		}
	}

	// validar login e senha no banco
	public boolean Login(String email, String senha) {
		// TODO Auto-generated method stub
		boolean autenticado = false;
		String sql = "SELECT * FROM Usuario WHERE email =? and senha = ?";
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, senha);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				autenticado = true;
			}
			ps.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Erro ao logar: " + e.getMessage());
		}

		return autenticado;

	}

	public Usuario retornarUsuario(String email, String senha) {
		// retornar usuario
		String sql = "SELECT email,senha FROM usuario where email = ?";
		Usuario u = new Usuario();
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setString(1, email);
			pstmt.execute();
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				u.setEmail(rs.getString("email"));
				u.setEmail(rs.getString("senha"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO = " + e.getMessage());
		}

		return u;
	}

	public Usuario buscarUsuario(Usuario usuario) throws SQLException {
		String sql = " SELECT * FROM Usuario WHERE email = ? and senha = ? ";
		Usuario usr = null;

		try {

			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.execute();
			pstmt.setString(1, usuario.getNome());
			pstmt.setString(2, usuario.getSenha());

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String email = rs.getString("nome");
				String senha = rs.getString("senha");

				usr = new Usuario();
				usr.setEmail(email);
				usr.setSenha(senha);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
		return usr;

	}
}
