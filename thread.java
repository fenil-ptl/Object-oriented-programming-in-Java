class ODD implements Runnable
{
    public void run()
    { 
        for(int i=0;i<11;i++)
        if(i%2==0)
        System.out.print(i +"\t"); 
    }
}
class EVEN implements Runnable
{
    public void run()
    {
        for(int i=0;i<11;i++)
        if(i%2==1)
        System.out.print(i +"\t");
    }
}
public class thread
{
    public static void main(String args[])
    {
        Runnable r=new ODD();
        Thread t=new Thread(r);
        Runnable r1=new EVEN();
        Thread t1=new Thread(r1);
        t1.start();
        t.start();
    }
}