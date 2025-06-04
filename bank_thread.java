class withdraw extends Thread{
    static int totalBalance=1000;
    int amount;
    public withdraw(int amount){
        this.amount=amount;
    }
    public void run(){
        synchronized(withdraw.class){
        if(totalBalance>=amount){
            System.out.println(Thread.currentThread().getName() +" is going to withdraw"+" "+amount);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){}
            totalBalance-=amount;
            System.out.println(Thread.currentThread().getName() +" Remaining moneyyy"+" "+totalBalance);
        }
        else{
            System.out.println(Thread.currentThread().getName() +" unsufficient balance");
        }
    }
    }
}
public class bank_thread {
    public static void main(String[] args) {
        withdraw w=new withdraw(900);
        withdraw w1=new withdraw(100);
        w.start(); w1.start();
    }
}
