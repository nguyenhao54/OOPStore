/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingdev.swing.table;

import model.ModelStaff;

public class ModelAction {
    private ModelStaff staff;
    private EventAction event;

    public ModelStaff getStaff() {
        return staff;
    }

    public void setStaff(ModelStaff st) {
        this.staff = st;
    }

    public EventAction getEvent() {
        return event;
    }

    public void setEvent(EventAction event) {
        this.event = event;
    }

    public ModelAction(ModelStaff staff, EventAction event) {
        this.staff=staff;
        this.event = event;
    }

    public ModelAction() {
    }

   }
