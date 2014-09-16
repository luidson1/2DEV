package fafica.org.br.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoMySql {
	private static ConexaoMySql instance;
	private Connection conexao;
	
	private String driver = "com.mysql.jdbc.Driver"; // localiza��o do driver
	private String url    = "jdbc:mysql://localhost:3306/twodevs"; // endere�o e porta
	private String user   = "root"; // usuario
	private String pass   = "123"; // senha
	 
	// realizando a conex�o
	public ConexaoMySql(){}
	
	public static ConexaoMySql getInstance(){
		if (instance == null) {
			instance = new ConexaoMySql();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url, user, pass); 
 		} catch (ClassNotFoundException e) { 
			JOptionPane.showMessageDialog(null, "Erro na conexao " +  e.getMessage());
		}
		return conexao; // retorna a conex�o.
	}

}

