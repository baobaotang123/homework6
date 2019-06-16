package homework;

/**
 * 输出1到100以内的所有质数
 *
 * 质数: 只能被1和自身整除的数,如3,7,11,13等
 *
 * @author haoc
 */
public class Topic2 {

    public static void main(String[] args) {

        int i,j;
        System.out.println("输出1到100以内的所有质数: 2");
        for(i =3;i<=100;i=i+2){

            for(j = 2;j<=i/2;j++)
                if(i%j==0)break;
                if(j>i/2)System.out.print(" "+i);


        }

    }


}
