package javaswingdev.swing.table;

import model.*;

public class ModelAction {
    private Staff staff;
    private EventAction event;
    private Product product;
    private ProductEventAction productEvent;

    private ShiftEventAction shiftEvent;
    private RegisteredShift registeredShift;
    
    private Bill bill;
    private BillEventAction billEvent;
    
    private Order order;
    private OrderEventAction orderEvent;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff st) {
        this.staff = st;
    }

    public EventAction getEvent() {
        return event;
    }

    public void setEvent(EventAction event) {
        this.event = event;
    }
    
    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public ProductEventAction getProductEvent() {
        return productEvent;
    }
    public void setProductEvent(ProductEventAction productEvent) {
        this.productEvent = productEvent;
    }

    public ModelAction(Product product, ProductEventAction productEvent) {
        this.product = product;
        this.productEvent = productEvent;
    }
    public ModelAction(Staff staff, EventAction event) {
        this.staff=staff;
        this.event = event;
    }
   
    public ModelAction(RegisteredShift shift, ShiftEventAction event){
        this.registeredShift=shift;
        this.shiftEvent=event;
    }
    
    public void setBill(Bill bill) {
        this.bill = bill;
    }
    
    public Bill getBill() {
        return bill;
    }
    public BillEventAction getBillEvent() {
        return billEvent;
    }
    public ModelAction(Bill bill, BillEventAction event) {
        this.bill=bill;
        this.billEvent = event;
    } 
    public void setOrder(Order order) {
        this.order = order;
    }
    public Order getOrder() {
        return order;
    } 
    public OrderEventAction getOrderEvent() {
        return orderEvent;
    }
    public ModelAction(Order order, OrderEventAction event) {
        this.order=order;
        this.orderEvent = event;
    }
    public ShiftEventAction getShiftEvent() {
        return shiftEvent;
    }
    public void setShiftEvent(ShiftEventAction ShiftEvent) {
        this.shiftEvent = ShiftEvent;
    }
    public RegisteredShift getRegisteredShift() {
        return registeredShift;
    }
    public void setRegisteredShift(RegisteredShift registeredShift) {
        this.registeredShift = registeredShift;
    }


   }
