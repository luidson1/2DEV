package fafica.org.br.Modelo;

// criando a classe profissional e seus atributos
public class Profissionais {
	private int codigo1;
	private String profissao;
	private String descricao_profissional;
	private String descricao_experiencia;
	private int positivos = 0;
	private int negativos = 0;

	/**
	 * codigo do profissional // profissão // descrição do curriculum do
	 * profissional // pontos positivos da reputação do profissional // pontos
	 * negativos da reputação do profissional
	 **/

	// Construtor da classe Profissional
	public Profissionais(int codigo1, String profissao,
			String descricao_profissional, String descricao_experiencia,
			int positivos, int negativos) {
		this.profissao = profissao;
		this.descricao_profissional = descricao_profissional;
		this.positivos = positivos;
		this.negativos = negativos;
		this.codigo1 = codigo1;
		this.descricao_experiencia = descricao_experiencia;

	}

	// metodo get e set
	// retorna o nome do profissional

	// retorna o codigo do profissional
	public int getCodigo1() {
		return codigo1;
	}

	// seta o codigo do profissional
	public void setCodigo1(int codigo1) {
		this.codigo1 = codigo1;
	}

	public Profissionais() {
		// TODO Auto-generated constructor stub
	}

	// retorna os pontos positivos do profissional
	public int getPositivos() {
		return positivos;
	}

	// seta os pontos positivos do profissional
	public void setPositivos(int positivos) {
		this.positivos = positivos;
	}

	// retorna os pontos negativos do profissional
	public int getNegativos() {
		return negativos;
	}

	// seta os pontos negativos do profissional
	public void setNegativos(int negativos) {
		this.negativos = negativos;
	}

	// retorna a profissão do profissional
	public String getProfissao() {
		return profissao;
	}

	// seta a profissão do profissional
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getDescricao_profissional() {
		return descricao_profissional;
	}

	public void setDescricao_profissional(String descricao_profissional) {
		this.descricao_profissional = descricao_profissional;
	}

	public String getDescricao_experiencia() {
		return descricao_experiencia;
	}

	public void setDescricao_experiencia(String descricao_experiencia) {
		this.descricao_experiencia = descricao_experiencia;
	}

}
