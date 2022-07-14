/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswingdev.main;
import java.awt.Color;
import model.Bill;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import javaswingdev.form.Message;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javaswingdev.swing.table.BillEventAction;
import model.Product;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import javaswingdev.swing.table.OrderEventAction;
import model.Order;
import model.Staff;

public class Billing extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private TableRowSorter<TableModel> rowSorter;
    private final Animator animator;
    private OrderEventAction orderEventAction;
    private boolean ok;
    private boolean show = true;
    private Bill bill;
    private ArrayList<Order> orderList = new ArrayList<>();
    private DefaultTableModel allBillModel;
    private javaswingdev.swing.table.Table allBillTable;
    private BillEventAction billEventAction;

    public Bill getBill() {
        return bill;
    }
    
    public void setBill(Bill bill) {
        this.bill = bill;
    }
    
    
    /**
     * @return the allBillTable
     */
    public javaswingdev.swing.table.Table getAllBillTable() {
        return allBillTable;
    }

    /**
     * @param allBillTable the allBillTable to set
     */
    public void setAllBillTable(javaswingdev.swing.table.Table allBillTable) {
        this.allBillTable = allBillTable;
    }
    
    public BillEventAction getBillEventAction(){
        return billEventAction;
    }
    
    public void setBillEventAction(BillEventAction bea){
        this.billEventAction = bea;
    }
    
    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

