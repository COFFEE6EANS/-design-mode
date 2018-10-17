package com.zmj.design.chain;
/**
 * 描述：组装车尾
 * @author 张谋江
 * @version 1.0 2017年4月26日 
 * @since 1.0
 */
public class CarTailHandler extends CarHandler {

	@Override
	public void handCar() {
		System.out.println("组装车尾");
		if(this.carHandler != null)
		this.carHandler.handCar();
	}

}
