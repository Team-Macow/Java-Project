/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */


import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;


public class Real_Estate extends javax.swing.JFrame {

    
    public Real_Estate() {
        initComponents();
        getStarted();
    }

    private static SortedList list = new SortedList();

    private void clearData() {
        lotText.setText("");
        firstText.setText("");
        lastText.setText("");
        priceText.setText("");
        feetText.setText("");
        noOfBedText.setText("");
    }

    private void dataViewer(ListHouse house) {
        lotText.setText(Integer.toString(house.lotNumber()));
        firstText.setText(house.firstName());
        lastText.setText(house.lastName());
        priceText.setText(Integer.toString(house.price()));
        feetText.setText(Integer.toString(house.squareFeet()));
        noOfBedText.setText(Integer.toString(house.bedRooms()));
    }

    private ListHouse dataRetriver() {
        String lastName;
        String firstName;
        int lotNumber;
        int price;
        int squareFeet;
        int bedRooms;

        lotNumber = Integer.parseInt(lotText.getText());
        firstName = firstText.getText();
        lastName = lastText.getText();
        price = Integer.parseInt(priceText.getText());
        squareFeet = Integer.parseInt(feetText.getText());
        bedRooms = Integer.parseInt(noOfBedText.getText());

        ListHouse house = new ListHouse(lastName, firstName, lotNumber, price,
                squareFeet, bedRooms);
        return house;
    }

    public void getStarted() {

        try {
            ListHouse house;
            HouseFile.checkAvailability();
            HouseFile.reset();

            while (HouseFile.moreHouses()) {
                house = HouseFile.getNextHouse();
                list.insert(house); 
            }
            list.reset();
            if (list.lengthIs() != 0) {
                house = (ListHouse) list.getNextItem();
                dataViewer(house);
            }
        } catch (Exception e) {

        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        find = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        lotText = new javax.swing.JTextField();
        lotLable = new javax.swing.JLabel();
        lotlabel = new javax.swing.JLabel();
        lastLabel = new javax.swing.JLabel();
        priceLable = new javax.swing.JLabel();
        feetLabel = new javax.swing.JLabel();
        bedLabel = new javax.swing.JLabel();
        firstText = new javax.swing.JTextField();
        lastText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        feetText = new javax.swing.JTextField();
        noOfBedText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();

        jButton4.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Real Estate Programe");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(0, 102, 102));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 102, 102));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(0, 102, 102));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 102, 102));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 102, 102));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        find.setBackground(new java.awt.Color(255, 255, 255));
        find.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        find.setForeground(new java.awt.Color(0, 102, 102));
        find.setText("Find");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(299, 299, 299))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        statusLabel.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(51, 51, 51));
        statusLabel.setText("Macow Real Estate Program");

