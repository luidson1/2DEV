package fafica.org.br.Repositorios;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import fafica.org.br.Conexao.ConexaoMySql;
import fafica.org.br.Modelo.Profissionais;

public class ProfissionaisRepositorio {
	private ConexaoMySql conexao = null;

	public ProfissionaisRepositorio() {
		conexao = ConexaoMySql.getInstance();
	}

	public void cadastrar(Profissionais profissionais) {
		// TODO Auto-generated method stub
		// preparando a conexão com o banco

		String sql = "INSERT INTO profissionais (profissao,descricao_experiencia,descricao_profissao) VALUES (?,?,?)";
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setString(1, profissionais.getProfissao());
			pstmt.setString(2, profissionais.getDescricao_experiencia());
			pstmt.setString(3, profissionais.getDescricao_profissional());
			
			pstmt.execute();

			JOptionPane.showMessageDialog(null,
					"Profissional Lançado");

		} catch (SQLException e) { // tratando erro de sql
			JOptionPane.showMessageDialog(null, "Erro!!!!  " + e.getMessage());

		}
				

	}
}
