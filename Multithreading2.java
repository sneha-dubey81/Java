class MyThread extends Thread{
    String file;
    public MyThread (String file){
        this.file=file;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(file+ " downloading...."+(i*20)+"%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
        System.out.println(file+" done");
    }
}public class Multithreading2 {
    public static void main(String[] args) {
        MyThread t1=new MyThread("file A");
        MyThread t2=new MyThread("file B");
        t1.start(); t2.start();        
    }
}
