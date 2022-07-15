package javaswingdev.form;

import java.text.DecimalFormat;
import javaswingdev.card.ModelCard;
import javaswingdev.main.Dashboard;

public class Form_Dashboard extends javax.swing.JPanel {

    public Form_Dashboard() {
        initComponents();
        init();
    }

    private void init() {
    

        //  init card data
       double income = Dashboard.store.getIncome();
       DecimalFormat df = new DecimalFormat("#");
       df.setMaximumFractionDigits(8);
       String formattedIncome = df.format(income) + "VND";
       double expense = Dashboard.store.getExpense();
       String formattedExpense = df.format(expense) + "VND";
        card1.setData(new ModelCard(null, null, null, formattedIncome, "Report Gross Income"));
        card2.setData(new ModelCard(null, null, null, formattedExpense, "Report Gross Expense"));
        card3.setData(new ModelCard(null, null, null, "VND 200.000", "Report Gross Profit"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card2 = new javaswingdev.card.Card();
        card3 = new javaswingdev.card.Card();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        card1 = new javaswingdev.card.Card();
        card6 = new javaswingdev.card.Card();
        card4 = new javaswingdev.card.Card();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setDescription("Gross Expense");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.PIE_CHART);
        card2.setValues("VND 0.00");
        add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        card3.setColor1(new java.awt.Color(95, 243, 140));
        card3.setColor2(new java.awt.Color(3, 157, 27));
        card3.setDescription("Gross Profit");
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.RING_VOLUME);
        card3.setValues("VND 0.00");
        add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_best_seller_110px.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_best_seller_110px.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 120));

        card1.setForeground(new java.awt.Color(102, 102, 102));
        card1.setColor1(new java.awt.Color(255, 255, 102));
        card1.setColor2(new java.awt.Color(153, 153, 0));
        card1.setDescription("Best performance");
        card1.setValues("Nguyễn Đồng Đức Anh");
        add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 370, 400));

        card6.setForeground(new java.awt.Color(102, 102, 102));
        card6.setColor1(new java.awt.Color(255, 255, 102));
        card6.setColor2(new java.awt.Color(153, 153, 0));
        card6.setDescription("Best seller");
        card6.setValues("Quần ");
        add(card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 380, 400));

        card4.setDescription("Gross Income");
        card4.setValues("VND 0.00");
        add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private javaswingdev.card.Card card4;
    private javaswingdev.card.Card card6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
