
package javaswingdev.main;

import java.awt.Color;
import model.*;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import java.time.LocalTime;
public class ShiftInfo extends javax.swing.JDialog {
    private Shift shift;
    public Shift getShift() {
        return shift;
    }
    public void setShift(Shift shift) {
        this.shift = shift;
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
    
    public void showInfo(Shift shift){
        shiftId.setText(String.valueOf(shift.getShiftId()));
        endTime.setText((shift.getEndTime()).toString());
        startTime.setText((shift.getStartTime()).toString());
        hour.setText(String.valueOf(shift.getHour()));
        setVisible(ok);
    }
   
    public ShiftInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        centerComponent();
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

        addProductForm = new javaswingdev.swing.RoundPanel();
        shiftId = new javaswingdev.raven.swing.TextField();
        endTime = new javaswingdev.raven.swing.TextField();
        okBtn = new javaswingdev.swing.Button();
        cancelBtn = new javaswingdev.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        startTime = new javaswingdev.raven.swing.TextField();
        hour = new javaswingdev.raven.swing.TextField();
        alertLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(800, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addProductForm.setBackground(new java.awt.Color(255, 255, 255));
        addProductForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        addProductForm.setRound(15);

        shiftId.setLabelText("Product name");
        shiftId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftIdActionPerformed(evt);
            }
        });

        endTime.setLabelText("Price");

        okBtn.setBackground(new java.awt.Color(98, 98, 157));
        okBtn.setForeground(new java.awt.Color(255, 255, 255));
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(204, 75, 75));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 106, 164));
        jLabel1.setText("Add Shift");

        startTime.setLabelText("Quantity");
        startTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeActionPerformed(evt);
            }
        });

        hour.setLabelText("Category");

        alertLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        alertLabel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout addProductFormLayout = new javax.swing.GroupLayout(addProductForm);
        addProductForm.setLayout(addProductFormLayout);
        addProductFormLayout.setHorizontalGroup(
            addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shiftId, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addProductFormLayout.setVerticalGroup(
            addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addComponent(shiftId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94)
                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(addProductForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centerComponent(){
        this.setLocationRelativeTo(Dashboard.getFrames()[0]);
    }
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        String pId = shiftId.getText();
        String pEndTime = endTime.getText();
        String pStartTime = startTime.getText();
        String pHour = hour.getText();

        if(pId.equals("") || pEndTime.equals("") || pStartTime.equals("") || pHour.equals("")){
            alertLabel.setText("Please fill in blank fields!");
            alertLabel.setVisible(true);
            
        }else{
            ok = true;
            closeMenu();
        }
        
    }//GEN-LAST:event_okBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
              ok = false;
        closeMenu();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void shiftIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftIdActionPerformed

    private void startTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTimeActionPerformed

    private void closeMenu() {
        if (animator.isRunning()) {
            animator.stop();
        }
        show = false;
        animator.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.RoundPanel addProductForm;
    private javax.swing.JLabel alertLabel;
    private javaswingdev.swing.Button cancelBtn;
    private javaswingdev.raven.swing.TextField endTime;
    private javaswingdev.raven.swing.TextField hour;
    private javax.swing.JLabel jLabel1;
    private javaswingdev.swing.Button okBtn;
    private javaswingdev.raven.swing.TextField shiftId;
    private javaswingdev.raven.swing.TextField startTime;
    // End of variables declaration//GEN-END:variables
}
