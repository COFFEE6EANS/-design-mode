package chapter1_4;

/**
 * @Author guojianfeng.
 * @Date Created in  2018/9/30
 * @Description：
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperatAdd();
            break;
            case "-":
                operation = new OperatSub();
            break;
            case "*":
                operation = new OperatMul();
            break;
            case "/":
                operation = new OperatDiv();
            break;
        }
        return operation;
    }
}
