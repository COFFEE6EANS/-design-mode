package chapter1_2;

import java.util.Scanner;

/**
 * @Author guojianfeng.
 * @Date Created in  2018/9/30
 * @Description：if没有switch好    使用switch
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("请输入数字A");
        Scanner scanner = new Scanner(System.in);
        double numA = scanner.nextDouble();
        System.out.println("请输入运算符+ - * /");
        String operate = scanner.next();
        System.out.println("请输入数字B");
        double numB = scanner.nextDouble();
        switch (operate){
            case "+" : System.out.println(numA+numB);break;
            case "-" : System.out.println(numA-numB);break;
            case "*" : System.out.println(numA*numB);break;
            case "qqqqq" : System.out.println(numA*numB);break;
            case "/" :
                if(numB==0){
                    System.out.println("error");
                }else {
                    System.out.println(numA/numB);
                }
                break;
        }
    }
}
