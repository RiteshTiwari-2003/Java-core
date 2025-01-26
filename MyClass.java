import java.sql.*;
/*java database connectiovity
 * 1. import package ---> java.sql.*
 * 2. load and register the driver --> com.mysql.jdbc.Driver
 * 3. create a connection
 * 	4. create a statement
 * 5. execute the query
 * 6.process the result
 * 7.close*/

public class MyClass {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pass="Ritesht@12345";
		int userId=6;
		String username="Dipali";
		String query="insert into student values (?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, userId);
		st.setString(2, username);
		int count=st.executeUpdate();
		System.out.println(count + "rows affected");
		st.close();
		con.close();
		// TODO Auto-generated method stub

	}

}
