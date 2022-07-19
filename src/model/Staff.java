/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author T460S
 */
import java.text.DecimalFormat;
import java.time.LocalDate;
import javaswingdev.swing.table.EventAction;
import javaswingdev.swing.table.ModelAction;
import java.util.ArrayList;
import java.util.Date;
public class Staff {

  
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password ;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Date getBirthDate() {
        return birthDate;
    }
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
    private static double perHour = 20000;
    private String username;
    private String password;
            
    
    public Staff( int id,String name, String gender, String phone, double rate, Date birthDate) {
        this.staffId = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.rate = rate;
        this.birthDate=birthDate;
        this.workedShifts=new ArrayList<>();
        this.maxShiftId = 1;
        this.setUsername("useracc");
        this.setPassword("12345");
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
    public double getWorkedHour(int month, int year)
    {
        workedHour = 0;
        for(RegisteredShift i : workedShifts)
        {            
            if(i.getRegisteredDate().getMonthValue() == month && i.getRegisteredDate().getYear()== year){
            workedHour += i.getRegisteredShift().getHour();
            }
        }
        return workedHour;
    }
    
    public double getWorkedHour()
    {
        LocalDate now = LocalDate.now();
        workedHour = 0;
        for(RegisteredShift i : workedShifts)
        {            
            if(i.getRegisteredDate().getMonthValue() == now.getMonthValue() && i.getRegisteredDate().getYear()== now.getYear()){
            workedHour += i.getRegisteredShift().getHour();
            }
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
    
//    Get salary of specific month
    public double getSalary(int month, int year) {
	return getWorkedHour(month, year)*rate*perHour;
}
//    Get salary of this month
    public double getSalary() {
	return getWorkedHour()*rate*perHour;
}

    public Object[] toRowTable(EventAction event) {
      
        return new Object[]{staffId, name, gender, phone, rate, new ModelAction(this, event)};
    }
    
    public Object[] toRowSalaryTable(int month, int year) {
               DecimalFormat df = new DecimalFormat("###,###.##");
       df.setMaximumFractionDigits(8);
       String formattedSalary = df.format(getSalary(month,year)) + " VND";
        return new Object[]{staffId, name, rate ,getWorkedHour(month,year),formattedSalary };
    }
}