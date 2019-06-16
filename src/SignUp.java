
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class SignUp extends javax.swing.JFrame {
    private static Login frame2 = null;
    //private static SignUp frame1 = new SignUp(frame2); 
    private static MyDBConnection mdbc;
    private static java.sql.Statement stmt;
    //private static SignUp frame1 = new SignUp();
    /**
     * Creates new form SignUp
     */
    
    public SignUp(Login frame) {
        frame2 = frame;
        try{
            mdbc = new MyDBConnection();
            mdbc.init();
            Connection conn=mdbc.getMyConnection();
            stmt= conn.createStatement(); 
        }catch (Exception e){}
        setTitle("HiTEA");
         initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        SignUp2 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Preference = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Username_text = new javax.swing.JTextField();
        Address_text = new javax.swing.JTextField();
        choices = new javax.swing.JComboBox();
        Phone_text = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Name_text = new javax.swing.JTextField();
        Password_text = new javax.swing.JPasswordField();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        SignUp2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SignUp2.setForeground(new java.awt.Color(153, 0, 255));
        SignUp2.setText("Sign Up");
        SignUp2.setToolTipText("");

        Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Password.setText("Password");

        Address.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Address.setText("Address");

        Username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Username.setText("Username");

        Preference.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Preference.setText("Preference Area");

        jLabel2.setText("(For Delivery)");

        Phone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Phone.setText("Phone");

        Username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_textActionPerformed(evt);
            }
        });

        choices.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01 金光华店", "02 万象城店", "03 Coco Park店", "04 万象天地店", " " }));

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Name.setText("Name");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(Username)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Preference))
                                .addGap(19, 19, 19))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Address_text, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(choices, 0, 0, Short.MAX_VALUE)
                            .addComponent(Phone_text)
                            .addComponent(Name_text)
                            .addComponent(Password_text))))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(SignUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(Confirm)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(SignUp2)
                .addGap(34, 34, 34)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Preference, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(choices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone)
                    .addComponent(Phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 378, Short.MAX_VALUE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jLayeredPane1.setLayer(SignUp2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Address, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Preference, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Phone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Username_text, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Address_text, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(choices, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Phone_text, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Clear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Confirm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Name_text, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Password_text, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_textActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        checkInfo();
    }//GEN-LAST:event_ConfirmActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        frame2.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        Password_text.setText("");
        Phone_text.setText("");
        Username_text.setText("");
        Address_text.setText("");
    }//GEN-LAST:event_ClearActionPerformed
    
    public void checkInfo(){
        if ( !((Password_text.getText().equals(""))|| (Phone.getText().equals("")) || (Username_text.getText().equals("")) || ( Address_text.getText().equals("")) || (Name_text.getText().equals("")))){
            if (Username_text.getText().length() > 6 || Password_text.getText().length() > 15){
                JOptionPane.showMessageDialog(
                        null,
                        "The length of username(characters <= 6) or password(characters <= 15) is too long  ",
                        "Failure!!",
                        JOptionPane.INFORMATION_MESSAGE);
                setVisible(true);
            }else{
                ResultSet rs = getResultFromCustomer(Username_text.getText());
                if(!isValid(rs)){
                    String insertStr="";
        
                    try{
                        insertStr = "Insert into `customer` VALUES (" + quotate(Username_text.getText()) + ", " + quotate(Name_text.getText()) + ", " + quotate(Password_text.getText()) +  ", " + quotate(Address_text.getText()) + ", " + quotate(choices.getSelectedItem().toString().substring(0, 2)) + ", " +  quotate(Phone_text.getText()) + ")";
                        int done = stmt.executeUpdate(insertStr);
                        JOptionPane.showMessageDialog(
                            null,
                            "Successfully register ",
                            "Success!!",
                            JOptionPane.INFORMATION_MESSAGE);
                        frame2.setVisible(true);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }else{
                    JOptionPane.showMessageDialog(
                        null,
                        "Username already existed. Please use another name ",
                        "Failure!!",
                        JOptionPane.INFORMATION_MESSAGE);
                    setVisible(true);
                }
            }       
        }else{
            JOptionPane.showMessageDialog(
                        null,
                        "Don't left blank.Please continue filling information ",
                        "Failure!!",
                        JOptionPane.INFORMATION_MESSAGE);
                setVisible(true);
        }
    }
    
    public ResultSet getResultFromCustomer(String username) {
        
        ResultSet rs=null;
        try{
            String SQLStatement = "Select * from customer where customerID" + " = " + quotate(username) + ";";
            rs = stmt.executeQuery(SQLStatement);
        }catch(SQLException e){}
        
        return rs;
        
    }
    
    public String quotate(String content){
    
        return "'"+content+"'";
    }
    
    public boolean isValid(ResultSet rs){
            boolean Isvalid = true;
            try{
                if(rs.next()){
                   Isvalid = true;  //already exist
                }else{
                   Isvalid = false; //not exist
                }
            }catch(SQLException e){}
            return Isvalid;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextField Address_text;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField Name_text;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Password_text;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField Phone_text;
    private javax.swing.JLabel Preference;
    private javax.swing.JLabel SignUp2;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField Username_text;
    private javax.swing.JComboBox choices;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
