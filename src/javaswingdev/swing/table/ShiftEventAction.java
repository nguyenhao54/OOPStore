/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingdev.swing.table;
import model.RegisteredShift;

public interface ShiftEventAction {

    public void delete(RegisteredShift registeredShift);

    public void update(RegisteredShift registeredShift);
}
