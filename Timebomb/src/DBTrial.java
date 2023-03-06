import java.sql.DriverManager;
import java.sql.Statement;

public class DBTrial {
	public static void main (String args[]) {
		try {
			Class.forName("com.mySql.jdbc.Driver");
			Connectino con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo",root username);
			
			Statement stmt = con.createStatement();
			Result rs = stmt.executeQuery("select *from empty");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getsomthing);
				con.close();
			}catch(Exception e) {
				System.out.println(e);
				
			}
		}
	}
}
