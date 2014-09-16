package fafica.org.br.Repositorios;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.xml.ws.Response;

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


	
}
