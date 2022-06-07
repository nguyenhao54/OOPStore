
package javaswingdev.main;

import java.awt.Color;
import model.Staff;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import java.util.Date;
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 
import storepkg.Store;
import javaswingdev.swing.table.EventAction;
import swing.MessageDialog;

public class StaffInfo extends javax.swing.JDialog {

 
    public Staff getStaff() {
        return staff;
    }
    public void setStaff(Staff staff) {
        this.staff = staff;
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
    private Staff staff;
    private boolean success;
   
    public StaffInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         getContentPane().setBackground(Color.WHITE);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        textField1 = new javaswingdev.raven.swing.TextField();
        textField2 = new javaswingdev.raven.swing.TextField();
        textField3 = new javaswingdev.raven.swing.TextField();
        textField4 = new javaswingdev.raven.swing.TextField();
        button1 = new javaswingdev.swing.Button();
        button2 = new javaswingdev.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        combobox1 = new javaswingdev.swing.Combobox();
        alertLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(800, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setRound(15);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField1.setLabelText("Name");
        roundPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 332, -1));

        textField2.setLabelText("Phone Number");
        roundPanel1.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 332, -1));

        textField3.setLabelText("BirthDay");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        roundPanel1.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 332, -1));

        textField4.setLabelText("Salary Rate");
        roundPanel1.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 332, -1));

        button1.setBackground(new java.awt.Color(98, 98, 157));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("OK");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        roundPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 410, 116, 35));

        button2.setBackground(new java.awt.Color(204, 75, 75));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("CANCEL");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        roundPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 410, 116, 34));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 106, 164));
        jLabel1.setText("Staff Info");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 31, -1, -1));

        combobox1.setMaximumRowCount(3);
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        combobox1.setSelectedIndex(-1);
        combobox1.setLabeText("Gender");
        roundPanel1.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, 45));

        alertLabel.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        alertLabel.setForeground(new java.awt.Color(255, 0, 0));
        alertLabel.setPreferredSize(new java.awt.Dimension(208, 13));
        roundPanel1.add(alertLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, -1));

        getContentPane().add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 390, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
      
        closeMenu();
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
 
       String name= textField1.getText();
       String phone= textField2.getText();
       String date= textField3.getText();
       String rate= textField4.getText();
       String gender= (String)combobox1.getSelectedItem();
       if(name.equals("")||phone.equals("")||date.equals("")||rate.equals("")||gender.equals("")){
           alertLabel.setVisible(true);
           alertLabel.setText("Please fill in blank fields!");
          }
       else{
           ok = true;
           int id;
           Store newSL=new Store();
           newSL.readStaff();
            if (staff==null){
              id= newSL.maxstaffid;
              if (newSL.addStaff(name, phone, gender, rate, date)){
                  try{
                  setSuccess(true);
                  Date realDate=new SimpleDateFormat("dd-mm-yyyy").parse(date);
                  this.setStaff(new Staff(id,name,gender,phone,Double.parseDouble(rate),realDate)) ; 
                  }
                  catch(Exception e){
                  e.printStackTrace();
                  }
                }
           
              else{
               setSuccess(false);
               setStaff(null);
              }
            }
            //// this is for updating purpose 
            else 
              {id= staff.getStaffId();
              if (newSL.updateStaff(id, name, phone, gender, rate, date)){
                 try{
                 setSuccess(true);
                 Date realDate=new SimpleDateFormat("dd-mm-yyyy").parse(date);
                 this.setStaff(new Staff(id,name,gender,phone,Double.parseDouble(rate),realDate)) ; 
                 }
                 catch(Exception e){
                 e.printStackTrace();
                 }
             }
             else{
               setSuccess(false);
              }
            }
           closeMenu();
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed
    
         public void showInfo(Staff staff) {
        textField1.setText(staff.getName());
        textField2.setText(staff.getPhone());
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");  
        String strDate = dateFormat.format(staff.getBirthDate());  
        textField3.setText(strDate);
        textField4.setText(Double.toString(staff.getRate()));
        combobox1.setSelectedItem(staff.getGender());
        animator.start();
        setVisible(true);
    }
//        public Staff getUpdateInfo(Staff staff) {
//        String name= textField1.getText();
//        String phone =textField2.getText();
//        String gender =  combobox1.getSelectedItem().toString();
//        String strDate = textField3.getText();
//        try{
//        Date date=new SimpleDateFormat("dd-mm-yyyy").parse(strDate);
//        String rate =  textField4.getText();
//        Staff newStaff = new Staff(staff.getStaffId(),name, phone,gender, Double.parseDouble(rate), date);
//        return newStaff;
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
// 
//        return null;
//          
//    }
      
          
          
         
    private void closeMenu() {
        if (animator.isRunning()) {
            animator.stop();
        }
        show = false;
        animator.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javaswingdev.swing.Button button1;
    private javaswingdev.swing.Button button2;
    private javaswingdev.swing.Combobox combobox1;
    private javax.swing.JLabel jLabel1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.raven.swing.TextField textField1;
    private javaswingdev.raven.swing.TextField textField2;
    private javaswingdev.raven.swing.TextField textField3;
    private javaswingdev.raven.swing.TextField textField4;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
