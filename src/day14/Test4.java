package day14;

public class Test4 {
    public static void main(String[] args) {
        Shower s = new Shower();
        Object obj=new Object();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (obj) {
                        System.out.print("犯");
                        System.out.print("我");
                        System.out.print("中");
                        System.out.print("华");
                        System.out.print("者");
                        System.out.println();
                    }
                }

            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (obj) {
                        System.out.print("虽");
                        System.out.print("远");
                        System.out.print("必");
                        System.out.print("诛");
                        System.out.println();
                    }
                }
            }
        }.start();

//        new Thread() {
//            @Override
//            public synchronized void run() {
//                for (int i = 0; i < 10; i++) {
//                    s.show();
//                }
//            }
//        }.start();
//
//        new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    synchronized (this) {
//                        s.show2();
//                    }
//                }
//            }
//        }.start();
    }
}
