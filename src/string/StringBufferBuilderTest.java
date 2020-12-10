package string;

import org.junit.Test;

/**
 * @version V1.0
 * @program: basic
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2020-12-09 22:05
 **/
public class StringBufferBuilderTest {

    /*
    * String:不可变字符序列，底层使用char[]存储
    * StringBuffer:可变字符序列，线程安全，效率低，底层使用char[]存储
    * StringBuilder:可变字符序列，线程不安全，效率高，底层使用char[]存储
    * StringBuffer默认创建容量为16的数组，如果添加数据底层数组装不下，就需要扩容
    * 默认情况下，扩容为原来的2倍+2，同时将原有的数组元素复制到新数组中
    * 建议使用new StringBuffer(int capacity)或new Sttingbuilder(int capacirt)防止自动扩容
    * */
    @Test
    public void test1(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append("1");//添加元素
        s1.delete(0,1);//删除0-1索引元素
        s1.replace(2,4,"hello");//将2-4为替换成hello
        s1.insert(2,false);//在第二位插入false
        s1.reverse();//反转字符串
    }
}
