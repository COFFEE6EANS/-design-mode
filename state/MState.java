package com.zmj.design.state;

/**
 * 描述：早餐状态
 * @author 张谋江
 * @version 1.0 2017年4月28日 
 * @since 1.0
 */
public class MState extends State{

	@Override
	public void eat(Person person) {
		if(person.getHour() == 6){
			System.out.println( "吃早餐");
		}else{
			person.setState(new LState());
			person.eat();
		}
	}

}
