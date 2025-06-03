class MyThread extends Thread{
    public void run(){
        System.out.println("helloo");
        try {
            Thread.sleep(2000);
         } catch (Exception e){}
        System.out.println("hehehe");
    }
    public void walk(){
        System.out.println("hehe");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread t= new MyThread();
        t.start();
        MyThread t1=new MyThread();
        t1.start();
        System.out.println("hiiii");
    }
}
