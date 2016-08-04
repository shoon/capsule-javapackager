/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.capsulejavapackager;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author shaun
 */
public class Application {

    private static final String HELLO_STRING = "Hello from inside the Application";

    public static void main(String args[]) {
        Toolkit.getDefaultToolkit().beep();
        System.out.println(HELLO_STRING);
        JOptionPane.showMessageDialog(null, HELLO_STRING);
    }

}
