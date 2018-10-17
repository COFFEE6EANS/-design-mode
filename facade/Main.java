package com.zmj.design.facade;

import org.junit.Test;

/**
 * 描述：外观模式（构造型模式）
 * @author 张谋江
 * @version 1.0 2017年4月24日 
 * @since 1.0
 */
public class Main {
@Test
public void client1(){
	/**引入外观模式的应用场景**/
	/**当客户端1要同时调用A、B、C三个系统的某个功能是需要进行如下操作***/
	SystemA systemA = new SystemA();
	SystemB systemB = new SystemB();
	SystemC systemC = new SystemC();
	systemA.doSomething();
	systemB.doSomething();
	systemC.doSomething();
}
@Test
public void client2(){
	/**引入外观模式的应用场景**/
	/**当客户端1要同时调用A、B三个系统的某个功能是需要进行如下操作**/
	SystemA systemA = new SystemA();
	SystemB systemB = new SystemB();
	systemA.doSomething();
	systemB.doSomething();
}
@Test
public void client11(){
	/**引入外观模式**/
	/**实现客户端1要实现的功能**/
	SystemFacade sf = new SystemFacade();
	sf.doABC();
	
}
@Test
public void client22(){
	/**引入外观模式**/
	/**实现客户端2要实现的功能**/
	SystemFacade sf = new SystemFacade();
	sf.doAB();
}
}
