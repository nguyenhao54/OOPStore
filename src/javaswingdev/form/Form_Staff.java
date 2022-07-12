package javaswingdev.form;
import javaswingdev.main.Dashboard;
import javaswingdev.swing.table.EventAction;
import javaswingdev.main.StaffInfo;
import javaswingdev.main.ShiftInfo;

import swing.MessageDialog;
import model.Staff;
import storepkg.Store;
import javax.swing.RowFilter;
import javaswingdev.form.Message;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.*;

     
public class Form_Staff extends javax.swing.JPanel {
    private DefaultTableModel model;
    private TableRowSorter<TableModel> rowSorter;
    public Form_Staff(String gender) {
        initComponents();
        initTable(gender);   
        SortFilter();
    }
        public boolean showUpdateStaff(Staff staff){
        StaffInfo obj = new StaffInfo(Dashboard.getFrames()[0], true);
        obj.setLocationRelativeTo(Dashboard.getFrames()[0]);
        obj.showInfo(staff);
        return obj.isOk();
        }
       private void initTable(String gender) {
//         store.readStaff();
        Message msg=new Message();
         eventAction = new EventAction() {
            @Override
            public void delete(Staff staff) {
             
              if (msg.showMessage("Delete Staff : " + staff.getName())) {  
                  Dashboard.store.deleteStaff(staff.getStaffId());
                  model =(DefaultTableModel) table.getModel();
                  model.removeRow(table.getSelectedRow());
                   msg.showDialog("Delete Staff Successfully!","red");
                } else {
                    System.out.println("User click Cancel");
                }
            }
            @Override
            public void update(Staff staff) {
                 StaffInfo obj= new StaffInfo(Dashboard.getFrames()[0], true);
                 obj.setLocationRelativeTo(Dashboard.getFrames()[0]);
                 obj.setStaff(staff);
                 obj.showInfo(staff);
                 if (obj.isOk()) {
                   Message msg=new Message();
                   if(obj.isSuccess()){
                   model =(DefaultTableModel) table.getModel();
                   model.setValueAt(obj.getStaff().getStaffId(),table.getSelectedRow() , 0);
                   model.setValueAt(obj.getStaff().getName(),table.getSelectedRow() , 1);
                   model.setValueAt(obj.getStaff().getGender(),table.getSelectedRow() , 2);
                   model.setValueAt(obj.getStaff().getPhone(),table.getSelectedRow() , 3);
                   model.setValueAt(obj.getStaff().getRate(),table.getSelectedRow() , 4);

                   msg.showDialog("Update staff successfully!","blue");
                   }
                   else 
                   msg.showDialog("Update staff failed! Please try again","red");
                   }    
                   
                 else {
                    System.out.println("User click Cancel");
                }
                  
            }
            @Override
            public void addShift (Staff staff){
                 ShiftInfo obj= new ShiftInfo(Dashboard.getFrames()[0], true);
                 obj.setLocationRelativeTo(Dashboard.getFrames()[0]);
                 obj.setShiftList(staff.getWorkedShifts());
                 obj.showInfo(staff);
                
            }
        };
         
        // append staffs info to the table
        table.fixTable(jScrollPane1);
        for(Staff s:Dashboard.store.getStaffList()){
            if(s.getGender().equals(gender)||gender.equals("all"))
              table.addRow(s.toRowTable(eventAction));    
        }
  }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();
        searchField = new swing.TextFieldAnimation();
        button1 = new javaswingdev.swing.Button();

        setBackground(new java.awt.Color(243, 243, 243));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Gender", "Phone number", "Rate", " Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(35);
            table.getColumnModel().getColumn(0).setPreferredWidth(35);
            table.getColumnModel().getColumn(0).setMaxWidth(35);
            table.getColumnModel().getColumn(4).setMinWidth(55);
            table.getColumnModel().getColumn(4).setPreferredWidth(55);
            table.getColumnModel().getColumn(4).setMaxWidth(55);
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

        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setAnimationColor(new java.awt.Color(87, 97, 174));
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(111, 120, 190));
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
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents
/// ***************************************************************************************** btn add 
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        StaffInfo obj= new StaffInfo(Dashboard.getFrames()[0], true);
        obj.setLocationRelativeTo(Dashboard.getFrames()[0]);
        obj.setStaff(null);
        obj.setVisible(true);
        if (obj.isOk()) {
        Message msg=new Message();
        if(obj.isSuccess()){
           table.addRow(obj.getStaff().toRowTable(eventAction)); 
           msg.showDialog("Add new staff successfully!","blue");
      }
      else 
           msg.showDialog("Add new staff failed! Please try again","red");
        }    
    }//GEN-LAST:event_button1ActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_searchFieldFocusGained
   
      //************************************************************************* search staff
  

  
    private void SortFilter(){
      rowSorter = new TableRowSorter<>(table.getModel());
      table.setRowSorter(rowSorter);
      searchField.getDocument().addDocumentListener(new DocumentListener(){
      @Override 
      public void insertUpdate(DocumentEvent e){
           String text = searchField.getText();
           if(text.trim().length()==0){
               rowSorter.setRowFilter(null);
           }
           else{
               rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+text));
               
           }
       }
      @Override
      public void removeUpdate(DocumentEvent e){
          String text= searchField.getText();
          if(text.trim().length()==0){
              rowSorter.setRowFilter(null);
              
          }else
          {
              rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" +text));
          }
      }
         @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
            
    });
              
 }
    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
       String text = searchField.getText();
       if (text.trim().length() == 0) {
            rowSorter.setRowFilter(null);
       } else {
             rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
       }    
    }//GEN-LAST:event_searchFieldActionPerformed

   

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.Button button1;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private swing.TextFieldAnimation searchField;
    private static javaswingdev.swing.table.Table table;
    // End of variables declaration//GEN-END:variables

    static EventAction eventAction;
}
