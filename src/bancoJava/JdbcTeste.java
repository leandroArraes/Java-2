package bancoJava;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTeste {
	public static void main(String[] args) {
		String url = "jdbc://mysql://localhost/test";
		String usuario = "root";
		String senha = "";
		
									
			try {
				DriverManager.getConnection(url,usuario,senha);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		


		
		
	}
}
