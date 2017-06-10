package applicationControllerPatternNew;

import java.util.HashMap;


public class Speak4Handler implements Handler 
{
    @Override
    public void handleIt(HashMap<String, Object> dataMap) 
    {
        try
        {
            System.out.println("just sent "+dataMap);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    @Override
    public void useIt(HashMap<String, Object> data) 
    {

    }
}