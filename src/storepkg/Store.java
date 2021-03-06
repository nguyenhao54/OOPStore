package storepkg;
import java.util.ArrayList;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.FileReader;
import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.Month;
import java.text.SimpleDateFormat;  
import java.time.LocalDate;
import model.*;
import java.text.ParseException;
 
public class Store  {

    /**
     * @return the managerList
     */
    public ArrayList<Manager> getManagerList() {
        return managerList;
    }
    private final ArrayList<Staff> staffList;
    private final ArrayList<Manager> managerList;
    private int maxStaffId;
    public static int maxProductId=0;
    public static int maxShiftId=0;
    public static int maxBillId=0;
    public JSONArray jStaffList;
    private final ArrayList<Product> productList;
    public ArrayList<Shift> shiftList;
    private final ArrayList<Bill> billList;
//    public ArrayList<Staff> staffList;
    
//  Default initiate
    public Store() throws ParseException{
        productList = new ArrayList<>();


        productList.add(new Shirt(1, "Polo Shirt", 299000, "Teelab", "Áo polo", "Trà đá vỉa hè", 10, 100000, 69, 52, 21, 44.5));
        productList.add(new Shirt(2, "Jacket", 350000, "H&M", "Clothes", "Áo khoác", 12, 200000, 71, 54, 42, 46));
        productList.add(new Shirt(3, "Vietnam Pride", 200000, "Bò sữa", "Áo phông", "Du lịch thì vô địch", 17, 125000, 69, 52, 21, 44.5));
        productList.add(new Shirt(4, "Somi Oxford", 413000, "Routine", "Áo sơ mi", "Lịch lãm", 21, 300000, 73, 56, 23, 47.5));
        productList.add(new Shirt(5, "Sơmi dài tay Dobby", 413000, "Routine", "Áo sơ mi", "Lịch lãm, năng động", 5, 200000, 75, 53, 61, 46));
        productList.add(new Shirt(6, "Sơ mi Seersucker", 472000, "Routine", "Áo sơ mi", "Trẻ trung", 12, 300000, 76, 55, 61, 47));
        productList.add(new Shirt(7, "Sơ mi caro", 299000, "Routine", "Áo sơ mi", "Lịch thiệp", 3, 200000, 76, 55, 61, 47));
        productList.add(new Pant(8, "Quần Jean trơn", 480000, "Routine", "Quần Jean", "Slimfit", 11, 400000, 101, 42, 51));
        productList.add(new Pant(9, "Quần khaki V", 299000, "Routine", "Quần khaki", "Slimcrop", 10, 200000, 98, 39, 48));
        productList.add(new Shirt(10, "Áo phông Marvel Comics", 599000, "Boo", "Áo phông", "Boo x Marvel", 2, 520000, 69, 52, 21, 44.5));
        productList.add(new Shirt(11, "Áo phông Hulk", 490000, "Boo", "Áo phông", "Boo x Marvel: Hulk", 19, 390000, 67, 50, 20, 43));
        productList.add(new Shoes(12, "Giày Night's Watch", 4999000, "Adidas", "Giày", "Adidas x GoT", 3, 4200000, 26.5));
        productList.add(new Shoes(13, "Bitis Hunter X 2022", 1199000, "Bitis Hunter", "Giày", "Bitis Hunter Collection", 3, 800000, 25.5));
        productList.add(new Shoes(14, "Bitis Hunter X 2021", 999000, "Bitis Hunter", "Giày", "Bitis Hunter Collection", 7, 600000, 25.9));
        productList.add(new Shirt(15, "Hà Nội Trà Đá", 189000, "Teelab", "Áo phông", "Trà đá vỉa hè", 24, 120000, 69, 52, 21, 44.5));
        productList.add(new Shoes(16, "Ultraboost 22", 3900000, "Adidas", "Giày", "Giày chạy thể thao", 10, 3000000, 28));
        productList.add(new Shoes(17, "Ultraboost 5.0 DNA", 2990000, "Adidas", "Giày", "Giày chạy thể thao", 1, 2000000, 26.7));
        productList.add(new Pant(18, "Jeans Bermuda", 434000, "Boo", "Quần Jeans", "Quần regular form", 18, 350000, 101, 42, 51));
        maxProductId = productList.size() + 1;
        
        staffList = new ArrayList<>();
         Date  bdate=new SimpleDateFormat("dd-mm-yyyy").parse("11-12-2001");           
        staffList.add(new Staff(1, "Nguyễn Đồng Đức Anh", "Male", "0858377316", 1.2,bdate));
        staffList.add(new Staff(2, "Nguyễn Thị Hà Giang", "Female", "0973567822", 1.2,bdate));
        staffList.add(new Staff(3, "Hoàng Trung Kiên", "Male", "0778237733", 1.2,bdate));
        staffList.add(new Staff(4, "Hoàng Đức Thiện", "Male", "0943453321", 1.9,bdate));
        staffList.add(new Staff(5, "Nguyễn Đức Tùng", "Male", "036663773", 1.2,bdate));
        staffList.add(new Staff(6, "Trần Văn Quân", "Male", "0927727253", 1.8,bdate));
        staffList.add(new Staff(7, "Nguyễn Phương Anh", "Female", "0876635623", 1.2,bdate));
        staffList.add(new Staff(8, "Nguyễn Thị Phương Nga", "Female", "078288232", 1.6,bdate));
        maxStaffId = staffList.size() + 1;
  
        
        managerList = new ArrayList<>();
        managerList.add(new Manager());
        
        shiftList = new ArrayList<>();
        shiftList.add(new Shift(1, "06:00:00", "12:00:00", 6));
        shiftList.add(new Shift(2, "12:00:00", "18:00:00", 6));
        shiftList.add(new Shift(3, "18:00:00", "23:59:00", 6));
        shiftList.add(new Shift(4, "23:00:00", "02:00:00", 3));
        

    
        Shift temp= this.getShift(1);
        Staff a= this.findStaff(1);
        a.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 7, 12),temp));
        a.getWorkedShifts().add(new RegisteredShift(2, LocalDate.of(2022, 7, 13),temp));
        a.getWorkedShifts().add(new RegisteredShift(3, LocalDate.of(2022, 7, 14),temp));        
        a.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 7, 12),temp));
        a.getWorkedShifts().add(new RegisteredShift(4, LocalDate.of(2022, 7, 13),temp));
        a.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 14),temp));
        a.setMaxShiftId(a.getWorkedShifts().size() + 1);

        temp= this.getShift(1);
        Staff b= this.findStaff(4);
        b.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 6, 11),temp));
        b.getWorkedShifts().add(new RegisteredShift(2, LocalDate.of(2022, 6, 12),temp));
        b.getWorkedShifts().add(new RegisteredShift(3, LocalDate.of(2022, 6, 11),temp));
        b.getWorkedShifts().add(new RegisteredShift(4, LocalDate.of(2022, 6, 12),temp));
        b.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 11),temp));
        b.getWorkedShifts().add(new RegisteredShift(6, LocalDate.of(2022, 7, 12),temp));
        b.getWorkedShifts().add(new RegisteredShift(7, LocalDate.of(2022, 7, 13),temp));
        b.getWorkedShifts().add(new RegisteredShift(8, LocalDate.of(2022, 7, 14),temp));
        b.getWorkedShifts().add(new RegisteredShift(9, LocalDate.of(2022, 7, 15),temp));
        


        b.setMaxShiftId(b.getWorkedShifts().size() + 1);


         temp= this.getShift(1);
        Staff e= this.findStaff(2);
        e.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 6, 11),temp));
        e.getWorkedShifts().add(new RegisteredShift(2, LocalDate.of(2022, 6, 12),temp));
        e.getWorkedShifts().add(new RegisteredShift(6, LocalDate.of(2022, 7, 12),temp));
        e.getWorkedShifts().add(new RegisteredShift(3, LocalDate.of(2022, 6, 11),temp));
        e.getWorkedShifts().add(new RegisteredShift(4, LocalDate.of(2022, 6, 12),temp));
        e.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 11),temp));
        e.getWorkedShifts().add(new RegisteredShift(7, LocalDate.of(2022, 7, 13),temp));
        e.getWorkedShifts().add(new RegisteredShift(8, LocalDate.of(2022, 7, 14),temp));
        e.getWorkedShifts().add(new RegisteredShift(9, LocalDate.of(2022, 7, 15),temp));
        


        e.setMaxShiftId(b.getWorkedShifts().size() + 1);
        
        
        temp= this.getShift(3);
        Staff c= this.findStaff(3);
        c.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 6, 11),temp));
        c.getWorkedShifts().add(new RegisteredShift(2, LocalDate.of(2022, 6, 12),temp));
        c.getWorkedShifts().add(new RegisteredShift(3, LocalDate.of(2022, 6, 11),temp));
        c.getWorkedShifts().add(new RegisteredShift(4, LocalDate.of(2022, 6, 12),temp));
        c.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 11),temp));
        c.getWorkedShifts().add(new RegisteredShift(6, LocalDate.of(2022, 7, 12),temp));
        c.getWorkedShifts().add(new RegisteredShift(7, LocalDate.of(2022, 7, 13),temp));
        c.getWorkedShifts().add(new RegisteredShift(8, LocalDate.of(2022, 7, 14),temp));
        c.getWorkedShifts().add(new RegisteredShift(9, LocalDate.of(2022, 7, 15),temp));
        c.getWorkedShifts().add(new RegisteredShift(10, LocalDate.of(2022, 7, 16),temp));
        c.getWorkedShifts().add(new RegisteredShift(11, LocalDate.of(2022, 7, 17),temp));
        c.getWorkedShifts().add(new RegisteredShift(12, LocalDate.of(2022, 7, 18),temp));
        c.getWorkedShifts().add(new RegisteredShift(13, LocalDate.of(2022, 7, 19),temp));
        c.getWorkedShifts().add(new RegisteredShift(14, LocalDate.of(2022, 7, 20),temp));

        c.setMaxShiftId(c.getWorkedShifts().size() + 1);
        
         c= this.findStaff(5);
        c.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 6, 11),temp));
        c.getWorkedShifts().add(new RegisteredShift(2, LocalDate.of(2022, 6, 12),temp));
        c.getWorkedShifts().add(new RegisteredShift(3, LocalDate.of(2022, 6, 11),temp));
        c.getWorkedShifts().add(new RegisteredShift(4, LocalDate.of(2022, 6, 12),temp));
        c.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 11),temp));
        c.getWorkedShifts().add(new RegisteredShift(6, LocalDate.of(2022, 7, 12),temp));
        c.getWorkedShifts().add(new RegisteredShift(7, LocalDate.of(2022, 7, 13),temp));
        c.getWorkedShifts().add(new RegisteredShift(8, LocalDate.of(2022, 7, 14),temp));
        c.getWorkedShifts().add(new RegisteredShift(9, LocalDate.of(2022, 7, 15),temp));

        c.setMaxShiftId(c.getWorkedShifts().size() + 1);

        temp= this.getShift(1);
        Staff d= this.findStaff(8);           
        d.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 7, 11),temp));
        temp= this.getShift(2);
        d.getWorkedShifts().add(new RegisteredShift(2, LocalDate.of(2022, 7, 11),temp));
        d.getWorkedShifts().add(new RegisteredShift(3, LocalDate.of(2022, 7, 12),temp));
        d.getWorkedShifts().add(new RegisteredShift(4, LocalDate.of(2022, 7, 13),temp));
        d.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 14),temp));

        d.setMaxShiftId(d.getWorkedShifts().size() + 1);
        
        
        temp= this.getShift(1);
        Staff g= this.findStaff(7);           
        g.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 7, 11),temp));
        temp= this.getShift(2);
        g.getWorkedShifts().add(new RegisteredShift(2, LocalDate.of(2022, 7, 11),temp));
        g.getWorkedShifts().add(new RegisteredShift(3, LocalDate.of(2022, 7, 12),temp));
        g.getWorkedShifts().add(new RegisteredShift(4, LocalDate.of(2022, 7, 13),temp));
        g.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 14),temp));

        g.setMaxShiftId(d.getWorkedShifts().size() + 1);
        
        
        temp= this.getShift(2);
        Staff m= this.findStaff(6);           
        m.getWorkedShifts().add(new RegisteredShift(1, LocalDate.of(2022, 7, 11),temp));
        temp= this.getShift(3);
        m.getWorkedShifts().add(new RegisteredShift(2, LocalDate.of(2022, 7, 11),temp));
        m.getWorkedShifts().add(new RegisteredShift(3, LocalDate.of(2022, 7, 12),temp));
        m.getWorkedShifts().add(new RegisteredShift(4, LocalDate.of(2022, 7, 13),temp));
        m.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 14),temp));
        m.getWorkedShifts().add(new RegisteredShift(5, LocalDate.of(2022, 7, 15),temp));


        g.setMaxShiftId(d.getWorkedShifts().size() + 1);
        
        billList = new ArrayList<>();
        ArrayList orders0 = new ArrayList<>(); 
        orders0.add(new Order(1, this.getProduct(1), 2));
        orders0.add(new Order(2, this.getProduct(4), 2));
        orders0.add(new Order(3, this.getProduct(5), 2));
        billList.add(new Bill(1, this.findStaff(3), orders0, LocalDateTime.of(2022, Month.JULY, 15, 14, 33, 23), 5000000));
        ArrayList orders1 = new ArrayList<>();
        orders1.add(new Order(1, this.getProduct(8), 2));
        orders1.add(new Order(2, this.getProduct(12), 2));
        orders1.add(new Order(3, this.getProduct(1), 2));
        billList.add(new Bill(2, this.findStaff(1), orders1, LocalDateTime.of(2022, Month.JULY, 15, 18, 22, 38), 17000000));   
        ArrayList orders2 = new ArrayList<>();
        orders2.add(new Order(1, this.getProduct(4), 2));
        orders2.add(new Order(2, this.getProduct(10), 2));
        orders2.add(new Order(3, this.getProduct(6), 2));
        ArrayList orders4 = new ArrayList<>();
        orders4.add(new Order(1, this.getProduct(4), 2));
        orders4.add(new Order(2, this.getProduct(10), 2));
        orders4.add(new Order(3, this.getProduct(6), 2));
        billList.add(new Bill(3, this.findStaff(2), orders2, LocalDateTime.of(2022, Month.JULY, 18, 6, 19, 20), 5000000));
        billList.add(new Bill(4, this.findStaff(6), orders2, LocalDateTime.of(2022, Month.JULY, 18, 6, 19, 20), 5000000));
        billList.add(new Bill(5, this.findStaff(6), orders4, LocalDateTime.of(2022, Month.JULY, 20, 5, 22, 22), 5000000));
        ArrayList orders3 = new ArrayList<>();
        orders3.add(new Order(1, this.getProduct(13), 2));
        orders3.add(new Order(2, this.getProduct(7), 2));
        orders3.add(new Order(3, this.getProduct(11), 2));
        ArrayList orders5 = new ArrayList<>();
        orders5.add(new Order(1, this.getProduct(13), 2));
        orders5.add(new Order(2, this.getProduct(7), 2));
        orders5.add(new Order(3, this.getProduct(11), 2));
        billList.add(new Bill(6, this.findStaff(6), orders3, LocalDateTime.of(2022, Month.JULY, 12, 11, 22, 22), 5000000));
        billList.add(new Bill(7, this.findStaff(6), orders3, LocalDateTime.of(2022, Month.JUNE, 15, 11, 22, 22), 5000000));
        billList.add(new Bill(8, this.findStaff(6), orders3, LocalDateTime.of(2022, Month.JUNE, 16, 11, 22, 22), 5000000));
        billList.add(new Bill(8+1, this.findStaff(2), orders5, LocalDateTime.of(2022, Month.JULY, 20, 6, 22, 22), 5000000));
        billList.add(new Bill(8+2, this.findStaff(1), orders1, LocalDateTime.of(2022, Month.MARCH, 23, 18, 22, 38), 17000000));

        
        maxBillId = billList.size() + 1;
     }
   // ***********************************************************************add new object
     public ArrayList<Staff> getSalaryList(){
      return staffList;
  }
     
  public boolean addStaff(String name, String phone , String gender, String rate, String strDate){
//        if(findStaff(phone)==null){
//        JSONObject staffDetails = new JSONObject();
//        staffDetails.put("id", Integer.toString(maxStaffId));
//        staffDetails.put("name", name);
//        staffDetails.put("phone", phone);
//        staffDetails.put("gender", gender);
//        staffDetails.put("rate", rate);
//        staffDetails.put("birth date", strDate);
//        JSONObject staffObject = new JSONObject(); 
//        staffObject.put("staff",staffDetails);
//        jStaffList.add(staffObject);
//         //Write JSON file
//        try (FileWriter file = new FileWriter("./staffs.json")) {
//            file.write(jStaffList.toJSONString()); 
//            file.flush();
        try{
            maxStaffId=getMaxStaffIdAndIncrease();
            Date date=new SimpleDateFormat("dd-mm-yyyy").parse(strDate); 
            Staff newStaff= new Staff(getMaxStaffId(),name,gender,phone,Double.parseDouble(rate),date);
                getStaffList().add(newStaff);
// 
//        } catch (IOException e) {
//            e.printStackTrace();
        }  catch (Exception e){
            e.printStackTrace();
                 return false;

        } 
        return true;
    }
  
  public void addStaff(Staff staff){
      staffList.add(staff);
  }

  
