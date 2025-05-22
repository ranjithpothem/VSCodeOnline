package Threads;

public class RunnableInterface implements Runnable {

    int i;

    public RunnableInterface(int i){
        this.i=i;
    }

    @Override
    public void run(){
        System.out.println("simple java runnable interface program"+i);
    }

    public static void main(String[] args) {
        RunnableInterface runnableInterface=new RunnableInterface(0);
        RunnableInterface runnableInterface1=new RunnableInterface(1);
        RunnableInterface runnableInterface2=new RunnableInterface(2);
        RunnableInterface runnableInterface3=new RunnableInterface(3);
        Thread t=new Thread(runnableInterface);
        t.start();
         Thread t1=new Thread(runnableInterface1);
        t1.start();
         Thread t2=new Thread(runnableInterface2);
        t2.start();
         Thread t3=new Thread(runnableInterface3);
        t3.start();


    }
}