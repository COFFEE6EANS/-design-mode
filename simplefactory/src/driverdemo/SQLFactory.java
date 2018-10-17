package driverdemo;

public class SQLFactory {
	/**
	 * 造对象
	 * 
	 * @param type
	 * @return
	 */
	public Driver getDriver(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*
		 * 第一种方法(缺点:当Driver接口的实现类多了的话，就需要动这部分的代码。不符合设计模式的封闭原则【封闭，封闭，
		 * 就是尽量少动之前写的代码了】)
		 
		if (type.equalsIgnoreCase("MySQL")) {
			return new driverdemo.MySQLDriver();
		} else if (type.equalsIgnoreCase("Oracle")) {
			return new driverdemo.OracleDriver();
		} else {
			System.out.println("没有该类型...");
			return null;
		}
		*/
		/*第二种方法*/
		return (Driver)Class.forName(type).newInstance();
	}
}
