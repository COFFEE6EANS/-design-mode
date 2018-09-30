package chapter1_1;

import java.util.Scanner;

/**
 * @Author guojianfeng.
 * @Date Created in  2018/9/30
 * @Description：
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("请输入数字A");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("请输入运算符+ - * /");
        String b = scanner.next();
        System.out.println("请输入数字B");
        double c = scanner.nextDouble();

        if("+".equals(b)){
            System.out.println(a+c);
        }
        if("-".equals(b)){
            System.out.println(a-c);
        }
        if("*".equals(b)){
            System.out.println(a*c);
        }
        if("/".equals(b)){
            if(c==0){
                System.out.println("error");
            }else {
                System.out.println(a/c);
            }
        }
    }
}
