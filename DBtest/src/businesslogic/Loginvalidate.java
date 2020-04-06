package businesslogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.ConnectionManager;
import model.Login;

public class Loginvalidate {

	public boolean validate(Login lgin) throws ClassNotFoundException, SQLException {
		
		String username = lgin.getUsername();
		String password = lgin.getPassword();
		
		
		ConnectionManager con = new ConnectionManager();
		
		Statement st=con.getConnection().createStatement();
		
		ResultSet rs = st.executeQuery("select * from USERDETAILS");
		
		while(rs.next())
		{
			if(username.equals(rs.getString("USERNAME")) && password.equals("PASSWORD"))
			{
				con.getConnection().close();
				return true;
			}
			else
			{
				con.getConnection().close();
				return false;
		}
	}
		return false;

}
}
