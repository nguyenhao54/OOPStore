package javaswingdev.swing.table;

import model.Bill;

public interface BillEventAction {
    public void delete(Bill bill);

    public void update(Bill bill);
}

