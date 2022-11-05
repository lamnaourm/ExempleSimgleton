import java.sql.Statement;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Principale {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
	
		Connection c = SingletonConnection.getInstance();
		
		Statement st = c.createStatement(); 

	}

}
