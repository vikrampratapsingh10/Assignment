package testgui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import testgui.model.City;
import testgui.model.State;
import testgui.service.GetConnection;

public class CityDAO {

    public static ArrayList<City> getCityList(int sid){
        Connection con = null;
        ArrayList<City> al = new ArrayList<City>();
        try{
           con = GetConnection.getConnection();
           String sql = "select * from city where stateId = ? order by cityName";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, sid);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               int id = rs.getInt(1);
               String name = rs.getString(2);
               int stateId = rs.getInt(3);
               al.add(new City(id, name,stateId));
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
}
