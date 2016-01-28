package frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author LIVEFREE
 */
public class ViewSuggestions extends JFrame{
    private final String columnNames[] = {"SrNo.","Suggestion","Weight"};                                
    private static int HEIGHT = 350, WIDTH = 500;
    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;
    private JButton closeButton;
    
    public ViewSuggestions(String suggestions[][]){
        setTitle("Suggestions");
        setSize(WIDTH,HEIGHT);
        setBackground(Color.GRAY);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        topPanel = new JPanel();
        closeButton = new JButton();
        closeButton.setText("Close");
        topPanel.setLayout( new BorderLayout() );
        getContentPane().add(topPanel);
        getContentPane().add(closeButton, BorderLayout.AFTER_LAST_LINE);
                        
        table = new JTable(suggestions, columnNames);

        // Add the table to a scrolling pane
        scrollPane = new JScrollPane( table );
        topPanel.add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(closeButton, BorderLayout.AFTER_LAST_LINE);
        
        // Adding the Action Listener
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
    }
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt){
        this.setVisible(false);
    }
}
