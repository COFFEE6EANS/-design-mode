
package extend;

/**
 * Description: 苹果手机，需要用指定的usb接口进行充电，但是现在没有，所以需要用指定的适配器来进行转化
 *
 */
public class IPhone {
	
	ThreePlugInterface plug;
	
	public IPhone(ThreePlugInterface plug) {
		this.plug = plug;
	}
	
	/**
	 * 使用三相电源接口，进行充电
	 */
	public void charge() {
		plug.powerWithThree();
	}
	
	public static void main(String[] args) {
		/**此方式是类适配器，采用继承的方式来实现**/
		/**通过多重继承不兼容接口，实现对目标接口的匹配，单一的为某一个类而实现适配**/
		ThreePlugInterface plug = new USBAdapter();
		IPhone laptop = new IPhone(plug);
		laptop.charge();
	}
	
}
