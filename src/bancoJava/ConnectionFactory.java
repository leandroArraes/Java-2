package bancoJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// é um filtro de entrada das conexoes ao banco , para limitar o numero de conexao para que o banco não caia
public class ConnectionFactory  {
	
	public static   Connection getConnection()throws SQLException {
					String url = "jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=UTC";
					String usuario = "root";
					String senha = "";
		
			return DriverManager.getConnection(url,usuario,senha);	
	}
}
