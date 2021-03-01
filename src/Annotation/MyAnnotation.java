package Annotation;

import org.junit.Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @program: basic
 * @description: 自定义注解
 * @author: Mr.Wang
 * @create: 2021-03-01 21:26
 **/

/*
* 1.注解声明为：@interface
* 2.内部定义成员，通常使用value表示
* 3.可以指定成员得默认值，使用default定义
* 4.如果自定义注解没有成员，表明是一个标识作用
*
*   元注解：对现有的注解进行解释说明的注解
*   Retention:指定所修饰的Annotation的声明周期
*       SOURCE：编译期注解，不会生成到.class文件中
*       CLASS：默认，不会体现在运行状态中
*       RUNTIME：运行时注解，只有声明为它才能通过反射获取
*   Target:用于指定被修饰的注解能用于修饰哪些程序元素
*   Documented：表示所修饰的注解在被javadoc解析时，保留下来（默认不保留）
*   Inherited：被它修饰的注解将具有继承性，带有该注解的类它的子类也有该注解
* */
    @Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String value() default "hello";
}
