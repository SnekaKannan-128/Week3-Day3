package week3.day3;

public class JavaConnection1 extends MySqlConnection{

	public static void main(String[] args) {
		
		JavaConnection1 obj=new JavaConnection1();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.executeQuery();

	}

}
