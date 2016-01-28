package minorproject;

/**
 *
 * @author LIVEFREE
 */
public class BinarySearch {
    public static int searchLowerRange(String query){
        int left = 0, right = MinorProject.rData.length;
        while(left < right){
            int mid = (right - left ) / 2 + left;
            if(compare(query,MinorProject.rData[mid].getWord()) < 0 ){ // s2 is less return is -1
                left = mid+1;
            }else{
                right = mid;
            }
        }
        //System.out.println(MinorProject.rData[left-1].getWord());
        
        if(left - 1 >= 0 && MinorProject.rData[left-1].getWord().startsWith(query)){
            //System.out.println(left-1);
            return left-1;
        }                
        
        if(MinorProject.rData[left].getWord().startsWith(query)){
            return left;
        }                        
        return -1;
    }
    
    public static int searchUpperRange(String query){
        int left = 0, right = MinorProject.rData.length ;
        while(left < right){
            int mid = (right - left ) / 2 + left;
            if(compare(query,MinorProject.rData[mid].getWord()) <= 0 ){ 
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        //System.out.println(MinorProject.rData[left-1].getWord());
        if(MinorProject.rData[left].getWord().startsWith(query)){
            //System.out.println(left);
            return left;
        }
        if(left-1 >=0 && MinorProject.rData[left-1].getWord().startsWith(query)){
            //System.out.println(left-1);
            return left-1;
        }
        return -1;        
    }
    
    private static int compare(String s1, String s2){
        int i;
        for(i=0; i < s1.length() && i < s2.length(); i++){
            if(s1.charAt(i) > s2.charAt(i)){
                return -1; 
            }else if(s1.charAt(i) < s2.charAt(i)){
                return 1;
            }
        }                
        
        if(i == s2.length()){
            return -1;
        }
        
        if(i < s1.length()){
            return 0; // condition for equal
        }                                        
        return 0;
    }
}
