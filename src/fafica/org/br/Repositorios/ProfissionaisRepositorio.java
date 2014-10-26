package fafica.org.br.Repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import fafica.org.br.Conexao.ConexaoMySql;
import fafica.org.br.Modelo.Profissionais;
import fafica.org.br.Modelo.Servicos;

public class ProfissionaisRepositorio {
	private ConexaoMySql conexao = null;

	public ProfissionaisRepositorio() {
		conexao = ConexaoMySql.getInstance();
	}

	public void cadastrar(Profissionais profissionais) {
		// TODO Auto-generated method stub
		// preparando a conexão com o banco

		String sql = "INSERT INTO profissionais (profissao,descricao_profissional,descricao_experiencia) VALUES (?,?,?)";
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setString(1, profissionais.getProfissao());
			pstmt.setString(2, profissionais.getDescricao_profissional());
			pstmt.setString(3, profissionais.getDescricao_experiencia());

			pstmt.execute();

		} catch (SQLException e) { // tratando erro de sql
			e.printStackTrace();

		}

	}
// listar profissionais
	public ArrayList<Profissionais> listarProfissionais() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM profissionais";
		ArrayList<Profissionais> listaDeProfissionais = null;
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			ResultSet rs = pstmt.executeQuery();
			listaDeProfissionais = new ArrayList<Profissionais>();
			while (rs.next()) {
				Profissionais p = new Profissionais();
				p.setCodigo1(rs.getInt("codigo1"));
				p.setProfissao(rs.getString("profissao"));
				p.setDescricao_profissional(rs
						.getString("descricao_profissional"));
				p.setDescricao_experiencia(rs
						.getString("descricao_experiencia"));
				p.setPositivos(rs.getInt("positivos"));
				p.setNegativos(rs.getInt("negativos"));
				listaDeProfissionais.add(p);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaDeProfissionais;
	}
// deletar profissional
	public void deletarProfissional(int codigo1){
		String sql = "DELETE FROM profissionais WHERE codigo1 = ?";
		try {

			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setInt(1, codigo1);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// alterar profissional
	public void alterarProfissional(Profissionais p){
		String sql = "UPDATE profissionais SET profissao = ? , descricao_profissional = ?, descricao_experiencia = ? WHERE codigo1 = ?";
		try {
			PreparedStatement pstmt = conexao.getConnection().prepareStatement(
					sql);
			pstmt.setString(1, p.getProfissao());
			pstmt.setString(2, p.getDescricao_profissional());
			pstmt.setString(3, p.getDescricao_experiencia());
			pstmt.setInt(4, p.getCodigo1());
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		}

		
	}
}
