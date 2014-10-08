package fafica.org.br.Modelo;

public class Usuario {
	private String nome;
	private String senha;
	private String email;
	private int avaliacao;
	private String endereco;
	private String cidade;
	private String uf;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nome, String senha, String email, int avaliacao,
			String endereco, String cidade, String uf) {
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.avaliacao = avaliacao;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
