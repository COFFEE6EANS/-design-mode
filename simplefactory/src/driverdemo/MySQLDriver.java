package driverdemo;

public class MySQLDriver implements Driver{

	@Override
	public void getConnection() {
		System.out.println("获取MySQL链接....");
	}

}
