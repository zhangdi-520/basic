package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @version V1.0
 * @program: basic
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-03-16 21:39
 **/
public class IteratorTest {

    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(new String("Tom"));
        collection.add(false);
        Iterator iterator = collection.iterator();

        //hasNext()判读是否有下一个元素
        while (iterator.hasNext()){
            //next()返回元素，指针下移
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(new String("Tom"));
        collection.add(false);
        Iterator iterator = collection.iterator();

        //hasNext()判读是否有下一个元素
        while (iterator.hasNext()){
            //next()返回元素，指针下移
            System.out.println(iterator.next());
            Object obj = iterator.next();
            if("Tom".equals(obj)){
                //删除方法（此处为删除collection中的Tom元素）
                iterator.remove();
            }
        }
    }

    @Test
    public void test2(){
        String [] arr = new String[]{"MM", "MM","MM"};

        //普通for循环直接修改数组中的值，所以数组会变
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = "GG";
//        }

        //增强for循环先把数组中元素取出赋值给s，次数修改的是s的值，所以原有数组不会变
        for (String s : arr){
            s = "GG";
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
