package day10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String str=df.format(date);
        System.out.println(str);
        String string="2020-01-01";
        DateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=df1.parse(string);
        System.out.println(date1);
    }
}
