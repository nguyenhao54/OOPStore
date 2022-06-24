
package javaswingdev.form;
import javaswingdev.main.Dashboard;
import javaswingdev.swing.table.EventAction;
import javaswingdev.main.*;
import javaswingdev.swing.table.ShiftEventAction;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.*;

        public class Form_Shift extends javax.swing.JPanel {
            private DefaultTableModel model;
            public Form_Shift() {
        initComponents();
        
        initTable();
        
        table.fixTable(jScrollPane1);
    }
         private Shift showUpdateForm(Shift shift){
        
        return null;
    }
         private void initTable() {
     ShiftEventAction shiftEventAction = new ShiftEventAction() {
         @Override
         public void delete(Shift shift) {
             Message msg=new Message();
             if(msg.showMessage("Delete Shift : " + shift.getShiftId())){
                 Dashboard.store.deleteShift(shift.getShiftId());
                 model =(DefaultTableModel) table.getModel();
                 model.removeRow(table.getSelectedRow());
                 msg.showDialog("Delete Shift Id " + shift.getShiftId()+" Successfully!","red");
             }else {
                    System.out.println("User click Cancel");
                }
         }
         @Override
         public void update(Shift shift) {
             Shift p = showUpdateForm(shift);
             if(p != null){
//               update table row
                 model =(DefaultTableModel) table.getModel();
                model.setValueAt(p.getShiftId(),table.getSelectedRow() , 0);
                model.setValueAt(p.getStartTime(),table.getSelectedRow() , 1);
                model.setValueAt(p.getEndTime(),table.getSelectedRow() , 2);
                model.setValueAt(p.getHour(),table.getSelectedRow() , 3);
            
             }
         }
    };
     table.fixTable(jScrollPane1);
     for(Shift p: Dashboard.store.getShiftList()){
         table.addRow(p.toRowTable(shiftEventAction));
     }
  }
/**
 *
 * @author T460S
 */


 
//     table.addRow(new Staff(1, "Bora", "Male", "33431232244", 300).toRowTable(eventAction));
//        table.addRow(new Staff(2, "Bora", "Male", "33436543244", 300).toRowTable(eventAction));
//        table.addRow(new Staff(3, "Bora", "Male", "33423232344", 300).toRowTable(eventAction));
//        table.addRow(new Staff(4, "Bora", "Male", "33333334344", 300).toRowTable(eventAction));
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        button1 = new javaswingdev.swing.Button();

        setBackground(new java.awt.Color(243, 243, 243));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "shifftId", "startTime", "endTime", "hour"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        textFieldAnimation1.setForeground(new java.awt.Color(153, 153, 153));
        textFieldAnimation1.setAnimationColor(new java.awt.Color(87, 97, 174));
        textFieldAnimation1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldAnimation1FocusGained(evt);
            }
        });

        button1.setBackground(new java.awt.Color(87, 97, 174));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("ADD ");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void textFieldAnimation1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldAnimation1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAnimation1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.Button button1;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.table.Table table;
    private swing.TextFieldAnimation textFieldAnimation1;
    // End of variables declaration//GEN-END:variables
}
