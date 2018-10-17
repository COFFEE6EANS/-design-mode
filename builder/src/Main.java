/**
 * 描述：建造者模式(创建型模式)
 * @author
 * @version 1.0
 * @since 1.0
 */
public class Main {

	public static void main(String[] args) {
		/**引入建造者模式的场景**/
		/**1.从客户端，对于要创建房子的最普通方式是如下，如果每次要创建不同的房子的话，就必须类似这样进行创建*/
		/**缺点：客户端的代码要不断的动，不利于维护**/
		House house = new House();
		house.setFloor("普通地板");
		house.setWall("普通墙");
		house.setRoof("普通房顶");
		House h1 = new House();
		h1.setFloor("中等地板");
		h1.setWall("中等墙");
		h1.setRoof("中等房顶");
		/**2.增加了一个建造房子的工程队**/
		/**缺点:**/
		
		HouseBuilder commonBuilder = new CommonBuilder();
		commonBuilder.makeFloor();
		commonBuilder.makeRoof();
		commonBuilder.makeWall();
		House h2 = commonBuilder.getHouse();
		System.out.println(h2);
		
		/**3.增加一个管理者（指导工程队进行设计）【引入建造者模式】**/
		/**对于后期如果要创建一个中等房子的话，只需要实现houseBuilder接口，创建出一个MediumBuilderm,交给designer即可**/
		/**分离了在客户端代码中去创建不同类别的House对象,代码数量动得少了**/
		Designer designer = new Designer();
		HouseBuilder builder = new CommonBuilder();
		designer.designHouse(builder);
		House h3 = builder.getHouse();
		System.out.println(h3);
		///
		HouseBuilder mediumBuilder = new MediumBuiler();
		designer.designHouse(mediumBuilder);
		House h4 = mediumBuilder.getHouse();
		System.out.println(h4);
		
	}
	

}
