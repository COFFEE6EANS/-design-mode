/**
 * 描述： 工厂方法模式
 * 		工厂方法退化后可以演变成简单工厂模式
 * @author
 * @version 1.0
 * @since 1.0
 */
public class Main {
	
	public static void main(String[] args) {
		FruitFactory aFactory = new AppleFactory();
		Fruit aFruit = aFactory.productionFruit();
		aFruit.collect();
		
		FruitFactory bFactory = new BananaFactory();
		Fruit bFruit = bFactory.productionFruit();
		bFruit.collect();
		//后期如果要添加新水果类的话，按如下步骤来:
		//1.添加一个实现Fruit的接口类
		//2.添加一个生产你要的水果的工厂
		//嘿嘿，到这边知道这个模式的好处了吧，是不是不动原来的代码，就是实现功能呢
		//（耦合度是不是降低了呢？）	
	}

}
