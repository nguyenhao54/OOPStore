/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.text.DateFormat;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import model.Staff;
import java.util.Date;
import java.text.SimpleDateFormat;  

 
public class StaffList  {
    public ArrayList<Staff> StaffList= new ArrayList<>();
    static int maxid=0;
    static JSONArray jStaffList;
 public void  write(String name, String phone , String gender, String rate, String date){
        JSONObject staffDetails = new JSONObject();
        maxid++;
        staffDetails.put("id", Integer.toString(maxid));
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
         
            Staff newStaff= new Staff(maxid,name,gender,phone,Double.parseDouble(rate),strDate);
            StaffList.add(newStaff);
 
        } catch (IOException e) {
            e.printStackTrace();
        }  catch (Exception e){
     e.printStackTrace();
 } 
    }
 
 public void read ( )
    {
//     StaffParser sP=new StaffParser();
//     sP.write("Ann","171673782","Male","1.7");
//       sP.write("Ann","171673782","Male","1.8");

     JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("./staffs.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            jStaffList = (JSONArray) obj;
            jStaffList.forEach( emp -> parseStaffObject( (JSONObject) emp ,StaffList) );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
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
          if(maxid<Integer.parseInt(staffid)) maxid=Integer.parseInt(staffid);
        Staff newStaff= new Staff(Integer.parseInt(staffid),name,gender,phone,Double.parseDouble(rate),date );
         StaffList.add(newStaff); 
      }
        catch(Exception e){
            e.printStackTrace();
        }
      
               

    }
}
    