// *****************************************************************   find Staff 
 public Staff findStaff(String phone){
    for(int i=0;i<getStaffList().size();i++){
        if( getStaffList().get(i).getPhone().equals(phone))
            return getStaffList().get(i);
    }
    return null;
 }
  public Staff findStaff(int id){
    for(int i=0;i<getStaffList().size();i++){
        if( getStaffList().get(i).getStaffId()==id)
            return getStaffList().get(i);
    }
    return null;
 }
//   public JSONObject findJStaff(int id){
//    for(int i=0;i<jStaffList.size();i++){
//        JSONObject obj= (JSONObject)jStaffList.get(i);
//       JSONObject objStaff=(JSONObject) obj.get("staff");
//        if(Integer.parseInt(objStaff.get("id").toString())==id)
//            return obj;
//    }
//    return null;
// }
//   
   // **********************************************************************
//   private boolean writeJsonStaff(JSONArray arr){
//          try (FileWriter file = new FileWriter("./staffs.json")) {
//            file.write(arr.toJSONString()); 
//            file.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return false;
//        }
//          return true;
//       
//   }
   
   // ******************************************************************* update staff
  public boolean updateStaff( int id, String name,String phone, String gender ,String rate ,String date){
      
//      JSONObject obj= findJStaff(id);
//      if(obj!=null){
//      for(int i=0; i<jStaffList.size(); i++){
//        JSONObject st= (JSONObject)jStaffList.get(i);
//           if(obj.equals(jStaffList.get(i))){
//             jStaffList.remove(i);
//             JSONObject staffDetails=(JSONObject) st.get("staff");
//             staffDetails.put("id",Integer.toString(id) );
//             staffDetails.put("name", name);
//             staffDetails.put("phone", phone);
//             staffDetails.put("gender", gender);
//             staffDetails.put("rate", rate);
//             staffDetails.put("birth date", date);
//             st.put("staff", staffDetails);
//            }
//           jStaffList.add(i,st);      
//           try (FileWriter file = new FileWriter("./staffs.json")) {         
//            file.write(jStaffList.toJSONString()); 
//            file.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return false;
//        }
          try{
          findStaff(id).setName(name);
          findStaff(id).setPhone(phone);               
          findStaff(id).setGender(gender);
          findStaff(id).setRate(Double.parseDouble(rate));
          Date d=new SimpleDateFormat("dd-mm-yyyy").parse(date); 
          findStaff(id).setBirthDate(d);
          } catch (Exception e) {
            e.printStackTrace();
            return false;

          }
          return true;
        }
