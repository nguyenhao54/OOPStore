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
       DecimalFormat df = new DecimalFormat("###,###.##");
       df.setMaximumFractionDigits(8);
       String formattedIncome = df.format(income) + " VND";
       double expense = Dashboard.store.getExpense();
       String formattedExpense = df.format(expense) + " VND";
       String formattedProfit = df.format(income-expense)+" VND";
        card1.setData(new ModelCard(null, null, null, formattedIncome, "Report Gross Income"));
        card2.setData(new ModelCard(null, null, null, formattedExpense, "Report Store Expense"));
        card3.setData(new ModelCard(null, null, null, formattedProfit , "Report Gross Profit"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card2 = new javaswingdev.card.Card();
        card3 = new javaswingdev.card.Card();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        workedlbl = new javax.swing.JLabel();
        profit = new javax.swing.JLabel();
        billcountlbl = new javax.swing.JLabel();
        bills = new javax.swing.JLabel();
        soldlbl = new javax.swing.JLabel();
        profitlbl = new javax.swing.JLabel();
        sold = new javax.swing.JLabel();
        workedhour = new javax.swing.JLabel();
        cardstaff = new javaswingdev.card.Card();
        card6 = new javaswingdev.card.Card();
        card1 = new javaswingdev.card.Card();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setDescription("Store Expense");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.PIE_CHART);
        card2.setValues("VND 0.00");
        add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 140));

        card3.setColor1(new java.awt.Color(95, 243, 140));
        card3.setColor2(new java.awt.Color(3, 157, 27));
        card3.setDescription("Gross Profit");
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.RING_VOLUME);
        card3.setValues("VND 0.00");
        add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_best_seller_110px.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_best_seller_110px.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 170, 120));

        workedlbl.setFont(new java.awt.Font("sansserif", 1, 52)); // NOI18N
        workedlbl.setForeground(new java.awt.Color(180, 174, 28));
        workedlbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workedlbl.setText("300");
        add(workedlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 220, 60));

        profit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        profit.setForeground(new java.awt.Color(102, 102, 102));
        profit.setText("Profit");
        add(profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 50, 80));

        billcountlbl.setFont(new java.awt.Font("sansserif", 1, 52)); // NOI18N
        billcountlbl.setForeground(new java.awt.Color(101, 112, 173));
        billcountlbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        billcountlbl.setText("300");
        add(billcountlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 280, 50));

        bills.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bills.setForeground(new java.awt.Color(102, 102, 102));
        bills.setText("Bills Count");
        add(bills, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 90, 80));

        soldlbl.setFont(new java.awt.Font("sansserif", 1, 52)); // NOI18N
        soldlbl.setForeground(new java.awt.Color(180, 174, 28));
        soldlbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soldlbl.setText("300");
        add(soldlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 220, 60));

        profitlbl.setFont(new java.awt.Font("sansserif", 1, 52)); // NOI18N
        profitlbl.setForeground(new java.awt.Color(101, 112, 173));
        profitlbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profitlbl.setText("300");
        add(profitlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 280, 50));

        sold.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        sold.setForeground(new java.awt.Color(102, 102, 102));
        sold.setText("Sold amount");
        add(sold, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 190, 50));

        workedhour.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        workedhour.setForeground(new java.awt.Color(102, 102, 102));
        workedhour.setText("Worked hours");
        add(workedhour, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 110, 80));

        cardstaff.setForeground(new java.awt.Color(102, 102, 102));
        cardstaff.setColor1(new java.awt.Color(255, 255, 102));
        cardstaff.setColor2(new java.awt.Color(153, 153, 0));
        cardstaff.setDescription("Best performance");
        cardstaff.setValues("Nguyễn Đồng Đức Anh");
        add(cardstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 370, 400));

        card6.setForeground(new java.awt.Color(102, 102, 102));
        card6.setColor1(new java.awt.Color(255, 255, 102));
        card6.setColor2(new java.awt.Color(153, 153, 0));
        card6.setDescription("Best seller");
        card6.setValues("Quần ");
        add(card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 380, 400));

        card1.setDescription("Gross Income");
        card1.setValues("VND 0.00");
        add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 140));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billcountlbl;
    private javax.swing.JLabel bills;
    private javaswingdev.card.Card card1;
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private javaswingdev.card.Card card6;
    private javaswingdev.card.Card cardstaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel profit;
    private javax.swing.JLabel profitlbl;
    private javax.swing.JLabel sold;
    private javax.swing.JLabel soldlbl;
    private javax.swing.JLabel workedhour;
    private javax.swing.JLabel workedlbl;
    // End of variables declaration//GEN-END:variables
}
