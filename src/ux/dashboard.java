/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ux;

import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author lenovo
 */
public class dashboard extends javax.swing.JPanel {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
         pn_Dasar.putClientProperty(FlatClientProperties.STYLE, "arc:75");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_Dasar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 248, 248));
        setLayout(new java.awt.CardLayout());

        pn_Dasar.setBackground(new java.awt.Color(255, 255, 255));
        pn_Dasar.setForeground(new java.awt.Color(0, 102, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MANAJEMEN.png"))); // NOI18N

        jButton1.setText("jButton1");

        javax.swing.GroupLayout pn_DasarLayout = new javax.swing.GroupLayout(pn_Dasar);
        pn_Dasar.setLayout(pn_DasarLayout);
        pn_DasarLayout.setHorizontalGroup(
            pn_DasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_DasarLayout.createSequentialGroup()
                .addContainerGap(489, Short.MAX_VALUE)
                .addGroup(pn_DasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_DasarLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_DasarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(465, 465, 465))))
        );
        pn_DasarLayout.setVerticalGroup(
            pn_DasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_DasarLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(jButton1)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        add(pn_Dasar, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pn_Dasar;
    // End of variables declaration//GEN-END:variables
}
