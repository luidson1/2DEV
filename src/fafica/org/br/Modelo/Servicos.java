package fafica.org.br.Modelo;

public class Servicos {

	private int codigo;
	private String Titulo_servico;
	private int Categoria;
	private String Estado;
	private String Cidade;
	private float Orcamento;
	private String Descricao_serv;
	private String Duracao;

	public Servicos() {
		// TODO Auto-generated constructor stub

	}

	public Servicos(int codigo, String Titulo_servico, int Categoria,
			String Estado, String Cidade, float Orcamento,
			String Descricao_serv, String Duracao) {
		this.codigo = codigo;
		this.Titulo_servico = Titulo_servico;
		this.Categoria = Categoria;
		this.Estado = Estado;
		this.Cidade = Cidade;
		this.Orcamento = Orcamento;
		this.Descricao_serv = Descricao_serv;
		this.Duracao = Duracao;
	}

	public String getDuracao() {
		return Duracao;
	}

	public void setDuracao(String duracao) {
		Duracao = duracao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo_servico() {
		return Titulo_servico;
	}

	public void setTitulo_servico(String titulo_servico) {
		this.Titulo_servico = titulo_servico;
	}

	public int getCategoria() {
		return Categoria;
	}

	public void setCategoria(int categoria) {
		this.Categoria = categoria;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		this.Estado = estado;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		this.Cidade = cidade;
	}

	public float getOrcamento() {
		return Orcamento;
	}

	public void setOrcamento(float orcamento) {
		this.Orcamento = orcamento;
	}

	public String getDescricao_serv() {
		return Descricao_serv;
	}

	public void setDescricao_serv(String descricao_serv) {
		this.Descricao_serv = descricao_serv;
	}
}
