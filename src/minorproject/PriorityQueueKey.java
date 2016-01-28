package minorproject;

import java.util.Comparator;

/**
 *
 * @author LIVEFREE
 */
public class PriorityQueueKey implements Comparator<PriorityQueueKey> {
    public int weight, segmentIndex, rangeLeftIndex, rangeRightIndex;
    
    public PriorityQueueKey(){
        this.rangeLeftIndex = -1;
        this.rangeRightIndex = -1;
        this.segmentIndex = -1;
        this.weight = 0;
    }
    
    public PriorityQueueKey(int segmentIndex, int weight, int rangeLeftIndex, int rangeRightIndex){
        this.rangeLeftIndex = rangeLeftIndex;
        this.rangeRightIndex = rangeRightIndex;
        this.segmentIndex = segmentIndex;
        this.weight = weight;
    }
    
    public PriorityQueueKey(SegmentTreeNode node, int segmentIndex){
        this.rangeLeftIndex = node.rangeLeftIndex;
        this.rangeRightIndex = node.rangeRightIndex;
        this.segmentIndex = segmentIndex;
        this.weight = node.weight;
    }
    
    public PriorityQueueKey(PriorityQueueKey pKey){
        this.rangeLeftIndex = pKey.rangeLeftIndex;
        this.rangeRightIndex = pKey.rangeRightIndex;        
        this.segmentIndex = pKey.segmentIndex;
        this.weight = pKey.weight;        
    } 
    
    public int getSegmentIndex(){
        return this.segmentIndex;
    }
    
    public void setSegmentIndex(int segmentIndex){
        this.segmentIndex = segmentIndex;
    }
    
    public int getweight(){
        return this.weight;
    }
    
    public void setweight(int weight){
        this.weight = weight;
    }
    
    public int getRangeLeftIndex(){
        return this.rangeLeftIndex;
    }
    
    public void setRangeLeftIndex(int rangeLeftIndex){
        this.rangeLeftIndex = rangeLeftIndex;
    }
    
    public int getRangeRightIndex(){
        return this.rangeRightIndex;
    }
    
    public void setRangeRightIndex(int rangeRightIndex){
        this.rangeRightIndex = rangeRightIndex;
    }
    
    @Override
    public int compare(PriorityQueueKey o1, PriorityQueueKey o2) {
        return o1.weight > o2.weight ? -1 : 1;
    }
}
