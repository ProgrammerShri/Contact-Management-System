/*
 * EditCustomer.java
 *
 * Created on 18 April, 2010, 9:18 PM
 */
package com.contactReport.frame;

import com.contactReport.bean.Contact;
import com.contactReport.common.CommonHelper;
import com.contactReport.connection.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicBorders.MarginBorder;

/**
 *
 * @author  Sudipta
 */
public class EditContact extends javax.swing.JFrame {

    /** Creates new form EditCustomer */
    public EditContact() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Edit Contact Details");
        bindGroupName();
        bindCustomerid();
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        CommonHelper.setFrameInCenter(this);
        setDefaultLookAndFeelDecorated(true);
        // lstCName.setVisible(false);
        pnlList.setVisible(false);
         btnShowByPone.setEnabled(false);
        //this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        // tblContactName.setTableHeader(null);
        // tblContactName.setVisible(false);
        pack();
    }

    private void bindGroupName() {
        try {
            String sql = "select * from tblgroup";
            ArrayList groupList = DBConnection.getGroupNameList(sql);
            String[] groupName = new String[groupList.size()];
            for (int i = 0; i < groupList.size(); i++) {
                groupName[i] = (String) groupList.get(i);
                cmbGroupName.addItem(groupName[i]);
            }
        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbContactid = new javax.swing.JComboBox();
        txtContactName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cmbGroupName = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnShow = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnShowByPone = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstCName = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Edit Contact Details");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Contact Id");

        txtContactName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                handlesearchContact(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                handleCustomerNameList(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Contact Name");

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Phone");

        txtAddress.setColumns(10);
        txtAddress.setRows(3);
        jScrollPane1.setViewportView(txtAddress);

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("E-Mail");

        cmbGroupName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Group Name");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnShow.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        btnShow.setForeground(new java.awt.Color(102, 0, 51));
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowhandelShowDetails(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        btnDelete.setForeground(new java.awt.Color(102, 0, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletehandelDeleteCustomer(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        btnEdit.setForeground(new java.awt.Color(102, 0, 51));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdithandelEditCustomer(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 0, 51));
        btnCancel.setText("Close");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelhandelCancel(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnShowByPone.setText("Show");
        btnShowByPone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleShowByPhone(evt);
            }
        });

        lstCName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                handleContactListByContactName(evt);
            }
        });
        jScrollPane3.setViewportView(lstCName);

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
            .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlListLayout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cmbGroupName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContactName, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(cmbContactid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowByPone)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLabel1)))
                    .addGap(43, 43, 43)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(cmbContactid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(pnlList, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowByPone)
                            .addComponent(jLabel9))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addContainerGap(442, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowhandelShowDetails(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowhandelShowDetails
        // TODO add your handling code here:
        String sql = "select * from contactInformation where contactid=" + cmbContactid.getSelectedItem().toString() + "";
        showCustomerDetails(sql);
        // btnEdit.setEnabled(true);
        // btnDelete.setEnabled(true);
}//GEN-LAST:event_btnShowhandelShowDetails

    private void btnDeletehandelDeleteCustomer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletehandelDeleteCustomer
        // TODO add your handling code here:
        int s = JOptionPane.showConfirmDialog(null, "Are you really want to delete this selected customer");
        if (s == 0) {
            String sql = "delete from contactInformation where contactid=" + cmbContactid.getSelectedItem().toString() + "";
            try {
                int i = DBConnection.updateRecordsy(sql);
                JOptionPane.showMessageDialog(null, "One Record Delete !! ");
                btnEdit.setEnabled(false);
                btnDelete.setEnabled(false);
            } catch (Exception ex) {
                System.out.println("Exception " + ex);
            }
            cmbContactid.removeAllItems();
            txtContactName.setText("");
            txtAddress.setText("");
            txtPhone.setText("");
            bindCustomerid();
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
        }
}//GEN-LAST:event_btnDeletehandelDeleteCustomer

    private void btnEdithandelEditCustomer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdithandelEditCustomer
        // TODO add your handling code here:
        int s = JOptionPane.showConfirmDialog(null, "Are you really want to edit this selected customer");
        if (s == 0) {
            String sql = "update contactInformation set contactname='" + txtContactName.getText().toString() + "'"
                    + ",address='" + txtAddress.getText().toString() + "',phone='" + txtPhone.getText().toString() + "'"
                    + ",email='" + txtEmail.getText().toString() + "',groupname='" + cmbGroupName.getSelectedItem().toString() + "' where contactid=" + cmbContactid.getSelectedItem().toString() + "";
            try {

                if (!CommonHelper.isStringEmptyOrNull(txtContactName.getText()) && !CommonHelper.isStringEmptyOrNull(txtAddress.getText())) {
                    int i = DBConnection.updateRecordsy(sql);
                } else {
                    JOptionPane.showMessageDialog(null, "Contact Name and Address Can not be Blank");
                }

            } catch (Exception ex) {
                System.out.println("Exception " + ex);
            }
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
        }
}//GEN-LAST:event_btnEdithandelEditCustomer

    private void btnCancelhandelCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelhandelCancel
        // TODO add your handling code here:
        MainWindow mw = new MainWindow();
        bindCustomerid();
        mw.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_btnCancelhandelCancel

    private void handlesearchContact(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_handlesearchContact
        // TODO add your handling code here:
        //       Vector heading=new Vector();
        //      String name=txtContactName.getText()+"%";
        //      System.out.println(name);
        //   String sql="select * from contactInformation where contactname like '" + name + "'";

        /*  try{
        String[][] contactnameList=DBConnection.getContactNameList(sql);
        tblContactName.setModel(new javax.swing.table.DefaultTableModel(contactnameList,heading.toArray() ));
        //  tblContactName.setVisible(true);
        }
        catch(Exception e)
        {

        }*/
    }//GEN-LAST:event_handlesearchContact

    private void handleCustomerNameList(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_handleCustomerNameList
        // TODO add your handling code here:
        Vector heading = new Vector();
        String name = txtContactName.getText() + "%";
      //  System.out.println(name);
        String sql = "select contactname from contactInformation where contactname like '" + name + "'";

        try {
            String[] contactnameList = DBConnection.getContactNameList(sql);
            // tblContactName.setModel(new javax.swing.table.DefaultTableModel(contactnameList,heading.toArray() ));
            lstCName.setListData(contactnameList);
            lstCName.setVisible(true);
            pnlList.setVisible(true);
            //  tblContactName.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_handleCustomerNameList

    private void handleContactListByContactName(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_handleContactListByContactName
        // TODO add your handling code here:
        String contactName = lstCName.getSelectedValue().toString();
      //  System.out.println("Name : " + contactName);
        String sql = "select * from contactInformation where contactname='" + contactName + "'";
        showCustomerDetails(sql);
        btnShowByPone.setEnabled(true);



    }//GEN-LAST:event_handleContactListByContactName

    private void handleShowByPhone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleShowByPhone
        // TODO add your handling code here:
        String sql = "select * from contactInformation where contactname='" + lstCName.getSelectedValue().toString() + "' and phone='" + txtPhone.getText() + "'";
        showCustomerDetails(sql);
        pnlList.setVisible(false);
    }//GEN-LAST:event_handleShowByPhone

    private void bindCustomerid() {
        try {
            String sql = "select * from contactInformation";
            ArrayList contactIdList = DBConnection.getRecordsList(sql);
            String[] customerId = new String[contactIdList.size()];
            for (int i = 0; i < contactIdList.size(); i++) {
                customerId[i] = (String) contactIdList.get(i);
                cmbContactid.addItem(customerId[i]);
            }
        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }
    }

    /*    private void showCustomerDetails() {
    String sql = "select * from contactInformation where contactid=" + cmbContactid.getSelectedItem().toString() + "";
    // showCustomer(sql);
    }
     */
    private void showCustomerDetails(String sql) {
        try {
            List contactList = DBConnection.getContactList(sql);
            if(contactList.size()>0)
            {
            Contact contact = (Contact) contactList.get(0);
            cmbContactid.setSelectedItem(contact.getContactid());
            txtContactName.setText(contact.getContactname());
            txtAddress.setText(contact.getAddress());
            txtPhone.setText(contact.getPhone());
            txtEmail.setText(contact.getEmail());
            cmbGroupName.setSelectedItem(contact.getGroupname());
            btnEdit.setEnabled(true);
            btnDelete.setEnabled(true);
            }
            else
            {
            cmbContactid.setSelectedItem("");
            txtContactName.setText("");
            txtAddress.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            cmbGroupName.setSelectedItem("");
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
            }

        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EditContact().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnShowByPone;
    private javax.swing.JComboBox cmbContactid;
    private javax.swing.JComboBox cmbGroupName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList lstCName;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContactName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}