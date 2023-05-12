package bancoJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTeste {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=UTC";
		String usuario = "root";
		String senha = "";
		
										
			try {
				Connection conexao = DriverManager.getConnection(url,usuario,senha);				
				System.out.println("Deu certo a conexão do Banco");
				
				// toda conexão aberta precisa ser fechada 
				// para garantir que uma conexão seja fechada eu posso colocar ela em um bloco finile
				conexao.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			
		


		
		
	}
}


