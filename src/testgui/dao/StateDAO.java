package testgui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import testgui.model.State;
import testgui.service.GetConnection;

public class StateDAO {
    public static ArrayList<State> getStateList(){
        Connection con = null;
        ArrayList<State> al = new ArrayList<State>();
        try{
           con = GetConnection.getConnection();
           String sql = "select * from state order by stateName";
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               int id = rs.getInt(1);
               String name = rs.getString(2);
               al.add(new State(id, name));
           }
        }
        catch(Exception e){
            
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
