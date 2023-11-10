package week3.day3;

public abstract class MySqlConnection implements DatabaseConnection{
	
	public void connect() {
		System.out.println("Connected");
	}
	
	public void disconnect() {
		System.out.println("Disconnected");
	}
	
	public void executeUpdate() {
		System.out.println("Update Executed");
	}
	
	public void executeQuery() {
		System.out.println("query executed");
	}

}
