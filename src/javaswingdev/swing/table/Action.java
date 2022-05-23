package javaswingdev.swing.table;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Action extends javax.swing.JPanel {
    private String dataModel;

    public Action(ModelAction data, String dataModel) {
        initComponents();
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(dataModel.equals("staff")){
                    data.getEvent().update(data.getStaff());
                }else if(dataModel.equals("product")){
                    data.getProductEvent().update(data.getProduct());
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
                }
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdEdit.setBackground(new java.awt.Color(100, 112, 194));
        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_edit_20px.png"))); // NOI18N
        add(cmdEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        cmdDelete.setBackground(new java.awt.Color(196, 72, 72));
        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_trash_can_20px.png"))); // NOI18N
        add(cmdDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 6, 30, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.Button cmdDelete;
    private javaswingdev.swing.Button cmdEdit;
    // End of variables declaration//GEN-END:variables
}
