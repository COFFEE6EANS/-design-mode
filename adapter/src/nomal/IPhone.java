package nomal;

import extend.USB;

/**
 * Description:
 *
 * @author <a href="mailto:zhangmoujiang@zuozh.com">Moujiang.Zhang</a>
 * @Date Create on 2017/11/1
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
public class IPhone {
    private USB usb;

    public void setUsb(USB usb) {
        this.usb = usb;
    }
    public void charge(){
        usb.usbCharge();
    }
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.setUsb(new USB());
        iPhone.charge();
    }
}
