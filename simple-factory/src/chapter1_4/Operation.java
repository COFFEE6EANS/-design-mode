package chapter1_4;

/**
 * @Author guojianfeng.
 * @Date Created in  2018/9/30
 * @Description： 封装运算符
 *
 */
public class Operation {

    private Double numA;
    private Double numB;

    public Double getNumA() {
        return numA;
    }

    public void setNumA(Double numA) {
        this.numA = numA;
    }

    public Double getNumB() {
        return numB;
    }

    public void setNumB(Double numB) {
        this.numB = numB;
    }
    public double getRes(double numA,double numB){
        double res = 0;
        return res;
    }

}
class OperatAdd extends Operation{
    @Override
    public double getRes(double numA, double numB) {
        return numA+numB;
    }
}
class OperatSub extends Operation{
    @Override
    public double getRes(double numA, double numB) {
        return numA-numB;
    }
}
class OperatMul extends Operation{
    @Override
    public double getRes(double numA, double numB) {
        return numA*numB;
    }
}
class OperatDiv extends Operation{
    @Override
    public double getRes(double numA, double numB) {
        if (numB==0){
            throw new RuntimeException("除数不能为0");
        }
        return numA/numB;
    }
}