package day6;

public interface JieKou {
        public abstract void eat();
        public default void run(){
            System.out.println("跑步");
        }
        public static void walk(){
            System.out.println("走路");
        }

    }
