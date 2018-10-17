package com.zmj.design.mediator;

import org.junit.Test;

public class Main {
	/**引入中介模式**/
	/**引入中介模式之后，用Mediator来管理两个类(Woman/Man)的交互行为，后期只需要维护Mediator这个类的getPartner的方法即可实现功能**/
	/**优点:**/
	/**1.对关联对象集中控制**/
	/**2.减少类的耦合程度，明确类之间的相互关系**/
	/**3.Mediator模式将原来相互依存的多对多的类之间的关系简化为Mediator控制类与**/
	/**其他关联类的一对多的关系，当其中一个类修改时，可以对其他关联的类不产生影响**/
	@Test
	public void mediator2(){
		Mediator mediator = new Mediator();
		Woman w1 = new Woman("小芳", 12, mediator);
		Man  m1 = new Man("张三", 12, mediator);
		w1.getPartner(m1);//我们很合适
		
	}
	@Test
	public void mediator3(){
		Mediator mediator = new Mediator();
		Woman w1 = new Woman("小芳", 12, mediator);
		Man m2 = new Man("李四", 14, mediator);
		w1.getPartner(m2);//我们不合适
		
	}
	@Test
	public void mediator4(){
		Mediator mediator = new Mediator();
		Man  m1 = new Man("张三", 12, mediator);
		Man m2 = new Man("李四", 14, mediator);
		m1.getPartner(m2);//你想搞同性恋啊？？？？不合适吧
	}
}
