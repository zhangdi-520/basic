package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * @version V1.0
 * @program: basic
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-03-15 20:48
 **/
/*
* 1.数组在存储多个数据方面得特点
*   > 一旦初始化以后，长度就确定了
*   > 数组一旦定义好，其元素得类型也就确定了。我们也就只能操作指定类型得数据
* 2.数组缺点
*  > 一旦初始化以后，其长度不可修改
*  > 数组中提供的方法非常有限，操作不便，同时效率不高
*  > 获取数组中实际元素和个数得需求，数组没有现成得属性或方法
*  > 数组存储数据得特点：有序，可重复。对于无序，不可重复得需求不能满足。
*
* */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        //add(Object e);
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        //size():获取添加元素个数
        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);

        coll.clear();

        System.out.println(coll.isEmpty());
    }

    @Test
    public void test2(){
        Collection cll = new ArrayList();
        cll.add("aa");
        cll.add(1234);
        cll.add(new String("Tom"));
        //contains(Object obj)会调用obj得equals方法，自定义对象一般要重写equals方法
        System.out.println(cll.contains(1234));
        System.out.println(cll.contains(new String("Tom")));

        Collection cll1 = Arrays.asList(111,222);
        System.out.println(cll.containsAll(cll1));
    }

    @Test
    public void test3(){
        Collection cll = new ArrayList();
        cll.add("aa");
        cll.add(1234);
        cll.add(new String("Tom"));
        System.out.println(cll);
        cll.remove(new String("Tom"));
        System.out.println(cll);

        //removeAll(Collection cll1)
        Collection cll1 = Arrays.asList(111);
        cll.removeAll(cll1);//cll中删除cll1中存在得元素
        cll.retainAll(cll1);//取交集并赋值给cll
        System.out.println(cll);

        //equals(Object obj)两个集合元素顺序必须相同，list是有序的

        //toArray()集合转换成数组
        Object[] objects = cll.toArray();

    }
}
