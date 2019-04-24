
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class maintable extends javax.swing.JFrame {

    String id, name, age, department;

    Update up = new Update(this);

    public String idpass() {
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        id = model.getValueAt(index, 0).toString();
        return id;
    }

    public String namepass() {
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        name = model.getValueAt(index, 1).toString();
        return name;
    }

    public String agepass() {
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        age = model.getValueAt(index, 2).toString();
        return age;
    }

    public String departmentpass() {
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        department = model.getValueAt(index, 3).toString();
        return department;
    }

    public maintable() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        refreshboutton = new javax.swing.JButton();
        updateboutton = new javax.swing.JButton();
        deleteboutton = new javax.swing.JButton();
        addboutton = new javax.swing.JButton();
        exitboutton = new javax.swing.JButton();
        imessage = new javax.swing.JLabel();
        searchfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student List Of Daffodil International University");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID:", "Name:", "Age:", "Department:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        table1.setSelectionForeground(new java.awt.Color(204, 204, 255));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        refreshboutton.setText("Refresh");
        refreshboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbouttonActionPerformed(evt);
            }
        });

        updateboutton.setText("Update");
        updateboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebouttonActionPerformed(evt);
            }
        });

        deleteboutton.setText("Delete");
        deleteboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebouttonActionPerformed(evt);
            }
        });

        addboutton.setText("ADD");
        addboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbouttonActionPerformed(evt);
            }
        });

        exitboutton.setText("Exit");
        exitboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbouttonActionPerformed(evt);
            }
        });

        imessage.setForeground(new java.awt.Color(255, 0, 0));

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchfieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchfieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(refreshboutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateboutton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addComponent(deleteboutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addboutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(exitboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(imessage, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(refreshboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(updateboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(deleteboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(addboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(exitboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbouttonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitbouttonActionPerformed

    private void refreshbouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbouttonActionPerformed
        imessage.setText("");
        searchfield.setText("");
        table1.clearSelection();
        this.hide();
        this.show();
    }//GEN-LAST:event_refreshbouttonActionPerformed

    private void deletebouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebouttonActionPerformed
        imessage.setText("");
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        if (table1.getSelectedRow() == -1) {
            if (table1.getRowCount() == 0) {
                imessage.setText("Table is empty!!!!!!!");
            } else {
                imessage.setText("you must Select a row!!!!!!");
            }
        } else {
            model.removeRow(table1.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Delete Successfull!!!");
        }
    }//GEN-LAST:event_deletebouttonActionPerformed

    private void updatebouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebouttonActionPerformed
        imessage.setText("");

        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        if (table1.getSelectedRow() == -1) {
            if (table1.getRowCount() == 0) {
                imessage.setText("Table is empty!!!!!!!");
            } else {
                imessage.setText("you must Select a row!!!!!!");
            }
        } else {

            this.hide();
            up.show();
            up.idfield.setText(id);
            up.namefield.setText(name);
            up.agefield.setText(age);
            up.departmentcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{department, "CSE", "BBA", "Textile", "EEE"}));

        }
    }//GEN-LAST:event_updatebouttonActionPerformed

    private void addbouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbouttonActionPerformed
        ADD add = new ADD(this);
        imessage.setText("");

        add.show();
        this.hide();


    }//GEN-LAST:event_addbouttonActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        this.idpass();
        this.namepass();
        this.agepass();
        this.departmentpass();
    }//GEN-LAST:event_table1MouseClicked

    private void searchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyReleased

    }//GEN-LAST:event_searchfieldKeyReleased

    private void searchfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyPressed

        int cheak = 0;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          try {
              for (int i = 0; i < table1.getRowCount(); i++) {//For each row
                 for (int j = 0; j < 4; j++) {//For each column in that row
                     if (table1.getModel().getValueAt(i, j).equals(searchfield.getText())) 
                        {
                            cheak=1;
                            search sc=new search();
                              sc.show();
                          if (table1.getModel().getValueAt(i, j).equals(table1.getModel().getValueAt(i, 0))) 
                              {
                                //table1.setRowSelectionInterval(i,j);
                                  sc.idtext.setText((String) table1.getModel().getValueAt(i, j));
                                  sc.nametext.setText((String) table1.getModel().getValueAt(i, j+1));
                                  sc.agetext.setText((String) table1.getModel().getValueAt(i, j+2));
                                  sc.departmenttext.setText((String) table1.getModel().getValueAt(i, j+3));

                              }
                          if(table1.getModel().getValueAt(i, j).equals(table1.getModel().getValueAt(i, 1)))
                            {
                                sc.idtext.setText((String) table1.getModel().getValueAt(i, j-1));
                                sc.nametext.setText((String) table1.getModel().getValueAt(i, j));
                                sc.agetext.setText((String) table1.getModel().getValueAt(i, j+1));
                                sc.departmenttext.setText((String) table1.getModel().getValueAt(i, j+2));
                             }
                          if(table1.getModel().getValueAt(i, j).equals(table1.getModel().getValueAt(i, 2)))
                          {
                                sc.idtext.setText((String) table1.getModel().getValueAt(i, j-2));
                                sc.nametext.setText((String) table1.getModel().getValueAt(i, j-1));
                                 sc.agetext.setText((String) table1.getModel().getValueAt(i, j));
                                sc.departmenttext.setText((String) table1.getModel().getValueAt(i, j+1));
                            }
                        else
                          {
                                sc.idtext.setText((String) table1.getModel().getValueAt(i, j-3));
                                sc.nametext.setText((String) table1.getModel().getValueAt(i, j-2));
                                 sc.agetext.setText((String) table1.getModel().getValueAt(i, j-1));
                                sc.departmenttext.setText((String) table1.getModel().getValueAt(i, j));
                          }
                            
                  }
             }
         }
                if (cheak != 1) {
                    JOptionPane.showMessageDialog(null, "Not Found!!!");
                } 
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_searchfieldKeyPressed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

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
            java.util.logging.Logger.getLogger(maintable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maintable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maintable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maintable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maintable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addboutton;
    private javax.swing.JButton deleteboutton;
    private javax.swing.JButton exitboutton;
    private javax.swing.JLabel imessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshboutton;
    private javax.swing.JTextField searchfield;
    public javax.swing.JTable table1;
    private javax.swing.JButton updateboutton;
    // End of variables declaration//GEN-END:variables
}
