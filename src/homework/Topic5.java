package homework;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 作业5:实现一个杨辉三角
 *
 * 要求: 打印多少行由方法入参传入
 *
 * 杨辉三角的样式:
 *
 *               1
 *              1 1
 *             1 2 1
 *            1 2 3 2 1
 *           1 2 3 5 3 2 1
 * @author haoc
 */
public class Topic5 {

    public static void main(String[] args) {
        //1.创建存储上一行数据的数组temp
        int k = 2;
        int[] temp = new int[k];
        //1.1 因为两端数均为1，所以给第一个数temp[0]和最后一个数temp[k-1]赋值为1
        temp[0] = temp[k - 1] = 1;

        //2.打印杨辉三角
        //打印的行数--即杨辉三角行数rowCount
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要打印的行数：");
        Integer rowCount=null;
        try{
            rowCount = scan.nextInt();
        }catch(InputMismatchException e){
            System.out.println("请输入整数；");
            return;
        }


        if(rowCount >= 0){

            for (int i = 1; i <= rowCount; i++) {
                // 建立数组，存取当前行数据
                int[] arr = new int[i];
                // 给当前行数组赋值
                for (int j = 0; j < i; j++) {
                    // 先给第一个和最后一个数赋值
                    if (j == 0 || j == i - 1) {
                        arr[j] = 1;
                    } else {
                        // 中间数为上一行斜对角的两数之和
                        arr[j] = temp[j - 1] + temp[j];
                    }
                }
                // 给当前行赋值完毕后让k+1，增加数组长度，用于存取当前行的数据
                k++;
                temp = new int[k];

                //打印空格来实现等腰三角形
                for(int z=0;z<rowCount-i;z++){
                    System.out.print(" ");
                }

                // 打印当前行数组，并给新temp赋值，便于下一行使用当前行数据
                for (int y = 0; y < arr.length; y++) {
                    temp[y] = arr[y];
                    System.out.print(arr[y] + " ");
                }
                System.out.println();
            }


        }else {
            System.out.println("请输入合法数字！");
        }

    }

}
