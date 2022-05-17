/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

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
    
    public Bill(int id, Staff staff, ArrayList<Order> orderList, LocalDate date) {
        this.billId = id;
        this.staff = staff;
        this.orderList = orderList;
        this.date = LocalDate.now();
        for (Order order : orderList) {
            this.totalCost += order.getCost();
        }
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
    
    public ArrayList<Order> orderList() {
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
        Order order = new Order(id, product, quantity, quantity * product.getProductPrice());
        this.orderList.add(order);
    }
}
