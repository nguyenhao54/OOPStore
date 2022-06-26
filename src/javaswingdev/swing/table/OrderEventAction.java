package javaswingdev.swing.table;

import model.Order;

public interface OrderEventAction {
    public void delete(Order order);

    public void update(Order order);
}

