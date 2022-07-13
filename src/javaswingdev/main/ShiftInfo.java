
package javaswingdev.main;

import com.raven.datechooser.EventDateChooser;
import com.raven.datechooser.SelectedAction;
import com.raven.datechooser.SelectedDate;
import java.awt.Color;
import java.text.SimpleDateFormat;
import model.*;
import javaswingdev.swing.table.ShiftEventAction;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import javaswingdev.form.Message;
import java.util.Date;
import java.time.LocalDate;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ShiftInfo extends javax.swing.JDialog {
    private ArrayList<RegisteredShift> shiftList;
    private ShiftEventAction shiftEventAction;
    private Staff staff;
    
    public void setStaff(Staff s){
        this.staff = s;
    }
    
    public Staff getStaff(){
        return this.staff;
    }
            
    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }
    private boolean ok;
    private final Animator animator;
    private boolean show = true;
    
    public void showInfo(Staff staff){
        staffNameLabel1.setText(staff.getName());
        setStaff(staff);
        if(staff.getWorkedShifts()!=null){
        for(RegisteredShift rS: staff.getWorkedShifts()){
           table1.addRow(rS.toRowTable(shiftEventAction));     
        }
        }
        
        //table1.addRow(new RegisteredShift(LocalDate.of(2022, 1, 11),Dashboard.store.getShift(1)).toRowTable(shiftEventAction));     

        setVisible(true);
        
 
    }
   
    public ShiftInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initTable();
        centerComponent();
         getContentPane().setBackground(Color.WHITE);
                 dateChooser.addEventDateChooser(new EventDateChooser() {
            @Override
            public void dateSelected(SelectedAction action, SelectedDate date) {
                System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
                if (action.getAction() == SelectedAction.DAY_SELECTED) {
                    dateChooser.hidePopup();
                }
            }
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    setOpacity(fraction);
                } else {
                    setOpacity(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (show == false) {
                    setVisible(false);
                }
            }

        };
        animator = new Animator(200, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
    }
    
    private void initTable(){
        shiftEventAction = new ShiftEventAction() {
         @Override
         public void delete(RegisteredShift rs) {
             System.out.println(rs.getRegisteredShift().getEndTime());
             
         }

         @Override
         public void update(RegisteredShift rs) {
            System.out.println("update");
         }
     };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        addProductForm = new javaswingdev.swing.RoundPanel();
        findShift = new javaswingdev.swing.Button();
        shiftId = new javaswingdev.raven.swing.TextField();
        endTime = new javaswingdev.raven.swing.TextField();
        okBtn = new javaswingdev.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        register = new javaswingdev.swing.Button();
        cancelBtn = new javaswingdev.swing.Button();
        startTime = new javaswingdev.raven.swing.TextField();
        date = new javaswingdev.raven.swing.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        staffNameLabel = new javax.swing.JLabel();
        staffNameLabel1 = new javax.swing.JLabel();

        dateChooser.setForeground(new java.awt.Color(82, 97, 198));
        dateChooser.setTextRefernce(date);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(800, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addProductForm.setBackground(new java.awt.Color(255, 255, 255));
        addProductForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        addProductForm.setRound(15);
        addProductForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        findShift.setForeground(new java.awt.Color(255, 255, 255));
        findShift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_search_20px.png"))); // NOI18N
        findShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findShiftActionPerformed(evt);
            }
        });
        addProductForm.add(findShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 30, 30));

        shiftId.setLabelText("Shift ID");
        shiftId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftIdActionPerformed(evt);
            }
        });
        addProductForm.add(shiftId, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 118, 332, -1));
        shiftId.getAccessibleContext().setAccessibleParent(shiftId);

        endTime.setLabelText("EndTime");
        addProductForm.add(endTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 332, -1));

        okBtn.setBackground(new java.awt.Color(98, 98, 157));
        okBtn.setForeground(new java.awt.Color(255, 255, 255));
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        addProductForm.add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 116, 35));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 106, 164));
        jLabel1.setText("Register Shift");
        addProductForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 83));

        register.setBackground(new java.awt.Color(122, 180, 113));
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        addProductForm.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 80, 30));

        cancelBtn.setBackground(new java.awt.Color(204, 75, 75));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        addProductForm.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 116, 34));

        startTime.setLabelText("StartTime");
        startTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeActionPerformed(evt);
            }
        });
        addProductForm.add(startTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 332, -1));

        date.setLabelText("Date");
        addProductForm.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 250, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shift", "Start", "End", "Date", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        addProductForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, 240));

        staffNameLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        staffNameLabel.setForeground(new java.awt.Color(74, 74, 74));
        staffNameLabel.setText("Staff:");
        staffNameLabel.setDoubleBuffered(true);
        staffNameLabel.setFocusTraversalPolicyProvider(true);
        addProductForm.add(staffNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        staffNameLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        staffNameLabel1.setForeground(new java.awt.Color(74, 74, 74));
        staffNameLabel1.setDoubleBuffered(true);
        staffNameLabel1.setFocusTraversalPolicyProvider(true);
        addProductForm.add(staffNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 400, 30));

        getContentPane().add(addProductForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 880, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTimeActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        ok = false;
        closeMenu();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

    }//GEN-LAST:event_okBtnActionPerformed

    private void shiftIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftIdActionPerformed

    private void findShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findShiftActionPerformed
        String id= shiftId.getText();
        Shift s= Dashboard.store.getShift(Integer.parseInt(id));
        if(s == null){
            Message msg = new Message();
            msg.showDialog("Shift not found!", "red");
        }else{
            startTime.setText(s.getStartTime().toString());
            endTime.setText(s.getEndTime().toString());
        }
        
        
    }//GEN-LAST:event_findShiftActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        Message msg = new Message();
        if(shiftId.getText().equals("") || date.getText().equals("")){
            msg.showDialog("Please fill blank fields", "red");
        }else{
            int sid= Integer.parseInt(shiftId.getText());
            Shift s= Dashboard.store.getShift(sid);

            if(s != null){
                LocalTime st=s.getStartTime();
                LocalTime et=s.getEndTime();
                
                
           try{
                  String formattedText = date.getText().replaceAll("-", "/");
                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                  LocalDate realDate= LocalDate.parse(formattedText, formatter);
                  RegisteredShift newShift = new RegisteredShift(realDate, s);
                  staff.addShift(newShift);
                  table1.addRow(newShift.toRowTable(shiftEventAction));
                  }
                  catch(Exception e){
                  e.printStackTrace();
                  }
            
            }else{
                msg.showDialog("Shift not found!", "red");
            }
        }
    }//GEN-LAST:event_registerActionPerformed

    private void centerComponent(){
        this.setLocationRelativeTo(Dashboard.getFrames()[0]);
    }
    private void closeMenu() {
        if (animator.isRunning()) {
            animator.stop();
        }
        show = false;
        animator.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.RoundPanel addProductForm;
    private javaswingdev.swing.Button cancelBtn;
    private javaswingdev.raven.swing.TextField date;
    private com.raven.datechooser.DateChooser dateChooser;
    private javaswingdev.raven.swing.TextField endTime;
    private javaswingdev.swing.Button findShift;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.Button okBtn;
    private javaswingdev.swing.Button register;
    private javaswingdev.raven.swing.TextField shiftId;
    private javax.swing.JLabel staffNameLabel;
    private javax.swing.JLabel staffNameLabel1;
    private javaswingdev.raven.swing.TextField startTime;
    private javaswingdev.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the shiftList
     */
    public ArrayList<RegisteredShift> getShiftList() {
        return shiftList;
    }

    /**
     * @param shiftList the shiftList to set
     */
    public void setShiftList(ArrayList<RegisteredShift> shiftList) {
        this.shiftList = shiftList;
    }
}
