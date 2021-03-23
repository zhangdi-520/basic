package Collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @version V1.0
 * @program: basic
 * @description: Set讲解
 * @author: Mr.Zhang
 * @create: 2021-03-23 21:54
 **/
public class SetTest {

    /*
    * Set接口：存储无序的、不可重复的数据
    *   以HashSet说明：
    *       1.无序性：
    *           不等于随机性，存储的数据在底层数组中并非按照数组索引的顺序添加，二十根据数据的哈希值添加
    *       2.不可重复性：
    *           保证添加的元素按照equals()判断时，不能返回true。即：相同的元素只能添加一个。
    *
    *   HashSet:
    *       作为Set接口的主要实现类，线程不安全；可以存储null值
    *   LinkedHashSet:
    *       作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历
    *   TreeSet:
    *       可以按照添加对象的指定属性，进行排序
    *
    *   添加元素：
    *       以HashSet为例：
    *           我们向HashSet中添加元素a，首先调用元素a的hashCode（）方法，计算a的哈希值，此哈希值通过某种
    *         算法计算出HashSet底层数组中的存放位置，判断数组此位置上是否有其他元素：
    *               如果此位置上没有其他元素，则a添加成功 -->
    *               如果此位置上有元素b（或以链表形式存在的多个元素），则比叫a与b的hash值：
    *                   如果hash值不相同，则a添加成功。 -->
    *                   如果hash值相同，进而需要调用a的equals()方法：
    *                       equals()返回true， a添加失败
    *                       equals()返回false，a添加成功 ---？情况3
    *       对于添加成功的情况2和情况3而言：元素a与已经存储在直到索引位置上的数据以链表的方式存储
    *       
    *
    * */

    @Test
    public void test(){
        Set set = new HashSet<>();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(129);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
