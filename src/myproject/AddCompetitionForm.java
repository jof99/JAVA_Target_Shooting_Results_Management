/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myproject;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import myproject.newstuff.GameManager;

/**
 *
 * @author Joel
 */
public class AddCompetitionForm extends javax.swing.JFrame {

    /**
     * Creates new form AddCompetition
     */
    public AddCompetitionForm() {
        initComponents();
    }
    public JComboBox getGamesComboBox() { 
       return gamesComboBox;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addCompetitionTitle = new javax.swing.JLabel();
        competitionNameLabel = new javax.swing.JLabel();
        distanceLabel = new javax.swing.JLabel();
        competitionNameTextField = new javax.swing.JTextField();
        distanceTextField = new javax.swing.JTextField();
        shotsLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        shotsTextField = new javax.swing.JTextField();
        timeSpinner = new javax.swing.JSpinner();
        addCompetitionButton = new javax.swing.JButton();
        cancelCompetitionFormButton = new javax.swing.JButton();
        gamesComboBox = new javax.swing.JComboBox<>();
        gamesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        addCompetitionTitle.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        addCompetitionTitle.setText("ADD COMPETITION");

        competitionNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        competitionNameLabel.setText("COMPETITION NAME");

        distanceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        distanceLabel.setText("DISTANCE");

        shotsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shotsLabel.setText("SHOTS");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timeLabel.setText("TIME");

        timeSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        addCompetitionButton.setText("Add");
        addCompetitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCompetitionButtonActionPerformed(evt);
            }
        });

        cancelCompetitionFormButton.setText("Cancel");
        cancelCompetitionFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCompetitionFormButtonActionPerformed(evt);
            }
        });

        gamesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(GameManager.getSingleton().getGameNames()));

        gamesLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gamesLabel.setText("GAMES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamesLabel)
                            .addComponent(timeLabel)
                            .addComponent(shotsLabel)
                            .addComponent(distanceLabel)
                            .addComponent(competitionNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addCompetitionButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelCompetitionFormButton))
                            .addComponent(distanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(competitionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shotsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gamesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(addCompetitionTitle)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(addCompetitionTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(competitionNameLabel)
                    .addComponent(competitionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distanceLabel)
                    .addComponent(distanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shotsLabel)
                    .addComponent(shotsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(timeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamesLabel)
                    .addComponent(gamesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCompetitionButton)
                    .addComponent(cancelCompetitionFormButton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCompetitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCompetitionButtonActionPerformed
        
        if(!GameManager.getSingleton().doesCompetitionExist(competitionNameTextField.getText())) {
            String competitionName = competitionNameTextField.getText();
        String distance =distanceTextField.getText();
        String shots = shotsTextField.getText();
        int timeHours = Integer.valueOf(timeSpinner.getValue().toString());
        
        
        String selectGame = (String) gamesComboBox.getSelectedItem();
        int selectedGameId = GameManager.getSingleton().getIdForGameName(selectGame);
        System.out.println(selectedGameId);
        
        
        GameManager.getSingleton().InsertDeleteUpdateCompetitor('i', null, competitionName, distance, shots,timeHours,selectedGameId);
        
        
        
        try { 
            ManageCompetitionsForm.competitionsTable.setModel(new DefaultTableModel(null, new Object[]{"Id","Compeitition Name","Distance","Shots","Time"}));
        GameManager.getSingleton().populateCompetitionJtable(ManageCompetitionsForm.competitionsTable);
        } catch (Exception ex) { 
            System.out.println(ex.getMessage());
        }
        
        } else { 
            JOptionPane.showMessageDialog(null, "Competition Already Exists");
        }
        
        
        
    }//GEN-LAST:event_addCompetitionButtonActionPerformed

    private void cancelCompetitionFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCompetitionFormButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelCompetitionFormButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddCompetitionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCompetitionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCompetitionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCompetitionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCompetitionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCompetitionButton;
    private javax.swing.JLabel addCompetitionTitle;
    private javax.swing.JButton cancelCompetitionFormButton;
    private javax.swing.JLabel competitionNameLabel;
    private javax.swing.JTextField competitionNameTextField;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JTextField distanceTextField;
    private javax.swing.JComboBox<String> gamesComboBox;
    private javax.swing.JLabel gamesLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel shotsLabel;
    private javax.swing.JTextField shotsTextField;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JSpinner timeSpinner;
    // End of variables declaration//GEN-END:variables
}