package http;

import java.net.*;
import java.io.*;

public class Http 
{

        public static void main(String[] args) throws IOException 
        {

            Http http =new Http();

            //Create valid connection
            URL goog = new URL("http://www.google.com/");
            URLConnection conn = goog.openConnection();
            BufferedReader buf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String s = buf.readLine();
            while (s != null)
            {
                System.out.println(s);
                s = buf.readLine();
            }

            //Create invalid connection
            try 
            {
                URL goog2 = new URL("http://www.goog.edu/fakeyfakefake");
                URLConnection conn2 = goog2.openConnection();
                BufferedReader buf2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
                String s2 = buf2.readLine();
                while (s2 != null) 
                {
                    System.out.println(s2);
                    s2 = buf2.readLine();
                }
            }
            catch (Exception e)
            {
                System.out.print("Failed: Page does not exist\n");
            }

            //Highlight importance of loop to output
            try 
            {
                URL goog3 = new URL("http://www.goog.edu/");
                URLConnection conn3 = goog3.openConnection();
                BufferedReader buf3 = new BufferedReader(new InputStreamReader(conn3.getInputStream()));
                String s3 = buf3.readLine();
                System.out.println(s3);
            }
            catch (Exception e)
            {
                System.out.print("Failed: No loop\n");
            }

            //Try fake URL
            try 
            {
                URL goog6 = new URL("www.citstuff.com");
                URLConnection conn6 = goog6.openConnection();
                BufferedReader buf6 = new BufferedReader(new InputStreamReader(conn6.getInputStream()));
                String s6 = buf6.readLine();
                while (s6 != null) 
                {
                    System.out.println(s6);
                    s6 = buf6.readLine();
                }
            }
            catch (Exception e)
            {
                System.out.print("Failed: Invalid URL\n");
            }

            //Try empty string as URL parameter
            try 
            {
                URL goog5 = new URL("");
                URLConnection conn5 = goog5.openConnection();
                BufferedReader buf5 = new BufferedReader(new InputStreamReader(conn5.getInputStream()));
                String s5 = buf5.readLine();
                while (s5 != null) 
                {
                    System.out.println(s5);
                    s5 = buf5.readLine();
                }
            }
            catch (Exception e)
            {
                System.out.print("Failed: Empty URL\n");
            }


        }


}
