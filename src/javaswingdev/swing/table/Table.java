package javaswingdev.swing.table;

import java.awt.Color;
import java.awt.Component;
import javaswingdev.swing.scroll.ScrollBar;
import javaswingdev.system.SystemColor;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                if(o instanceof ModelAction){
                    ModelAction data=(ModelAction) o;
                    Action cell= null;
                    Action2 cell2=null;
                    if(data.getStaff() != null){
                        cell2 = new Action2(data, "staff");
                        return cell2;
                    }else if(data.getProduct() != null){
                        cell = new Action(data, "product");
                    }else if(data.getBill() != null){
                        cell = new Action(data, "bill");
                    }else if(data.getOrder() != null){
                        cell = new Action(data, "order");
                    }
                    else if(data.getOrder() != null){
                        cell = new Action(data, "order");
                    }
                    else if(data.getRegisteredShift()!=null){
                        cell=new Action(data,"register");
                    }
//                    if (selected) {
//                        cell.setForeground(SystemColor.MAIN_COLOR_1);
//                    } else {
//                        cell.setForeground(new Color(102, 102, 102));
//                     }
                    return cell;
                }
             
                else{
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if (selected) {
                        com.setForeground(SystemColor.MAIN_COLOR_1);    
                    } else {
                        com.setForeground(new Color(102, 102, 102));
                    }
                    return com;
               }
            }
        });
    }
    @Override
    public TableCellEditor getCellEditor(int row,int col){
        if(col==5 || col==7 || col == 4){
            return new TableCellAction();
        }
        else return super.getCellEditor(row,col);
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

    public void fixTable(JScrollPane scroll) {
        scroll.setBorder(null);
        scroll.setVerticalScrollBar(new ScrollBar());
        scroll.getVerticalScrollBar().setBackground(Color.WHITE);
        scroll.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }
}
