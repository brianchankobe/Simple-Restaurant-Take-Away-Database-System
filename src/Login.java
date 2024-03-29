
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class Login extends javax.swing.JFrame {
    private static Login frame = new Login();
    private static SignUp frame1 = new SignUp(frame);
    private static MyDBConnection mdbc;
    private static java.sql.Statement stmt;

    /**
     * Creates new form Login
     */
    public Login(){
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

        jLayeredPane2 = new javax.swing.JLayeredPane();
        Title = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        username_text = new javax.swing.JTextField();
        password_text = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        SignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(102, 51, 255));
        Title.setText("Welcome to HiTEA");

        Username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Username.setText("Username");

        Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Password.setText("Password");

        username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        SignUp.setText("SignUp");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_text)
                            .addComponent(password_text, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Login)
                        .addGap(46, 46, 46)
                        .addComponent(SignUp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Title)
                .addGap(44, 44, 44)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane2.setLayer(Title, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Title.getAccessibleContext().setAccessibleName("Title");
        jLayeredPane2.setLayer(Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(username_text, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(password_text, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(SignUp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_textActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        frame.setVisible(false);
        checkIn();
    }//GEN-LAST:event_LoginActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
        frame.setVisible(false);
        frame1.setVisible(true);
    }//GEN-LAST:event_SignUpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mdbc = new MyDBConnection();
                    mdbc.init();
                    Connection conn=mdbc.getMyConnection();
                    stmt= conn.createStatement();
                    frame.setVisible(true);
                    frame.setTitle("HiTEA");		
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
        });
    }
    
        public void checkIn(){
            //!null --> successfully login   
            ResultSet rs = getResultFromCustomer(username_text.getText(), password_text.getText());  
            boolean Isvalid = true;
            try{
                if(rs.next()){
                   Isvalid = true;
                }else{
                    Isvalid = false;
                }
            }catch(SQLException e){}
                    
            if (Isvalid){
                JOptionPane.showMessageDialog(
                        null,
                        "Successfully Login ! ",
                        "Success !!",
                        JOptionPane.INFORMATION_MESSAGE);
                new order(frame).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(
                        null,
                        "Wrong username or password or no registration try again ! ",
                        "Failure !!",
                        JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(true);
            }
        }
    
        
    public ResultSet getResultFromCustomer(String username, String password) {
        
        ResultSet rs=null;
        try{
            String SQLStatement = "Select * from customer where customerID" + " = " + quotate(username) + " and " + "Password" + " = " + quotate(password) + ";";
            rs = stmt.executeQuery(SQLStatement);
        }catch(SQLException e){}
        
        return rs;
        
    }
    public String quotate(String content){
    
        return "'"+content+"'";
    }
    
    public String getUsername(){
        return username_text.getText();
    }
    
    public void clear(){
        username_text.setText("");
        password_text.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel Password;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Username;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}
