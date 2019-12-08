/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720126Ela;
import java.sql.*;

/**
 *
 * @author Ela Widya
 */
public class DBHelper1841720126Ela {
    private static Connection koneksi;
    
    public static void bukaKoneksiEla(){
        if(koneksi == null){
            try{
                    String url = "jdbc:mysql://localhost/dbperpus";

                    String user = "root";
                    String password = "";

                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    koneksi = DriverManager.getConnection(url, user, password);
                }
                catch (SQLException t)
                {
                    System.out.println("Error koneksi!");
                }
            }
        }
        public static int insertQueryGetIdEla(String query){
            bukaKoneksiEla();
            int num = 0;
            int result = -1;
            
            try{
                Statement stmt = koneksi.createStatement();
                num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
                
                ResultSet rs = stmt.getGeneratedKeys();

                if (rs.next()){
                    result = rs.getInt(1);
                }
                rs.close();
                stmt.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                result = -1;
            }
    
            return result;
        }
        public static boolean executeQueryEla(String query)
        {
            bukaKoneksiEla();
            boolean result = false;

            try{
                Statement stmt = koneksi.createStatement();
                stmt.executeUpdate(query);
                
                result = true;
                
                stmt.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
                return result;
            }

            public static ResultSet selectQueryEla(String query){
                bukaKoneksiEla();
                ResultSet rs = null;
            
                try{
                    Statement stmt = koneksi.createStatement();
                    rs = stmt.executeQuery(query);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                return rs;
        }
}
