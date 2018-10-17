package operationdemo;

public class SubOperation extends Operation{
	@Override
	public double getResult() {
		return this.getNum1() - this.getNum2();
	}

}
