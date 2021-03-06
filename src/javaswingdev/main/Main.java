
package javaswingdev.main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import storepkg.Store;

public class Main extends javax.swing.JFrame {
    private static Main main;
     public static Store store;
    public Main() {
        try{
        store = new Store();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        initComponents();
        init();
    }
    private void init() {
        main = this;
        txtUser.requestFocus();
        titleBar.initJFram(this);
             alertLabel.setVisible(false);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titleBar = new javaswingdev.swing.titlebar.TitleBar();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        button1 = new javaswingdev.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        button2 = new javaswingdev.swing.Button();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javaswingdev.raven.swing.PasswordField();
        txtUser = new javaswingdev.raven.swing.TextField();
        alertLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 205));
        setMinimumSize(new java.awt.Dimension(1104, 705));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1104, 705));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setRound(10);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setBackground(new java.awt.Color(98, 98, 157));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("LOGIN");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        roundPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 198, 40));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 106, 164));
        jLabel1.setText("LOGIN");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 177, 53));
        roundPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 343, -1));

        button2.setBackground(new java.awt.Color(196, 72, 72));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("CREATE NEW ACCOUNT");
        roundPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 257, 41));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Forgot password?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel2FocusGained(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 104, 25));

        txtPass.setLabelText("Password");
        txtPass.setLineColor(new java.awt.Color(102, 102, 102));
        txtPass.setSelectionColor(new java.awt.Color(55, 99, 168));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        roundPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 302, 78));

        txtUser.setLabelText("Username");
        txtUser.setLineColor(new java.awt.Color(102, 102, 102));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        roundPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 302, 74));

        alertLabel.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        alertLabel.setForeground(new java.awt.Color(255, 0, 0));
        alertLabel.setPreferredSize(new java.awt.Dimension(208, 13));
        roundPanel1.add(alertLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 218, -1));

        bg.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 380, 450));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(99, 99, 159));
        jLabel4.setText("GROUP OOP");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 260, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Manage-Store.png"))); // NOI18N
        jLabel5.setText("jLabel3");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Manage-Store.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 570, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        try {
            login();
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button1ActionPerformed
    private void login() throws ParseException{
        if(txtUser.getText().equals(store.getManagerList().get(0).getUsername()) && txtPass.getText().equals(store.getManagerList().get(0).getPassword())){
            this.setVisible(false);
            new Dashboard(1).setVisible(true);
        }else if(txtUser.getText().equals("") || txtPass.getText().equals("")){
           
         alertLabel.setVisible(true);
               alertLabel.setText("Please fill in blank fields");
        }
        else  if(txtUser.getText().equals(store.findStaff(1).getUsername()) && txtPass.getText().equals(store.findStaff(1).getPassword())){
            this.setVisible(false);
            new Dashboard(2).setVisible(true);
        }
        else
        {
               alertLabel.setVisible(true);
               alertLabel.setText("Incorrect username or password!");
            
        }
        
    }
    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
         
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
      
    }//GEN-LAST:event_txtPassFocusLost

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jLabel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel2FocusGained
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jLabel2FocusGained

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
           jLabel2.setForeground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
           
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
      jLabel2.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabel2MouseExited

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        try {
            login();
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    }//GEN-LAST:event_txtPassKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()  {
                new Main().setVisible(true);
            }
        });
    }
    public void clearLogin() {
        txtUser.setText("");
        txtPass.setText("");
        txtUser.setHelperText("");
        txtPass.setHelperText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JPanel bg;
    private javaswingdev.swing.Button button1;
    private javaswingdev.swing.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.titlebar.TitleBar titleBar;
    private javaswingdev.raven.swing.PasswordField txtPass;
    private javaswingdev.raven.swing.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
