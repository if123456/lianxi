package day15.BZ;

public class ProductThread implements Runnable {

    private BaiZi baiZi;

    public ProductThread(BaiZi baiZi) {
        this.baiZi = baiZi;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (baiZi){
                if (baiZi.getFlag()<=5){
                    System.out.println(Thread.currentThread().getName()+"正在生产"+ baiZi.getFlag()+"包子");
                    baiZi.setFlag(baiZi.getFlag()+1);
//                    System.out.println("生产线程正在生产: " + baiZi.getName() + ";价格为: " + baiZi.getPrice());
                }
                else if(baiZi.getFlag()>5){
                    baiZi.notify();
                }
                else if(baiZi.getFlag()>=10){
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
