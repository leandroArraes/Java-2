package bancoJava;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConnectionFactory {

	public static void main(String[] args) {
		
		try {
				Connection conexao = ConnectionFactory.getConnection();
				System.out.println("Conectado ao Banco");
				conexao.close();
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
