package Enum;

/**
 * @version V1.0
 * @program: basic
 * @description: 枚举类使用
 * @author: Mr.Zhang
 * @create: 2021-02-23 21:49
 **/
/*
* 1.枚举类的理解：类的对象只有有限个，确定的。我们程此类为枚举类。
* 2.当需要定义一组常量时，强烈建议使用枚举类。
* 3.如果枚举类只有一个对象，则可以作为单例模式的实现方式。
*
* */
public class SeasonTest {

    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season1 S = Season1.SUMMER;

        //获取枚举类常量数组
        Season1[] values = Season1.values();
        for (Season1 value : values) {
            System.out.println(value);
        }

        Season1 summer = Season1.valueOf("SUMMER");
        System.out.println(summer);
    }
}

//自定义枚举类(基本不用)
class Season{
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final Season SPRING = new Season("春天","春");
    public static final Season SUMMER = new Season("夏天","夏");
}

interface Info{
    void show();
}

//推荐使用（定义的枚举类默认继承java.lang.Enum）
enum Season1 implements Info{
    SPRING ("春天","春"){
        //为每个变量定义实现接口方法
        @Override
        public void show() {
            System.out.println("春天来啦");
        }
    },
    SUMMER ("夏天","夏") {
        @Override
        public void show() {
            System.out.println("夏天来啦");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

}
