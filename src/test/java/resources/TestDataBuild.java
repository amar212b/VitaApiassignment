package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.Login;


public class TestDataBuild {

	
	
	public Login loginPayLoad(String email, String password)
	{
		Login p =new Login();
		p.setEmail(email);
		p.setPassword(password);
		return p;
	}
	
}
