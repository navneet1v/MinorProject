package frontend;

import javax.swing.JOptionPane;
import minorproject.MinorProject;
import minorproject.ProcessQuery;

/**
 *
 * @author LIVEFREE
 */
public class FindSuggestions {
    private ViewSuggestions viewSuggestions;
    public FindSuggestions(){        
    }
    
    public void findResult(String queryString, int numberOfSuggestions){                               
        /* Take out the useful data */               
        ProcessQuery.findRangeOfString(queryString);
        /* get the index of suggestions*/
        int indexesOfSuggestions [] = ProcessQuery.findSuggestions(numberOfSuggestions);
        
        if(indexesOfSuggestions == null){            
            JOptionPane.showMessageDialog(null, "No suggestions can be found starting from " + queryString);
            return ;
        }
        
        String showSuggestions [][] = new String[indexesOfSuggestions.length][3];
        /* Using the suggestions index print the string */
        for(int i=0 ; i < indexesOfSuggestions.length ; i++){
            if(indexesOfSuggestions[i] == -1){                
                JOptionPane.showMessageDialog(null, "Not enough suggestion that starts from " + queryString + "\n"
                        + "Total Suggestions outputed are " + i);        
                break;
            }
            showSuggestions[i][0] = Integer.toString(i+1);            
            showSuggestions[i][1] = MinorProject.rData[indexesOfSuggestions[i]].getWord();
            showSuggestions[i][2] = Integer.toString(MinorProject.rData[indexesOfSuggestions[i]].getWeight());            
        }
        viewSuggestions = new ViewSuggestions(showSuggestions);
    }    
}
