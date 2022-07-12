package javaswingdev.swing.table;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Action2 extends javax.swing.JPanel {
    private String dataModel;

    public Action2(ModelAction data, String dataModel) {
        initComponents();
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(dataModel.equals("staff")){
                    data.getEvent().update(data.getStaff());
                }else if(dataModel.equals("product")){
                    data.getProductEvent().update(data.getProduct());
                }else if(dataModel.equals("bill")) {
                    data.getBillEvent().update(data.getBill());
                }else if(dataModel.equals("order")){
                    data.getOrderEvent().update(data.getOrder());
                }
                
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(dataModel.equals("staff")){
                    data.getEvent().delete(data.getStaff());
                }else if(dataModel.equals("product")){
                    data.getProductEvent().delete(data.getProduct());
                }else if(dataModel.equals("bill")) {
                    data.getBillEvent().delete(data.getBill());
                }else if(dataModel.equals("order")){
                    data.getOrderEvent().delete(data.getOrder());
                }
            }
        });
           addshiftbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
    
                    data.getEvent().addShift(data.getStaff());
        
            }
        });
    }
    @Override
        protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230, 230, 230));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdEdit = new javaswingdev.swing.Button();
        cmdDelete = new javaswingdev.swing.Button();
        addshiftbtn = new javaswingdev.swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        cmdEdit.setBackground(new java.awt.Color(100, 112, 194));
        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_edit_20px.png"))); // NOI18N
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdDelete.setBackground(new java.awt.Color(196, 72, 72));
        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_trash_can_20px.png"))); // NOI18N
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        addshiftbtn.setBackground(new java.awt.Color(122, 165, 97));
        addshiftbtn.setForeground(new java.awt.Color(255, 255, 255));
        addshiftbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_plus_+_20px.png"))); // NOI18N
        addshiftbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addshiftbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addshiftbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addshiftbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdEditActionPerformed

    private void addshiftbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addshiftbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addshiftbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.Button addshiftbtn;
    private javaswingdev.swing.Button cmdDelete;
    private javaswingdev.swing.Button cmdEdit;
    // End of variables declaration//GEN-END:variables
}
