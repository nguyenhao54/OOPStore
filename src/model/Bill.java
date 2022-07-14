/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javaswingdev.swing.table.ModelAction;
import javaswingdev.swing.table.BillEventAction;

/**
 *
 * @author Duc Anh.Nguyen
 */
public class Bill {
    final private int billId;
    private Staff staff;
    private ArrayList<Order> orderList;
    private LocalDateTime date;
    private double totalCost;
    private double paid;
    private int maxOrderId;
    
    public Bill(int id, Staff staff, ArrayList<Order> orderList, LocalDateTime date, double paid) {
        this.billId = id;
        this.staff = staff;
        this.orderList = orderList;
        this.date = date;
        for (Order order : orderList) {
            this.totalCost += order.getCost();
        }
        this.paid = paid;
        maxOrderId = orderList.size() + 1;
    }
    
    public Bill(int id, Staff staff, double paid) {
        this.billId = id;
        this.staff = staff;
        this.orderList = new ArrayList<>();
        this.date = LocalDateTime.now();
        for (Order order : orderList) {
            this.totalCost += order.getCost();
        }
        this.paid = paid;
        maxOrderId = 1;
    }
    
    public int getBillId() {
        return this.billId;
    }
    
    public Staff getStaff() {
        return this.staff;
    }
    
    public LocalDateTime getDate() {
        return this.date;
    }
    
    public double getTotalCost() {
        double sum = 0;
        for (Order order : orderList) {
            sum += order.getCost();
        }
        this.totalCost = sum;
        return this.totalCost;
    }
    
    public void setPaid(double paid){
        this.paid = paid;
    }
    
    public double getPaid() {
        return this.paid;
    }
    
    public ArrayList<Order> getOrderList() {
        return this.orderList;
    }
    
    public void setDate() {
        this.date = LocalDateTime.now();
    }
    
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    
    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(Order order) {
        this.orderList.add(order);
    }
    
    public void addOrder(Product product, int id, int quantity) {
        Order order = new Order(id, product, quantity);
        this.orderList.add(order);
    }
    
    public void deleteOrder(int id) {
       // System.out.println(this.orderList.size());
        for (int i = 0; i < this.orderList.size(); i++) {
            if (this.orderList.get(i).getOrderId() == id) {
                this.orderList.remove(i);
            }
        }
    }
    
    public int getMaxOrderId(){
        return maxOrderId;
    }
    
    public void setMaxOrderId(int newId){
        this.maxOrderId = newId;
    }
    
    public int getOrderIdAndIncrease(){
        return maxOrderId++;
    }
    
    public Object[] toRowTable(BillEventAction event) {
        return new Object[]{billId, date, staff.getName(), totalCost, new ModelAction(this, event)};
    }
}
