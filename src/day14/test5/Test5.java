package day14.test5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        MyRunnable mr=new MyRunnable();
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                int a=1;
                for (int i = 1; i <=10 ; i++) {
                    a*=i;
                }
                System.out.println(a);
            }
        };
        service.submit(mr);
        service.submit(mr);
        service.submit(mr);
        //service.submit(r1);
//        service.shutdown();


       // Thread t=new Thread(new Test5());
       // t.start();

    }

//    @Override
//    public void run() {
////        for (int i = 0; i < num; i++) {
////            System.out.println(i);
////        }
//    }
}
