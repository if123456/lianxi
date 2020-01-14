package day6_test;


import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
//        String str="sfaasfgs";
//        char[] c=str.toCharArray();
//        byte[] b=str.getBytes();
//        for (int i = 0; i <c.length ; i++) {
//            System.out.print(c[i]+" ");
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i]+" ");
//        }

//        String str="123,asd,456,qwer";
//        String[] s=str.split(",");
//        for (int i = 0; i <s.length ; i++) {
//            System.out.println(s[i]);
//        }

//        Student student=new Student("zhangsan",12);
//        String[] str=student.toString().split(",");
//        //System.out.println(str);
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }

        String str="[User{name=马云,age=56,money=2500.0},User{name=马化腾,age=56,money=2400.0},User{name=马赛克,age=56,money=2500.0}]";

       String s1= str.replace("[","");
        String s2=s1.replace("]","");
        String s3=s2.replace("User{","");

        //String s4=s2.replace("User{","");

        String[] s4=s3.split("name=");
        for (int i = 0; i < s4.length; i++) {
            System.out.println(s4[i]);
        }

        ArrayList<String> list=new ArrayList<>();
        System.out.println(s4.length);
        for (int i = 1; i < s4.length; i++) {
            int a=s4[i].indexOf(",");
            //System.out.println(s4[i]);
            String str2=s4[i].substring(0,a);
            list.add(str2);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

/*     int a=Student.num=100;
        System.out.println(a);
        Student.run();
        Student student=new Student();
        student.run();
        int b=student.num=1000;
        System.out.println(b);*/

    }
}
