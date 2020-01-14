package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "123");
        map.put("b", "456");
        map.put("c", "789");

        Set<String> set = map.keySet();
//        for(String s:set){
//            String value=map.get(s);
//            System.out.println("key:"+s+",vaule:"+value);
//        }

//        set.stream().forEach((n)->{
//            String value=map.get(n);
//            System.out.println("key:"+n+",vaule:"+value);
//        });

//        Iterator<String>iter=set.iterator();
//        while(iter.hasNext()){
//            String key=iter.next();
//            String value=map.get(key);
//            System.out.println("key:"+key+",vaule:"+value);
//        }

        Set<Map.Entry<String, String>> set1 = map.entrySet();
        set1.stream().forEach(n -> {
            String key = n.getKey();
            String value = n.getValue();
            System.out.println("key:"+key+",vaule:"+value);
        });


    }
}
