/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evm;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author kamal
 */
public class Registration_page extends javax.swing.JFrame {
PreparedStatement ps;
Connection con;
ResultSet rs;


    /**
     * Creates new form Registration_page
     */
    public Registration_page() {
        initComponents();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","11113112");
         }
        catch(ClassNotFoundException | SQLException e)
                {
                  JOptionPane.showMessageDialog(this,e);
                }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aadhaar_number = new javax.swing.JTextField();
        person_name = new javax.swing.JTextField();
        person_address = new javax.swing.JTextField();
        contact_number = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        Upload_image = new javax.swing.JButton();
        Upload_thumbimpression = new javax.swing.JButton();
        Submit_button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("   VOTING REGISTRARTION");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Aadhaar Number");

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Address as per Adhaar Card");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Contact number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Date of Birth");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Photo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Thumb Impression");

        aadhaar_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aadhaar_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaar_numberActionPerformed(evt);
            }
        });

        person_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        person_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        person_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_addressActionPerformed(evt);
            }
        });

        contact_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contact_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_numberActionPerformed(evt);
            }
        });

        dob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        Upload_image.setBackground(new java.awt.Color(153, 255, 255));
        Upload_image.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Upload_image.setText("Upload");
        Upload_image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Upload_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upload_imageActionPerformed(evt);
            }
        });

        Upload_thumbimpression.setBackground(new java.awt.Color(153, 255, 255));
        Upload_thumbimpression.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Upload_thumbimpression.setText("Upload Thumb Impression");
        Upload_thumbimpression.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Upload_thumbimpression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upload_thumbimpressionActionPerformed(evt);
            }
        });

        Submit_button.setText("Submit");
        Submit_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Submit_button.setBorderPainted(false);
        Submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DD-MM-YYYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(420, 420, 420))))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel8)
                .addGap(132, 132, 132)
                .addComponent(Upload_thumbimpression)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(name)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(person_name, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addComponent(aadhaar_number)
                        .addComponent(person_address)
                        .addComponent(contact_number)
                        .addComponent(dob))
                    .addComponent(Upload_image)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aadhaar_number, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(person_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(person_address))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contact_number)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Upload_image))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Upload_thumbimpression))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(Submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private ImageIcon ResizeImage(String Imagepath)//Imageicon is a predefined method in java responsible for the image storing and getting//
{
  ImageIcon I1 = new ImageIcon(Imagepath);
  Image img = I1.getImage();
  Image i = img.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
  ImageIcon I11 = new ImageIcon(i);
  return(I11);
  // this funcation is responsible to get the path and the size of the image and returning or showing the image in the same size//
  
}
    private void Upload_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upload_imageActionPerformed
            // TODO add your handling code here:
            JFileChooser f= new JFileChooser();
            f.showOpenDialog(null);
            File f1 = f.getSelectedFile();
            String FileName = f1.getPath();
            jLabel9.setText(FileName);
            jLabel10.setIcon(ResizeImage(jLabel9.getText()));//get image from upload and represent it onto the panel right beside it//
            
            
    }//GEN-LAST:event_Upload_imageActionPerformed

    private void Upload_thumbimpressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upload_thumbimpressionActionPerformed
                        // TODO add your handling code here:
    }//GEN-LAST:event_Upload_thumbimpressionActionPerformed

    private void aadhaar_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaar_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaar_numberActionPerformed

    private void Submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_buttonActionPerformed
        // TODO add your handling code here:
        if(aadhaar_number.getText().equals("") || person_name.getText().equals("") || jLabel9.getText().equals("") || contact_number.getText().equals("") || dob.getText().equals("") || person_address.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }
        else
        {
            
        try{
            String Anumber=aadhaar_number.getText();
            String Name=person_name.getText();
            String Add=person_address.getText();
            String Cnumber=contact_number.getText();
            String DOB=dob.getText();
            String Pic=jLabel9.getText(); 
            //jTextField1.getText().equals(""); this is used to check if the textfield is empty or not and trim function cannot be used which is responsible to NOT STORE ANY BLANK SPACE IN THE DATABASE//
                    
            ps=con.prepareStatement("select * from Registration where Adhaar_number = ?");
            ps.setString(1,aadhaar_number.getText());
            rs = ps.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Adhaar number already exists.");
            }
            else{
                ps = con.prepareStatement("insert into Registration values(?,?,?,?,?,?)");
                ps.setString(1,Anumber);
                ps.setString(2,Name);
                ps.setString(3,Add);
                ps.setString(4,Cnumber);
                ps.setString(5,DOB);
                ps.setString(6,Pic);
                ps.executeUpdate();
                Voting_page v= new Voting_page();
                v.setVisible(true);
                this.setVisible(false);
                
            }
        }
        
        catch(SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_Submit_buttonActionPerformed
    }
    private void person_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_person_addressActionPerformed

    private void contact_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_numberActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registration_page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit_button;
    private javax.swing.JButton Upload_image;
    private javax.swing.JButton Upload_thumbimpression;
    private javax.swing.JTextField aadhaar_number;
    private javax.swing.JTextField contact_number;
    private javax.swing.JTextField dob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel name;
    private javax.swing.JTextField person_address;
    private javax.swing.JTextField person_name;
    // End of variables declaration//GEN-END:variables
}
