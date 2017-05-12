package MVC;

import java.util.HashMap;

public class Model 
{
	
	   private HashMap<String, String> pages = new HashMap<String,String>();

	    public Model ()
	    {
	        pages.put("Home","Here is the Home page");
	        pages.put("Inventory","Here is the Inventory page");
	        pages.put("About", "Here is the About page");
	    }

	   public void add(String name, String desc)
	   {
	       pages.put(name,desc);
	   }

	   public String getDesc (String name)
	   {
	       String description = pages.get(name);
	       return description;
	   }

	   public HashMap getMap()
	   {
	       return pages;
	   }
	   
	   public int Authenticate(String user, String pass)
	    {           
	    	int userLevel;
	    	if (user.equals("admin") && pass.equals("password"))
	    	   return 0;
	    	else 
	    		return 1;
	    }
}

