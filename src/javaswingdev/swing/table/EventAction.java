/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingdev.swing.table;
import model.ModelStaff;

public interface EventAction {

    public void delete(ModelStaff staff);

    public void update(ModelStaff staff);
}
