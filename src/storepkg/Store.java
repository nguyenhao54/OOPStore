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
import model.Staff;
import java.util.Date;
import java.text.SimpleDateFormat;  

 
public class Store  {
    public ArrayList<Staff> StaffList;
    public static int maxStaffId=0;
    public JSONArray jStaffList;
   // ***********************************************************************add new staff
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
    

    
}
    