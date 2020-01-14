package day6_test;

import java.util.ArrayList;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int num = 5;
        int money = 100;
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int red = r.nextInt(money / num * 2 - 1) + 1;
            money = money - red;
            list.add(red);
        }
        list.add(money);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println("红包：" + list.get(i));
            count += list.get(i);
        }
        System.out.println(count);
    }
}
