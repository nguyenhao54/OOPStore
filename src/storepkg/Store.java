/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storepkg;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;  
import model.*;

 
public class Store  {
    public ArrayList<Staff> StaffList;
    public static int maxStaffId=0;
    public static int maxProductId=0;
    public JSONArray jStaffList;
    private final ArrayList<Product> productList;
    
//  Default initiate
    public Store(){
        productList = new ArrayList<>();
        productList.add(new Shirt(1, "Polo Shirt", 299000, "Teelab", "Áo polo", "Trà đá vỉa hè", 10, 69, 52, 21, 44.5));
        productList.add(new Shirt(2, "Jacket", 350000, "H&M", "Clothes", "Áo khoác", 12, 71, 54, 42, 46));
        productList.add(new Shirt(3, "Vietnam Pride", 200000, "Bò sữa", "Áo phông", "Du lịch thì vô địch", 17, 69, 52, 21, 44.5));
        productList.add(new Shirt(4, "Somi Oxford", 413000, "Routine", "Áo sơ mi", "Lịch lãm", 21, 73, 56, 23, 47.5));
        productList.add(new Shirt(5, "Sơmi dài tay Dobby", 413000, "Routine", "Áo sơ mi", "Lịch lãm, năng động", 5, 75, 53, 61, 46));
        productList.add(new Shirt(6, "Sơ mi Seersucker", 472000, "Routine", "Áo sơ mi", "Trẻ trung", 12, 76, 55, 61, 47));
        productList.add(new Shirt(7, "Sơ mi caro", 299000, "Routine", "Áo sơ mi", "Lịch thiệp", 3, 76, 55, 61, 47));
        productList.add(new Pant(8, "Quần Jean trơn", 480000, "Routine", "Quần Jean", "Slimfit", 11, 101, 42, 51));
        productList.add(new Pant(9, "Quần khaki V", 299000, "Routine", "Quần khaki", "Slimcrop", 10, 98, 39, 48));
        productList.add(new Shirt(10, "Áo phông Marvel Comics", 599000, "Boo", "Áo phông", "Boo x Marvel", 2, 69, 52, 21, 44.5));
        productList.add(new Shirt(11, "Áo phông Hulk", 490000, "Boo", "Áo phông", "Boo x Marvel: Hulk", 19, 67, 50, 20, 43));
        productList.add(new Shoes(12, "Giày Night's Watch", 4999000, "Adidas", "Giày", "Adidas x GoT", 3, 26.5));
        productList.add(new Shoes(13, "Bitis Hunter X 2022", 1199000, "Bitis Hunter", "Giày", "Bitis Hunter Collection", 3, 25.5));
        productList.add(new Shoes(14, "Bitis Hunter X 2021", 999000, "Bitis Hunter", "Giày", "Bitis Hunter Collection", 7, 25.9));
        productList.add(new Shirt(15, "Hà Nội Trà Đá", 189000, "Teelab", "Áo phông", "Trà đá vỉa hè", 24, 69, 52, 21, 44.5));
        productList.add(new Shoes(16, "Ultraboost 22", 3900000, "Adidas", "Giày", "Giày chạy thể thao", 10, 28));
        productList.add(new Shoes(17, "Ultraboost 5.0 DNA", 2990000, "Adidas", "Giày", "Giày chạy thể thao", 1, 26.7));
        productList.add(new Pant(18, "Jeans Bermuda", 434000, "Boo", "Quần Jeans", "Quần regular form", 18, 101, 42, 51));
        maxProductId = productList.size() + 1;
    }
   // ***********************************************************************add new object
  public boolean addStaff(String name, String phone , String gender, String rate, String strDate){
        readStaff();
        if(findStaff(phone)==null){
        JSONObject staffDetails = new JSONObject();
         maxStaffId++;
        staffDetails.put("id", Integer.toString(maxStaffId));
        staffDetails.put("name", name);
        staffDetails.put("phone", phone);
        staffDetails.put("gender", gender);
        staffDetails.put("rate", rate);
        staffDetails.put("birth date", strDate);
        JSONObject staffObject = new JSONObject(); 
        staffObject.put("staff",staffDetails);
        jStaffList.add(staffObject);
         //Write JSON file
        try (FileWriter file = new FileWriter("./staffs.json")) {
            file.write(jStaffList.toJSONString()); 
            file.flush();
            Date date=new SimpleDateFormat("dd-mm-yyyy").parse(strDate); 
            Staff newStaff= new Staff(maxStaffId,name,gender,phone,Double.parseDouble(rate),date);
            StaffList.add(newStaff);
 
        } catch (IOException e) {
            e.printStackTrace();
        }  catch (Exception e){
            e.printStackTrace();
        } 
        return true;
    }
     return false;
}
  
// *****************************************************************   find Staff 
 public Staff findStaff(String phone){
    for(int i=0;i<StaffList.size();i++){
        if(StaffList.get(i).getPhone().equals(phone))
            return StaffList.get(i);
    }
    return null;
 }
  public Staff findStaff(int id){
    for(int i=0;i<StaffList.size();i++){
        if(StaffList.get(i).getStaffId()==id)
            return StaffList.get(i);
    }
    return null;
 }
   public JSONObject findJStaff(int id){
    for(int i=0;i<jStaffList.size();i++){
        JSONObject obj= (JSONObject)jStaffList.get(i);
       JSONObject objStaff=(JSONObject) obj.get("staff");
        if(Integer.parseInt(objStaff.get("id").toString())==id)
            return obj;
    }
    return null;
 }
   
