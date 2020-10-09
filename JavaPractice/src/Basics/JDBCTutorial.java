package Basics;

import java.sql.*;

public class JDBCTutorial {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/devtest";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "eastroad";

    public static void main(String args[]) throws SQLException {
        Connection conn = null;
        Statement stmt = null;

        try{

            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql, sqlGet;
            sql = " insert into PersonalInfo values ('Mou', 45, '1975-08-17' )";
            stmt.executeUpdate(sql);

            sqlGet = "select * from PersonalInfo";
            ResultSet rs = stmt.executeQuery(sqlGet);

            while (rs.next()){
                String name = rs.getString("name");
                System.out.println(name);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }

}
