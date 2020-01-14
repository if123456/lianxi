package day14;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5000 ; i++) {
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println("守护线程："+i);
                }
            }
        });

        t1.setDaemon(true);

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("用户线程1:"+i);
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
//                    if(i==20){
//                       Thread.yield();
//                    }
                    System.out.println("用户线程2:"+i);
                }
            }
        });

//        t2.setPriority(2);
//        t3.setPriority(10);


        t1.start();
        t2.start();
        t3.start();




    }
}
