
package javaswingdev.main;

import java.awt.Color;
import javaswingdev.form.Message;
import model.*;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

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
        setVisible(ok);
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
        alertLabel = new javax.swing.JLabel();
        pantWidth = new javaswingdev.raven.swing.TextField();
        buttWidth = new javaswingdev.raven.swing.TextField();
        pantLength = new javaswingdev.raven.swing.TextField();

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

        pantWidth.setLabelText("Pant width");

        buttWidth.setLabelText("Butt width");

        pantLength.setLabelText("Pant Length");

        javax.swing.GroupLayout addProductFormLayout = new javax.swing.GroupLayout(addProductForm);
        addProductForm.setLayout(addProductFormLayout);
        addProductFormLayout.setHorizontalGroup(
            addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addProductFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(pantLength, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(pantWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(buttWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(pantLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pantWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String pPantLength = pantLength.getText();
        String pPantWidth = pantWidth.getText();
        String pButtWidth = buttWidth.getText();

        if(pName.equals("") || pPrice.equals("") || pBrand.equals("") || pQuantity.equals("") || pCategory.equals("")
                || pDescription.equals("") || pPantLength.equals("") || pPantWidth.equals("") || pButtWidth.equals(""))
        {
            alertLabel.setText("Please fill in blank fields!");
            alertLabel.setVisible(true);
            
            }else{
                ok = true;
    //          If no item -> create new one
                if(getPant() == null){

    //          If a item is set -> update
                }else{
                    int id = getPant().getProductId();
                    Message msg=new Message();
                    Dashboard.store.updateProduct(id, pName, Double.parseDouble(pPrice), pBrand, pCategory, pDescription, 
                            Integer.parseInt(pQuantity), Double.parseDouble(pPantLength), Double.parseDouble(pPantWidth), 
                            Double.parseDouble(pButtWidth));
                    setPant((Pant)Dashboard.store.getProduct(id));
                    msg.showDialog("Update shirt id " + pant.getProductId()+ " successfully!","blue");
                }
                closeMenu();
        }
        
    }//GEN-LAST:event_okBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
              ok = true;
        closeMenu();
    }//GEN-LAST:event_cancelBtnActionPerformed

    public void showInfo(Staff staff) {
       productName.setText(staff.getName());
       price.setText(staff.getPhone());
       animator.start();
       setVisible(true);
   }
    
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
    private javax.swing.JLabel jLabel1;
    private javaswingdev.swing.Button okBtn;
    private javaswingdev.raven.swing.TextField pantLength;
    private javaswingdev.raven.swing.TextField pantWidth;
    private javaswingdev.raven.swing.TextField price;
    private javaswingdev.raven.swing.TextField productName;
    private javaswingdev.raven.swing.TextField quantity;
    // End of variables declaration//GEN-END:variables
}
