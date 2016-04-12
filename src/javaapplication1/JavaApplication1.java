/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import testobj.Comp;

/**
 *
 * @author Philip
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comp com = new Comp();
        com.name ="WS01";
        com.hdd=250;
        com.on();
        com.load();
        com.off();
    }
    
}
