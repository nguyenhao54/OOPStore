/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
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
    private LocalDate date;
    private double totalCost;
    private double paid;
    
    public Bill(int id, Staff staff, ArrayList<Order> orderList, LocalDate date, double paid) {
        this.billId = id;
        this.staff = staff;
        this.orderList = orderList;
        this.date = LocalDate.now();
        for (Order order : orderList) {
            this.totalCost += order.getCost();
        }
        this.paid = paid;
    }
    
    public Bill(int id, Staff staff, double paid) {
        this.billId = id;
        this.staff = staff;
        this.orderList = new ArrayList<>();
        this.date = LocalDate.now();
        for (Order order : orderList) {
            this.totalCost += order.getCost();
        }
        this.paid = paid;
    }
    
    public int getBillId() {
        return this.billId;
    }
    
    public Staff getStaff() {
        return this.staff;
    }
    
    public LocalDate getDate() {
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
    
    public double getPaid() {
        return this.paid;
    }
    
    public ArrayList<Order> getOrderList() {
        return this.orderList;
    }
    
    public void setDate() {
        this.date = LocalDate.now();
    }
    
    public void setDate(LocalDate date) {
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
        for (int i = 0; i < this.orderList.size(); ++i) {
            if (this.orderList.get(i).getOrderId() == id) {
                this.orderList.remove(i);
            }
        }
    }
    
    public Object[] toRowTable(BillEventAction event) {
        return new Object[]{billId, date, staff.getName(), totalCost, new ModelAction(this, event)};
    }
}
