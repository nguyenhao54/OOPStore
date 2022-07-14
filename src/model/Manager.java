/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;

/**
 *
 * @author Duc Anh.Nguyen
 */
public class Manager extends Staff{
    double bonus;
    public Manager()
            {
                super(1, "Hoang", "male", "134892", 1.2, new Date());
            }
    public Manager( int id,String name, String gender, String phone, double rate, Date date )
            {
                super(id, name, gender, phone, rate, date);
            }
    @Override
    public double getSalary(int month, int year) {
	return getWorkedHour(month, year)*rate + bonus;
}

}
