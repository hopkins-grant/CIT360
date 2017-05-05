package threadsExecutorsRunnables;

public class moarThreads 
{
    public static void main(String[] args) throws Exception
    {
        final ThreadsRun Worker = new ThreadsRun();

        Thread t1 = new Thread(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    Worker.firstTh();
                } catch (InterruptedException ignored) {}
            }
        });
        Thread t2 = new Thread(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    Worker.secondTh();
                } catch (InterruptedException ignored) {}
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        Worker.print();


        //All Together Now

        final threads Workers = new threads();

        Thread ts1 = new Thread(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    Workers.firstTh();
                } 
                catch (InterruptedException ignored) {}
            }
        });
        
        Thread ts2 = new Thread(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    Workers.secondTh();
                } catch (InterruptedException ignored) {}
            }
        });
        ts1.start();
        ts2.start();
        ts1.join();
        ts2.join();
        Workers.print();


        final theadPass WorkerPass = new theadPass();

        Thread tPass1 = new Thread(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    WorkerPass.firstTh();
                } catch (InterruptedException ignored) {}
            }
        });
        Thread tPass2 = new Thread(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    WorkerPass.secondTh();
                } catch (InterruptedException ignored) {}
            }
        });

        tPass1.start();
        tPass2.start();
        tPass1.join();
        tPass2.join();
        WorkerPass.print();
    }

}

