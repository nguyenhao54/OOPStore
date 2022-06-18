
package javaswingdev.main;

import java.awt.Color;
import javaswingdev.form.Message;
import model.Shirt;
import model.Staff;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class ShirtInfo extends javax.swing.JDialog {

    /**
     * @return the shirt
     */
    public Shirt getShirt() {
        return shirt;
    }

    /**
     * @param shirt the shirt to set
     */
    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
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
    private Shirt shirt;
    
    public void showInfo(Shirt shirt){
        productName.setText(shirt.getProductName());
        price.setText(Double.toString(shirt.getProductPrice()));
        brand.setText(shirt.getBrand());
        quantity.setText(Integer.toString(shirt.getQuantity()));
        category.setText(shirt.getCategory());
        description.setText(shirt.getDescription());
        shirtLength.setText(Double.toString(shirt.getShirtLength()));
        chestWidth.setText(Double.toString(shirt.getChestWidth()));
        sleeveLength.setText(Double.toString(shirt.getShirtLength()));
        shoulderWidth.setText(Double.toString(shirt.getShoulderWidth()));
        setVisible(ok);
    }
   
    public ShirtInfo(java.awt.Frame parent, boolean modal) {
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
        alertLabel = new javax.swing.JLabel();
        chestWidth = new javaswingdev.raven.swing.TextField();
        sleeveLength = new javaswingdev.raven.swing.TextField();
        shirtLength = new javaswingdev.raven.swing.TextField();
        shoulderWidth = new javaswingdev.raven.swing.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(800, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addProductForm.setBackground(new java.awt.Color(255, 255, 255));
        addProductForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        addProductForm.setRound(15);

        productName.setLabelText("Product name");

        price.setLabelText("Price");

        brand.setLabelText("Brand");

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
        jLabel1.setText("Add New Product");

        quantity.setLabelText("Quantity");

        description.setLabelText("Description");

        category.setLabelText("Category");

        alertLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        alertLabel.setForeground(new java.awt.Color(255, 0, 51));

        chestWidth.setLabelText("Chest width");

        sleeveLength.setLabelText("Sleeve length");

        shirtLength.setLabelText("Shirt Length");

        shoulderWidth.setLabelText("Shoulder width");

        javax.swing.GroupLayout addProductFormLayout = new javax.swing.GroupLayout(addProductForm);
        addProductForm.setLayout(addProductFormLayout);
        addProductFormLayout.setHorizontalGroup(
            addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addProductFormLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addProductFormLayout.createSequentialGroup()
                                .addComponent(shirtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chestWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addProductFormLayout.createSequentialGroup()
                                .addComponent(sleeveLength, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(shoulderWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addProductFormLayout.setVerticalGroup(
            addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chestWidth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shirtLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sleeveLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shoulderWidth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(addProductForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centerComponent(){
        this.setLocationRelativeTo(Dashboard.getFrames()[0]);
    }
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        String pName = productName.getText();
        String pPrice = price.getText();
        String pBrand = brand.getText();
        String pQuantity = quantity.getText();
        String pCategory = category.getText();
        String pDescription = description.getText();
        String pShirtLength = shirtLength.getText();
        String pChestWidth = chestWidth.getText();
        String pSleeveLength = sleeveLength.getText();
        String pShoulderWidth = shoulderWidth.getText();

        if(pName.equals("") || pPrice.equals("") || pBrand.equals("") || pQuantity.equals("") || pCategory.equals("")
                || pDescription.equals("") || pShirtLength.equals("") || pChestWidth.equals("") || pSleeveLength.equals("")
                || pShoulderWidth.equals("")){
            alertLabel.setText("Please fill in blank fields!");
            alertLabel.setVisible(true);
            
        }else{
            ok = true;
//          If no shirt -> create new one
            if(shirt == null){
                
//          If a shirt is set -> update
            }else{
                int id = shirt.getProductId();
                Message msg=new Message();
                Dashboard.store.updateProduct(id, pName, Double.parseDouble(pPrice), pBrand, pCategory, pDescription, 
                        Integer.parseInt(pQuantity), Double.parseDouble(pShirtLength), Double.parseDouble(pChestWidth), 
                        Double.parseDouble(pSleeveLength), Double.parseDouble(pShoulderWidth));
                setShirt((Shirt)Dashboard.store.getProduct(id));
                msg.showDialog("Update shirt id " + shirt.getProductId()+ " successfully!","blue");
            }
            closeMenu();
        }
        
    }//GEN-LAST:event_okBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
              ok = true;
        closeMenu();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
    private javaswingdev.swing.Button cancelBtn;
    private javaswingdev.raven.swing.TextField category;
    private javaswingdev.raven.swing.TextField chestWidth;
    private javaswingdev.raven.swing.TextField description;
    private javax.swing.JLabel jLabel1;
    private javaswingdev.swing.Button okBtn;
    private javaswingdev.raven.swing.TextField price;
    private javaswingdev.raven.swing.TextField productName;
    private javaswingdev.raven.swing.TextField quantity;
    private javaswingdev.raven.swing.TextField shirtLength;
    private javaswingdev.raven.swing.TextField shoulderWidth;
    private javaswingdev.raven.swing.TextField sleeveLength;
    // End of variables declaration//GEN-END:variables
}
