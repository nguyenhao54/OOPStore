
package model;

public class Pant extends Product{
    private double pantLength;
    private double pantWidth;
    private double buttWidth;
    
    public Pant(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double pantLength,
            double pantWidth,
            double buttWidth
            ){
        super(id, name, price, brand, category, description, quantity);
        this.pantLength = pantLength;
        this.pantWidth = pantWidth;
        this.buttWidth = buttWidth;
    }

    /**
     * @return the pantLength
     */
    public double getPantLength() {
        return pantLength;
    }

    /**
     * @param pantLength the pantLength to set
     */
    public void setPantLength(double pantLength) {
        this.pantLength = pantLength;
    }

    /**
     * @return the pantWidth
     */
    public double getPantWidth() {
        return pantWidth;
    }

    /**
     * @param pantWidth the pantWidth to set
     */
    public void setPantWidth(double pantWidth) {
        this.pantWidth = pantWidth;
    }

    /**
     * @return the buttWidth
     */
    public double getButtWidth() {
        return buttWidth;
    }

    /**
     * @param buttWidth the buttWidth to set
     */
    public void setButtWidth(double buttWidth) {
        this.buttWidth = buttWidth;
    }
}
