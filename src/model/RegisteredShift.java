package model;
import java.time.LocalDate;
import javaswingdev.swing.table.ShiftEventAction;
import javaswingdev.swing.table.ModelAction;

public class RegisteredShift{
    private LocalDate registeredDate;
    private Shift registeredShift;
    private int id;
    
//    public RegisteredShift(LocalDate d, Shift s){
//        registeredDate = d;
//        registeredShift = s;
//    }
    
    public RegisteredShift(int id, LocalDate d, Shift s){
        this.id = id;
        registeredDate = d;
        registeredShift = s;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    /**
     * @return the registeredDate
     */
    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    /**
     * @param registeredDate the registeredDate to set
     */
    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    /**
     * @return the registeredShift
     */
    public Shift getRegisteredShift() {
        return registeredShift;
    }

    /**
     * @param registeredShift the registeredShift to set
     */
    public void setRegisteredShift(Shift registeredShift) {
        this.registeredShift = registeredShift;
    }
    public Object[] toRowTable(ShiftEventAction event) {
        return new Object[]{this.getId(), registeredShift.getStartTime(), registeredShift.getEndTime(),registeredDate, new ModelAction(this, event)};
    }
}
