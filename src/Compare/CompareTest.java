package Compare;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @version V1.0
 * @program: basic
 * @description: Java比较器
 * @author: Mr.Zhang
 * @create: 2020-12-11 21:06
 **/
public class CompareTest {

    /*
    * Comparable使用
    * 1.实现Comparable，重写compareTo()方法，给出比较两个对象大小的方案
    * 2.重写compareTo(obj)规则:
    *       如果当前对象this大于形参对象obj，则返回正整数
    *       如果当前对象this小于形参对象obj，则返回负整数
    *       如果当前对象this等于形参对象obj，则返回零
    * */
    @Test
    public void test(){
       String[] arr =  new String[]{"AA","CC", "KK", "MM", "BB","DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test1(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("1",43);
        arr[1] = new Goods("2",3);
        arr[2] = new Goods("3",50);
        arr[3] = new Goods("4",21);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test2(){
        String[] arr =  new String[]{"AA","CC", "KK", "MM", "BB","DD"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test3(){
        Goods[] arr = new Goods[3];
        arr[0] = new Goods("zhangsan",34);
        arr[1] = new Goods("zhangsan",39);
        arr[2] = new Goods("lisi",28);
        Arrays.sort(arr, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getName().equals(o2.getName())) {
                    return -Double.compare(o1.getPrice(), o2.getPrice());
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
//        Arrays.sort(arr, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1 instanceof Goods && o2 instanceof Goods) {
//                    Goods g1 = (Goods)o1;
//                    Goods g2 = (Goods)o2;
//                    if (g1.getName().equals(g2.getName())) {
//                        return -Double.compare(g1.getPrice(), g2.getPrice());
//                    }else{
//                        return g1.getName().compareTo(g2.getName());
//                    }
//                }
//                throw new RuntimeException("数据类型不一致");
//            }
//        });
        System.out.println(Arrays.toString(arr));
    }
}