//    private final Animator animator;
//    private boolean show = true;
    
    public void showBillInfo(Bill bill, DefaultTableModel model, javaswingdev.swing.table.Table allBillTable) {
        staffName.setText(bill.getStaff().getName());
        billDate.setText(bill.getDate().toString());
        for (Order o: getBill().getOrderList()) {
                table1.addRow(o.toRowTable(orderEventAction));
            }
        billTotal.setText(Double.toString(bill.getTotalCost()));
        billPaid.setText(Double.toString(bill.getPaid()));
        billReturn.setText(Double.toString(bill.getPaid() - bill.getTotalCost()));
        allBillModel = model;
        this.setAllBillTable(allBillTable);
        setVisible(true);
    }
    
    public Billing(java.awt.Frame parent, boolean modal) {
        initComponents();
        table1.fixTable(jScrollPane2);
//       Avoid focus to staff name text field
        jLabel3.requestFocusInWindow();
        initTable();
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
    
    private void initTable() {
        orderEventAction = new OrderEventAction() {
            Message msg=new Message();
            @Override
            public void delete(Order order) {
             if(msg.showMessage("Delete this order?"+order.getOrderId())){
                 Product orderProduct = order.getProduct();
//               Give the order quantity back to product when delete order
                 orderProduct.setQuantity(orderProduct.getQuantity() + order.getQuantity());
                 System.out.println(order.getOrderId() + " - " + order.getProduct().getProductName());
                 model.removeRow(table1.getSelectedRow());

                bill.deleteOrder(order.getOrderId());
                billTotal.setText(Double.toString(bill.getTotalCost()));
                billReturn.setText(Double.toString(bill.getPaid() - bill.getTotalCost()));
                model =(DefaultTableModel) table1.getModel();
                msg.showDialog("Delete Order Id " + order.getOrderId()+" Successfully!","red");
             }else {
                    System.out.println("User click Cancel");
                }
            }
            
            @Override
            public void update(Order order) {
                msg.showDialog("Please emove and add new to update", "red");
            }
        };
        
        table1.fixTable(jScrollPane2);
    }
    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        findProduct = new javaswingdev.swing.Button();
        productId = new javaswingdev.raven.swing.TextField();
        jLabel3 = new javax.swing.JLabel();
        billDate = new javax.swing.JLabel();
        staffNameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        jLabel4 = new javax.swing.JLabel();
        cancelBtn = new javaswingdev.swing.Button();
        billReturn = new javaswingdev.raven.swing.TextField();
        price = new javaswingdev.raven.swing.TextField();
        billTotal = new javaswingdev.raven.swing.TextField();
        billPaid = new javaswingdev.raven.swing.TextField();
        addToBillBtn = new javaswingdev.swing.Button();
        name = new javaswingdev.raven.swing.TextField();
        okBtn3 = new javaswingdev.swing.Button();
        quantity = new javaswingdev.raven.swing.TextField();
        staffName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        findProduct.setForeground(new java.awt.Color(255, 255, 255));
        findProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_search_20px.png"))); // NOI18N
        findProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findProductActionPerformed(evt);
            }
        });
        getContentPane().add(findProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 138, -1, -1));

        productId.setLabelText("Product Id");
        productId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIdActionPerformed(evt);
            }
        });
        getContentPane().add(productId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 128, 280, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 74, 74));
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 100, -1));

        billDate.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        billDate.setForeground(new java.awt.Color(74, 74, 74));
        getContentPane().add(billDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 220, 30));

        staffNameLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        staffNameLabel.setForeground(new java.awt.Color(74, 74, 74));
        staffNameLabel.setText("Staff:");
        staffNameLabel.setDoubleBuffered(true);
        staffNameLabel.setFocusTraversalPolicyProvider(true);
        getContentPane().add(staffNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 59, -1, -1));

        table1.setBackground(new java.awt.Color(255, 0, 102));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Product", "Price", "Quantity", "Total", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class
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
        table1.setRowHeight(41);
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMinWidth(28);
            table1.getColumnModel().getColumn(0).setPreferredWidth(28);
            table1.getColumnModel().getColumn(0).setMaxWidth(28);
            table1.getColumnModel().getColumn(3).setMinWidth(35);
            table1.getColumnModel().getColumn(3).setPreferredWidth(35);
            table1.getColumnModel().getColumn(3).setMaxWidth(35);
            table1.getColumnModel().getColumn(5).setMinWidth(85);
            table1.getColumnModel().getColumn(5).setPreferredWidth(85);
            table1.getColumnModel().getColumn(5).setMaxWidth(85);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 128, 512, 240));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(106, 106, 164));
        jLabel4.setText("Bill Info");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 100, 30));

        cancelBtn.setBackground(new java.awt.Color(204, 75, 75));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 468, 116, 40));

        billReturn.setEditable(false);
        billReturn.setLabelText("Return");
        getContentPane().add(billReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 388, 270, -1));

        price.setEditable(false);
        price.setLabelText("Price");
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 248, 280, 60));

        billTotal.setEditable(false);
        billTotal.setLabelText("Total");
        getContentPane().add(billTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 388, 280, -1));

        billPaid.setLabelText("Paid");
        getContentPane().add(billPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 388, 260, -1));

        addToBillBtn.setBackground(new java.awt.Color(122, 180, 113));
        addToBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        addToBillBtn.setText("ADD");
        addToBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBillBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addToBillBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 326, 50, -1));

        name.setEditable(false);
        name.setLabelText("Product name");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 188, 280, 60));

        okBtn3.setBackground(new java.awt.Color(98, 98, 157));
        okBtn3.setForeground(new java.awt.Color(255, 255, 255));
        okBtn3.setLabel("OK");
        okBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(okBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 468, 110, 40));

        quantity.setLabelText("Quantity");
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 308, 220, 60));
        getContentPane().add(staffName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 49, 220, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBillBtnActionPerformed
        // TODO add your handling code here:
        Message msg = new Message();
           if(productId.getText().equals("") || quantity.getText().equals("")){
               msg.showDialog("Please fill in id and quantity", "red");
           }else{
             int pid= Integer.parseInt(productId.getText());
             Product pd= Dashboard.store.getProduct(pid);
             Order order;
             if(pd != null){
                 Double pr=pd.getProductPrice();
                    int quan=Integer.parseInt(quantity.getText());
                     
                    if(quan > pd.getQuantity()){
                        msg.showDialog("Out of stock!", "red");
                    }else{
//                      Bill is not null => update
                        if(bill != null){
                            int orderId = bill.getOrderIdAndIncrease();
                            order= new Order(orderId,pd,quan);
                            bill.addOrder(order);
                            billTotal.setText(Double.toString(bill.getTotalCost()));
                            pd.setQuantity(pd.getQuantity() - quan);
                            billReturn.setText(Double.toString(bill.getPaid() - bill.getTotalCost()));
                            table1.addRow(order.toRowTable(orderEventAction));
                        }else{
//                          Bill is null -> new bill, add new order to temporary order list
                            int orderId = orderList.size() + 1;
                            order = new Order(orderId, pd, quan);
                            orderList.add(order);
                            double sum = 0;
                            for(Order o: orderList){
                                sum += o.getCost();
                            }
                            billTotal.setText(Double.toString(sum));
                            pd.setQuantity(pd.getQuantity() - quan);
                            table1.addRow(order.toRowTable(orderEventAction));
                        }
                        
                    }
             }else{
                 msg.showDialog("Product not found.", "red");
             }
             
           }
    }//GEN-LAST:event_addToBillBtnActionPerformed

    private void productIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdActionPerformed

    private void findProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findProductActionPerformed
        // TODO add your handling code here:
        
        int pid= Integer.parseInt(productId.getText());
        Product pd= Dashboard.store.getProduct(pid);
        if(pd!=null){
            name.setText(pd.getProductName());
            price.setText(Double.toString(pd.getProductPrice()));
            

        }
    }//GEN-LAST:event_findProductActionPerformed

    boolean checkNumeric(String strNum){
        try {
            double d = Integer.parseInt(strNum);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    private void okBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtn3ActionPerformed
        // TODO add your handling code here:
//        Update part
        Message msg = new Message();
        if(bill != null){
            if(Double.parseDouble(billPaid.getText()) < bill.getTotalCost()){
                msg.showDialog("Insufficient paid", "red");
            }else if(staffName.getText().equals("") || billPaid.getText().equals("")){
                msg.showDialog("Fill in staff id & paid", "red");
            }else{
//              If not a number -> not update staff
                if(!checkNumeric(staffName.getText())){
                    allBillModel.setValueAt(bill.getTotalCost(),getAllBillTable().getSelectedRow() , 3);
                    bill.setPaid(Double.parseDouble(billPaid.getText()));
                    closeMenu();
                }else{
                    Staff newStaff = Dashboard.store.findStaff(Integer.parseInt(staffName.getText()));
                    if(newStaff == null){
                        msg.showDialog("Staff not found!", "red");
                    }else{
//                      update staff because input is a valid id
                        bill.setStaff(newStaff);
                        bill.setPaid(Double.parseDouble(billPaid.getText()));
//                      Change info on all bill table
                        allBillModel.setValueAt(bill.getTotalCost(),getAllBillTable().getSelectedRow() , 3);
                        allBillModel.setValueAt(bill.getStaff().getName(),getAllBillTable().getSelectedRow() , 2);
                        closeMenu();
                    }
                }
                
            }
        }else{
//           Create new bill
            
            if(staffName.getText().equals("") || billPaid.getText().equals("")){
                msg.showDialog("Fill in staff id & paid", "red");
            }else{
                    int id = Dashboard.store.maxBillId++;
                int staffId = Integer.parseInt(staffName.getText());
                Staff staff = Dashboard.store.findStaff(staffId);
                double paid = Double.parseDouble(billPaid.getText());
                if(staff == null){

                    msg.showDialog("Staff not found!", "red");
                }else{
                    LocalDateTime now = LocalDateTime.now();
                    LocalDateTime formattedNow = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 
                            now.getHour(), now.getMinute(), now.getSecond());
                    Bill b = new Bill(id, staff, orderList, formattedNow, paid);
                    if(Double.parseDouble(billPaid.getText()) < b.getTotalCost()){
                        msg.showDialog("Insufficient paid", "red");
                    }else{
                        Dashboard.store.addBill(b);
                        setBill(b);
                        getAllBillTable().addRow(b.toRowTable(billEventAction));
                        closeMenu();
                    }
                }
            }
        }
        
    }//GEN-LAST:event_okBtn3ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        ok=false;
        for(Order o: orderList){
            o.getProduct().addQuantity(o.getQuantity());
        }
        closeMenu();
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.Button addToBillBtn;
    private javax.swing.JLabel billDate;
    private javaswingdev.raven.swing.TextField billPaid;
    private javaswingdev.raven.swing.TextField billReturn;
    private javaswingdev.raven.swing.TextField billTotal;
    private javaswingdev.swing.Button cancelBtn;
    private javaswingdev.swing.Button findProduct;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javaswingdev.raven.swing.TextField name;
    private javaswingdev.swing.Button okBtn3;
    private javaswingdev.raven.swing.TextField price;
    private javaswingdev.raven.swing.TextField productId;
    private javaswingdev.raven.swing.TextField quantity;
    private javax.swing.JTextField staffName;
    private javax.swing.JLabel staffNameLabel;
    private javaswingdev.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