   // **********************************************************************
   private boolean writeJsonStaff(JSONArray arr){
          try (FileWriter file = new FileWriter("./staffs.json")) {
            file.write(arr.toJSONString()); 
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
          return true;
       
   }
   
   // ******************************************************************* update staff
  public boolean updateStaff( int id, String name,String phone, String gender ,String rate ,String date){
      
      JSONObject obj= findJStaff(id);
      if(obj!=null){
      for(int i=0; i<jStaffList.size(); i++){
        JSONObject st= (JSONObject)jStaffList.get(i);
           if(obj.equals(jStaffList.get(i))){
             jStaffList.remove(i);
             JSONObject staffDetails=(JSONObject) st.get("staff");
             staffDetails.put("id",Integer.toString(id) );
             staffDetails.put("name", name);
             staffDetails.put("phone", phone);
             staffDetails.put("gender", gender);
             staffDetails.put("rate", rate);
             staffDetails.put("birth date", date);
             st.put("staff", staffDetails);
            }
           jStaffList.add(i,st);
           return writeJsonStaff(jStaffList);
        }
    }
      return false;
  }
  
  
  // ************************************************************************** read Json file
 public void readStaff ()
    {    
        StaffList= new ArrayList<>();
        jStaffList =new JSONArray();
     JSONParser jsonParser = new JSONParser();    
        try (FileReader reader = new FileReader("./staffs.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            jStaffList = (JSONArray) obj;
            jStaffList.forEach( st -> parseStaffObject( (JSONObject) st ,StaffList ));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
 
 private void parseStaffObject(JSONObject staff , ArrayList<Staff> StaffList) { 
        int tempId=0;
        JSONObject staffObj= (JSONObject) staff.get("staff");    
        String name = (String) staffObj.get("name");  
        String staffid = (String) staffObj.get("id");  
        String gender = (String) staffObj.get("gender");  
        String phone = (String) staffObj.get("phone");    
        String rate = (String) staffObj.get("rate"); 
        String strDate = (String) staffObj.get("birth date"); 
 
        try{
        Date date=new SimpleDateFormat("dd-mm-yyyy").parse(strDate);
          if(tempId<Integer.parseInt(staffid)) tempId=Integer.parseInt(staffid);
        Staff newStaff= new Staff(Integer.parseInt(staffid),name,gender,phone,Double.parseDouble(rate),date );
         StaffList.add(newStaff); 
         maxStaffId=tempId;
      }
        catch(Exception e){
            e.printStackTrace();
        }
 }
           
 
 // ****************************************************************************** deleteStaff
  public boolean deleteStaff (int staffId ){
      Staff a=findStaff(staffId);
    if (a!=null){
    jStaffList.remove(findJStaff(staffId));
   // System.out.println(jStaffList);
     try (FileWriter file = new FileWriter("./staffs.json")) {
            file.write(jStaffList.toJSONString()); 
            file.flush();
            StaffList.remove(a);
       StaffList.forEach(Staff->System.out.println(Staff.getStaffId()));
        } catch (IOException e) {
            e.printStackTrace();
        }  catch (Exception e){
            e.printStackTrace();
        } 
        return true;
    }
    return false;
  } 
    

  // ****************************************************************************** Product part
  public ArrayList<Product> getProductList(){
      return productList;
  }
  
  public void addProduct(Product newProduct){
        productList.add(newProduct);
    }
  
  public Product getProduct(int id){
        for(Product p: productList){
            if(p.getProductId() == id){
                return p;
            }
        }
        return null;
    }
  
//  Update shirt
  public void updateProduct(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double shirtLength,
            double chestWidth,
            double sleeveLength,
            double shoulderWidth){
        Shirt p = (Shirt)getProduct(id);
        if(p == null){
            return;
        }
        p.setProductName(name);
        p.setProductPrice(price);
        p.setBrand(brand);
        p.setCategory(category);
        p.setDescription(description);
        p.setQuantity(quantity);
        p.setShirtLength(shirtLength);
        p.setChestWidth(chestWidth);
        p.setSleeveLength(sleeveLength);
        p.setShoulderWidth(shoulderWidth);
    }
    
//  Update pant
  public void updateProduct(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double pantLength,
            double pantWidth,
            double buttWidth){
        Pant p = (Pant)getProduct(id);
        if(p == null){
            return;
        }
        p.setProductName(name);
        p.setProductPrice(price);
        p.setBrand(brand);
        p.setCategory(category);
        p.setDescription(description);
        p.setQuantity(quantity);
        p.setPantLength(pantLength);
        p.setPantWidth(pantWidth);
        p.setButtWidth(buttWidth);
    }
  
  //  Update shoes
  public void updateProduct(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double footLength){
      
      Shoes p = (Shoes)getProduct(id);
      p.setProductName(name);
      p.setProductPrice(price);
      p.setBrand(brand);
      p.setCategory(category);
      p.setDescription(description);
      p.setQuantity(quantity);
      p.setFootLength(footLength);
  }
}   