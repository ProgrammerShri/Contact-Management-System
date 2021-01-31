/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddGroup.java
 *
 * Created on Jun 20, 2010, 9:07:01 AM
 */

package com.contactReport.frame;

import com.contactReport.common.CommonHelper;
import com.contactReport.connection.DBConnection;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author COMP5
 */
public class AddGroup extends javax.swing.JFrame {

    /** Creates new form AddGroup */
    public AddGroup() {
        initComponents();
        CommonHelper.setFrameInCenter(this);
        setDefaultLookAndFeelDecorated(true);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGroupId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGroupName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Add New Group");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Group Id");

        txtGroupId.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Group Name");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Description");

        txtDescription.setColumns(10);
        txtDescription.setRows(3);
        jScrollPane1.setViewportView(txtDescription);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnNew.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(102, 0, 51));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewhandelNew(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(102, 0, 51));
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavehandelSave(evt);
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
                .addContainerGap()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(txtGroupName)
                    .addComponent(txtGroupId, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnNewhandelNew(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewhandelNew
        // TODO add your handling code here:
        txtGroupId.setText("");
        txtGroupName.setText("");
        txtDescription.setText("");
       
        String sql = "select max(groupid) from tblgroup";
        try {
            String contactid = DBConnection.getRecord(sql);
            if (contactid == null) {
                contactid = "0";
            }
            int cid = Integer.parseInt(contactid) + 1;
            txtGroupId.setText(String.valueOf(cid));
            btnSave.setEnabled(true);
        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }
}//GEN-LAST:event_btnNewhandelNew

    private void btnSavehandelSave(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavehandelSave
        // TODO add your handling code here:
        int s = JOptionPane.showConfirmDialog(null, "Are you really want to Save this Records");
        if (s == 0) {
            try {
                String sql = "insert into tblgroup (groupid,groupname,description) "
                        + "values ('" + txtGroupId.getText().toString() + "',"
                        + "'" + txtGroupName.getText().toString() + "','" + txtDescription.getText().toString() + "')";
                if (!CommonHelper.isStringEmptyOrNull(txtGroupName.getText())) {
                    boolean status = DBConnection.insertRecord(sql);

                    //System.out.println("Status: "+status);
                    if (status) {
                        JOptionPane.showMessageDialog(null, "One Record Save !! ");
                        btnSave.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Record Not Save !! ");
                        btnSave.setEnabled(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Group Name Can not be Blank");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Exception " + ex);
            }
        }

    }//GEN-LAST:event_btnSavehandelSave

    private void btnCancelhandelCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelhandelCancel
        // TODO add your handling code here:
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_btnCancelhandelCancel

    /**
    * @param args the command line arguments
    */
 /*   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGroup().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtGroupId;
    private javax.swing.JTextField txtGroupName;
    // End of variables declaration//GEN-END:variables

}