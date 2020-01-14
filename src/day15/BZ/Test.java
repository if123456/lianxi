package day15.BZ;

public class Test {
    public static void main(String[] args) {
        BaiZi baiZi=new BaiZi();
        baiZi.setFlag(1);
        ConsumerThread consumer=new ConsumerThread(baiZi);
        ProductThread product=new ProductThread(baiZi);

        new Thread(product,"小二").start();
        new Thread(consumer,"猪八戒").start();
    }
}
