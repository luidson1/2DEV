package fafica.org.br.Controladores;

import java.util.ArrayList;

import fafica.org.br.Modelo.Servicos;
import fafica.org.br.Repositorios.ServicosRepositorios;

public class ServicosControle {

	private ServicosRepositorios serv = null;

	public ServicosControle() {

		this.serv = new ServicosRepositorios();

	}

	public void cadastrarservico(Servicos servicos) {
		// TODO Auto-generated method stub
		this.serv.cadastrarservico(servicos);
	}

	public ArrayList<Servicos> listarServicos() {
		return this.serv.listarServicos();
	}

}
