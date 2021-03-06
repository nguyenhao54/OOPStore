package javaswingdev.main;
import java.text.ParseException;
import storepkg.Store;
import java.awt.Component;
import javaswingdev.form.*;
import javaswingdev.menu.EventMenuSelected;

public class Dashboard extends javax.swing.JFrame {
    
    private static Dashboard main;
  
    public Dashboard(int staffType) throws ParseException{
   
        initComponents();
        init(staffType);
        
        
    }
    
    private void init(int staffType) {
        main = this;
        titleBar.initJFram(this);
        if(staffType==1){
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (index == 0 && indexSubMenu == 0) {
                    showForm(new Form_Dashboard());
                } 
                else if(index==1 &&indexSubMenu==1 ) 
                {
                    showForm(new Form_Staff("all"));
                }
                 else if(index==1 &&indexSubMenu==2 ) 
                {
                showForm(new Form_Staff("Male"));
                }
                else if(index==1 &&indexSubMenu==3 ) 
                {
                    showForm(new Form_Staff("Female"));
                }
                 else if(index == 3 && indexSubMenu == 1){
                     showForm(new Form_Product());
                 }else if(index == 3 && indexSubMenu == 2){
                     showForm(new Form_SingleProduct("tops"));
                 }else if(index == 3 && indexSubMenu == 3){
                     showForm(new Form_SingleProduct("bottoms"));
                 }else if(index == 3 && indexSubMenu == 4){
                     showForm(new Form_SingleProduct("shoes"));
                 }
                 else if(index == 2 && indexSubMenu == 0){
                     showForm(new Form_Salary());
                 }
                 else if(index == 4 && indexSubMenu == 1) {
                     showForm(new Form_Bill("daily"));
                 }
                   else if(index == 4 && indexSubMenu == 2) {
                     showForm(new Form_Bill("monthly"));
                 }
                     else if(index == 4 && indexSubMenu == 3) {
                     showForm(new Form_Bill("yearly"));
                 }
                             else if(index == 4 && indexSubMenu == 4) {
                     showForm(new Form_Bill("all"));
                 }
                 
                else{
                    showForm(new Form_Empty(index + " " + indexSubMenu));
                }
            }
        });
        }
        else {
             menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (index == 0 && indexSubMenu == 0) {
                    showForm(new Form_Dashboard());
                } 
                else if(index==1 ||index==2 ) 
                {
               showForm(new Form_Empty("No permission"));
                }
                 else if(index == 3 && indexSubMenu == 1){
                     showForm(new Form_Product());
                 }else if(index == 3 && indexSubMenu == 2){
                     showForm(new Form_SingleProduct("tops"));
                 }else if(index == 3 && indexSubMenu == 3){
                     showForm(new Form_SingleProduct("bottoms"));
                 }else if(index == 3 && indexSubMenu == 4){
                     showForm(new Form_SingleProduct("shoes"));
                 }
               
                 else if(index == 4 && indexSubMenu == 1) {
                     showForm(new Form_Bill("daily"));
                 }
                   else if(index == 4 && indexSubMenu == 2) {
                     showForm(new Form_Bill("monthly"));
                 }
                     else if(index == 4 && indexSubMenu == 3) {
                     showForm(new Form_Bill("yearly"));
                 }
                 
                else{
                    showForm(new Form_Empty(index + " " + indexSubMenu));
                }
            }
        });
        }
        
        menu.setSelectedIndex(0, 0);
    }
    
    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }
    
    public static Dashboard getMain() {
        return main;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        menu = new javaswingdev.menu.Menu();
        titleBar = new javaswingdev.swing.titlebar.TitleBar();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(245, 245, 245));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private javaswingdev.menu.Menu menu;
    private javax.swing.JPanel panelMenu;
    private javaswingdev.swing.titlebar.TitleBar titleBar;
    // End of variables declaration//GEN-END:variables
}
