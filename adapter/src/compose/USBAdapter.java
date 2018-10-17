
package compose;


/**
 * Description: 
 * 
 * @Date Create on 2017年9月26日
 * @author <a href="mailto:zhangmoujiang@zuozh.com">zhangmoujiang</a>
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
public class USBAdapter implements ThreePlugInterface {
	
	USB usb;
	
	public USBAdapter(USB usb) {
		this.usb = usb;
	}

	@Override
	public void powerWithThree() {
		usb.usbCharge();
	}
	
}
