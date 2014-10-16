package fafica.org.br.Fachada;

import java.util.ArrayList;

import fafica.org.br.Controladores.ProfissionaisControle;
import fafica.org.br.Controladores.ServicosControle;
import fafica.org.br.Controladores.UsuarioControl;
import fafica.org.br.Controladores.UsuarioControle;
import fafica.org.br.Modelo.Profissionais;
import fafica.org.br.Modelo.Servicos;
import fafica.org.br.Modelo.Usuario;

public class Facade {
	private static Facade instance = null;

	public Facade() {
	}

	public static Facade getInstance() {
		if (Facade.instance == null) {
			Facade.instance = new Facade();
		}
		return instance;
	}

	public void cadastrarErico(Usuario u) {
		UsuarioControl control = new UsuarioControl();
		control.inserirErico(u);
	}
	
	// Cadastrar usuário
	public void cadastrarUsuario(Usuario usuario) {
		UsuarioControle usuariocontrol = new UsuarioControle();
		usuariocontrol.cadastrarUsuario(usuario);
	}

	// Editar usuário
	public void alterarUsuario(Usuario u) {
		UsuarioControle control = new UsuarioControle();
		control.alterarUsuario(u);
	}

	// validar login usuario
	public boolean Login(String email, String senha) {
		UsuarioControle control = new UsuarioControle();
		return control.Login(email, senha);
	}

	// retornar o usuario depois que é validado o login
	public Usuario retornarusuario(String email, String senha) {
		// TODO Auto-generated method stub
		UsuarioControle controlu = new UsuarioControle();
		return controlu.retornarUsuario(email, senha);
	}

	// deletar usuario por cpf e senha
	public void deletarUsuario(String cpf, String senha) {
		UsuarioControle control = new UsuarioControle();
		control.deletarUsuario(cpf, senha);
	}



	// cadastrar serviços
	public void cadastrarservico(Servicos servicos) {
		ServicosControle control = new ServicosControle();
		control.cadastrarservico(servicos);
	}

	// cadastrar profissional
	public void cadastrarprofissional(Profissionais profissionais) {
		// TODO Auto-generated method stub
		ProfissionaisControle control = new ProfissionaisControle();
		control.cadastrar(profissionais);
	}
	// listar servicos
	public ArrayList<Servicos> listarServicos() {
		// TODO Auto-generated method stub
		ServicosControle control = new ServicosControle();
		return control.listarServicos();
	}

	// listar profissionas / curriculuns
	public ArrayList<Profissionais> listarProfissionais() {
		// TODO Auto-generated method stub
		ProfissionaisControle pcontrol = new ProfissionaisControle();
		return pcontrol.listarProfissionais();
	}

}