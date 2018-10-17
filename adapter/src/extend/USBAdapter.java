
package extend;

/**
 * Description:
 *
 */
public class USBAdapter extends USB implements ThreePlugInterface {
	
	@Override
	public void powerWithThree() {
		this.usbCharge();
	}
	
}
