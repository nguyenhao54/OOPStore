/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Duc Anh.Nguyen
 */
import javaswingdev.swing.table.EventAction;
import javaswingdev.swing.table.ModelAction;

public class Product {
    final private int productId;
    private String productName;
    private double productPrice;
    private String brand;
    private String category;
    private String description;
    private int quantity;
    
    public Product(
            int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
        this.brand = brand;
        this.category = category;
        this.description = description;
        this.quantity = quantity;
    }
    
    public int getProductId() {
        return this.productId;
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public double getProductPrice() {
        return this.productPrice;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String getCategory() {
        return this.category;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setProductName(String name) {
        this.productName = name;
    }
    
    public void setProductPrice(double price) {
        this.productPrice = price;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
//    public Object[] toRowTable(EventAction event) {
//        return new Object[]{productId, productName, productPrice, brand, category, description, quantity, new ModelAction(this, event)};
//    }
}
