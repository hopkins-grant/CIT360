package threadsExecutorsRunnables;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ThreadsRun 
{
    private int count =0;

    private void increase()
    {
        for (int i=0; i<9999999; i++)
        {
            count++;
        }
    }

    private void decrease()
    {
        for (int i=0; i<9999999; i++)
        {
            count--;
        }
    }
    public void firstTh() throws InterruptedException
    {
        increase();
    }
    public void secondTh() throws InterruptedException
    {
        decrease();
    }
    public void print(){System.out.println("count is: " + count);
    }
}


 class threads
 {
    private int count =0;

    private void increase()
    {
        for (int i=0; i<9999999; i++)
        {
            count++;
        }
    }

    private void decrease(){
        for (int i=0; i<9999999; i++)
        {
            count--;
        }
    }
    public synchronized void firstTh() throws InterruptedException
    {
        increase();
    }
    public synchronized void secondTh() throws InterruptedException
    {
        decrease();
    }
    public void print()
    {
    	System.out.println("count is: " + count);
    }
}

class theadPass {
    private int count =0;
    private Lock thingy = new ReentrantLock();


    private void increase()
    {
        for (int i=0; i<9999999; i++)
        {
            count++;
        }
    }

    private void decrease(){
        for (int i=0; i<9999999; i++)
        {
            count--;
        }
    }
    public void firstTh() throws InterruptedException
    {
        thingy.lock();
        increase();
        thingy.unlock();
    }
    public void secondTh() throws InterruptedException
    {
        thingy.lock();
        decrease();
        thingy.unlock();
    }
    public void print()
    {
    	System.out.println("count is: " + count);
    }
}