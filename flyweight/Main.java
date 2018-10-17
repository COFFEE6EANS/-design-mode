package com.zmj.design.flyweight;
/**
 * 描述：享元模式(构造型模式)
 * @author 张谋江
 * @version 1.0 2017年4月23日 
 * @since 1.0
 *  享元模式它通过与其他类似对象共享数据来减少内存占用
 */
public class Main {
	static {
		System.out.println("静态代码块");
	}
	private static boolean s = Main.staticMethod(2); 
	public static boolean  staticMethod(int a ){
		System.out.println("静态方法...");
		return true;
	}
	public static void main(String[] args) throws ClassNotFoundException {
		/**引入享元模式的应用场景，对于有的数据取得是一样的话，就没有必要再创建**/
		/**出来一个一样的对象了**/
		MyCharacter c5 = new MyCharacter("a");
		MyCharacter c6 = new MyCharacter("b");
		MyCharacter c7 = new MyCharacter("c");
		MyCharacter c8 = new MyCharacter("d");
		System.out.println(c7 == c8);//false
		
		/**享元模式**/
		/*CharacterFactory cf = new CharacterFactory();
		MyCharacter c1 = cf.getMyCharacter('a');
		MyCharacter c2 =  cf.getMyCharacter('c');
		MyCharacter c3 = cf.getMyCharacter('b');
		MyCharacter c4 = cf.getMyCharacter('b');
		System.out.println(c3 == c4);//true
*/		
	}
}
