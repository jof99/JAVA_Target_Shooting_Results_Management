/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myproject;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import myproject.newstuff.Competitor;
import myproject.newstuff.GameManager;
import myproject.newstuff.SomeTest;
import myproject.newstuff.CompetitionPair;

/**
 *
 * @author Joel
 */
public class ManageCompetitionsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageCompetitionsForm
     */
    
   
    public ManageCompetitionsForm() {
        initComponents();
        
        GameManager.getSingleton().populateCompetitionJtable(competitionsTable);
        competitionsTable.setRowHeight(40);
        competitionsTable.setShowGrid(true);
        competitionsTable.setSelectionBackground(Color.BLUE);
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
        nameLabel = new javax.swing.JLabel();
        distanceLabel = new javax.swing.JLabel();
        shotsLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        manageCompetitionsTitle = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        distanceTextField = new javax.swing.JTextField();
        shotsTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        competitionsTable = new javax.swing.JTable();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        addCompetitionButton = new javax.swing.JButton();
        removeCompetitionButton = new javax.swing.JButton();
        editCompetitionButton = new javax.swing.JButton();
        exitManageCompetitionForm = new javax.swing.JButton();
        timeTextField = new javax.swing.JSpinner();
        gameIdLabel = new javax.swing.JLabel();
        gameIdComboBox = new javax.swing.JComboBox<>();
        generateLeagueButton = new javax.swing.JButton();
        person1Label = new javax.swing.JLabel();
        person2Label = new javax.swing.JLabel();
        person1IDTextField = new javax.swing.JTextField();
        person2IDTextField = new javax.swing.JTextField();
        score1Label = new javax.swing.JLabel();
        score2Label = new javax.swing.JLabel();
        score1TextField = new javax.swing.JTextField();
        score2TextField = new javax.swing.JTextField();
        addScoreButton = new javax.swing.JButton();
        weeksComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pairsTable = new javax.swing.JTable();
        showResultButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLabel.setText("NAME");

        distanceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        distanceLabel.setText("DISTANCE");

        shotsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shotsLabel.setText("SHOTS");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timeLabel.setText("TIME");

        manageCompetitionsTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manageCompetitionsTitle.setText("MANAGE COMPETITIONS");

        nameTextField.setEditable(false);

        distanceTextField.setEditable(false);

        shotsTextField.setEditable(false);

        competitionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Distance", "Shots", "Time"
            }
        ));
        competitionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                competitionsTableMouseClicked(evt);
            }
        });
        competitionsTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                competitionsTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(competitionsTable);

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idLabel.setText("ID");

        idTextField.setEditable(false);
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        addCompetitionButton.setText("Add");
        addCompetitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCompetitionButtonActionPerformed(evt);
            }
        });

        removeCompetitionButton.setText("Remove");
        removeCompetitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCompetitionButtonActionPerformed(evt);
            }
        });

        editCompetitionButton.setText("Edit");
        editCompetitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCompetitionButtonActionPerformed(evt);
            }
        });

        exitManageCompetitionForm.setText("Exit");
        exitManageCompetitionForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitManageCompetitionFormActionPerformed(evt);
            }
        });

        timeTextField.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        gameIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gameIdLabel.setText("GAME ID");

        gameIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(GameManager.getSingleton().getGameNames()));
        gameIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameIdComboBoxActionPerformed(evt);
            }
        });

        generateLeagueButton.setText("Start Competition");
        generateLeagueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateLeagueButtonActionPerformed(evt);
            }
        });

        person1Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        person1Label.setText("PERSON 1 ID");

        person2Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        person2Label.setText("PERSON 2 ID");

        person1IDTextField.setEditable(false);

        person2IDTextField.setEditable(false);

        score1Label.setText("SCORE 1");

        score2Label.setText("SCORE 2");

        addScoreButton.setText("Add");
        addScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScoreButtonActionPerformed(evt);
            }
        });

        weeksComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3"}));
        weeksComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeksComboBoxActionPerformed(evt);
            }
        });

        pairsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "LeagueID", "Comp. 1 Name", "Comp. 2 Name", "Comp. 1 ID (Week 1)", "Comp. 2 ID (Week 1)", "Comp. 1 ID (Week 2)", "Comp. 2 ID (Week 2)", "Comp. 1 ID (Finals)", "Comp.  2 ID (Finals)"
            }
        ));
        pairsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pairsTableMouseClicked(evt);
            }
        });
        pairsTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pairsTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(pairsTable);

        showResultButton.setText("Show Result");
        showResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("WEEK:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DISPLAY COMPETITIONS TABLE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("DISPLAY COMPETITOR PAIRS TABLE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(distanceLabel)
                                        .addComponent(shotsLabel)
                                        .addComponent(timeLabel)
                                        .addComponent(nameLabel)
                                        .addComponent(idLabel)
                                        .addComponent(gameIdLabel)))
                                .addComponent(person1Label, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(gameIdComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(timeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(distanceTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(shotsTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(addScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(score2Label)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(score2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(generateLeagueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(editCompetitionButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(exitManageCompetitionForm))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(addCompetitionButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(removeCompetitionButton))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(weeksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(969, 969, 969))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(person1IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(score1Label)
                                .addGap(18, 18, 18)
                                .addComponent(score1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1208, 1208, 1208))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(person2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(person2IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageCompetitionsTitle)
                .addGap(627, 627, 627))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(manageCompetitionsTitle)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generateLeagueButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameLabel)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(distanceLabel)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(distanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editCompetitionButton)
                                        .addComponent(exitManageCompetitionForm)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(shotsLabel)
                                    .addComponent(shotsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(timeLabel)
                                    .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addCompetitionButton)
                                    .addComponent(removeCompetitionButton))
                                .addGap(120, 120, 120))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameIdLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(weeksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(person1IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score1Label)
                            .addComponent(person1Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(person2Label)
                            .addComponent(person2IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score2Label)
                            .addComponent(score2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showResultButton)
                            .addComponent(addScoreButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void competitionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_competitionsTableMouseClicked
        int index = competitionsTable.getSelectedRow();

        idTextField.setText(competitionsTable.getValueAt(index, 0).toString());
        nameTextField.setText(competitionsTable.getValueAt(index, 1).toString());
        distanceTextField.setText(competitionsTable.getValueAt(index, 2).toString());
        shotsTextField.setText(competitionsTable.getValueAt(index, 3).toString());
        timeTextField.setValue(Integer.valueOf(competitionsTable.getValueAt(index, 4).toString()));

        if (idTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Competition ID field cannot be empty!");
            return;
        }

        Map<Integer, CompetitionPair> pairs = GameManager.getSingleton().getPairs(parseInt(idTextField.getText()));

        
        DefaultTableModel model = (DefaultTableModel)pairsTable.getModel();
        model.setRowCount(0);
       
    
        for(CompetitionPair pair : pairs.values()) { 
            Object[] test = new Object[9];
            if(pair.getPerson1() != null && pair.getPerson2() != null) {
                test[0] = pair.getPerson1().getLeagueId();
                test[1] = pair.getPerson1().getName();
                test[2] =  pair.getPerson2().getName(); 
                test[3] = pair.getPerson1().getId();
                test[4] =  pair.getPerson2().getId(); 
                test[5] =  "---";
                test[6] =  "---";
                test[7] =  "---";
                test[8] =  "---";
                        
                model.addRow(test);
            }
        }
        
        //competitorVarirable.populateCompetitorWithScoreJtable(competitorsTable);
        pairsTable.setRowHeight(40);
        pairsTable.setShowGrid(true);
        pairsTable.setSelectionBackground(Color.BLUE);
        
        
        
    }//GEN-LAST:event_competitionsTableMouseClicked

    private void competitionsTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_competitionsTableKeyReleased
        
    }//GEN-LAST:event_competitionsTableKeyReleased

    private void addCompetitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCompetitionButtonActionPerformed
        AddCompetitionForm addCf = new AddCompetitionForm();
        addCf.setVisible(true);
        addCf.pack();
        addCf.setLocationRelativeTo(null);
        addCf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addCompetitionButtonActionPerformed

    private void removeCompetitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCompetitionButtonActionPerformed
// Deletes score associated with student by adding a constraint to the score table which is the foriegn key and delete on cascade        
        int id = -1;
        if(!idTextField.getText().equals("")) { 
            id = Integer.valueOf(idTextField.getText());    
        }
        GameManager.getSingleton().InsertDeleteUpdateCompetitor('d', id, null, null, null,null,0);
        ManageCompetitionsForm.competitionsTable.setModel(new DefaultTableModel(null, new Object[]{"Id","Compeitition Name","Distance","Shots","Time"}));
        GameManager.getSingleton().populateCompetitionJtable(ManageCompetitionsForm.competitionsTable);
        JOptionPane.showMessageDialog(null, "Competition Removed!");
        idTextField.setText("");
        nameTextField.setText("");
        distanceTextField.setText("");
        shotsTextField.setText("");
        timeTextField.setValue(0);
        
    }//GEN-LAST:event_removeCompetitionButtonActionPerformed

    private void editCompetitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCompetitionButtonActionPerformed
        //     if(!c.doesCompetitionExist(jTextField1_competitionName.getText())) {
        int id = Integer.valueOf(idTextField.getText());
        String competitionName = nameTextField.getText();
        String distance =distanceTextField.getText();
        String shots = shotsTextField.getText();
        int timeHours = Integer.valueOf(timeTextField.getValue().toString());
        
        String selectGame = (String) gameIdComboBox.getSelectedItem();
        int selectedGameId = GameManager.getSingleton().getIdForGameName(selectGame);
        System.out.println(selectedGameId);
        GameManager.getSingleton().InsertDeleteUpdateCompetitor('u', id, competitionName, distance, shots,timeHours,selectedGameId);
        
        ManageCompetitionsForm.competitionsTable.setModel(new DefaultTableModel(null, new Object[]{"Id","Compeitition Name","Distance","Shots","Time"}));
        GameManager.getSingleton().populateCompetitionJtable(ManageCompetitionsForm.competitionsTable);
        //} else { 
        //    JOptionPane.showMessageDialog(null, "Competition Already Exists!");
        //}
    }//GEN-LAST:event_editCompetitionButtonActionPerformed

    private void exitManageCompetitionFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitManageCompetitionFormActionPerformed
        this.dispose();  
    }//GEN-LAST:event_exitManageCompetitionFormActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void generateLeagueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateLeagueButtonActionPerformed
       GameManager.getSingleton().startCompetition(idTextField.getText());
    }//GEN-LAST:event_generateLeagueButtonActionPerformed

    private void addScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScoreButtonActionPerformed
        int index = pairsTable.getSelectedRow();
        if(index < 0) {
            JOptionPane.showMessageDialog(null, "You must select a pair!");
            return;
        }
        
         if(idTextField.getText().length() == 0) { 
             JOptionPane.showMessageDialog(null, "You must select a competition ID!");
             return;
         }
        int competitionID = Integer.valueOf(idTextField.getText());
        int person1ID = Integer.valueOf(person1IDTextField.getText());
        int person2ID = Integer.valueOf(person2IDTextField.getText());
        double person1Score = Double.valueOf(score1TextField.getText());
        double person2Score = Double.valueOf(score2TextField.getText());
        int week = Integer.parseInt(weeksComboBox.getSelectedItem().toString()); 
        int pairKey = person1ID + person2ID;
        int leagueId = (int) pairsTable.getValueAt(index, 0);
        
        System.out.println(leagueId);
        
        GameManager.getSingleton().InsertCompetitorsCurrentScores(pairKey, competitionID, person1ID, person2ID, person1Score, person2Score, week, leagueId);
        
        
    }//GEN-LAST:event_addScoreButtonActionPerformed

    private void pairsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pairsTableMouseClicked
        int rowIndex = pairsTable.getSelectedRow();
        person1IDTextField.setText(pairsTable.getValueAt(rowIndex, 3).toString());
        person2IDTextField.setText(pairsTable.getValueAt(rowIndex, 4).toString());
        
    }//GEN-LAST:event_pairsTableMouseClicked

    private void pairsTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pairsTableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pairsTableKeyReleased

    private void showResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultButtonActionPerformed

        
        if (!idTextField.getText().equals("")) {
            
            int competitionId = Integer.parseInt(idTextField.getText());
            int week = Integer.valueOf(weeksComboBox.getSelectedItem().toString());
            GameManager.getSingleton().showResults(competitionId, week);
        } else { 
            JOptionPane.showMessageDialog(null, "Competition ID must be selected");
        }

    }//GEN-LAST:event_showResultButtonActionPerformed

    private void weeksComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeksComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weeksComboBoxActionPerformed

    private void gameIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameIdComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameIdComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCompetitionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCompetitionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCompetitionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCompetitionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCompetitionsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCompetitionButton;
    private javax.swing.JButton addScoreButton;
    public static javax.swing.JTable competitionsTable;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JTextField distanceTextField;
    private javax.swing.JButton editCompetitionButton;
    private javax.swing.JButton exitManageCompetitionForm;
    private javax.swing.JComboBox<String> gameIdComboBox;
    private javax.swing.JLabel gameIdLabel;
    private javax.swing.JButton generateLeagueButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageCompetitionsTitle;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    public static javax.swing.JTable pairsTable;
    private javax.swing.JTextField person1IDTextField;
    private javax.swing.JLabel person1Label;
    private javax.swing.JTextField person2IDTextField;
    private javax.swing.JLabel person2Label;
    private javax.swing.JButton removeCompetitionButton;
    private javax.swing.JLabel score1Label;
    private javax.swing.JTextField score1TextField;
    private javax.swing.JLabel score2Label;
    private javax.swing.JTextField score2TextField;
    private javax.swing.JLabel shotsLabel;
    private javax.swing.JTextField shotsTextField;
    private javax.swing.JButton showResultButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JSpinner timeTextField;
    private javax.swing.JComboBox<String> weeksComboBox;
    // End of variables declaration//GEN-END:variables
}
