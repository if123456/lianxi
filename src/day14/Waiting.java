package day14;

import java.util.Scanner;

public class Waiting {


    public static void main(String[] args) {
        Object obj = new Object();
//        Scanner input = new Scanner(System.in);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    synchronized (obj) {
//                        System.out.println(Thread.currentThread().getName() + "=== 获取到锁对 象，调用wait方法，进入waiting状态，释放锁对象");
//                        String s = input.nextLine();
//                        if ("".equals(s)) {
//                            try {
//                                obj.wait();
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        } else {
//                            System.out.println(Thread.currentThread().getName() + "=== 从waiting状 态醒来，获取到锁对象，继续执行了");
//                        }
//                    }
//                }
//            }
//        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "=== 获取到锁对象，调用wait方法，进入waiting状态，释放锁对象");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "从wait中醒来");
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "‐‐‐‐‐ 等待3秒钟");
                            Thread.sleep(3000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "‐‐‐‐‐ 获取到锁对 象,调用notify方法，释放锁对象");
                        obj.notify();
                    }
                }

            }
        }).start();


    }
}
