import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		//because by loading the class static method executed and by creating the object instance method is created
		
			
	}

}
class PQR{
		static {
			System.out.println("In static");
		}
		{
			System.out.println("In instance");
		}
}