//    }
//      return false;
//  }
  
  
  // ************************************************************************** read Json file
// public void readStaff ()
//    {    
//        StaffList= new ArrayList<>();
//        jStaffList =new JSONArray();
//     JSONParser jsonParser = new JSONParser();    
//        try (FileReader reader = new FileReader("./staffs.json"))
//        {
//            //Read JSON file
//            Object obj = jsonParser.parse(reader);
//            jStaffList = (JSONArray) obj;
//            jStaffList.forEach( st -> parseStaffObject( (JSONObject) st ,StaffList ));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
// 
 
// private void parseStaffObject(JSONObject staff , ArrayList<Staff> StaffList) { 
//        int tempId=0;
//        JSONObject staffObj= (JSONObject) staff.get("staff");    
//        String name = (String) staffObj.get("name");  
//        String staffid = (String) staffObj.get("id");  
//        String gender = (String) staffObj.get("gender");  
//        String phone = (String) staffObj.get("phone");    
//        String rate = (String) staffObj.get("rate"); 
//        String strDate = (String) staffObj.get("birth date"); 
// 
//        try{
//        Date date=new SimpleDateFormat("dd-mm-yyyy").parse(strDate);
//          if(tempId<Integer.parseInt(staffid)) tempId=Integer.parseInt(staffid);
//        Staff newStaff= new Staff(Integer.parseInt(staffid),name,gender,phone,Double.parseDouble(rate),date );
//         StaffList.add(newStaff); 
//         maxStaffId=tempId;
//      }
//        catch(Exception e){
//            e.printStackTrace();
//        }
// }
           
 
 // ****************************************************************************** deleteStaff
  public boolean deleteStaff (int staffId ){
      Staff a=findStaff(staffId);
    if (a!=null){
//    jStaffList.remove(findJStaff(staffId));
   // System.out.println(jStaffList);
//     try (FileWriter file = new FileWriter("./staffs.json")) {
//            file.write(jStaffList.toJSONString()); 
//            file.flush();
            getStaffList().remove(a);
      //      getStaffList().forEach(Staff->System.out.println(Staff.getStaffId()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }  catch (Exception e){
//            e.printStackTrace();
//        } 
        return true;
    }
    return false;
  } 
    
  
  // ****************************************************************************** Bill part
  public ArrayList<Bill> getBillList(String kind) {
      
      
      ArrayList<Bill> Billkind= new ArrayList<>();
      if (kind.equals("daily")){
           for(Bill b:billList){
          if (b.getDate().toLocalDate().getDayOfYear() == java.time.LocalDate.now().getDayOfYear()){
              Billkind.add(b);
          }    
        }
      }
      else if (kind.equals("monthly")){
          
           for(Bill b:billList){
           if (b.getDate().toLocalDate().getMonth() == java.time.LocalDate.now().getMonth()){
              Billkind.add(b);
          }
        }
      }
      else if (kind.equals("yearly")) {
           for(Bill b:billList){
           if (b.getDate().toLocalDate().getYear() == java.time.LocalDate.now().getYear()){
              Billkind.add(b);
          }
        }   
      }
      else {
          return billList;
          
      }
      
      return Billkind;
  }
  
  public void deleteBill(int id){
        for (int i = 0; i < billList.size(); i++){
              if(billList.get(i).getBillId() == id){
                  billList.remove(i);
              }
          }
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
            double importPrice,
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
        p.setImportPrice(importPrice);
    }
    
