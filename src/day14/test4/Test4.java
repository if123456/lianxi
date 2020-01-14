package day14.test4;

public class Test4 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Thread t1=new Thread(ticket,"1站");
        Thread t2=new Thread(ticket,"2站");
        Thread t3=new Thread(ticket,"3站");

        t1.start();
        t2.start();
        t3.start();
    }
}
