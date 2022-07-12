/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingdev.swing.table;
import model.Staff;

public interface EventAction {

    public void delete(Staff staff);

    public void update(Staff staff);
    public void addShift(Staff staff);
}