//  Update pant
  public void updateProduct(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double importPrice,
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
        p.setImportPrice(importPrice);
    }
  
  //  Update shoes
  public void updateProduct(int id,
            String name,
            double price,
            String brand,
            String category,
            String description,
            int quantity,
            double importPrice,
            double footLength){
      
      Shoes p = (Shoes)getProduct(id);
      p.setProductName(name);
      p.setProductPrice(price);
      p.setBrand(brand);
      p.setCategory(category);
      p.setDescription(description);
      p.setQuantity(quantity);
      p.setFootLength(footLength);
      p.setImportPrice(importPrice);
  }
  
  public void deleteProduct(int id){
        for (int i = 0; i < productList.size(); i++){
              if(productList.get(i).getProductId() == id){
                  productList.remove(i);
              }
          }
    }

   public ArrayList<Shift> getShiftList(){
      return shiftList;
  }
  
  public void addShift(Shift newShift){
        shiftList.add(newShift);
    }
  
  public Shift getShift(int id){
        for(Shift p: shiftList){
            if(p.getShiftId() == id){
                return p;
            }
        }
        return null;
    } 
  public void deleteShift(int id){
        for (int i = 0; i < shiftList.size(); i++){
              if(shiftList.get(i).getShiftId() == id){
                  shiftList.remove(i);
              }
          }
    }
  public void updateShift(Shift s, int id,
            String startTime,
            String endTime
            ){
      
      s.setShiftId(id);
      s.setStartTime(startTime);
      s.setEndTime(endTime);
  }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }
    
    public void increaseMaxStaffId(){
        maxStaffId += 1;
    }
    
    public int getMaxStaffIdAndIncrease(){
        return maxStaffId++;
    }
    
    public int getMaxStaffId() {
        maxStaffId=0;
       for(Staff s:staffList){
           if(s.getStaffId()>maxStaffId){
               maxStaffId=s.getStaffId();
           }
       }     
     return maxStaffId;
    }
    
