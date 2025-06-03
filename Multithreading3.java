class Num extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            int j=(i*1000);
            try {
                Thread.sleep(j);
            } catch (Exception e) {
            }
            System.out.println(i);
        }
    }
}
public class Multithreading3{
    public static void main(String[] args) {
        Num n=new Num();
        n.start();
    }
}
