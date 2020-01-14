package day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Test8 {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        final Semaphore semp = new Semaphore(5);
        for (int index = 0; index < 20; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        while (true) {
                            if (semp.tryAcquire()) {
                                System.out.println(Thread.currentThread().getName() + " 【 Access: " + NO);
                                Thread.sleep(100);
                                semp.release();
                                System.out.println(Thread.currentThread().getName() + " 【 Release: " + NO);
                                System.out.println("----------------- 【 " + Thread.currentThread().getName() + "】" + semp.availablePermits());
                                break;
                            } else {
                                System.out.println(Thread.currentThread().getName() + " 【 NOT Access: " + NO);
                                Thread.sleep(100);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            exec.execute(run);
        }
        Thread.sleep(1000);
        exec.shutdown();
    }
}