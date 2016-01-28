package minorproject;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author LIVEFREE
 */
public class SegmentTree {
    
    private int sizeOfTree;
    private SegmentTreeNode segmentTreeArray[];
    private static Comparator<PriorityQueueKey> comparator = new PriorityQueueKey();
    private static PriorityQueue<PriorityQueueKey> pQ;
    
    public SegmentTree(int numberOfElements){
        sizeOfTree = 4*numberOfElements;
        segmentTreeArray = new SegmentTreeNode[sizeOfTree];
        for(int i=0;i<sizeOfTree;i++){
            segmentTreeArray[i] = new SegmentTreeNode();
        }
    }
    
    public void buildTree(){
        buildTreeUtil(0, ProcessQuery.actualData.length-1, 0);
    }
    
    private void buildTreeUtil(int ss, int se, int si){
        if(ss == se){
            assignData(ss, se, si, ProcessQuery.actualData[ss]);
            return ;
        }                        
        int mid = getMid(ss, se);
        buildTreeUtil(ss, mid, 2*si+1);
        buildTreeUtil(mid+1, se, 2*si+2);
        mergeTreeNodes(si);
        return ;
    }    
    
    public int[] queryTree(int numberOfSuggestions){
        pQ = new PriorityQueue<PriorityQueueKey>(numberOfSuggestions, comparator);
        int indexArray[] = new int[numberOfSuggestions];
        SegmentTreeNode tempNode = new SegmentTreeNode(segmentTreeArray[0]);        
        PriorityQueueKey tempKey = new PriorityQueueKey(tempNode, 0);
        pQ.add(tempKey);
        
        for(int i=0; i < numberOfSuggestions ; i++){
            if(pQ.isEmpty()){
                /* The total number of Suggestions cannot be reterived */
                indexArray[i] = -1;
                break;
            }
            tempKey = pQ.peek();
            pQ.remove();
            while(true){
                int parent = tempKey.segmentIndex;
                if(tempKey.rangeLeftIndex == tempKey.rangeRightIndex){
                    
                    indexArray[i] = segmentTreeArray[tempKey.segmentIndex].stringIndex;
                    break;
                }
                int left = 2*parent + 1, right = left + 1, pqIndex, tempKeyIndex;
                if(segmentTreeArray[left].weight > segmentTreeArray[right].weight ){
                    pqIndex = right;
                    tempKeyIndex = left;
                }else{
                    pqIndex = left;
                    tempKeyIndex = right;
                }
                /* remove the node */
                /* Add to the PQ... */
                tempNode = new SegmentTreeNode(segmentTreeArray[pqIndex]);        
                tempKey = new PriorityQueueKey(tempNode, pqIndex);                
                pQ.add(tempKey);
                
                /* Going to the depth and finding the String index with the weight */
                tempNode = new SegmentTreeNode(segmentTreeArray[tempKeyIndex]);        
                tempKey = new PriorityQueueKey(tempNode, tempKeyIndex);
            }            
        }
        
        return indexArray;
    }
             
    private void assignData(int ss, int se, int si , Data value){        
        this.segmentTreeArray[si].rangeLeftIndex = ss;
        this.segmentTreeArray[si].rangeRightIndex = se;
        this.segmentTreeArray[si].stringIndex = value.index;
        this.segmentTreeArray[si].weight = value.weight;
    }
    
    private void mergeTreeNodes(int si){
        int parent = si;
        int left = 2*si+1;
        int right = left + 1;
        this.segmentTreeArray[parent].rangeLeftIndex = this.segmentTreeArray[left].rangeLeftIndex;
        this.segmentTreeArray[parent].rangeRightIndex = this.segmentTreeArray[right].rangeRightIndex;
        this.segmentTreeArray[parent].weight = max(this.segmentTreeArray[left].weight, this.segmentTreeArray[right].weight);
    }
    
    private int getMid(int a, int b){
        return a + ((b-a)>>1);
    }
    
    private int max(int a, int b){
        return a > b ? a : b;
    }    
}