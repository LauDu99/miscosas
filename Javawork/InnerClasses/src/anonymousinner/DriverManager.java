package anonymousinner;

public class DriverManager {

	static Connection getConnection() {//creando una conexion
		Connection con = new Connection() {

			@Override
			public void createStatement() {
				System.out.println("Anonymus inner class");
			}
			
		};
		return con;
	}
	
}
