package driverdemo;

/**
 * 描述： 简单工厂方法(创建型模式)
 * @author coffee6eans.
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		SQLFactory sqlFactory = new SQLFactory();
		Driver mysqlDriver = sqlFactory.getDriver(DriverEnum.MySQLDriver);
//		driverdemo.Driver oracleDriver = sqlFactory.getDriver("mysql");
		mysqlDriver.getConnection();
//		oracleDriver.getConnection();
	}
}
