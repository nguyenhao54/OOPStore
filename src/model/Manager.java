/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Duc Anh.Nguyen
 */
public class Manager extends Staff{
    double bonus;
    public Manager()
            {
                super();
            }
    public Manager( int id,String name, String gender, String phone, double rate)
            {
                super(id, name, gender, phone, rate);
            }
    @Override
    public double getSalary() {
	return workedHour*rate + bonus;
}

}