//    Bill part
    public void addBill(Bill newBill){
        billList.add(newBill);
    }
     
//    Get income of specific month and year
     public double getIncome(int month, int year){
        double sum = 0;
        for(Bill b: billList){
            if(b.getDate().getMonthValue() == month && b.getDate().getYear() == year)
            sum += b.getTotalCost();
        }
        return sum;
    } 
     
     //    Default method get income this month
     public double getIncome(){
         LocalDate now = LocalDate.now();
        return getIncome(now.getMonthValue(), now.getYear());
    } 
     
     public double getExpense(int month, int year){
         double expense = 0;
         for(Bill b: billList){
             if(b.getDate().getMonthValue() == month && b.getDate().getYear() == year)
             for(Order o: b.getOrderList()){
                 expense += o.getProduct().getImportPrice();
             }
         }
         expense += getTotalSalary();
         return expense;
     }
     
     public double getExpense(){
         LocalDate now = LocalDate.now();
        return getExpense(now.getMonthValue(), now.getYear());
     }
     
     public Staff getBestStaff(){
         Staff bestStaff = staffList.get(0);
         double maxHour = 0;
         for(Staff s: staffList){
             LocalDate now = LocalDate.now();
             if(s.getWorkedHour() > maxHour){
                 bestStaff = s;
                 maxHour = s.getWorkedHour(now.getMonthValue(), now.getYear());
             }
         }
         return bestStaff;
     }
     
     public double getTotalSalary(){
         double sum = 0;
         LocalDate now = LocalDate.now();
         for(Staff s: staffList){
             sum += s.getSalary(now.getMonthValue(), now.getYear());
         }
         return sum;
     }
     
     public int getMaxBillCount(Staff s){
         int sum = 0;
         for(Bill b: billList){
             if(b.getStaff().getStaffId() == s.getStaffId()){
                 sum++;
             }
         }
         return sum;
     }
}   
