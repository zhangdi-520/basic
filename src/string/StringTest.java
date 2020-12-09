package string;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @version V1.0
 * @program: basic
 * @description: String的使用
 * @author: Mr.Zhang
 * @create: 2020-12-07 21:00
 **/
public class StringTest {

    /*
    * 1.常量拼接的结果在常量池中
    * 2.如果其中一个是变量，结果在堆中
    * 3.拼接结果调用intern()方法，返回值就在常量池中
    * */

    @Test
    public void test3(){
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = "a" + "b";
        String s5 = s1 + "b";
        String s6 = s5.intern();
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s6);
    }

    /*
    * 1.通过字面量的方式
    * 2.通过new+构造器的方式
    * */
    @Test
    public void test2(){
        String s1 = "javaEE";
        String s2 = "javaEE";

        //new的对象放在堆中，对象里的value指向方法区常量池里的javeEE，
        String s3 = new String("javaEE");
        //在内存中创建了两个对象，一个在堆中一个在常量池中
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("************************");
        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);//均指向常量池中的Tom 地址相同

    }


    /*
    * 1.String声明为final的，不可被继承
    * 2.String实现了Serializable接口，表示字符串是支持序列化的.
    *         实现了Comparable接口，表示String可以比较大小
    * 3.String内部定义了final char[] value用于存储字符串数据
    * 4.String：代表不可变的字符序列。简称：不可变性。
    *   体现：1.当字符串重新赋值时，需要指定重新指定内存区域赋值，不能使用原有的value进行赋值
    *        2.对现有的字符串进行连接操作时，也需要指定重新指定内存区域赋值，不能使用原有的value进行赋值
    * 5.通过字面量的方式（区别于new）给字符串赋值，此时的字符串值声明在字符串常量池中（方法娶呢）。
    * 6.字符串常量池中是不会存储相同内容的字符串的
    * */
    @Test
    public void test1(){
        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";
        System.out.println(s1==s2);//比较s1和S2地址值
        s1 = "hello";
        System.out.println(s1);//hello
        System.out.println(s2);//abc

        String s3 = "abc";
        s3+="def";
        System.out.println(s3);

        String s4 = "abc";
        String s5 = s4.replace("a","s");//replace也是从新指定内存区域赋值
        System.out.println(s4);
        System.out.println(s5);
    }
}
