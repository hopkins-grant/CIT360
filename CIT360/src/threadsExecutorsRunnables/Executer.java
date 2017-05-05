package threadsExecutorsRunnables;

import java.util.concurrent.*;

public class Executer 
{
    public static void main(String[] arge)
    {

        try 
        {
            ExecutorService exe = Executors.newFixedThreadPool(1);
            Future<Integer> future = exe.submit(new Callable<Integer>() 
            {
                @Override
                public Integer call() throws Exception 
                {
                    int count = 0;
                    for (int i = 0; i < 999; i++) 
                    {
                        count++;
                    }
                    return count;
                }
            });
            exe.shutdown();

            try 
            {
                System.out.println("this is the count " + future.get());
            } 
            catch (InterruptedException ignored) {} 
            catch (ExecutionException e) 
            {
                TimeoutException ex = (TimeoutException) e.getCause();
                System.out.print(ex.getMessage());
            }
        }
        catch(IllegalArgumentException err) 
        {
            err.printStackTrace();
        }

        try 
        {
            ExecutorService exe = Executors.newFixedThreadPool(0);


            Future<Integer> future = exe.submit(new Callable<Integer>() 
            {
                @Override
                public Integer call() throws Exception 
                {
                    int count = 0;
                    for (int i = 0; i < 999; i++) 
                    {
                        count++;
                    }
                    return count;
                }
            });
            exe.shutdown();

            try 
            {
                System.out.println("this is the count " + future.get());
            } catch (InterruptedException ignored) {} 
            catch (ExecutionException e) 
            {
                TimeoutException ex = (TimeoutException) e.getCause();
                System.out.print(ex.getMessage());
            }
        }
        catch(IllegalArgumentException err) 
        {
            err.printStackTrace();
        }

    }
}