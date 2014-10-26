package fafica.org.br.Repositorios;

import java.util.ArrayList;

import fafica.org.br.Modelo.Servicos;
import fafica.org.br.Modelo.Usuario;

public interface IServicosRepositorios {

	public void cadastrarservico(Servicos servicos) ;
	public ArrayList<Servicos> listarServicos();
	public void alterarUsuario(Usuario u);
	public void deletarUsuario(String email, String senha);
}
