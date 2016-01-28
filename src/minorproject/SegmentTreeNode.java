package minorproject;

/**
 *
 * @author LIVEFREE
 */
public class SegmentTreeNode {
    
    public int weight;
    public int stringIndex;
    public int rangeLeftIndex, rangeRightIndex;
    
    public SegmentTreeNode(){
        this.weight = 0;
        this.stringIndex = -1;
        this.rangeLeftIndex = -1;
        this.rangeRightIndex = -1;
    }
    
    public SegmentTreeNode(int weight, int stringIndex){
        this.weight = weight;
        this.stringIndex = stringIndex;
        this.rangeLeftIndex = -1;
        this.rangeRightIndex = -1;
    }
    
    public SegmentTreeNode(int weight, int stringIndex, int range){
        this.weight = weight;
        this.stringIndex = stringIndex;
        this.rangeLeftIndex = range;
        this.rangeRightIndex = range;
    }
    
    public SegmentTreeNode(int weight, int stringIndex, int rangeLeftIndex, int rangeRightIndex){
        this.weight = weight;
        this.stringIndex = stringIndex;
        this.rangeLeftIndex = rangeLeftIndex;
        this.rangeRightIndex = rangeRightIndex;
    } 
    
    public SegmentTreeNode(SegmentTreeNode node){
        this.weight = node.weight;
        this.stringIndex = node.stringIndex;
        this.rangeLeftIndex = node.rangeLeftIndex;
        this.rangeRightIndex = node.rangeRightIndex;
    }     
}