package operationdemo;

public class OperationFactory {
	public static Operation getOperation(String oper) {
		if ("+".equals(oper)) {
			return new AddOperation();
		} else if ("-".equals(oper)) {
			return new SubOperation();
		} else if ("*".equals(oper)) {
			return null;
		} else if ("/".equals(oper)) {
			return null;
		}else{
			return null;
		}
	}
}
