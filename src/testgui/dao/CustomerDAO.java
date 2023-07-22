package testgui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import testgui.model.Customer;
import testgui.service.GetConnection;

public class CustomerDAO {
  public static ArrayList<Customer> getCustomerList(){
      ArrayList<Customer> al = new ArrayList<Customer>();
      Connection con = null;
      try{
          con = GetConnection.getConnection();
          String sql = "select * , city.cityName from customer inner join city on customer.cityId = city.id";
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              int id = rs.getInt(1);
              String name = rs.getString("customerName");
              String email  = rs.getString("email");
              String mobile = rs.getString("mobile");
              int age = rs.getInt("age");
              String aadhar = rs.getString("aadharNo");
              String panCard = rs.getString("panCard");
              String address = rs.getString("address");
              String gender = rs.getString("gender");
              String dob = rs.getString("dob");
              String cityName = rs.getString("cityName");
              int cityId = rs.getInt("cityId");
              
              Customer customer = new Customer();
              customer.setId(id);
              customer.setMobile(mobile);
              customer.setCustomerName(name);
              customer.setEmail(email);
              customer.setAge(age);
              customer.setAadharNo(aadhar);
              customer.setPanCard(panCard);
              customer.setAddress(address);
              customer.setGender(gender);
              customer.setDob(dob);
              customer.setCityId(cityId);
              customer.setCityName(cityName);
              
              al.add(customer);
          }
      }
      catch(Exception e){
          e.printStackTrace();
      }
      finally{
          try{
              con.close();
          }
          catch(Exception e){
              e.printStackTrace();
          }
      }
      return al;
  }  
  public static boolean save(Customer customer){
      boolean status = false;
      Connection con = null;
      try{
          con = GetConnection.getConnection();
          String sql = "insert into customer(customerName,email,mobile,age,address,aadharNo,acountNo,panCard,gender,dob,cityId) values(?,?,?,?,?,?,?,?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          
          ps.setString(1, customer.getCustomerName());
          ps.setString(2,customer.getEmail());
          ps.setString(3, customer.getMobile());
          ps.setInt(4, customer.getAge());
          ps.setString(5, customer.getAddress());
          ps.setString(6, customer.getAadharNo());
          ps.setString(7, customer.getAccountNo());
          ps.setString(8, customer.getPanCard());
          ps.setString(9, customer.getGender());
          ps.setString(10, customer.getDob());
          ps.setInt(11, customer.getCityId());
      
          if(ps.executeUpdate()!=0)
              status = true;
      }
      catch(Exception e){
          e.printStackTrace();
      }
      finally{
          try{
              con.close();
          }
          catch(Exception e){
              e.printStackTrace();
          }
      }
      return status;
  }    
}
