package string.exer;

/**
 * @version V1.0
 * @program: basic
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2020-12-08 21:06
 **/
public class StringTest {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        //本质上是将str的地址赋给了第一个参数，第一个参数指向了另一个常量池里的值，但是str还是指向原先的值
        //这里str和第一个参数代表两个不同变量，str只是把地址值赋值给了第一个参数
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);//good
        System.out.println(ex.ch);
    }
}
