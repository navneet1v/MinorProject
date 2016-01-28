package minorproject;

/**
 *
 * @author LIVEFREE
 */
public class LoadData {        
    public static RawTestData[] LoadRawDataToArray(){
        /* It loads the data into the array for the binary search */
        DataBaseClass dBClass = new DataBaseClass();
        return dBClass.getData();
    }
}