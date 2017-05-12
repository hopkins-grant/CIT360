package MVC;

import java.util.HashMap;
import java.util.Scanner;

public class Controller 
{
	public Model model = new Model();
	String page;
	Scanner scanner = new Scanner(System.in);

	    public HashMap getMap()
	    {
	       return model.getMap();
	    }
	    
	    public void addPage(String name, String desc)
	    {
	    	System.out.println("Please enter your username");
	    	String user = scanner.nextLine();
	    	System.out.println("Please enter your password");
	    	String password = scanner.nextLine();
	    	
	    	int userLevel = model.Authenticate(user, password);
	    	if (userLevel == 0)
	    		model.add(name, desc);
	    	else
	    		System.out.println("Insufficient Privileges.");
	    }
	    
	    public void getDesc(String name)
	    {
	    	System.out.println("Description for " + name + ": " + model.getDesc(name));
	    }
}

