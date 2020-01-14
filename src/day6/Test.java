package day6;
import java.util.*;

public class Test {
    public static void main(String[] args) {
//        Person person=new Person();
//        person.eat();
//        person.run();

//        int[] a={1,2,9,5,7,6,8,10};
//        binaryInsertSort(a,a.length);


//        c.show();

        Animal cat=new Cat();
        cat.eat();

        Animal dog= new Dog();
        dog.eat();

        Cat cat1=new Cat();
        Dog dog1=new Dog();
        showanimal(dog);
        showanimal(cat);
        showcat(cat1);
        showdog(dog1);

    }

    public static void binaryInsertSort(int []array,int size)
    {
        int i,j,temp;
        int low,high,mid;
        for(i=1;i<size;i++)
        {
            //将待插入的元素赋给temp，这个元素前面是有序数组，用于插入到有序数组中
            temp=array[i];
            low=0;
            high=i-1;
            while(low<=high)
            {
                //有序数组的中间坐标，此时用于二分查找，减少查找次数
                mid = (low+high)/2;
                //如果有序序列中的中间元素大于待排序的元素，则有序序列的中间坐标向前搜索，否则向后搜索
                if(array[mid]>array[i])
                    high=mid-1;
                else
                    low = mid + 1;
            }
            /**
             * j首先赋值为要插入值的前一个元素的最后的坐标，也就是有序数组中最后一个元素的坐标
             * 然后依次向前扫描有序数组，然后如果满足条件则向后移动数据
             */

            for(j=i-1;j>=low;j--)
            {
                array[j+1]=array[j];
            }
            //将待排序的元素插入到array数组中
            array[low]=temp;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void showanimal(Animal animal){
        animal.eat();
    }
    public static void showdog(Dog dog){
        dog.eat();
    }
    public static void showcat(Cat cat){
        cat.eat();
    }
}

