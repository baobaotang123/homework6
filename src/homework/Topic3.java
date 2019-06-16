package homework;


import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 作业3: 实现一个计算器
 *
 * 需求如下:
 *
 * - 1.接收客户端输入(Java核心卷一,第三章,3.7节)的三个数据,格式: 数据1 操作符 数据2,如: 1 + 2
 *
 * - 2.如果数据1和2是数值型,则进行相应的运算符操作
 *
 * - 3.如果数据1和2不是数值型,则将数据1和数据2按字符串处理,与运算符一起拼接后输出,如: abc - bcd,输出"abc-bcd"
 *
 * 备注:
 *
 * - 1.计算器运算符只支持+,-,*,/,%
 *
 * - 2.数据和运算符之间使用空格隔开
 *
 * 要求:
 *
 * - 1.考虑程序的健壮性
 *
 * - 2.自行设计测试用例
 *
 * @author haoc
 */
public class Topic3 {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("请输入计算公式:");
        String str = scan.nextLine();
        String[] expression = str.split(" ");
        String firstParam,secondParam,oper;
        if(expression.length == 3){

            firstParam = expression[0];
            secondParam = expression[2];
            oper = expression[1];
            if(isNumber(firstParam) && isNumber(secondParam) && isOperation(oper)){
                double result;
                switch(oper){
                    case "+":
                        result =  Double.parseDouble(firstParam)  +  Double.parseDouble(secondParam);
                        System.out.println("The Result is:" + firstParam + oper + secondParam+"="+result);
                        break;
                    case "-":
                        result =  Double.parseDouble(firstParam)  -  Double.parseDouble(secondParam);
                        System.out.println("The Result is:" + firstParam + oper + secondParam+"="+result);
                        break;
                    case "*":
                        result =  Double.parseDouble(firstParam)  *  Double.parseDouble(secondParam);
                        System.out.println("The Result is:" + firstParam + oper + secondParam+"="+result);
                        break;
                    case "/":
                        if(Double.parseDouble(secondParam)==0.0){
                            System.out.println("被除数不能为0");
                            break;
                        }
                        result =  Double.parseDouble(firstParam)  /  Double.parseDouble(secondParam);
                        System.out.println("The Result is:" + firstParam + oper + secondParam+"="+result);
                        break;
                    case "%":
                        result =  Double.parseDouble(firstParam)  %  Double.parseDouble(secondParam);
                        System.out.println("The Result is:" + firstParam + oper + secondParam+"="+result);
                        break;

                }

            }else if(!isOperation(oper)){
                System.out.println("运算符不符合要求！");
            }else{
                System.out.println("The Result is:" + firstParam + oper + secondParam);
            }


        }else {
            System.out.println("输入的计算公式不符合要求！");
        }

    }

    protected static boolean isNumber(String s){
        try{
            Double.valueOf(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    protected static boolean isOperation(String s){
        if("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s) || "%".equals(s)){
            return true;
        }
        return false;
    }

}
