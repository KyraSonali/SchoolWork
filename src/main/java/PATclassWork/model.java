/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PATclassWork;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kyrab
 */
public class model extends javax.swing.JFrame {

    /**
     * Creates new form table
     */
    public model() {
        initComponents();
        
        //table
        String [] columnNames = {"Name", "Surname","Grade"};
        String [][] data = {{"John","Walker","10"},{"Paul","Adam","8"}};
        DefaultTableModel dataModel = new DefaultTableModel(data,columnNames);
        studentTable.setModel(dataModel);
        
        
        //combo
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        studentCombo.setModel(dcb);
        studentCombo.addItem("JC");
        studentCombo.addItem("Megan");
        studentCombo.addItem("neeraav");
        
        
        
        //list
        ArrayList<String> names = getListNames();
        DefaultListModel b = new DefaultListModel();
       //studentList.add(names);
        studentList.setModel(b);
               
        
        
        
        
        
        
    }
    
    public ArrayList<String> getListNames(){
        ArrayList<String> list = new ArrayList<>();
        list.add("kyra");
        list.add("oogie");
        
        
      return list;
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
        comboLabel = new javax.swing.JLabel();
        personLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        studentCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList<>();
        personLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboLabel.setForeground(new java.awt.Color(0, 0, 0));
        comboLabel.setText("Person:");
        jPanel1.add(comboLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        personLabel.setBackground(new java.awt.Color(255, 255, 255));
        personLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        personLabel.setForeground(new java.awt.Color(0, 0, 0));
        personLabel.setText("Person:");
        jPanel1.add(personLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 20));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Surname", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 400, 90));

        studentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        studentCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentComboMouseClicked(evt);
            }
        });
        jPanel1.add(studentCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 170, 30));

        studentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(studentList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 230, 150));

        personLabel1.setBackground(new java.awt.Color(255, 255, 255));
        personLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        personLabel1.setForeground(new java.awt.Color(0, 0, 0));
        personLabel1.setText("Person:");
        jPanel1.add(personLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        
        int row = studentTable.getSelectedRow();
        
        String name = (String)studentTable.getValueAt(row,0);
        String surname = (String)studentTable.getValueAt(row,1);
        String grade = (String)studentTable.getValueAt(row,2);
        personLabel.setText("Person:"+ name);
        
    }//GEN-LAST:event_studentTableMouseClicked

    private void studentComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentComboMouseClicked
       String name = (String) studentCombo.getSelectedItem();
       comboLabel.setText("Person:"+ name);
    }//GEN-LAST:event_studentComboMouseClicked

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
            java.util.logging.Logger.getLogger(model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new model().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comboLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel personLabel;
    private javax.swing.JLabel personLabel1;
    private javax.swing.JComboBox<String> studentCombo;
    private javax.swing.JList<String> studentList;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}