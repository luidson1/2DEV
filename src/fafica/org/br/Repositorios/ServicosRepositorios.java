package fafica.org.br.Repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import fafica.org.br.Conexao.ConexaoMySql;
import fafica.org.br.Modelo.Servicos;

public class ServicosRepositorios {
	// preparando a conexão com o banco SQL
	private ConexaoMySql conexao = null;

	public ServicosRepositorios() {
		conexao = ConexaoMySql.getInstance();

	}

	/**
	 * metodo inserir serviços
	 * 
	 * @param servicos
	 */
	public void cadastrarservico(Servicos servicos) {
		// TODO Auto-generated method stub
		// codigo inserir o serviço no banco
		String sql = "insert into servicos (Titulo_servico, Estado, Cidade, Orcamento, Descricao_serv, Categoria) values (?, ?, ?, ?, ?, ?)";
		try {
			// conexão com o banco
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);

			pstmt.setString(1, servicos.getTitulo_servico());
			pstmt.setString(2, servicos.getEstado());
			pstmt.setString(3, servicos.getCidade());
			pstmt.setFloat(4, servicos.getOrcamento());
			pstmt.setString(5, servicos.getDescricao_serv());
			pstmt.setInt(6, servicos.getCategoria());

			pstmt.execute(); // executar atualização no banco
			// exibir que o serviço foi cadastrado
			JOptionPane.showMessageDialog(null,
					"Serviço Lançado no sistema com Sucesso! ");

		} catch (SQLException e) { // tratando o erro no banco
			JOptionPane.showMessageDialog(null, "Erro!!!!  " + e.getMessage());

		}

	}

	// Metodo Pesquisar Profissional para retornar NA JTABLE2.
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
			JOptionPane.showMessageDialog(null,
					"ERRO NO BANCO DE DADOS= " + e.getMessage());
		}
		return listaDeServicos;
	}

}
