package fafica.org.br.Exception;

public class UsuarioJaCadastradoException {

	private String email;
	
	public UsuarioJaCadastradoException(String email){
		super();
		this.email = email;
		
	}
// metodo get e set
	public String getemail() {
		return email;
	
	}

	public void setCpf(String email) {
		this.email = email;
	}
	
	
}

	

