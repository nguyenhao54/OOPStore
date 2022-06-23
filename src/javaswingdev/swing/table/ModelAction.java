package javaswingdev.swing.table;

import model.*;

public class ModelAction {
    private Staff staff;
    private EventAction event;
    
    private Product product;
    private ProductEventAction productEvent;
    
    private Bill bill;
    private BillEventAction billEvent;

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

    public ModelAction() {
    }

   }
