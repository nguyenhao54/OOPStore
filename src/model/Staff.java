/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author T460S
 */
import javaswingdev.swing.table.EventAction;
import javaswingdev.swing.table.ModelAction;
import java.util.ArrayList;
public class Staff {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public ArrayList<Shift> getWorkedShifts()
            {
                return this.workedShifts;
            }
    public void setWorkedShifts(ArrayList<Shift> workedShifts)
            {
                this.workedShifts = workedShifts;
            }
    double workedHour;
    void getWorkedHour()
    {
        for(Shift i : workedShifts)
        {
            workedHour += i.hour;
        }
    }
    public double getSalary() {
	return workedHour*rate;
}
    public Staff( int id,String name, String gender, String phone, double rate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.rate = rate;
    }

    public Staff() {
    }

    private int id;
    private String name;
    private String gender;
    private String phone;
    double rate;
    private ArrayList<Shift> workedShifts;
    

    public Object[] toRowTable(EventAction event) {
      
        return new Object[]{id, name, gender, phone, rate, new ModelAction(this, event)};
    }
}