package demo1;

import java.util.Arrays;
import java.util.List;

/**
 * @Author guojianfeng.
 * @Date Created in  2018/10/11
 * @Description：
 */
public class Demo1 {
    public static void main(String[] args) {
        demo1();
    }
    public static void demo1(){
        Integer[] integers = new Integer[]{1,4,9,4,6};
        Arrays.sort(integers);
        for (Integer i:integers)
        System.out.println(i);
    }
}
