package minorproject;

/**
 *
 * @author LIVEFREE
 */
public class Data {  
    
    public int weight;
    public int index;
    
    public Data(){        
        this.weight = 0;
        this.index = -1;
    }
    
    public Data(int weight, int index){        
        this.weight = weight;
        this.index = index;
    }        
    
    public Data(Data d){
        this.weight = d.weight;
        this.index = d.index;
    }
}
