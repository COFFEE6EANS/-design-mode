package operationdemo;

import java.util.Scanner;
/**
 * 描述： 工厂方法的应用场景
 *     写出一个计算器
 * @author coffee6eans
 * @version 1.0
 * @since 1.0
 */
public class MainClass {
public static void main(String[] args) {
	/**1、此处完全使用面向过程的方法来实现的***/
	System.out.println("请输入第一个操作数...");
	Scanner scanner = new Scanner(System.in);
	String num1 = scanner.nextLine();
	System.out.println("请输入运算符");
	String operation = scanner.nextLine();
	System.out.println("请输入第二个数..");
	String num2 = scanner.nextLine();
	double result = 0 ;
	if("+".equals(operation)){
		result = Double.parseDouble(num1) +Double.parseDouble(num2);
	}else if("-".equals(operation)){
		result = Double.parseDouble(num1)  - Double.parseDouble(num2);
	}else if("*".equals(operation)){
		result = Double.parseDouble(num1)  * Double.parseDouble(num2);
	}else if("/".equals(operation)){
		result = Double.parseDouble(num1)  / Double.parseDouble(num2);
	}
	System.out.println("结果为：" + result);
	/***2、使用简单的工厂模式来实现*****/
	Operation o = OperationFactory.getOperation(operation);
	o.setNum1(Double.parseDouble(num1));
	o.setNum2(Double.parseDouble(num2));
	System.out.println(	o.getResult());
}
}
