package businesslogic;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.ConnectionManager;
import model.User;

public class Register {
	
	public void addUser(User usr) throws ClassNotFoundException, SQLException
	{
		String firstname = usr.getFirstname();
		String lastname = usr.getLastname();
		String username = usr.getUsername();
		String password = usr.getPassword();
		String email = usr.getEmail();
		
		ConnectionManager cm = new ConnectionManager();
		
		String sql = "insert into USERDETAILS(firstname,lastname,username,password,email)VALUES(?,?,?,?,?)";
		
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		
		st.setString(1, firstname);
		st.setString(2, lastname);
		st.setString(3, username);
		st.setString(4, password);
		st.setString(5, email);
		
		st.executeUpdate();
		
		cm.getConnection().close();
	}

}
