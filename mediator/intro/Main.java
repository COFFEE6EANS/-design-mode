package com.zmj.design.mediator.intro;

import org.junit.Test;

public class Main {
	/**引入中介模式的应用场景**/
	/**两个类之间的一个行为交互(Woman和Man这两个类),对于后期如果Woman和Man这两个类的getPartner()方法又增加了新的条件**/
	/**那么，必然需要去动getPartner()里面的代码，而且目前这两个类getPartner()方法中的代码类似，所以此处可以引入中介者模式来处理这个问题**/
	@Test
public void mediator1(){
	Woman xiaoFang = new Woman("小芳", 15);
	Man zhangSan = new Man("张三", 13);
	Man liSi = new Man("李四", 15);
	xiaoFang.getPartner(zhangSan);
}
}
