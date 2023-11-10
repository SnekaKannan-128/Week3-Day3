package week3.day3;

public class JavaConnection implements DatabaseConnection{

	
public void connect() {
		
		System.out.println("Connected");
		
		}

	public void disconnect() {
		
		System.out.println("Disconnected ");
		
		}

	public void executeUpdate() {
		
		System.out.println("Update execution done");
		
		}
	
	public static void main(String[] args) {
	
		JavaConnection obj=new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		
}
}
