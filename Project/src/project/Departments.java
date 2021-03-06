package project;

import java.util.Enumeration;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Departments extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Departments() {
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

        genderButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mHome = new javax.swing.JMenu();
        mEmployees = new javax.swing.JMenu();
        mDepartments = new javax.swing.JMenu();
        mAssignments = new javax.swing.JMenu();
        mPayroll = new javax.swing.JMenu();
        mClose = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(97, 102, 255));

        titleLabel.setFont(new java.awt.Font("Vrinda", 1, 36)); // NOI18N
        titleLabel.setText("Google HR");

        errorLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/google-logo-black-1920-300x622 blue G.jpg"))); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("It’s really the people that make Google the kind of company it is. We hire people who are smart and determined, and we favor ability over experience. Although Googlers share common goals and visions for the company, we hail from all walks of life and speak dozens of languages, reflecting the global audience that we serve. And when not at work, Googlers pursue interests ranging from cycling to beekeeping, from frisbee to foxtrot.  We strive to maintain the open culture often associated with startups, in which everyone is a hands-on contributor and feels comfortable sharing ideas and opinions. In our weekly all-hands (“TGIF”) meetings—not to mention over email or in the cafe—Googlers ask questions directly to Larry, Sergey and other execs about any number of company issues. Our offices and cafes are designed to encourage interactions between Googlers within and across teams, and to spark conversation about work as well as play.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        mHome.setText("Home");
        jMenuBar1.add(mHome);

        mEmployees.setText("Employees");
        mEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mEmployeesMouseClicked(evt);
            }
        });
        jMenuBar1.add(mEmployees);

        mDepartments.setText("Departments");
        mDepartments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mDepartmentsMouseClicked(evt);
            }
        });
        jMenuBar1.add(mDepartments);

        mAssignments.setText("Assignments");
        mAssignments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mAssignmentsMouseClicked(evt);
            }
        });
        jMenuBar1.add(mAssignments);

        mPayroll.setText("Payroll");
        jMenuBar1.add(mPayroll);

        mClose.setText("Close");
        mClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mCloseMouseClicked(evt);
            }
        });
        jMenuBar1.add(mClose);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //click on close in menu
    private void mCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mCloseMouseClicked
        //Project.writefiles();
        dispose();
        
        //System.exit(0);
    }//GEN-LAST:event_mCloseMouseClicked
    
    //click on Employee in menu
    private void mEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mEmployeesMouseClicked
        new Employee().setVisible(true);
        dispose();
    }//GEN-LAST:event_mEmployeesMouseClicked

        //click on Departments in menu
    private void mDepartmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mDepartmentsMouseClicked
        new Departments().setVisible(true);
        dispose();
    }//GEN-LAST:event_mDepartmentsMouseClicked

        //click on Assignments in menu
    private void mAssignmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mAssignmentsMouseClicked
        new Assignments().setVisible(true);
        dispose();
    }//GEN-LAST:event_mAssignmentsMouseClicked

    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) 
        {
            
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return "";
    }
    
    //private String getSelectedComboBoxText()
    //{
    //     = position.nextElement();
    //    if (position.isSelected()){
    //      return position.getText();
    //    }
    //}
    
    private Boolean verifyAlpha(String value) 
    { 
        // matches method examples on page 616 of text
        return value.matches("[a-zA-Z]*");
    }
    
    private Boolean verifyNum(String value) 
    { 
        // matches method examples on page 616 of text
        if (value.matches("\\d{10}")) 
            return true;
        else if(value.matches("\\d{9}")) 
            return true;
        else if(value.matches("\\d{7}")) 
            return true;
        else return false;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Departments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Departments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Departments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Departments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Departments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu mAssignments;
    private javax.swing.JMenu mClose;
    private javax.swing.JMenu mDepartments;
    private javax.swing.JMenu mEmployees;
    private javax.swing.JMenu mHome;
    private javax.swing.JMenu mPayroll;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}