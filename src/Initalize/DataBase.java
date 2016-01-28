package Initalize;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LIVEFREE
 */
public class DataBase {
    
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private final int MINLIMIT = 1, MAXLIMIT = 50, RANGE = MAXLIMIT - MINLIMIT + 1;
    
    public DataBase(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
        }
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minorproject","root","");
        }catch(Exception e){
            System.out.println("connection db Not Found");
        } 
        try{
            stmt = con.createStatement();
        }catch(Exception e){
            System.out.println("Stmt Not Found");
        }
    }
    
    public void addDataInDBFromFile(String FileName){
        File inputFile = new File(FileName);        
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
            String s = null;
            int cnt = 0;
            while((s = br.readLine())!= null){
                InsertOneEntry(s, (int) (Math.random()*RANGE + MINLIMIT));                
                cnt ++;                
            }
            
            System.out.println(cnt);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }                        
    }
    
    private void InsertOneEntry(String word, Integer weight){
        String query = "INSERT INTO words (word, weight) values('" + word + "','" + weight.toString() + "')" ;
        try{
            stmt.execute(query);
        }catch(Exception e){
            System.out.println("Error in the insert query");
            e.printStackTrace();
        }
    }
    
    public void DeleteData(){
        String query = "DROP TABLE words";
        try{
            stmt.executeQuery(query);
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
    
    public void query(){
        String q = "a";
        String queryDB = "SELECT * FROM words WHERE word LIKE '" + q + "%' ";  
        try{
            PreparedStatement prepareStatement = con.prepareStatement(queryDB);            
            ResultSet resultSet = prepareStatement.executeQuery(queryDB);
            resultSet.last();
            int rows = resultSet.getRow();
            resultSet.beforeFirst();
            System.out.println(rows);
            int i=0;
            while(resultSet.next()){
                System.out.println(resultSet.getString("word"));
                System.out.println(Integer.parseInt(resultSet.getString("weight")));                
            }
        }catch(Exception e){
            e.printStackTrace();
        }       
    }
    
}
