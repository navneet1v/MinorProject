package minorproject;

/**
 *
 * @author LIVEFREE
 */
public class ProcessQuery {
    public static Data [] actualData;
    
    public static void findRangeOfString(String queryString){        
        int startIndex = BinarySearch.searchLowerRange(queryString);
        int endIndex = BinarySearch.searchUpperRange(queryString);
        
        if(startIndex == -1 || endIndex == -1){
            actualData = null;
            return;
        }
        
        int sizeOfMatchedData = endIndex - startIndex + 1;
        actualData = new Data[sizeOfMatchedData];
        /* just take the index of the array and the weight */
        int index = startIndex;
        for(int i = 0 ; i < sizeOfMatchedData; i++){
            actualData[i] = new Data();
            actualData[i].index = index;
            actualData[i].weight = MinorProject.rData[index].getWeight();            
            index ++;
        }
        /* for testing read the data from a file */        
    }
    
    public static int[] findSuggestions(int numberOfSuggestions){        
        /* make the segment Tree */
        if(actualData == null || actualData.length == 0){
            return null;
        }
        SegmentTree segmentTree = new SegmentTree(actualData.length);
        segmentTree.buildTree();
        /* use PQ and fill the suggestionsIndex Array */
        return segmentTree.queryTree(numberOfSuggestions);       
    }    
}