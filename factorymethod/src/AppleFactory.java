/**
 * 描述：水果工厂
 */
public class AppleFactory implements FruitFactory {
	@Override
	public Fruit productionFruit() {
		return new Apple();
	}

}
