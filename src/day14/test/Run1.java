package day14.test;

public class Run1 implements Runnable {

    private Entity entity;

    public Run1(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        while(true){
            synchronized (entity){
                System.out.println("线程1进入等待状态");
                try {
                    entity.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1被唤醒");
            }
        }
    }
}
