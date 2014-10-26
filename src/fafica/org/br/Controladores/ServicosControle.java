package fafica.org.br.Controladores;

import java.util.ArrayList;

import fafica.org.br.Modelo.Servicos;
import fafica.org.br.Repositorios.ServicosRepositorios;

public class ServicosControle {

	private ServicosRepositorios serv = null;

	public ServicosControle() {

		this.serv = new ServicosRepositorios();

	}
// cadastrar servicos
	public void cadastrarservico(Servicos servicos) {
		// TODO Auto-generated method stub
		this.serv.cadastrarservico(servicos);
	}
// listar servicos
	public ArrayList<Servicos> listarServicos() {
		return this.serv.listarServicos();
	}
	
	// deletar servicos
	public void DeletarServicos (int codigo){
		this.serv.deletarServicos(codigo);
	}
	// alterar servicos
	public void alterarServicos(Servicos servicos) {
		// TODO Auto-generated method stub
		this.serv.alterarServicos(servicos);
	}
}
