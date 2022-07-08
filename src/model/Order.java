/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javaswingdev.swing.table.OrderEventAction;
import javaswingdev.swing.table.ModelAction;

/**
 *
 * @author Duc Anh.Nguyen
 */
public class Order {
    final int orderId;
    private Product orderProduct;
    private int orderQuantity;
    private double orderCost;
    
    public Order(int id, Product product, int quantity) {
        this.orderId = id;
        this.orderProduct = product;
        this.orderQuantity = quantity;
        this.orderCost = product.getProductPrice()*quantity;
    }
    
    public Product getProduct() {
        return this.orderProduct;
    }
    
    public int getQuantity() {
        return this.orderQuantity;
    }
    
    public double getCost() {
        return this.orderCost;
    }
    
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setQuantity(int quantity) {
        this.orderQuantity = quantity;
    }
    
    public void addQuantity() {
        this.orderQuantity += 1;
    }
    
    public void addQuantity(int quantity) {
        this.orderQuantity += quantity;
    }
    
    public void setCost(int cost) {
        this.orderCost = cost;
    }
    
    public void setProduct(Product product) {
        this.orderProduct = product;
    }
    
    public Object[] toRowTable(OrderEventAction event) {
        return new Object[]{orderId, orderProduct.getProductName(), orderProduct.getProductPrice(), orderQuantity, orderCost, new ModelAction(this, event)};
    }
}
