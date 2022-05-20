/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import model.Staff;

 
public class StaffList {
    public ArrayList<Staff> StaffList= new ArrayList<>();
    static int id=1;
    static JSONArray jStaffList;
    public void  write(String name, String phone , String gender, String rate){
        JSONObject staffDetails = new JSONObject();
        staffDetails.put("id", Integer.toString(id));
        staffDetails.put("name", name);
        staffDetails.put("phone", phone);
        staffDetails.put("gender", gender);
        staffDetails.put("rate", rate);
        JSONObject staffObject = new JSONObject(); 
       staffObject.put("staff",staffDetails);
       id++;
        jStaffList.add(staffObject);
         //Write JSON file
        try (FileWriter file = new FileWriter("./staffs.json")) {
            file.write(jStaffList.toJSONString()); 
            file.flush();
            Staff newStaff= new Staff(id,name,gender,phone,Double.parseDouble(rate));
            StaffList.add(newStaff);
 
        } catch (IOException e) {
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
        Staff newStaff= new Staff(Integer.parseInt(staffid),name,gender,phone,Double.parseDouble(rate));
         StaffList.add(newStaff); 
      
               

    }
}
    