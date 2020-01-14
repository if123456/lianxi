package day14.test;


public class Run2 implements Runnable {

    private Entity entity;

    public Run2(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (entity){
                System.out.println("线程2开始唤醒");
                entity.notify();
            }
        }
    }
}
