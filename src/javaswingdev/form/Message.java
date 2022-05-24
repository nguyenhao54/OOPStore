/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingdev.form;

import javaswingdev.main.Dashboard;
import swing.MessageDialog;
import swing.Alarm;


/**
 *
 * @author T460S
 */
public class Message {
    
        public boolean showMessage(String message) {
        MessageDialog obj = new MessageDialog(Dashboard.getFrames()[0], true);
        obj.setLocationRelativeTo(Dashboard.getFrames()[0]);
        obj.showMessage(message);
        return obj.isOk();
    }
              public boolean showDialog(String message, String color) {
        Alarm obj = new Alarm(Dashboard.getFrames()[0], true, color);
        obj.setLocationRelativeTo(Dashboard.getFrames()[0]);
        obj.showMessage(message, color);
        return obj.isOk();
    }
    
}
