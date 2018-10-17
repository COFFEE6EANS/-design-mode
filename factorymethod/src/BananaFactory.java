public class BananaFactory implements FruitFactory {
	@Override
	public Fruit productionFruit() {
		return new Banana();
	}

}
