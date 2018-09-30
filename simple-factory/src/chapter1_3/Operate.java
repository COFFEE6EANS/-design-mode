package chapter1_3;

/**
 * @Author guojianfeng.
 * @Date Created in  2018/9/30
 * @Description： 封装运算符
 *
 */
public class Operate {
    public static double getRes(double numA,double numB,String operate){
        double res = 0;
        switch (operate){
            case "+":
                res = numA+numB;
                break;
            case "-":
                res = numA-numB;
                break;
            case "*":
                res = numA*numB;
                break;
            case "/":
                if (numB == 0){
                    throw new RuntimeException("除数不能为0！");
                }
                res = numA/numB;
                break;
        }
        return res;
    }
}