        lotText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotTextActionPerformed(evt);
            }
        });

        lotLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lotLable.setForeground(new java.awt.Color(0, 51, 153));
        lotLable.setText("Lot Number :");

        lotlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lotlabel.setForeground(new java.awt.Color(0, 51, 153));
        lotlabel.setText("First Name :");

        lastLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastLabel.setForeground(new java.awt.Color(0, 51, 153));
        lastLabel.setText("Last Name :");

        priceLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceLable.setForeground(new java.awt.Color(0, 51, 153));
        priceLable.setText("Price :");

        feetLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feetLabel.setForeground(new java.awt.Color(0, 51, 153));
        feetLabel.setText("Square Feet :");

        bedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bedLabel.setForeground(new java.awt.Color(0, 51, 153));
        bedLabel.setText("Num of BedRooms :");

        firstText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstTextActionPerformed(evt);
            }
        });

        lastText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastTextActionPerformed(evt);
            }
        });

        priceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextActionPerformed(evt);
            }
        });

        feetText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feetTextActionPerformed(evt);
            }
        });

        noOfBedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfBedTextActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("REAL ESTATE");

        close.setBackground(new java.awt.Color(255, 51, 51));
        close.setText("X");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lotlabel)
                            .addComponent(lotLable)
                            .addComponent(lastLabel)
                            .addComponent(priceLable)
                            .addComponent(feetLabel)
                            .addComponent(bedLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstText, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(lastText)
                            .addComponent(priceText)
                            .addComponent(feetText)
                            .addComponent(noOfBedText)
                            .addComponent(lotText, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lotText)
                    .addComponent(lotLable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lotlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfBedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        ListHouse house;

        try {
            house = dataRetriver();
            if (list.availability(house)) {
                list.delete(house);
                statusLabel.setText("House deleted");
            } else {
                statusLabel.setText("Lot number not on list");
            }
        } catch (NumberFormatException badHouseData) {

            statusLabel.setText("Number? " + badHouseData.getMessage());
        }
        clearData();

    }//GEN-LAST:event_deleteActionPerformed

    private void lotTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotTextActionPerformed

    private void firstTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstTextActionPerformed

    private void lastTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastTextActionPerformed

    private void priceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextActionPerformed

    private void feetTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feetTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feetTextActionPerformed

    private void noOfBedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfBedTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfBedTextActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        if ((list.lengthIs() == 1) && list.getCurrent() == null) {
        } else {
            ListHouse house;
            if (list.lengthIs() == 0) {
                statusLabel.setText("Empty List!");
            } else {
                house = (ListHouse) list.getNextItem();
                dataViewer(house);
                statusLabel.setText("Next house is displayed");
            }
        }

    }//GEN-LAST:event_nextActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        ListHouse house;
        list.reset();
        if (list.lengthIs() == 0) {
            clearData();
        } else {
            house = (ListHouse) list.getNextItem();
            dataViewer(house);
        }
        statusLabel.setText("Reset List");
    }//GEN-LAST:event_resetActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        ListHouse house;
        if (lotText.getText().isEmpty()) {
            statusLabel.setText("Enter The Lot Number");
        } else if (firstText.getText().isEmpty()) {
            statusLabel.setText("Enter First Name ");
        } else if (lastText.getText().isEmpty()) {
            statusLabel.setText("Enter Last Name");
        } else if (priceText.getText().isEmpty()) {
            statusLabel.setText("Enter The Price");
        } else if (feetText.getText().isEmpty()) {
            statusLabel.setText("Enter Squrefeet Amount");
        } else if (noOfBedText.getText().isEmpty()) {
            statusLabel.setText("Enter The No Of Bedrooms");
        } else {
            try {
                house = dataRetriver();
                if (list.availability(house)) {
                    statusLabel.setText("Lot number already in use");
                } else {
                    list.insert(house);
                    statusLabel.setText("House added to list");
                }
                if ((list.getCurrent() == null) && (list.lengthIs() == 1)) {
                    list.reset();
                    house = (ListHouse) list.getNextItem();

                }

            } catch (NumberFormatException d) {

                statusLabel.setText("Invalid Entry!");
            }
        }

    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        clearData();
        statusLabel.setText(list.lengthIs() + " houses on list");

    }//GEN-LAST:event_clearActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed

        ListHouse house;
        int lotNumber;
        try {
            lotNumber = Integer.parseInt(lotText.getText());
            house = new ListHouse("", "", lotNumber, 0, 0, 0);
            if (list.availability(house)) {
                house = (ListHouse) list.Fetcher(house);
                dataViewer(house);
                statusLabel.setText("found");
            } else {
                statusLabel.setText("Not found");
            }
        } catch (NumberFormatException badHouseData) {
            // text field info incorrectly formated
            statusLabel.setText("Number? " + badHouseData.getMessage());
        }

    }//GEN-LAST:event_findActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        
            ListHouse house;
            try
            {
                HouseFile.rewrite();
                list.reset();
                int length = list.lengthIs();
                for (int counter = 1; counter <= length; counter++)
                {
                    house = (ListHouse)list.getNextItem();
                    HouseFile.putToFile(house);
                }
                HouseFile.close();
            }
            catch (Exception e)
            {
                System.out.println("Issue in "+e);

            }
            System.exit(0);
        
    }//GEN-LAST:event_closeActionPerformed

    private void LotNumTextKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            Toolkit.getDefaultToolkit().beep();

            statusLabel.setText("Type numbers only");
        } else {

        }
    }

    private void PriceTextKeyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            Toolkit.getDefaultToolkit().beep();

            statusLabel.setText("Type numbers only");
        } else {
            statusLabel.setText(" ");
        }
    }

    private void SquareFetTextKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            Toolkit.getDefaultToolkit().beep();

            statusLabel.setText("Type numbers only");
        } else {
            statusLabel.setText(" ");
        }
    }
    
   

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Real_Estate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Real_Estate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Real_Estate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Real_Estate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new Real_Estate().setVisible(true);            /* Create and display the form */
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel bedLabel;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JLabel feetLabel;
    private javax.swing.JTextField feetText;
    private javax.swing.JButton find;
    private javax.swing.JTextField firstText;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lastLabel;
    private javax.swing.JTextField lastText;
    private javax.swing.JLabel lotLable;
    private javax.swing.JTextField lotText;
    private javax.swing.JLabel lotlabel;
    private javax.swing.JButton next;
    private javax.swing.JTextField noOfBedText;
    private javax.swing.JLabel priceLable;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton reset;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
