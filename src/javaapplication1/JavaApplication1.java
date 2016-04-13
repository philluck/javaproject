
package javaapplication1;

import testobj.Comp;

public class JavaApplication1 {


    public static void main(String[] args) {
        Comp com = new Comp();
        com.setName("WS01");
        com.setRam(-2046);
        com.setHdd(500);
        com.on();
        com.load();
        com.off();
        com.setFactoryNumber("    sdgf       ");
        System.out.println(com.getFactoryNumber());
        
    }
    
}
