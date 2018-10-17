
package compose;


/**
 * Description: 苹果手机，需要用指定的usb接口进行充电，但是现在没有，所以需要用指定的适配器来进行转化
 * 
 * @Date Create on 2017年9月26日
 * @author <a href="mailto:zhangmoujiang@zuozh.com">zhangmoujiang</a>
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
public class IPhone {
	
	ThreePlugInterface plug;
	
	public IPhone(ThreePlugInterface plug) {
		this.plug = plug;
	}
	/**
	 * 使用三相电源接口，进行充电
	 */
	public void charge(){
		plug.powerWithThree();
	}
	public static void main(String[] args) {
		/**此方式 是对象适配器，把“被适配者”，作为一个对象组合到适配器类中，以修改目标接口包装被适配者**/
		USB usb = new USB();
		ThreePlugInterface plug = new USBAdapter(usb);
		IPhone laptop = new IPhone(plug);
		laptop.charge();
	}
	
}
