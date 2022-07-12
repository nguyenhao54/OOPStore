/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalTime;

/**
 *
 * @author Duc Anh.Nguyen
 */
public class Shift {
    int shiftId;
    LocalTime startTime;
    LocalTime endTime;
    double hour;
    public Shift(int shiftId, String startTime, String endTime, double hour)
            {
                this.shiftId = shiftId; 
                this.startTime = LocalTime.parse(startTime);
                this.endTime = LocalTime.parse(endTime);
                this.hour = hour;
            }
    public LocalTime getStartTime()
        {
               return startTime;
        }
    public LocalTime getEndTime()
        {
               return endTime;
        }
    public int getShiftId()
        {
            return shiftId;    
        }
    public double getHour()
        {
            return hour;    
        }
    public void setStartTime(String startTime)
        {
            this.startTime = LocalTime.parse(startTime);
        }
    public void setEndTime(String endTime)
        {
            this.endTime = LocalTime.parse(endTime);
        }
    public void setShiftId(int shiftId)
        {
            this.shiftId = shiftId;    
        }
   
}
