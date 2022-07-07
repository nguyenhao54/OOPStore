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
import java.util.Date;
public class Staff {

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    private int staffId;
    private String name;
    private String gender;
    private String phone;
    double rate;
    private Date birthDate;
    private ArrayList<RegisteredShift> workedShifts;
    
    public Staff( int id,String name, String gender, String phone, double rate, Date birthDate) {
        this.staffId = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.rate = rate;
        this.birthDate=birthDate;
    }

    public Staff() {
    }
    
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int id) {
        this.staffId = id;
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
    
    public ArrayList<RegisteredShift> getWorkedShifts()
            {
                return this.workedShifts;
            }
    public void setWorkedShifts(ArrayList<RegisteredShift> workedShifts)
            {
                this.workedShifts = workedShifts;
            }
    double workedHour;
    public double getWorkedHour()
    {
        workedHour = 0;
        for(RegisteredShift i : workedShifts)
        {
            workedHour += i.getRegisteredShift().getHour();
        }
        return workedHour;
    }
    
    public double getSalary() {
	return getWorkedHour()*rate;
}

    public Object[] toRowTable(EventAction event) {
      
        return new Object[]{staffId, name, gender, phone, rate, new ModelAction(this, event)};
    }
    
    public Object[] toRowSalaryTable() {
        return new Object[]{staffId, name, "role", rate, 1000000, 0, 0};
    }
}