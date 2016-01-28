package minorproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Navneet Verma
 */
public class DataBaseClass {
        
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private final String TAG_WORD = "word", TAG_WEIGHT = "weight";
    
    DataBaseClass(){
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
    
    public RawTestData[] getData(){        
        RawTestData[] rawTestData = null;
        String queryDB = "SELECT * FROM words ";
        try{
            PreparedStatement prepareStatement = con.prepareStatement(queryDB);            
            ResultSet resultSet = prepareStatement.executeQuery(queryDB);
            resultSet.last();
            int rows = resultSet.getRow();
            resultSet.beforeFirst();
            rawTestData = new RawTestData[rows];
            int i=0;
            while(resultSet.next()){
                rawTestData[i] = new RawTestData();
                rawTestData[i].setWord(resultSet.getString("word"));
                rawTestData[i].setWeight(Integer.parseInt(resultSet.getString("weight")));
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }        
        return rawTestData;
    }
    
}
