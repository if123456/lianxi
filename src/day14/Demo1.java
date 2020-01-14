package day14;

public class Demo1 {
    public static void main(String[] args)  {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1:" + i);
            }
        });

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程2：" + i);
                    if (i == 50) {
                        try {
                            t1.join(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        t1.start();
        //t2.start();
    }
}
