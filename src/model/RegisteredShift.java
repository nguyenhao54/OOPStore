package model;
import java.time.LocalDate;

public class RegisteredShift{
    private LocalDate registeredDate;
    private Shift registeredShift;
    
    public RegisteredShift(LocalDate d, Shift s){
        registeredDate = d;
        registeredShift = s;
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
}
