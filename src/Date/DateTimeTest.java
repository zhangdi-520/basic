package Date;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * @version V1.0
 * @program: basic
 * @description: JDK8之前的日期和时间API
 * @author: Mr.Zhang
 * @create: 2020-12-10 21:35
 **/
public class DateTimeTest {

    @Test
    public void test1(){
        //时间戳
        long l = System.currentTimeMillis();
        System.out.println(l);

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());//获取时间戳
    }

    @Test
    public void test2(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化：日期--------------->字符串
        System.out.println(simpleDateFormat.format(new Date()));

        //解析： 格式化的逆过程 字符串-----------------> 日期
        String str = "2020-12-10 10:35:47";
        Date parse = simpleDateFormat.parse(str);
        System.out.println(parse);
    }

    @Test
    public void testCalendar(){
        Calendar instance = Calendar.getInstance();
        //返回本月的第几天
        int i = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        //将日期改为22号
        instance.set(Calendar.DAY_OF_MONTH,22);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //加3天，负数为减
        instance.add(Calendar.DAY_OF_MONTH,3);

    }


    /*
    * JDK8中的时间API
    * */
    @Test
    public void test4(){
        //now()获取当前日期和时间
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        //of()设置指定的年月日时分秒
        LocalDateTime of = LocalDateTime.of(2020, 10, 6, 10, 20);
        System.out.println(of);

        //getXXX()获取具体的时间值
        System.out.println(now2.getDayOfMonth());
        System.out.println(now2.getDayOfWeek());
        System.out.println(now2.getMonth());
        System.out.println(now2.getMonthValue());
        System.out.println(now2.getMinute());

        //修改产生新的值，不影响原来的值，不可变性
        //withXXX()设置相关属性
        LocalDateTime localDateTime = now2.withDayOfMonth(22);
        System.out.println(now2);
        System.out.println(localDateTime);

        //plusxxx()相关加操作， minusxxx()相关减操作
        LocalDateTime localDateTime1 = now2.plusDays(5);

        //now()获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);

        //添加时间偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //获取自1970年1月1日0时0分0秒开始的毫秒数
        long l = instant.toEpochMilli();
        System.out.println(l);

        //通过给定的毫秒数获取实例
        Instant instant1 = Instant.ofEpochMilli(15151554151L);
    }

    @Test
    public void test5(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(format);

        TemporalAccessor parse = dateTimeFormatter.parse("2020-12-11");
        System.out.println(parse);
    }
}
