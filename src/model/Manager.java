
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
import javaswingdev.main.Main;

/**
 *
 * @author Duc Anh.Nguyen
 */
public class Manager extends Staff{
    private double bonus;
    
    public Manager()
            {
                super(1, "Hoang", "male", "134892", 1.2, new Date());
                 this.setUsername("bms");
                  this.setPassword("1");
            }
    public Manager( int id,String name, String gender, String phone, double rate, Date date )
            {
                super(id, name, gender, phone, rate, date);
                 this.setUsername("bms");
                 this.setPassword("1");
            }
    @Override
    public double getSalary(int month, int year) {
	return getWorkedHour(month, year)*rate + getBonus();
}

    /**
     * @return the bonus
     */
    public double getBonus() {
        double b= Main.store.getIncome()- Main.store.getExpense();
        bonus=b*rate/12;
        return bonus;
    }   
  
    
 

}
