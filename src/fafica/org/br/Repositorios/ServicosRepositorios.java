package fafica.org.br.Repositorios;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import fafica.org.br.Conexao.ConexaoMySql;
import fafica.org.br.Modelo.Servicos;

public class ServicosRepositorios {
	// preparando a conex�o com o banco SQL
	private ConexaoMySql conexao = null;

	public ServicosRepositorios() {
		conexao = ConexaoMySql.getInstance();

	}

	/**
	 * metodo inserir servi�os
	 * 
	 * @param servicos
	 */
	public void cadastrarservico(Servicos servicos) {
		// TODO Auto-generated method stub
		// codigo inserir o servi�o no banco
		String sql = "insert into servicos (Titulo_servico, Estado, Cidade, Orcamento, Descricao_serv, Categoria) values (?, ?, ?, ?, ?, ?)";
		try {
			// conex�o com o banco
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);

			pstmt.setString(1, servicos.getTitulo_servico());
			pstmt.setString(2, servicos.getEstado());
			pstmt.setString(3, servicos.getCidade());
			pstmt.setFloat(4, servicos.getOrcamento());
			pstmt.setString(5, servicos.getDescricao_serv());
			pstmt.setInt(6, servicos.getCategoria());

			pstmt.execute(); // executar atualiza��o no banco
			// exibir que o servi�o foi cadastrado
			JOptionPane.showMessageDialog(null,
					"Servi�o Lan�ado no sistema com Sucesso! ");

		} catch (SQLException e) { // tratando o erro no banco
			JOptionPane.showMessageDialog(null, "Erro!!!!  " + e.getMessage());

		}

	}

}