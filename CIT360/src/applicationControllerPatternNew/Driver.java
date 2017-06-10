package applicationControllerPatternNew;

import java.util.HashMap;

public class Driver 
{
    public static void main(String[] args)
    {
        ApplicationController applicationController = new ApplicationController();

        applicationController.mapCommand("command1",new Speak4Handler());
        applicationController.mapCommand("command2",new Speak4Handler());

        String command1 = "command1";

        HashMap data = new HashMap();
        data.put("Grant","awesome");
        data.put("School","not so much");

        //Access with variable
        applicationController.handleRequest(command1,data);
        //Access with manual string
        applicationController.handleRequest("command2",data);
        //Fail access
        applicationController.handleRequest("no",data);

    }
}