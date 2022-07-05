package javaswingdev.swing.table;

import model.*;

public class ModelAction {
    private Staff staff;
    private EventAction event;
    
    private Product product;
    private ProductEventAction productEvent;

    private Shift shift;
    private ShiftEventAction shiftEvent;
    
    
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

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the productEvent
     */
    public ProductEventAction getProductEvent() {
        return productEvent;
    }

    /**
     * @param productEvent the productEvent to set
     */
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

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift st) {
        this.shift = st;
    }

    public ShiftEventAction getShiftEvent() {
        return shiftEvent;
    }

    public void setShiftEvent(ShiftEventAction shiftevent) {
        this.shiftEvent = shiftevent;
    }
    public ModelAction(Shift shift, ShiftEventAction shiftEvent) {
        this.shift = shift;
        this.shiftEvent = shiftEvent;
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

    public ModelAction() {
    }

   }
