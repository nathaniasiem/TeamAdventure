
import java.awt.image.BufferedImage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class GUI extends javax.swing.JFrame {
    
    //Create the constant to be used
    private MainGame controller;

    /**
     * Creates new form GUI
     */
    
    public GUI() {
        initComponents();
    }
    
    public GUI (MainGame controller){
        initComponents();
        this.controller = controller;
        
        
    }
    
    public void setController(MainGame c){
        controller = c;
    }
    
    public void setImage(BufferedImage img){
       image.setImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftButton = new javax.swing.JButton();
        ForwardButton = new javax.swing.JButton();
        RightButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftButton.setText("Left");
        LeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftButtonActionPerformed(evt);
            }
        });

        ForwardButton.setText("Forward");
        ForwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForwardButtonActionPerformed(evt);
            }
        });

        RightButton.setText("Right");
        RightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(LeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(ForwardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(RightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LeftButton)
                    .addComponent(ForwardButton)
                    .addComponent(RightButton))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A method to turn left using the left button
     * @param evt 
     */
    private void LeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftButtonActionPerformed
        //the the user can turn left
        controller.turnLeft();
        
    }//GEN-LAST:event_LeftButtonActionPerformed
    
    /**
     * A method to go forward or go to next location using the forward button
     * @param evt 
     */
    private void ForwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForwardButtonActionPerformed
        //the user can go forward ot go to next location
        controller.goForward();
    }//GEN-LAST:event_ForwardButtonActionPerformed

    /**
    * A method to turn right using the right button
    * @param evt 
    */
    private void RightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightButtonActionPerformed
        //the user can turn right
        controller.turnRight();   
    }//GEN-LAST:event_RightButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ForwardButton;
    private javax.swing.JButton LeftButton;
    private javax.swing.JButton RightButton;
    // End of variables declaration//GEN-END:variables
}
