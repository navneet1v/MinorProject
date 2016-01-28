package frontend;

/**
 *
 * @author LIVEFREE
 */
public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        super("Prefix Based Ranked AutoComplete");
        initComponents();
        removeAllErrorMessages();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        queryTextField = new javax.swing.JTextField();
        numberOfSuggestionsTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        getSuggestions = new javax.swing.JButton();
        wrongInputMessage = new javax.swing.JLabel();
        queryMessage = new javax.swing.JLabel();
        suggestionsMessage = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Prefix Based Ranked AutoComplete");

        jLabel2.setText("Enter the Query");

        queryTextField.setToolTipText("Enter the Query String");

        numberOfSuggestionsTextField.setToolTipText("Number of Suggestions. Should be a decimal number only");

        jLabel3.setText("Number of Suggestions ");

        getSuggestions.setText("Get Suggestions");
        getSuggestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSuggestionsActionPerformed(evt);
            }
        });

        wrongInputMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wrongInputMessage.setForeground(new java.awt.Color(255, 0, 0));
        wrongInputMessage.setText("Wrong Input : Please enter the correct inputs");
        wrongInputMessage.setToolTipText("Wrong input Message");

        queryMessage.setForeground(new java.awt.Color(255, 0, 0));
        queryMessage.setText("Field is Empty");

        suggestionsMessage.setForeground(new java.awt.Color(255, 0, 0));
        suggestionsMessage.setText("Field is Empty");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberOfSuggestionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(queryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(queryMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(suggestionsMessage)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(wrongInputMessage)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(getSuggestions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetButton)
                                .addGap(66, 66, 66)))))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(queryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryMessage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numberOfSuggestionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suggestionsMessage))
                .addGap(26, 26, 26)
                .addComponent(wrongInputMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getSuggestions)
                    .addComponent(resetButton))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getSuggestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSuggestionsActionPerformed
        
        String numberOfSuggestions = numberOfSuggestionsTextField.getText();        
        String queryString = queryTextField.getText();        
        if(!isInputValidated(numberOfSuggestions,queryString )){            
            this.wrongInputMessage.setVisible(true);
            return;
        }
        removeAllErrorMessages();
        FindSuggestions findSuggestions = new FindSuggestions();
        findSuggestions.findResult(queryString, Integer.parseInt(numberOfSuggestions));       
    }//GEN-LAST:event_getSuggestionsActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        removeAllErrorMessages();
        this.numberOfSuggestionsTextField.setText("");
        this.queryTextField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void removeAllErrorMessages(){
        this.wrongInputMessage.setVisible(false);
        this.queryMessage.setVisible(false);
        this.suggestionsMessage.setVisible(false);
    }
    
    private boolean isInputValidated(String numberOfSuggestions, String queryString) {        
        if(queryString.equals("") ){
            this.queryMessage.setVisible(true);
        }
        
        if(numberOfSuggestions.equals("") ){
            this.suggestionsMessage.setVisible(true);
        }
        
        if(queryString.equals("") || numberOfSuggestions.equals("") ){
            return false;
        }
        for(int i=0;i<numberOfSuggestions.length();i++){
            if(numberOfSuggestions.charAt(i) < '0' || numberOfSuggestions.charAt(i) > '9' ){
                this.suggestionsMessage.setVisible(true);
                return false;
            }
        }        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getSuggestions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numberOfSuggestionsTextField;
    private javax.swing.JLabel queryMessage;
    private javax.swing.JTextField queryTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel suggestionsMessage;
    private javax.swing.JLabel wrongInputMessage;
    // End of variables declaration//GEN-END:variables

}
