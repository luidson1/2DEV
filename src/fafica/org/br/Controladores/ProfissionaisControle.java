package fafica.org.br.Controladores;

import fafica.org.br.Modelo.Profissionais;
import fafica.org.br.Repositorios.ProfissionaisRepositorio;

public class ProfissionaisControle {

	public ProfissionaisRepositorio pr = null;

	public ProfissionaisControle() {
		this.pr = new ProfissionaisRepositorio();
	}

	public void cadastrar(Profissionais profissionais) {
		// TODO Auto-generated method stub
		this.pr.cadastrar(profissionais);
	}

		
	}

