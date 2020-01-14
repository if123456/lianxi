package day14.test6;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    Integer num = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override

    public void run() {
        while (true) {
            lock.lock();
            if (num <= 0) {
                System.out.println("票卖完了");
                lock.unlock();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "：正在卖第：" + num + "张票");
            num--;
            lock.unlock();
        }
    }
}
