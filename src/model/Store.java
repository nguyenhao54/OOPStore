/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
import java.util.ArrayList;

/**
 *
 * @author Duc Anh.Nguyen
 */
public class Store {
    ArrayList<Product> productList;
    ArrayList<Bill> billList;
    ArrayList<Staff> staffList;
    ArrayList<Manager> managerList;
    ArrayList<Shift> shiftList;
    
    public Store(ArrayList<Product> productList,ArrayList<Bill> billList, ArrayList<Staff> staffList, 
            ArrayList<Manager> managerList, ArrayList<Shift> shiftList){
        this.productList = productList;
        this.billList = billList;
        this.staffList = staffList;
        this.managerList = managerList;
        this.shiftList = shiftList;
    }
    
    public Store(){
//      init empty arrays of objects
        productList = new ArrayList<>();
        billList = new ArrayList<>();
        staffList = new ArrayList<>();
        managerList = new ArrayList<>();
        shiftList = new ArrayList<>();
    }
    
    public void addProduct(Product newProduct){
        productList.add(newProduct);
    }
    
    public void addBill(Bill newBill){
        billList.add(newBill);
    }
    
    public void addStaff(Staff newStaff){
        staffList.add(newStaff);
    }
    
    public void addManager(Manager newManager){
        managerList.add(newManager);
    }
    
    public void addShift(Shift newShift){
        shiftList.add(newShift);
    }
    
//    public void deleteProduct(int id){
//        for (int i = 0; i < productList.size(); i++){
//            if(productList.get(i).productId == id){
//                productList.remove(i);
//            }
//        }
//    }
}
