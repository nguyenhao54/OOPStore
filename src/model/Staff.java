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
    private int maxShiftId;
    
    public Staff( int id,String name, String gender, String phone, double rate, Date birthDate) {
        this.staffId = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.rate = rate;
        this.birthDate=birthDate;
        this.workedShifts=new ArrayList<>();
        this.maxShiftId = 1;
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
    public double getWorkedHour(String month, String year)
    {
        workedHour = 0;
        for(RegisteredShift i : workedShifts)
        {  
            if((i.getRegisteredDate().getMonth().toString().equals(month))&&(i.getRegisteredDate().getYear()==Integer.parseInt(year))){
            workedHour += i.getRegisteredShift().getHour();}
        }
        return workedHour;
    }
    
    public int getMaxShiftId(){
        return maxShiftId;
    }
    
    public void setMaxShiftId(int newId){
        this.maxShiftId = newId;
    }
    
    public int getMaxShiftIdAndIncrease(){
        return maxShiftId++;
    }
    
    public void addShift(RegisteredShift shift){
        workedShifts.add(shift);
    }
    
    public void deleteShift(int id){
        for (int i = 0; i < this.workedShifts.size(); ++i) {
            if (this.workedShifts.get(i).getId()== id) {
                this.workedShifts.remove(i);
            }
        }
    }
    
    public double getSalary(String month, String year) {
	return getWorkedHour(month, year)*rate;
}

    public Object[] toRowTable(EventAction event) {
      
        return new Object[]{staffId, name, gender, phone, rate, new ModelAction(this, event)};
    }
    
    public Object[] toRowSalaryTable() {
        return new Object[]{staffId, name, rate ,"1111", workedHour };
    }
}