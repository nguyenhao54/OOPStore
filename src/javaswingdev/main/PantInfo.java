
package javaswingdev.main;

import java.awt.Color;
import javaswingdev.form.Message;
import model.*;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import storepkg.Store;

public class PantInfo extends javax.swing.JDialog {

    /**
     * @return the pant
     */
    public Pant getPant() {
        return pant;
    }

    /**
     * @param pant the pant to set
     */
    public void setPant(Pant pant) {
        this.pant = pant;
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
    private Pant pant;
    
    public void showInfo(Pant pant){
        productName.setText(pant.getProductName());
        price.setText(Double.toString(pant.getProductPrice()));
        brand.setText(pant.getBrand());
        quantity.setText(Integer.toString(pant.getQuantity()));
        category.setText(pant.getCategory());
        description.setText(pant.getDescription());
        pantLength.setText(Double.toString(pant.getPantLength()));
        pantWidth.setText(Double.toString(pant.getPantWidth()));
        buttWidth.setText(Double.toString(pant.getButtWidth()));
        importPrice.setText(Double.toString(pant.getImportPrice()));
        setVisible(true);
    }
   
    public PantInfo(java.awt.Frame parent, boolean modal) {
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
        productName = new javaswingdev.raven.swing.TextField();
        price = new javaswingdev.raven.swing.TextField();
        brand = new javaswingdev.raven.swing.TextField();
        okBtn = new javaswingdev.swing.Button();
        cancelBtn = new javaswingdev.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        quantity = new javaswingdev.raven.swing.TextField();
        description = new javaswingdev.raven.swing.TextField();
        category = new javaswingdev.raven.swing.TextField();
        pantWidth = new javaswingdev.raven.swing.TextField();
        buttWidth = new javaswingdev.raven.swing.TextField();
        pantLength = new javaswingdev.raven.swing.TextField();
        alertLabel = new javax.swing.JLabel();
        importPrice = new javaswingdev.raven.swing.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(800, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addProductForm.setBackground(new java.awt.Color(255, 255, 255));
        addProductForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        addProductForm.setRound(15);
        addProductForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productName.setLabelText("Product name");
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });
        addProductForm.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 82, 268, -1));

        price.setLabelText("Price");
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        addProductForm.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 268, -1));

        brand.setLabelText("Brand");
        addProductForm.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 268, -1));

        okBtn.setBackground(new java.awt.Color(98, 98, 157));
        okBtn.setForeground(new java.awt.Color(255, 255, 255));
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        addProductForm.add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 116, 35));

        cancelBtn.setBackground(new java.awt.Color(204, 75, 75));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        addProductForm.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 116, 34));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 106, 164));
        jLabel1.setText("Pant Info");
        addProductForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 38, -1, -1));

        quantity.setLabelText("Quantity");
        addProductForm.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 82, 262, -1));

        description.setLabelText("Description");
        addProductForm.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 550, -1));

        category.setLabelText("Category");
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        addProductForm.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 262, -1));

        pantWidth.setLabelText("Pant width");
        addProductForm.add(pantWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 283, 174, -1));

        buttWidth.setLabelText("Butt width");
        addProductForm.add(buttWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 283, 179, -1));

        pantLength.setLabelText("Pant Length");
        addProductForm.add(pantLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 283, 176, -1));

        alertLabel.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        alertLabel.setForeground(new java.awt.Color(255, 0, 0));
        alertLabel.setPreferredSize(new java.awt.Dimension(208, 13));
        addProductForm.add(alertLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 370, 220, 30));

        importPrice.setLabelText("Import Price");
        addProductForm.add(importPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 265, -1));

        getContentPane().add(addProductForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 620, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centerComponent(){
        this.setLocationRelativeTo(Dashboard.getFrames()[0]);
    }
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        this.setOk(false);
        String pName = productName.getText();
        String pPrice = price.getText();
        String pBrand = brand.getText();
        String pQuantity = quantity.getText();
        String pCategory = category.getText();
        String pDescription = description.getText();
        String pPantLength = pantLength.getText();
        String pPantWidth = pantWidth.getText();
        String pButtWidth = buttWidth.getText();
        String pImportPrice = importPrice.getText();

        if(pName.equals("") || pPrice.equals("") || pBrand.equals("") || pQuantity.equals("") || pCategory.equals("")
                || pDescription.equals("") || pPantLength.equals("") || pPantWidth.equals("") || pButtWidth.equals("")
                || pImportPrice.equals(""))
        {
            alertLabel.setText("Please fill in blank fields!");
            alertLabel.setVisible(true);
            
            }else{
    //          If no item -> create new one
                if(getPant() == null){
                    Message msg=new Message();
                    int id = Store.maxProductId++;
                    Pant newPant = new Pant(id, pName, Integer.parseInt(pPrice), pBrand, pCategory, 
                            pDescription, Integer.parseInt(pQuantity), Double.parseDouble(pImportPrice), Double.parseDouble(pPantLength), Double.parseDouble(pPantWidth),
                    Double.parseDouble(pButtWidth));
                    Main.store.addProduct(newPant);
                    this.setPant(newPant);
                    msg.showDialog("Add new pant successfully!","blue");
                    ok = true;
    //          If a item is set -> update
                }else{
                    int id = getPant().getProductId();
                    Message msg=new Message();
                    Main.store.updateProduct(id, pName, Double.parseDouble(pPrice), pBrand, pCategory, pDescription, 
                            Integer.parseInt(pQuantity), Double.parseDouble(pImportPrice), Double.parseDouble(pPantLength), Double.parseDouble(pPantWidth), 
                            Double.parseDouble(pButtWidth));
                    setPant((Pant)Main.store.getProduct(id));
                    msg.showDialog("Update pant id " + pant.getProductId()+ " successfully!","blue");
                    ok = true;
                }
                closeMenu();
        }
        
    }//GEN-LAST:event_okBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
              ok = false;
        closeMenu();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

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
    private javaswingdev.raven.swing.TextField brand;
    private javaswingdev.raven.swing.TextField buttWidth;
    private javaswingdev.swing.Button cancelBtn;
    private javaswingdev.raven.swing.TextField category;
    private javaswingdev.raven.swing.TextField description;
    private javaswingdev.raven.swing.TextField importPrice;
    private javax.swing.JLabel jLabel1;
    private javaswingdev.swing.Button okBtn;
    private javaswingdev.raven.swing.TextField pantLength;
    private javaswingdev.raven.swing.TextField pantWidth;
    private javaswingdev.raven.swing.TextField price;
    private javaswingdev.raven.swing.TextField productName;
    private javaswingdev.raven.swing.TextField quantity;
    // End of variables declaration//GEN-END:variables
}
