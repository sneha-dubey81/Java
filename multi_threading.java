class mythread extends Thread{
    public void run(){
        System.out.println("hehehe");
    }
}
public class multi_threading {
    public static void main(String[] args) {
        mythread t1= new mythread();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
        }
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("Main thread is running");
    }
}