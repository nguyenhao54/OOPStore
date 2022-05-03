/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaswingdev.swing.table;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Action extends javax.swing.JPanel {

    public Action(ModelAction data) {
        initComponents();
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                data.getEvent().update(data.getStaff());
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                data.getEvent().delete(data.getStaff());
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

        cmdEdit.setBackground(new java.awt.Color(98, 98, 168));
        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_edit_20px.png"))); // NOI18N
        add(cmdEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        cmdDelete.setBackground(new java.awt.Color(174, 55, 55));
        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_trash_can_20px.png"))); // NOI18N
        add(cmdDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 6, 30, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.Button cmdDelete;
    private javaswingdev.swing.Button cmdEdit;
    // End of variables declaration//GEN-END:variables
}
