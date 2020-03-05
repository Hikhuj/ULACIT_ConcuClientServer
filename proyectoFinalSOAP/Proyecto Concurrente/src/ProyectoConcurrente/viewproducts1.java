/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoConcurrente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sharma1
 */
public class viewproducts1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewemployee
     */
    public viewproducts1() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Products");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items", "Company", "Sub Category", "Rate/Piece in Rupees", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 970, 470);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Products Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 30, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("By Company");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 90, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Company" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 80, 140, 30);

        setBounds(0, 0, 1025, 656);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        String path = "jdbc:mysql://localhost/";
        String place = "factorydb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "select distinct(category) from products";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                ResultSet myresult = mystatement.executeQuery();
                if (myresult.next()) {
                    do {
                        jComboBox1.addItem(myresult.getString(1));
                    } while (myresult.next());
                }
                mystatement.close();
                myconnection.close();

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Error in query " + ae.getMessage());
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error in connection " + ae.getMessage());
        }

    }//GEN-LAST:event_formInternalFrameActivated

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String path = "jdbc:mysql://localhost/";
        String place = "factorydb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            String item, category, subcategory, rates, quantity;
            try {
                String q = "select * from products where category=?";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1, jComboBox1.getSelectedItem().toString());
                DefaultTableModel mymodel = (DefaultTableModel) jTable1.getModel();
                ResultSet myresult = mystatement.executeQuery();
                mymodel.setRowCount(0);
                if (myresult.next()) {
                    do {
                        item = myresult.getString("items");
                        category = myresult.getString("category");
                        subcategory = myresult.getString("subcategory");
                        rates = myresult.getString("rates");
                        quantity = myresult.getString("quantity");
                        mymodel.addRow(new Object[]{item, category, subcategory, rates, quantity});
                    } while (myresult.next());
                }
                mystatement.close();
                myconnection.close();

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "No records exist");
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error in connection" + ae.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}