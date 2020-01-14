package day15.BZ;

public class ConsumerThread implements Runnable {
    private BaiZi baiZi;

    public ConsumerThread(BaiZi baiZi) {
        this.baiZi = baiZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baiZi) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (baiZi.getFlag() > 5) {
//                    System.out.println("消费线程正在消费："+baiZi.getName()+"，价格为："+baiZi.getPrice());
                    System.out.println(Thread.currentThread().getName() + "正在消费包子");
                    baiZi.setFlag(baiZi.getFlag() - 1);
                    baiZi.notify();
                } else {
                    try {
                        baiZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
