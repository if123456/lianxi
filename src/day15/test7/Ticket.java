package day15.test7;

public class Ticket implements Runnable {
    private Ticketbean bean;

    public Ticket(Ticketbean bean) {
        this.bean = bean;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bean){
                int num=bean.getNum();
                if(num<=0){
                    System.out.println("票卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName()+":正在卖"+bean.getName()+"票号:"+(101-num));
                bean.setNum(num-1);
            }
        }
    }
}
