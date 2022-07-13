
package javaswingdev.swing.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableCellAction extends DefaultCellEditor {

    private ModelAction data;

    public TableCellAction() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        data = (ModelAction) o;
        Action cell = null;
        if(data.getStaff() != null){
            Action2 cell2= new Action2(data, "staff");
            return cell2;
        }else if(data.getProduct() != null){
            cell = new Action(data, "product");
        }else if(data.getBill() != null){
            cell = new Action(data, "bill");
        }else if(data.getOrder() != null){
            cell = new Action(data, "order");
        }else if(data.getRegisteredShift()!=null){
            cell=new Action(data,"register");
        }
//        cell.setBackground(new Color(239, 244, 255));
        return cell;
    }

    //  This method to pass data to cell render when focus lose in cell
    @Override
    public Object getCellEditorValue() {
        return data;
    }
}
