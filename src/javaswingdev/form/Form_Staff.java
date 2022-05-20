package javaswingdev.form;
import javaswingdev.main.Dashboard;
import javaswingdev.swing.table.EventAction;
import javaswingdev.main.Add;
import swing.MessageDialog;
import model.Staff;
import database.StaffList;
import java.util.ArrayList;
        
public class Form_Staff extends javax.swing.JPanel {

    /**
     * Creates new form Form_Shift
     */
    public Form_Staff() {
        initComponents();
        initTable();
        
    }
    
        private boolean showMessage(String message) {
        MessageDialog obj = new MessageDialog(Dashboard.getFrames()[0], true);
        obj.setLocationRelativeTo(Dashboard.getFrames()[0]);
        obj.showMessage(message);
        return obj.isOk();
    }
        public boolean showUpdateStaff(Staff staff){
        Add obj = new Add(Dashboard.getFrames()[0], true);
        obj.setLocationRelativeTo(Dashboard.getFrames()[0]);
        obj.showInfo(staff);
        return obj.isOk();
        }
       private void initTable() {
          EventAction eventAction = new EventAction() {
            @Override
            public void delete(Staff staff) {
              if (showMessage("Delete Staff : " + staff.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

            @Override
            public void update(Staff staff) {
                  showUpdateStaff(staff);
            }
        };
      
        StaffList sP=new StaffList();
       sP.read();
        sP.write("An","171673782","Male","1.8");
//        sP.write("3","Ha","171673782","Male","1.8",StaffList);
//        sP.write("4","Bon","171673782","Male","1.8",StaffList);
        table.fixTable(jScrollPane1);
        for(int i=0; i<sP.StaffList.size();i++){
              table.addRow(sP.StaffList.get(i).toRowTable(eventAction));
            
        }
            
      
//        table.addRow(new Staff(2, "Bora", "Male", "33436543244", 300).toRowTable(eventAction));
//        table.addRow(new Staff(3, "Bora", "Male", "33423232344", 300).toRowTable(eventAction));
//        table.addRow(new Staff(4, "Bora", "Male", "33333334344", 300).toRowTable(eventAction));
  }
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
                "#", "Name", "Gender", "Phone number", "Date Join", " Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
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
   
//        ModelStaff newStaff= new ModelStaff();
//        
//        showUpdateStaff(newStaff);
          new Add(Dashboard.getFrames()[0], true).setVisible(true);
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
