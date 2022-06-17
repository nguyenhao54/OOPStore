/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Shoes extends Product{
    private double footLength;
    private double footWidth;
    
    public Shoes(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double footLength,
            double footWidth){
        super(id, name, price, brand, category, description, quantity);
        this.footLength = footLength;
        this.footWidth = footWidth;
    }

    /**
     * @return the footLength
     */
    public double getFootLength() {
        return footLength;
    }

    /**
     * @param footLength the footLength to set
     */
    public void setFootLength(double footLength) {
        this.footLength = footLength;
    }

    /**
     * @return the footWidth
     */
    public double getFootWidth() {
        return footWidth;
    }

    /**
     * @param footWidth the footWidth to set
     */
    public void setFootWidth(double footWidth) {
        this.footWidth = footWidth;
    }
}
