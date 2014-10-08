package fafica.org.br.Repositorios;

import java.util.ArrayList;

import fafica.org.br.Modelo.Servicos;

public interface IServicosRepositorios {

	public void cadastrarservico(Servicos servicos) ;
	public ArrayList<Servicos> listarServicos();
}
