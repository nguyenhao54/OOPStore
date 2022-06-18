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
    
    public Shoes(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double footLength){
        super(id, name, price, brand, category, description, quantity);
        this.footLength = footLength;
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
}
