package Arr;


import org.junit.Test;

import java.util.Arrays;

/*
* 数组
*       1.数组一旦初始化长度不能改变
*       2.基本数据类型数组：默认初始化的值根据数组类型决定
*         引用数据类型数据：默认初始化值为null
* */
public class Arr {

    public static void main(String[] args) {
        //定义
        //动态初始化 为数组声明且分配空间与赋值操作分开进行
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        //静态初始化，在定义数组的同时就为数组元素分配空间并赋值
        int arr1[] = new int[]{3,6,9};
        int[] arr2 = {3,6,9};
        String names[] = {"李大钊","陈独秀"};

        System.out.println(names.length);

    }

    @Test
    public void test1(){
        //二分查找
        int[] arr3 = new int[]{-9,-54,-2,0,2,33,43,256,999};
        boolean isFlag = true;
        int number = 256;
        int head = 0;
        int end = arr3.length-1;
        while(head<=end){
            int middle = (head+end)/2;
            if(arr3[middle] == number){
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag = false;
                break;
            }else if(arr3[middle]>number){
                end = middle-1;
            }else {
                head = middle+1;
            }
        }
        if (isFlag){
            System.out.println("未找到指定元素");
        }
    }

    @Test
    public void test2(){
        int[] numbers= {5,900,1,5,99,30};
        Arrays.sort(numbers);;
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}

class TestArr{
    public static void main(String[] args) {
        int[] s;
        s= new int[10];
        for (int i =0;i<10;i++){
            s[i] = 2*i+1;
            System.out.println(s[i]);
        }

        //二维数组定义
        //动态
        int[][] arr = new int[3][2];
        int[][] arr1 = new int[3][];
//        int[][] arr2 = new int[][2];//非法
        //静态
        int[][] arr3 = new int[][]{{3,2,8},{2,7}};
    }
}
