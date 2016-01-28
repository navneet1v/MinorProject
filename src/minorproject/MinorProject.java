package minorproject;

import frontend.MainFrame;

/**
 *
 * @author LIVEFREE
 */
public class MinorProject {  
    private static int HEIGHT = 350, WIDTH = 500;
    public static RawTestData rData[];
    public static void main(String[] args) {        
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setSize(WIDTH, HEIGHT);
        rData = LoadData.LoadRawDataToArray();        
    }    
}