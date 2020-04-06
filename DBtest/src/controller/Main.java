package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import businesslogic.Loginvalidate;
import businesslogic.Register;
import model.Login;
import model.User;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		System.out.println("REGISTER HERE");
		System.out.println("LOGIN");
		
		int x;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(bf.readLine());
		
		User usr = new User();
		Register rg = new Register();
		Login lgin = new Login();
		Loginvalidate lgvld = new Loginvalidate();
		
		switch(x)
		{
		
		case 1:
			
			System.out.println("ENTER YOUR FIRST NAME:");
			String firstname = bf.readLine();
			System.out.println("ENTER YOUR LAST NAME:");
			String lastname = bf.readLine();
			System.out.println("ENTER YOUR USER NAME:");
			String username = bf.readLine();
			System.out.println("ENTER YOUR PASSWORD:");
			String password = bf.readLine();
			System.out.println("ENTER YOUR EMAIL:");
			String email = bf.readLine();
		
			
			usr.setFirstname(firstname);
			usr.setLastname(lastname);
			usr.setUsername(username);
			usr.setPassword(password);
			usr.setEmail(email);
			
			rg.addUser(usr);
			
			break;
			
		case 2:
			
			System.out.println("ENTER YOUR USER NAME:");
			String name = bf.readLine();
			System.out.println("ENTER YOUR PASSWORD:");
			String pass = bf.readLine();
			
			lgin.setUsername(name);
			lgin.setPassword(pass);
			
			if(lgvld.validate(lgin)==true)
			{
                 Good gud = new Good();
                 gud.display();
			}
			else
				System.out.println("USERNAME OR PASSWORD INCORRECT");
	
			break;
		}

	}

}
