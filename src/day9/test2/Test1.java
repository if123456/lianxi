package day9.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张强");

        Stream<String>stream= list.stream();

        Stream<String> stream1=stream.filter(s -> {
            return s.startsWith("张");
        });

        Stream<String> stream2=stream1.filter(s -> {
           return s.length()==3;
        });

        List<String>list1=stream2.collect(Collectors.toList());
        list1.stream().forEach(n->{
            System.out.println(n);
        });


        list.stream().filter(n->{
            return n.startsWith("周");
        }).forEach(System.out::println);

    }
}
