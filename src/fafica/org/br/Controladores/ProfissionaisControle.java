package fafica.org.br.Controladores;

import java.util.ArrayList;

import fafica.org.br.Modelo.Profissionais;
import fafica.org.br.Repositorios.ProfissionaisRepositorio;

public class ProfissionaisControle {

	public ProfissionaisRepositorio pr = null;

	public ProfissionaisControle() {
		this.pr = new ProfissionaisRepositorio();
	}
// cadastrar profissional
	public void cadastrar(Profissionais profissionais) {
		// TODO Auto-generated method stub
		this.pr.cadastrar(profissionais);
	}
// listar profissional
	public ArrayList<Profissionais> listarProfissionais() {
		// TODO Auto-generated method stub
		
		return this.pr.listarProfissionais();
	}
// alterar profissional
	public void alterarProfissional(Profissionais p) {
		this.pr.alterarProfissional(p);
		// TODO Auto-generated method stub
		
	}
// deletar profissional
	public void deletarProfissional(int codigo1) {
		// TODO Auto-generated method stub
		this.pr.deletarProfissional(codigo1);;
	}

		
	}


