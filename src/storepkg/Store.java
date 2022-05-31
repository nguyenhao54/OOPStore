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
    public static int maxstaffid=0;
    public JSONArray jStaffList;
   // add new staff
  public boolean addStaff(String name, String phone , String gender, String rate, String date){
        if(findStaff(phone)==null){
        JSONObject staffDetails = new JSONObject();
        maxstaffid++;
        staffDetails.put("id", Integer.toString(maxstaffid));
        staffDetails.put("name", name);
        staffDetails.put("phone", phone);
        staffDetails.put("gender", gender);
        staffDetails.put("rate", rate);
        staffDetails.put("birth date", date);
        JSONObject staffObject = new JSONObject(); 
        staffObject.put("staff",staffDetails);
        jStaffList.add(staffObject);
         //Write JSON file
        try (FileWriter file = new FileWriter("./staffs.json")) {
            file.write(jStaffList.toJSONString()); 
            file.flush();
        
            Date strDate=new SimpleDateFormat("dd-mm-yyyy").parse(date); 
         
            Staff newStaff= new Staff(maxstaffid,name,gender,phone,Double.parseDouble(rate),strDate);
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
 // deleteStaff
  public boolean deleteStaff (int id ){
    if (findStaff(id)!=null){
    jStaffList.remove(id);
     try (FileWriter file = new FileWriter("./staffs.json")) {
            file.write(jStaffList.toJSONString()); 
            file.flush();
            StaffList.remove(id);
       
        } catch (IOException e) {
            e.printStackTrace();
        }  catch (Exception e){
            e.printStackTrace();
        } 
        return true;
    }
    return false;
  }
    
  
   public void deleteStaff (String phone ){
    jStaffList.remove(findStaff(phone));
  }
   
   
private static void parseStaffObject(JSONObject staff , ArrayList<Staff> StaffList) 
    { 
        JSONObject staffObj= (JSONObject) staff.get("staff");    
        String name = (String) staffObj.get("name");  
        String staffid = (String) staffObj.get("id");  
        String gender = (String) staffObj.get("gender");  
        String phone = (String) staffObj.get("phone");    
        String rate = (String) staffObj.get("rate"); 
        String strDate = (String) staffObj.get("birth date"); 
 
        try{
        Date date=new SimpleDateFormat("dd-mm-yyyy").parse(strDate);
          if(maxstaffid<Integer.parseInt(staffid)) maxstaffid=Integer.parseInt(staffid);
        Staff newStaff= new Staff(Integer.parseInt(staffid),name,gender,phone,Double.parseDouble(rate),date );
         StaffList.add(newStaff); 
      }
        catch(Exception e){
            e.printStackTrace();
        }
        }
               

    
}
    