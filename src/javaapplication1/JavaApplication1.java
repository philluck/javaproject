
package javaapplication1;

import testobj.Comp;

public class JavaApplication1 {


    public static void main(String[] args) {
        Comp com = new Comp();
        com.name ="WS01";
        com.hdd=250;
        com.on();
        com.load();
        com.off();
    }
    
}
