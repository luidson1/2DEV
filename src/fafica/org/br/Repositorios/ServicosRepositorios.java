package fafica.org.br.Repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		String sql = "insert into servicos (Titulo_servico, Estado, Cidade, Orcamento, Descricao_serv, Categoria, Duracao) values (?, ?, ?, ?, ?, ?,?)";
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
			pstmt.setString(7, servicos.getDuracao());

			pstmt.execute(); // executar atualiza��o no banco
			// exibir que o servi�o foi cadastrado
		} catch (SQLException e) { // tratando o erro no banco
			e.printStackTrace();
		}

	}

	// Metodo Pesquisar Servicos
	public ArrayList<Servicos> listarServicos() {
		String sql = "SELECT * FROM servicos";
		ArrayList<Servicos> listaDeServicos = null;
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			ResultSet rs = pstmt.executeQuery();
			listaDeServicos = new ArrayList<Servicos>();
			while (rs.next()) {
				Servicos s = new Servicos();
				s.setCodigo(rs.getInt("codigo"));
				s.setTitulo_servico(rs.getString("titulo_servico"));
				s.setEstado(rs.getString("estado"));
				s.setCidade(rs.getString("cidade"));
				s.setOrcamento(rs.getFloat("orcamento"));
				s.setCategoria(rs.getInt("categoria"));
				listaDeServicos.add(s);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaDeServicos;
	}

	// deletar servico
	public void deletarServicos(int codigo) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM servicos WHERE codigo = ?";
		try {

			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setInt(1, codigo);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
// alterar servicos
	public void alterarServicos(Servicos servicos) {
		String sql = "UPDATE servicos SET Titulo_servico = ? , Orcamento = ? , Descricao_serv = ? , Duracao = ?  WHERE codigo = ?";
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setString(1, servicos.getTitulo_servico());
			pstmt.setFloat(2, servicos.getOrcamento());
			pstmt.setString(3, servicos.getDescricao_serv());
			pstmt.setString(4, servicos.getDuracao());
			pstmt.setInt(5, servicos.getCodigo());
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
