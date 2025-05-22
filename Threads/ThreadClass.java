package Threads;

public class ThreadClass extends Thread{
    
    int i;
    public ThreadClass(int i){
        this.i=i;
    }

    @Override
    public void run(){
        System.out.println("simple java thread program"+i);
    }

    public static void main(String[] args) {
        ThreadClass threadClass=new ThreadClass(0);
        threadClass.start();
        ThreadClass threadClass1=new ThreadClass(1);
         threadClass1.start();
        ThreadClass threadClass2=new ThreadClass(2);
         threadClass2.start();
        ThreadClass threadClass3=new ThreadClass(3);
         threadClass3.start();
    }
}