
import Project.ConnectionProvider;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HunTer
 */
public class updateProduct extends javax.swing.JFrame {

    /**
     * Creates new form addBuyers
     */
    public updateProduct() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ProductId = new javax.swing.JTextField();
        Rate = new javax.swing.JTextField();
        Active = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        update = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        Description = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 180));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update product ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 20, 330, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update product.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 560, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setText("Product ID: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel4.setText("Product Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel5.setText("Rate");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel6.setText("Description");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel7.setText("Activate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        ProductId.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ProductId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProductIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProductIdFocusLost(evt);
            }
        });
        ProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductIdActionPerformed(evt);
            }
        });
        getContentPane().add(ProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 206, -1));

        Rate.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Rate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RateFocusLost(evt);
            }
        });
        getContentPane().add(Rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 206, -1));

        Active.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Active.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ActiveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ActiveFocusLost(evt);
            }
        });
        getContentPane().add(Active, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 206, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 560, 10));

        update.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        Reset.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        Cancel.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 560, -1));

        Description.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Description.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DescriptionFocusLost(evt);
            }
        });
        getContentPane().add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 206, -1));

        ProductName.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ProductName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProductNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProductNameFocusLost(evt);
            }
        });
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });
        getContentPane().add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 206, -1));

        searchbtn.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbg.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductIdActionPerformed

    private void ProductIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductIdFocusGained
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_ProductIdFocusGained

    private void ProductIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductIdFocusLost
      
    }//GEN-LAST:event_ProductIdFocusLost

    private void RateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RateFocusGained
       
    }//GEN-LAST:event_RateFocusGained

    private void RateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RateFocusLost
      
        
    }//GEN-LAST:event_RateFocusLost

    private void ActiveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ActiveFocusGained
        
    }//GEN-LAST:event_ActiveFocusGained

    private void ActiveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ActiveFocusLost
        
    }//GEN-LAST:event_ActiveFocusLost

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateProduct().setVisible(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       
        String id=ProductId.getText();
        String productName=ProductName.getText();
        String productRate=Rate.getText();
        String productDescription=Description.getText();
        String active=Active.getText();
        
        
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("update product Set ProductName ='"+productName+"', ProductRate = '"+productRate+"',ProductDescription ='"+productDescription+"',Activate ='"+active+"' where Productid='"+id+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            setVisible(false);
            new updateProduct().setVisible(true);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
           
    }//GEN-LAST:event_updateActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formComponentShown

    private void DescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescriptionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionFocusGained

    private void DescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescriptionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionFocusLost

    private void ProductNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameFocusGained

    private void ProductNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameFocusLost

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        
        String productId=ProductId.getText();
        
       
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st =con.createStatement();
            ResultSet rs=st.executeQuery("Select* from product where Productid = '"+productId+"'");
            if(rs.next()){
            
            ProductName.setText(rs.getString(2));
            Rate.setText(rs.getString(3));
            Description.setText(rs.getString(4));
            Active.setText(rs.getString(5));
            ProductId.setEditable(false);
            
            }
            else{
            
                JOptionPane.showMessageDialog(null, "Product Not Exists!");
            
            }
            
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
            
        
    }//GEN-LAST:event_searchbtnActionPerformed

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
            java.util.logging.Logger.getLogger(addBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Active;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Description;
    private javax.swing.JTextField ProductId;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Rate;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}