package model;

public class Shirt extends Product{
    private double shirtLength;
    private double sleeveLength;
    private double shoulderWidth;
    private double chestWidth;
    
    public Shirt(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double shirtLength,
            double chestWidth,
            double sleeveLength,
            double shoulderWidth
            ){
        super(id, name, price, brand, category, description, quantity);
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
        this.shoulderWidth = shoulderWidth;
        this.chestWidth = chestWidth;
    }
    
    public Shirt(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double importPrice,
            double shirtLength,
            double chestWidth,
            double sleeveLength,
            double shoulderWidth
            ){
        super(id, name, price, brand, category, description, quantity, importPrice);
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
        this.shoulderWidth = shoulderWidth;
        this.chestWidth = chestWidth;
    }

    /**
     * @return the shirtLength
     */
    public double getShirtLength() {
        return shirtLength;
    }

    /**
     * @param shirtLength the shirtLength to set
     */
    public void setShirtLength(double shirtLength) {
        this.shirtLength = shirtLength;
    }

    /**
     * @return the sleeveLength
     */
    public double getSleeveLength() {
        return sleeveLength;
    }

    /**
     * @param sleeveLength the sleeveLength to set
     */
    public void setSleeveLength(double sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    /**
     * @return the shoulderWidth
     */
    public double getShoulderWidth() {
        return shoulderWidth;
    }

    /**
     * @param shoulderWidth the shoulderWidth to set
     */
    public void setShoulderWidth(double shoulderWidth) {
        this.shoulderWidth = shoulderWidth;
    }

    /**
     * @return the chestWidth
     */
    public double getChestWidth() {
        return chestWidth;
    }

    /**
     * @param chestWidth the chestWidth to set
     */
    public void setChestWidth(double chestWidth) {
        this.chestWidth = chestWidth;
    }
    
}
