package qcjson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

import quickconnectfamily.*;

public class Driver 
{
    public static void main(String[] args)
    {

        // parsing a string

        try 
        {
            String name = "{\"My name is\":\"Grant Hopkins\"}";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

       // Will fail since JSON format is expected
       try 
        {
            String name = "My name is:Grant Hopkins";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

       //Empty JSON created
        try 
        {
            String name = "{}";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        //Can store null values
        try 
        {
            String name = null;
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e){
            e.printStackTrace();
        }


        // writing to a file

        try
        {
            String name = "{\"My name is\":\"Grant Hopkins\"}";
            String path = "C:\\Users\\ghopk\\Google Drive\\School\\CIT360\\Week5\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream grantout = new JSONOutputStream(fileOut);
            grantout.writeObject(name);
            grantout.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        //Will write nothing to a file which effectively clears any previous contents
        try
        {
            String name = null;
            String path = "C:\\Users\\ghopk\\Google Drive\\School\\CIT360\\Week5\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream grantout = new JSONOutputStream(fileOut);
            grantout.writeObject(name);
            grantout.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        //Expectedly cannot handle null file path.
        try
        {
            String name = "{\"My name is\":\"Grant Hopkins\"}";
            String path = null;
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream grantout = new JSONOutputStream(fileOut);
            grantout.writeObject(name);
            grantout.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        // reading from a file
        
        // Create valid contents
        try
        {
            String name = "{\"My name is\":\"Grant Hopkins\"}";
            String path = "C:\\Users\\ghopk\\Google Drive\\School\\CIT360\\Week5\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream grantout = new JSONOutputStream(fileOut);
            grantout.writeObject(name);
            grantout.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        // Pull in contents and display them
        try 
        {
            String path = "C:\\Users\\ghopk\\Google Drive\\School\\CIT360\\Week5\\jtest.txt";

            FileInputStream fileInput = new FileInputStream(path);

            JSONInputStream jsonInputStream = new JSONInputStream(fileInput);
            String aString = (String)jsonInputStream.readObject();
            jsonInputStream.close();
            System.out.println(aString);
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}