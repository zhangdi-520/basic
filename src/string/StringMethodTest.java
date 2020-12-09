package string;

import org.junit.Test;

/**
 * @version V1.0
 * @program: basic
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2020-12-08 21:23
 **/
public class StringMethodTest {

    @Test
    public void test4(){
        String s = "abc";
        //String和char[] 互转
        char[] chars = s.toCharArray();
        String s1 = new String(chars);
    }

    @Test
    public void test3(){
        String s = "fafnhaus";
        //把a替换成c
        s.replace("a","c");
    }

    @Test
    public void test2(){
        String s1 = "a";
        String s2 = "A";
        String s3 = "c";
        //忽略大小写的比较
        System.out.println(s1.equalsIgnoreCase(s2));
        //字符串拼接
        System.out.println(s1.concat(s2));
        //比较大小，负数s1小
        System.out.println(s1.compareTo(s3));
        //截取字符串，两个参数是取前不取后
        System.out.println(s1.substring(0));
        //判断是否以指定字符串结尾
        s1.endsWith("a");
        s1.startsWith("a");
        //判断从0号索引开始是不是以a开始的
        s1.startsWith("a",0);
        //判断当前字符串中是否包含
        s1.contains("S");
        //返回a在s1中首次出现的索引，没找到返回-1
        s1.indexOf("a");
        //返回5号索引后a首次出现的索引
        s1.indexOf("a",5);
        //从后往前
        String s4 = "cadasj";
        System.out.println(s4.lastIndexOf("a"));
        s1.lastIndexOf("A",7);
    }

    @Test
    public void test1(){
        String s1 = "helloWorld";
        System.out.println(s1.length());
        //返回索引处的字符
        System.out.println(s1.charAt(1));
        //判断是否为空
        System.out.println(s1.isEmpty());
        //大小写
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        String s2 = "   he  llo    ";
        //去除字符串首尾空格
        System.out.println(s2.trim());
    }
}
