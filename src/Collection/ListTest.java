package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @version V1.0
 * @program: basic
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-03-21 13:47
 **/
public class ListTest {
    /*
    * list集合类元素有序且可重复
    * 实现类：ArrayList:
    *           作为List接口的主要实现类；线程不安全的，效率高，底层使用Object[] elementData存储
    *       LinkedList:
    *           底层使用双向链表存储；对于频繁的插入，删除操作，使用此类效率比ArrayList高
    *       Vector:
    *           作为List接口的古老实现类；线程安全，效率低，底层使用Object[] elementData 存储
    * 三个实现类异同点：
    *  相同：三个类都实现了List接口，存储数据的特点相同：存储有有序的，可重复的数据
    *
    *  ArrayList源码分析：
    *   1.7 ：
    *       Arraylist list = new ArrayList<>();//底层创建了长度是10的Object[]数组elementData
    *       list.add(123);//elementData[0] = new Integer(123);
    *       ...
    *       list.add(11);//如果此次的添加导致底层elementData数组容量不够，则扩容
    *       默认情况下，扩容为原来容量的1.5倍，同时需要将原有数组中的数据复制到新的数组中。
    *
    *       结论：建议开发中使用带参的构造器： ArrayList list = new ArrayList<int capacity>
    *
    *   1.8 ：
    *       ArrayList list = new ArrayList();//底层数组初始化为{}，并没有创建容量为10的数组
    *       list.add(123);//第一次调用add()时，底层才创建长度10的数据，并将数据123添加到elementData[0]中
    *       ...
    *       后续的添加和扩容操作与jdk 7 无异。
    *    小结：jdk7中的ArrayList的对象的创建类似于单例的饿汉式，而jdk8中的ArrayList的对象的创建类似于单例的
    *           懒汉式，延迟了数组的创建，节省内存。
    *
    *      方法:
    *       indexof(Object obj):返回obj在集合中首次出现的位置
    *       lastindexOf(Object obj):返回obj在当前集合中末次出现的位置
    *       remove(int index):移除指定索引元素
    *       set(int index, Object ele):设置指定index位置的元素为ele
    *       subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
    * */

    @Test
    public void test(){
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private static void updateList(List list){
        list.remove(2);//删除所以为2的元素
        list.remove(new Integer(2));//删除值为2的元素
    }
}
