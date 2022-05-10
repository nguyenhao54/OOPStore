/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingdev.swing.table;

import model.Staff;

public class ModelAction {
    private Staff staff;
    private EventAction event;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff st) {
        this.staff = st;
    }

    public EventAction getEvent() {
        return event;
    }

    public void setEvent(EventAction event) {
        this.event = event;
    }

    public ModelAction(Staff staff, EventAction event) {
        this.staff=staff;
        this.event = event;
    }

    public ModelAction() {
    }

   }
