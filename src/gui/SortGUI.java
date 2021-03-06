/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import sortapp.*;
import java.util.Arrays;
/**
 *
 * @author ryan
 */
public class SortGUI extends javax.swing.JFrame
{

    private SortCoord sorter;
    /**
     * Creates new form sortGUI
     */
    public SortGUI()
    {
        initComponents();
        sorter = new SortCoord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultDisplay = new javax.swing.JTextPane();
        listButton = new javax.swing.JButton();
        bubbleButton = new javax.swing.JButton();
        quickButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorting Algorithms");
        setResizable(false);

        jScrollPane1.setViewportView(resultDisplay);

        listButton.setText("new List");
        listButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                listButtonActionPerformed(evt);
            }
        });

        bubbleButton.setText("Bubble Sort");
        bubbleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bubbleButtonActionPerformed(evt);
            }
        });

        quickButton.setText("Quick Sort");
        quickButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quickButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bubbleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quickButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bubbleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quickButton)
                        .addGap(0, 200, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_listButtonActionPerformed
    {//GEN-HEADEREND:event_listButtonActionPerformed
        resultDisplay.setText("");
    }//GEN-LAST:event_listButtonActionPerformed

    private void bubbleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bubbleButtonActionPerformed
    {//GEN-HEADEREND:event_bubbleButtonActionPerformed
        resultDisplay.setText(Arrays.toString(bubbleSort()));
    }//GEN-LAST:event_bubbleButtonActionPerformed

    private void quickButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quickButtonActionPerformed
    {//GEN-HEADEREND:event_quickButtonActionPerformed
        resultDisplay.setText(Arrays.toString(quickSort()));
    }//GEN-LAST:event_quickButtonActionPerformed

    private int[] quickSort()
    {
        return sorter.quickSort(stringToArray(resultDisplay.getText()));
    }
    
    private int[] bubbleSort()
    {
        return sorter.bubbleSort(stringToArray(resultDisplay.getText()));
    }
    
    /**
     * this method will split the display text into an int array
     * @param displayText
     * @return 
     */
    private int[] stringToArray(String line)
    {
        String[] numbers = line.split(" ");
        
        int[] numArray = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++)
        {
            try
            {
                numArray[i] = Integer.parseInt(numbers[i]);
            }
            catch(Exception e)
            {
                resultDisplay.setText("Please enter Integers only seperated by a space: Error " + e);
                return numArray;
            }
        }
        
        
        
        return numArray;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SortGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SortGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SortGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SortGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new SortGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bubbleButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listButton;
    private javax.swing.JButton quickButton;
    private javax.swing.JTextPane resultDisplay;
    // End of variables declaration//GEN-END:variables
}
