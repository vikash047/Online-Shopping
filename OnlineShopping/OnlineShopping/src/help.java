


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikash
 */
public class help extends javax.swing.JPanel {

    /**
     * Creates new form Help
     */
    javax.swing.JScrollPane current = null;
    javax.swing.JLabel cl = null;
    public help() {
        initComponents();
        sp1.setVisible(false);
        sp2.setVisible(false);
        sp3.setVisible(false);
        sp4.setVisible(false);
        sp5.setVisible(false);
        sp6.setVisible(false);
        sp8.setVisible(false);
        sp7.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        sp1 = new javax.swing.JScrollPane();
        ordertext = new javax.swing.JTextArea();
        l2 = new javax.swing.JLabel();
        sp2 = new javax.swing.JScrollPane();
        mobileandaddress = new javax.swing.JTextArea();
        l3 = new javax.swing.JLabel();
        sp3 = new javax.swing.JScrollPane();
        register = new javax.swing.JTextArea();
        l4 = new javax.swing.JLabel();
        sp4 = new javax.swing.JScrollPane();
        product = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        l5 = new javax.swing.JLabel();
        sp5 = new javax.swing.JScrollPane();
        damage = new javax.swing.JTextArea();
        l6 = new javax.swing.JLabel();
        sp6 = new javax.swing.JScrollPane();
        debitcard = new javax.swing.JTextArea();
        l7 = new javax.swing.JLabel();
        sp7 = new javax.swing.JScrollPane();
        delivery = new javax.swing.JTextArea();
        l8 = new javax.swing.JLabel();
        sp8 = new javax.swing.JScrollPane();
        warrenty = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        l1.setBackground(new java.awt.Color(49, 168, 168));
        l1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l1.setText("Where is my Order ?");
        l1.setOpaque(true);
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });

        ordertext.setEditable(false);
        ordertext.setColumns(20);
        ordertext.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ordertext.setForeground(new java.awt.Color(0, 153, 255));
        ordertext.setLineWrap(true);
        ordertext.setRows(5);
        ordertext.setText("You may check the progress of your dispatch in 'My Account ->   View History', once you login to your account using your registered email ID. \nYou can print your Invoice . In case of you need for warrenty of compay and any extra use.\n");
        ordertext.setWrapStyleWord(true);
        sp1.setViewportView(ordertext);

        l2.setBackground(new java.awt.Color(49, 168, 168));
        l2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l2.setText("How do I change my address and mobile number ?");
        l2.setOpaque(true);
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        mobileandaddress.setEditable(false);
        mobileandaddress.setColumns(20);
        mobileandaddress.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        mobileandaddress.setForeground(new java.awt.Color(0, 153, 255));
        mobileandaddress.setLineWrap(true);
        mobileandaddress.setRows(5);
        mobileandaddress.setText("You may change your profile in ' My Account ->change profile' Where you can change your address and mobile number \nbut if you placed once order then shipping address and mobile number does not change . If your shipping address and mobile number are wrong then It's your mistake we are not responsilble for any kind of claim.\n");
        mobileandaddress.setWrapStyleWord(true);
        sp2.setViewportView(mobileandaddress);

        l3.setBackground(new java.awt.Color(49, 168, 168));
        l3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l3.setText("How do I register ?");
        l3.setOpaque(true);
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });

        register.setEditable(false);
        register.setColumns(20);
        register.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        register.setForeground(new java.awt.Color(0, 153, 255));
        register.setLineWrap(true);
        register.setRows(5);
        register.setText("First time you visit on our site there is one option ' Sign Up' where you register for login at that time you will be our register user . No need for extra account and registration at time of order place .");
        register.setWrapStyleWord(true);
        sp3.setViewportView(register);

        l4.setBackground(new java.awt.Color(49, 168, 168));
        l4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l4.setText("How do I buy product ?");
        l4.setOpaque(true);
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });

        product.setEditable(false);
        product.setColumns(20);
        product.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        product.setForeground(new java.awt.Color(0, 153, 255));
        product.setLineWrap(true);
        product.setRows(5);
        product.setText("When you are click on a specific product you see details and price about it if you click on ' The Add To Card ' item will be added to your card . When you view your card then proceed payment option on click on the buy option .");
        product.setWrapStyleWord(true);
        sp4.setViewportView(product);

        jSeparator1.setBackground(new java.awt.Color(255, 102, 102));
        jSeparator1.setOpaque(true);

        l5.setBackground(new java.awt.Color(49, 168, 168));
        l5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l5.setText("Would My product safe from any kind of damage ?");
        l5.setOpaque(true);
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
        });

        damage.setEditable(false);
        damage.setColumns(20);
        damage.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        damage.setForeground(new java.awt.Color(0, 153, 255));
        damage.setLineWrap(true);
        damage.setRows(5);
        damage.setText("Your product will be safe because Our courier company will be 'Blue Dart' that is special care about your product and our Pakaging will be make according to durability of your product.\nIf any damage occur during shipping the recieve product after one hour you can call on our customer care number and inform us about it. Otherwise product will be not changed . ");
        damage.setWrapStyleWord(true);
        sp5.setViewportView(damage);

        l6.setBackground(new java.awt.Color(49, 168, 168));
        l6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l6.setText("Would My Net Banking and Debit card safe ?");
        l6.setOpaque(true);
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });

        debitcard.setEditable(false);
        debitcard.setColumns(20);
        debitcard.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        debitcard.setForeground(new java.awt.Color(0, 153, 255));
        debitcard.setLineWrap(true);
        debitcard.setRows(5);
        debitcard.setText("Your net banking and debit card will be safe . It will br secure by Norton and Quick - heel . These company are provider secure networking for your transition and mkae direct connection to your bank . Our collaboration with every national and international Banks .");
        debitcard.setWrapStyleWord(true);
        sp6.setViewportView(debitcard);

        l7.setBackground(new java.awt.Color(49, 168, 168));
        l7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l7.setText("What are the delivery Charges ?");
        l7.setOpaque(true);
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });

        delivery.setEditable(false);
        delivery.setColumns(20);
        delivery.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        delivery.setForeground(new java.awt.Color(0, 153, 255));
        delivery.setLineWrap(true);
        delivery.setRows(5);
        delivery.setText("Delivery charges are 50 rupees on 500 shopping and also depend on the weight of the your shooping luggage . ");
        delivery.setWrapStyleWord(true);
        sp7.setViewportView(delivery);

        l8.setBackground(new java.awt.Color(49, 168, 168));
        l8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l8.setText("What about the warranty  ?");
        l8.setOpaque(true);
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });

        warrenty.setEditable(false);
        warrenty.setColumns(20);
        warrenty.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        warrenty.setForeground(new java.awt.Color(0, 153, 255));
        warrenty.setLineWrap(true);
        warrenty.setRows(5);
        warrenty.setText("Warrenty does not provided by us . It is provided by manufature company . We are only seller not manufature .\n");
        warrenty.setWrapStyleWord(true);
        sp8.setViewportView(warrenty);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp2)
                    .addComponent(sp1)
                    .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp3)
                    .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp8)
                    .addComponent(l8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp7)
                    .addComponent(l7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sp5, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        if (current != null) {
            current.setVisible(false);
            cl.setVisible(false);
        }
        sp1.setVisible(true);
        current = sp1;
        jLabel1.setVisible(true);
        cl = jLabel1;
    }//GEN-LAST:event_l1MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
        if (current != null) {
            current.setVisible(false);
            cl.setVisible(false);
        }
        sp5.setVisible(true);
        current = sp5;
        jLabel5.setVisible(true);
        cl = jLabel5;
    }//GEN-LAST:event_l5MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        if (current != null) {
            current.setVisible(false);
            cl.setVisible(false);
        }
        sp2.setVisible(true);
        current = sp2;
        jLabel2.setVisible(true);
        cl = jLabel2;
    }//GEN-LAST:event_l2MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        if (current != null) {
            current.setVisible(false);
            cl.setVisible(false);
        }
        sp6.setVisible(true);
        current = sp6;
        jLabel6.setVisible(true);
        cl = jLabel6;
    }//GEN-LAST:event_l6MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        if (current != null) {
            current.setVisible(false);
            cl.setVisible(false);
        }
        sp3.setVisible(true);
        current = sp3;
        jLabel3.setVisible(true);
        cl = jLabel3;
    }//GEN-LAST:event_l3MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        if (current != null) {
            current.setVisible(false);
            cl.setVisible(false);
        }
        sp7.setVisible(true);
        current = sp7;
        jLabel7.setVisible(true);
        cl = jLabel7;
    }//GEN-LAST:event_l7MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        if (current != null) {
            current.setVisible(false);
            cl.setVisible(false);
        }
        sp4.setVisible(true);
        current = sp4;
        jLabel4.setVisible(true);
        cl = jLabel4;
    }//GEN-LAST:event_l4MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
        if (current != null) {
            current.setVisible(false);
            cl.setVisible(false);
        }
        sp8.setVisible(true);
        current = sp8;
        jLabel8.setVisible(true);
        cl = jLabel8;
    }//GEN-LAST:event_l8MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea damage;
    private javax.swing.JTextArea debitcard;
    private javax.swing.JTextArea delivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JTextArea mobileandaddress;
    private javax.swing.JTextArea ordertext;
    private javax.swing.JTextArea product;
    private javax.swing.JTextArea register;
    private javax.swing.JScrollPane sp1;
    private javax.swing.JScrollPane sp2;
    private javax.swing.JScrollPane sp3;
    private javax.swing.JScrollPane sp4;
    private javax.swing.JScrollPane sp5;
    private javax.swing.JScrollPane sp6;
    private javax.swing.JScrollPane sp7;
    private javax.swing.JScrollPane sp8;
    private javax.swing.JTextArea warrenty;
    // End of variables declaration//GEN-END:variables
}
