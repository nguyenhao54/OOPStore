/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
import java.time.LocalDate;
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
    
    public Product getProduct(int id){
        for(Product p: productList){
            if(p.getProductId() == id){
                return p;
            }
        }
        return null;
    }
    
    public Bill getBill(int id){
        for(Bill b: billList){
            if(b.getBillId() == id){
                return b;
            }
        }
        return null;
    }
    
    public Staff getStaff(int id){
        for(Staff s: staffList){
            if(s.getStaffId()== id){
                return s;
            }
        }
        return null;
    }
    
    public Manager getManager(int id){
        for(Manager m: managerList){
            if(m.getStaffId()== id){
                return m;
            }
        }
        return null;
    }
    
    public Shift getshift(int id){
        for(Shift s: shiftList){
            if(s.getShiftId()== id){
                return s;
            }
        }
        return null;
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
    
    public void updateProduct(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity){
        Product p = getProduct(id);
        if(p == null){
            return;
        }
        p.setProductName(name);
        p.setProductPrice(price);
        p.setBrand(brand);
        p.setCategory(category);
        p.setDescription(description);
        p.setQuantity(quantity);
    }
    
    public void updateBill(int id, Staff staff, ArrayList<Order> orderList, LocalDate date){
        Bill b = getBill(id);
        if(b == null){
            return;
        }
        
        b.setStaff(staff);
        b.setOrderList(orderList);
        b.setDate(date);
        b.getTotalCost();
    }
    
    public void updateStaff(int id,String name, String gender, String phone, double rate){
        Staff s = getStaff(id);
        if(s == null){
            return;
        }
        
        s.setName(name);
        s.setGender(gender);
        s.setPhone(phone);
        s.setRate(rate);
    }
    
    public void updateManager(int id,String name, String gender, String phone, double rate){
        Manager m = getManager(id);
        if(m == null){
            return;
        }
        
        m.setName(name);
        m.setGender(gender);
        m.setPhone(phone);
        m.setRate(rate);
    }
    
//    public void updateShift()
    
    public void deleteProduct(int id){
        for (int i = 0; i < productList.size(); i++){
            if(productList.get(i).getProductId() == id){
                productList.remove(i);
            }
        }
    }
    
    public void deleteBill(int id){
        for (int i = 0; i < billList.size(); i++){
            if(billList.get(i).getBillId() == id){
                billList.remove(i);
            }
        }
    }
    
    public void deleteStaff(int id){
        for (int i = 0; i < staffList.size(); i++){
            if(staffList.get(i).getStaffId() == id){
                billList.remove(i);
            }
        }
    }
    
    public void deleteManager(int id){
        for (int i = 0; i < managerList.size(); i++){
            if(managerList.get(i).getStaffId() == id){
                managerList.remove(i);
            }
        }
    }
    
    public void deleteShift(int id){
        for (int i = 0; i < shiftList.size(); i++){
            if(shiftList.get(i).getShiftId() == id){
                shiftList.remove(i);
            }
        }
    }
    
    public double calculateIncome(){
        double sum = 0;
        for(Bill b: billList){
            sum += b.getTotalCost();
        }
        return sum;
    }
    
    public double calculateSalary(){
        double sum = 0;
//      Calculate salary for staff
        for(Staff s: staffList){
            sum += s.getSalary();
        }
        
//      calculate salary for manager
        for(Manager m: managerList){
            sum += m.getSalary();
        }
        
        return sum;
    }
}
