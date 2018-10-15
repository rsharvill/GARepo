package fitness;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class GAFrame extends javax.swing.JFrame {

    /**
     * Creates new form GAFrame
     */
    Population pList;
    int fitnessCount;
    boolean doAGen = true;
    ArrayList<Integer> popSizeList = new ArrayList<Integer>();
    ArrayList<Double> mutationRateList = new ArrayList<Double>();
    ArrayList<Integer> numCrossoverList = new ArrayList<Integer>();
    ArrayList<Integer> fitnessCountList = new ArrayList<Integer>();

    public GAFrame() {
        initComponents();

        // Population slider defaults
        pField1.setText("10");
        muField.setText(".001");
        crossField.setText("1");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        run = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        populationLabel = new javax.swing.JLabel();
        crossField = new javax.swing.JTextField();
        muField = new javax.swing.JTextField();
        runButton = new javax.swing.JButton();
        pField1 = new javax.swing.JTextField();
        save1 = new javax.swing.JButton();
        displayTrends = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        run.setText("Do a Gen");
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });
        getContentPane().add(run);
        run.setBounds(890, 130, 290, 40);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 280, 1170, 310);

        jLabel1.setText("Mutation Rate");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 160, 100, 20);

        jLabel2.setText("Population Size");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 120, 30);

        jLabel3.setText("Crossover");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 220, 70, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Genetic Algorithm Program");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 550, 50);

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(890, 180, 140, 40);
        getContentPane().add(populationLabel);
        populationLabel.setBounds(200, 130, 0, 0);

        crossField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossFieldActionPerformed(evt);
            }
        });
        getContentPane().add(crossField);
        crossField.setBounds(20, 240, 100, 30);

        muField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muFieldActionPerformed(evt);
            }
        });
        getContentPane().add(muField);
        muField.setBounds(20, 180, 100, 30);

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });
        getContentPane().add(runButton);
        runButton.setBounds(890, 80, 290, 40);

        pField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pField1ActionPerformed(evt);
            }
        });
        getContentPane().add(pField1);
        pField1.setBounds(20, 120, 100, 30);

        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        getContentPane().add(save1);
        save1.setBounds(1040, 180, 140, 40);

        displayTrends.setText("Display Parameter Trends");
        displayTrends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTrendsActionPerformed(evt);
            }
        });
        getContentPane().add(displayTrends);
        displayTrends.setBounds(890, 230, 290, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed

        int population = Integer.parseInt(pField1.getText());
        int crossover = Integer.parseInt(crossField.getText());
        int muRate = (int) (1 / Double.parseDouble(muField.getText()));
        if (doAGen == true) {
            pList = new Population(population);
        }

        pList.doageneration(muRate, crossover);

        textArea.setText(pList.toString() + "\nFitness avg:" + pList.evaluateFitness());
        doAGen = false;
    }//GEN-LAST:event_runActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        pList.reset();

        doAGen = true;
        textArea.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void muFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muFieldActionPerformed

    private void crossFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crossFieldActionPerformed

    private void pField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pField1ActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed

        doAGeneration();

    }//GEN-LAST:event_runButtonActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        int popSize = Integer.parseInt(pField1.getText());
        double mutationRate = Double.parseDouble(muField.getText());
        int numCrossovers = Integer.parseInt(crossField.getText());

        popSizeList.add(popSize);
        mutationRateList.add(mutationRate);
        numCrossoverList.add(numCrossovers);
        fitnessCountList.add(fitnessCount);
        JOptionPane.showMessageDialog(this, "The parameters have been saved");
    }//GEN-LAST:event_save1ActionPerformed

    private void displayTrendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTrendsActionPerformed
        textArea.setText("");
        for (int i = 0; i < popSizeList.size(); i++) {
            int popSize = popSizeList.get(i);
            double mutationRate = mutationRateList.get(i);
            int numCrossovers = numCrossoverList.get(i);
            int fitnessCount = fitnessCountList.get(i);
            
            textArea.append("Population size: "+ popSize+ " Mutation rate: " + mutationRate + " Number of Crossover Points: " + numCrossovers + " resulted in " + fitnessCount + " fitness evaluations\n");
        }
       
    }//GEN-LAST:event_displayTrendsActionPerformed

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
            java.util.logging.Logger.getLogger(GAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GAFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField crossField;
    private javax.swing.JButton displayTrends;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField muField;
    private javax.swing.JTextField pField1;
    private javax.swing.JLabel populationLabel;
    private javax.swing.JButton reset;
    private javax.swing.JButton run;
    private javax.swing.JButton runButton;
    private javax.swing.JButton save1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    private void doAGeneration() {
        int population = Integer.parseInt(pField1.getText());
        int crossover = Integer.parseInt(crossField.getText());
        int count = 0;

        int muRate = (int) (1 / Double.parseDouble(muField.getText()));

        if (doAGen == true) {
            pList = new Population(population);
        }

        while (pList.evaluateFitness() != 100) {
            count++;
            pList.doageneration(muRate, crossover);

            textArea.append("\nFitness avg:" + pList.evaluateFitness());
        }
        fitnessCount = count;
        JOptionPane.showMessageDialog(this, "Number of fitness counts was: " + count);
        doAGen = false;

    }
}
