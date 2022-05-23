package javaswingdev.swing.table;

import model.Product;

public interface ProductEventAction {
    public void delete(Product product);

    public void update(Product product);
}
