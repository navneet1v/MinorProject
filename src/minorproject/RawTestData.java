package minorproject;

/**
 *
 * @author LIVEFREE
 */
public class RawTestData {
    
    private String word;
    private int weight;
    
    public RawTestData(){
        this.word = null;
        this.weight = 0;
    }
    
    public RawTestData(String word, int weight){
        this.weight = weight;
        this.word = word;
    }
    
    public String getWord(){
        return this.word;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public void setWord(String word){
        this.word = word;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }    
}