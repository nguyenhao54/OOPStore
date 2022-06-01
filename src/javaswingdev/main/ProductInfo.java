
package javaswingdev.main;

import java.awt.Color;
import model.Product;
import model.Staff;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class ProductInfo extends javax.swing.JDialog {
    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }
    private boolean ok;
    private final Animator animator;
    private boolean show = true;
    
    public void showInfo(Product product){
        productName.setText(product.getProductName());
        price.setText(Double.toString(product.getProductPrice()));
        brand.setText(product.getBrand());
        quantity.setText(Integer.toString(product.getQuantity()));
        category.setText(product.getCategory());
        description.setText(product.getDescription());
        setVisible(ok);
    }
   
    public ProductInfo(java.awt.Frame parent, boolean modal) {
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
        button1 = new javaswingdev.swing.Button();
        button2 = new javaswingdev.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        quantity = new javaswingdev.raven.swing.TextField();
        description = new javaswingdev.raven.swing.TextField();
        category = new javaswingdev.raven.swing.TextField();

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

        button1.setBackground(new java.awt.Color(98, 98, 157));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("OK");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(204, 75, 75));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("CANCEL");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 106, 164));
        jLabel1.setText("Add New Product");

        quantity.setLabelText("Quantity");

        description.setLabelText("Description");

        category.setLabelText("Category");

        javax.swing.GroupLayout addProductFormLayout = new javax.swing.GroupLayout(addProductForm);
        addProductForm.setLayout(addProductFormLayout);
        addProductFormLayout.setHorizontalGroup(
            addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(addProductFormLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addProductFormLayout.createSequentialGroup()
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 35, Short.MAX_VALUE))
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
                .addGap(40, 40, 40)
                .addGroup(addProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(addProductForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centerComponent(){
        this.setLocationRelativeTo(Dashboard.getFrames()[0]);
    }
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
          
        closeMenu();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
              ok = true;
        closeMenu();
    }//GEN-LAST:event_button2ActionPerformed

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
    private javaswingdev.raven.swing.TextField brand;
    private javaswingdev.swing.Button button1;
    private javaswingdev.swing.Button button2;
    private javaswingdev.raven.swing.TextField category;
    private javaswingdev.raven.swing.TextField description;
    private javax.swing.JLabel jLabel1;
    private javaswingdev.raven.swing.TextField price;
    private javaswingdev.raven.swing.TextField productName;
    private javaswingdev.raven.swing.TextField quantity;
    // End of variables declaration//GEN-END:variables
}
