package day14;

import java.util.concurrent.locks.ReentrantLock;

public class Test5 {
    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    System.out.print("犯");
                    System.out.print("我");
                    System.out.print("中");
                    System.out.print("华");
                    System.out.print("者");
                    System.out.println();
                    lock.unlock();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    System.out.print("虽");
                    System.out.print("远");
                    System.out.print("必");
                    System.out.print("诛");
                    System.out.println();
                    lock.unlock();
                }
            }
        }.start();
}
}
