/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelmania;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class travelmaniadashboard extends javax.swing.JFrame {

    /**
     * Creates new form travelmaniadashboard
     */
    public travelmaniadashboard() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        vehicles = new javax.swing.JButton();
        myaccount = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        hotels = new javax.swing.JButton();
        trendingplaces = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        places = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vehicles.setBackground(new java.awt.Color(0, 102, 102));
        vehicles.setForeground(new java.awt.Color(255, 255, 0));
        vehicles.setText("Vehicles");
        vehicles.setBorderPainted(false);
        vehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiclesActionPerformed(evt);
            }
        });
        jPanel1.add(vehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 138, 50));

        myaccount.setBackground(new java.awt.Color(0, 102, 102));
        myaccount.setForeground(new java.awt.Color(255, 255, 0));
        myaccount.setText("About Us");
        myaccount.setBorderPainted(false);
        myaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myaccountActionPerformed(evt);
            }
        });
        jPanel1.add(myaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 138, 45));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Creat a trip");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 138, 45));

        hotels.setBackground(new java.awt.Color(0, 102, 102));
        hotels.setForeground(new java.awt.Color(255, 255, 0));
        hotels.setText("Hotels");
        hotels.setBorderPainted(false);
        hotels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelsActionPerformed(evt);
            }
        });
        jPanel1.add(hotels, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 138, 46));

        trendingplaces.setBackground(new java.awt.Color(0, 102, 102));
        trendingplaces.setForeground(new java.awt.Color(255, 255, 0));
        trendingplaces.setText("Traveling places");
        trendingplaces.setBorderPainted(false);
        trendingplaces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trendingplacesActionPerformed(evt);
            }
        });
        jPanel1.add(trendingplaces, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 138, 47));

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setForeground(new java.awt.Color(255, 255, 0));
        jButton9.setText("Covid-19 updates");
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 138, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel1.setText("-TRAVELMANIA-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 400, 80));

        places.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0431706d-e43c-452e-a61d-522311cc72f7_journal.jpg"))); // NOI18N
        jPanel1.add(places, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Covid19Updates dash;
        dash = new Covid19Updates();
                
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void vehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiclesActionPerformed
        // TODO add your handling code here:
        vehicles dash;
        dash = new vehicles();
                
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_vehiclesActionPerformed

    private void myaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myaccountActionPerformed
        // TODO add your handling code here:
       aboutus dash;
        dash = new aboutus();
                
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_myaccountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        create_a_trip dash;
        dash = new create_a_trip();
                
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void trendingplacesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trendingplacesActionPerformed
        // TODO add your handling code here:
        destinationspage dash;
        dash = new destinationspage();
                
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_trendingplacesActionPerformed

    private void hotelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelsActionPerformed
        // TODO add your handling code here:
        Hotelspage dash;
        dash = new Hotelspage();
                
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_hotelsActionPerformed

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
            java.util.logging.Logger.getLogger(travelmaniadashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(travelmaniadashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(travelmaniadashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(travelmaniadashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new travelmaniadashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hotels;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton myaccount;
    private javax.swing.JLabel places;
    private javax.swing.JButton trendingplaces;
    private javax.swing.JButton vehicles;
    // End of variables declaration//GEN-END:variables
}
