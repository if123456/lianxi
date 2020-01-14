package day14.test4;

public class Ticket implements Runnable {

    private static Integer ticket=100;
    private static Object obj=new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket==0){
                    System.out.println("piaomeil");
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"正卖"+(101-ticket)+"张票");
                ticket--;
            }
        }
    }
}
