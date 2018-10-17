package driverdemo;

public class OracleDriver implements Driver {

	@Override
	public void getConnection() {
		System.out.println("获取Oracle链接.....");
	}

}
