package fafica.org.br.Repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import fafica.org.br.Conexao.ConexaoMySql;
import fafica.org.br.Modelo.Usuario;

public class UsuarioRepositorio {
	// preparando a conexão;
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

			e.printStackTrace();
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

	// retornar usuario
	public Usuario retornarUsuario(String email, String senha) {
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
				u.setSenha(rs.getString("senha"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO = " + e.getMessage());
		}

		return u;
	}

	public Usuario buscarUsuario(Usuario usuario) throws SQLException {
		String sql = " SELECT * FROM Usuario WHERE email = ?";
		Usuario usr = null;

		try {

			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.execute();
			pstmt.setString(1, usuario.getNome());
			pstmt.setString(2, usuario.getEmail());
			pstmt.setString(3, usuario.getSenha());
			pstmt.setString(4, usuario.getEndereco());
			pstmt.setString(5, usuario.getCidade());
			pstmt.setString(6, usuario.getUf());
			pstmt.execute();

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

		}
		return usr;

	}

	// deletar usuario no banco
	public void deletarUsuario(String email, String senha) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM usuario WHERE email = ? and senha = ?";
		try {

			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setString(1, email);
			pstmt.setString(2, senha);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// alterar usuario no banco
	public void alterarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		String sql = "UPDATE usuario SET nome = ? , email = ?, senha = ?, endereco = ? , cidade = ? , uf = ?  WHERE email = ?";
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setString(1, u.getNome());
			pstmt.setString(2, u.getEmail());
			pstmt.setString(3, u.getSenha());
			pstmt.setString(4, u.getEndereco());
			pstmt.setString(5, u.getCidade());
			pstmt.setString(6, u.getUf());
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
