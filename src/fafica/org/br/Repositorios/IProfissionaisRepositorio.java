package fafica.org.br.Repositorios;

import java.util.ArrayList;

import fafica.org.br.Modelo.Profissionais;

public interface IProfissionaisRepositorio {

	
	public void cadastrar(Profissionais profissionais) ;

	public ArrayList<Profissionais> listarProfissionais();
	public void alterarProfissional(Profissionais p);
	public void deletarProfissional(int codigo1);
}
