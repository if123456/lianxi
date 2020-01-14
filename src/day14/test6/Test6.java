package day14.test6;

public class Test6 {
    public static void main(String[] args) {
        Ticket t=new Ticket();
        Thread t1=new Thread(t,"窗口a");
        Thread t2=new Thread(t,"窗口b");
        t1.start();
        t2.start();

    }
}
