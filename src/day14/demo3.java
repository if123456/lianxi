package day14;

public class demo3 {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        new Thread() {
            public void run() {
                while (true) {
                    synchronized (s1) {
                        System.out.println(this.getName() + "s1");
                        synchronized (s2) {
                            System.out.println(this.getName() + "s2");
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                while (true) {
                    synchronized (s2) {
                        System.out.println(this.getName() + "s2");
                        synchronized (s1) {
                            System.out.println(this.getName() + "s1");
                        }
                    }
                }
            }
        }.start();

    }
}