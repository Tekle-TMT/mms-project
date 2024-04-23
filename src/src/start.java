package src;

import src.login;

/**
 *
 * @author tekleeyesus munye
 */
public class start extends javax.swing.JFrame {
        
    public start() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        myprogress = new javax.swing.JProgressBar();
        test = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        test1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("loading");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myprogress.setBackground(new java.awt.Color(0, 0, 51));
        myprogress.setForeground(new java.awt.Color(255, 0, 51));
        myprogress.setBorder(null);
        myprogress.setBorderPainted(false);
        jPanel2.add(myprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 221, 447, 6));

        test.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MUSEUM MANAGEMENT SYSTEM");

        javax.swing.GroupLayout testLayout = new javax.swing.GroupLayout(test);
        test.setLayout(testLayout);
        testLayout.setHorizontalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        testLayout.setVerticalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel2.add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 44, -1, -1));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("version 1.0");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 80, -1));

        test1.setBackground(new java.awt.Color(255, 255, 255));
        test1.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        test1.setForeground(new java.awt.Color(255, 255, 255));
        test1.setText("Loading...");
        test1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(test1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        start mysplash = new start();
        mysplash.setVisible(true);
        mysplash.setLocationRelativeTo(null);
//        new start().setUndecorated(true);
        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                mysplash.myprogress.setValue(i);
                mysplash.test1.setText("Loading... "+i + "%");
            }
        } catch (Exception e) {

        }
//     new login().setVisible(true);
        login n = new login();
        n.setLocationRelativeTo(null);
        n.setVisible(true);
        mysplash.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar myprogress;
    private javax.swing.JPanel test;
    private javax.swing.JLabel test1;
    // End of variables declaration//GEN-END:variables
}
