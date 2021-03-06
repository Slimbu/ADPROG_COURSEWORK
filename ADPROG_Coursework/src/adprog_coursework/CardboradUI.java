package adprog_coursework;

/**
 * 
 * @author @UP811334
 */

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * 
 * Main UI Class
 */

public class CardboradUI extends javax.swing.JFrame {

    /**
     * 
     */
    
    private final ArrayList<OrderCardboard> orderList = new ArrayList<>();
    private double total, newLength, newWidth, newHeight;
    private String cost;
    String floater = "f";
    private int numOfGrade, typeOfCardboard, numOfColour, quantity;
    private boolean reinforcedBottom, reinforcedCornor, sealableTop;
    private NewCardboard currentCardboard;
    private OrderCardboard newOrder;
    private final CardboardValidator checkCardboard = new CardboardValidator();

    /**
     * Creates new form CardboradUI
     */
    
    public CardboradUI() {
        
        initComponents();
        radioButton();

        //set icon 
        ImageIcon img = new ImageIcon("cardboardBox.png");
        setIconImage(img.getImage());
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
        jLabel1 = new javax.swing.JLabel();
        lengthTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        noColour = new javax.swing.JRadioButton();
        oneColour = new javax.swing.JRadioButton();
        twoColour = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        widthTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bottomBox = new javax.swing.JCheckBox();
        cornorBox = new javax.swing.JCheckBox();
        sealableTopBox = new javax.swing.JCheckBox();
        heightTextField = new javax.swing.JTextField();
        comboGrade = new javax.swing.JComboBox<>();
        gradeLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        helpBtn = new javax.swing.JButton();
        basketList = new java.awt.List();
        jLabel6 = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        totalBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        priceInTotal = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FlexBox");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Length -");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        noColour.setSelected(true);
        noColour.setText("No Colour");

        oneColour.setText("One Colour");

        twoColour.setText("Two Colours");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noColour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(oneColour)
                .addGap(35, 35, 35)
                .addComponent(twoColour)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noColour)
                    .addComponent(oneColour)
                    .addComponent(twoColour))
                .addContainerGap())
        );

        oneColour.getAccessibleContext().setAccessibleDescription("12% extra cost");
        twoColour.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setText("Width -");

        jLabel3.setText("Height -");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bottomBox.setText("Reinforced Bottom");

        cornorBox.setText("Reinforced Cornor");

        sealableTopBox.setText("Sealable Top");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(bottomBox)
                .addGap(29, 29, 29)
                .addComponent(cornorBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(sealableTopBox)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottomBox)
                    .addComponent(cornorBox)
                    .addComponent(sealableTopBox))
                .addContainerGap())
        );

        comboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        gradeLabel.setText("Grade");

        jLabel7.setText("Quantity -");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Additional");
        jPanel2.getAccessibleContext().setAccessibleParent(jPanel2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel5.setText("FlexBox Ordering System");

        helpBtn.setText("Help");
        helpBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Your basket");

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        totalBtn.setText("Total");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Total: £");

        priceInTotal.setText("0");
        priceInTotal.setToolTipText("Total cost");
        priceInTotal.setName("priceInTotal"); // NOI18N

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 621, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceInTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addComponent(basketList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(helpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basketList, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetBtn)
                        .addComponent(totalBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(priceInTotal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Cardboard Boxes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Picture for help 
     * 
     * @param evt
     */
    
    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        // TODO add your handling code here:
        try {
            BufferedImage myImg = ImageIO.read(new File("Information.png"));
            ImageIcon icon = new ImageIcon(myImg);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog((null), label);
        } catch (IOException | HeadlessException exRef) {
            JOptionPane.showMessageDialog(null, exRef);
        }
    }//GEN-LAST:event_helpBtnActionPerformed

    /**
     * If valid print out total outcome 
     * 
     * @param evt
     */
    
    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
        // TODO add your handling code here:
        if (getInputs() && validInput()) {
            typeOfCardboard = checkCardboard.check(numOfGrade, numOfColour, reinforcedBottom, reinforcedCornor);
            if (typeOfCardboard != 0) {
                chooseCardboard(typeOfCardboard);                                       //initialize the current cardboard
                newOrder = new OrderCardboard(currentCardboard, quantity);
                cost = new DecimalFormat("0.00").format(newOrder.getOrderPrice());

                //yes or no option messaage box
                JDialog.setDefaultLookAndFeelDecorated(true);
                int response = JOptionPane.showConfirmDialog(null, "You grade type is" + typeOfCardboard + ". This cardboard will cost £" + cost + ". Would you like to add this to your basket?", "Add to basket",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                    addToBasket();
                }
            } else {
                msg("Your option choice does not create a cardboard of a valid grade");
            }
            totalPrice();
        }
    }//GEN-LAST:event_totalBtnActionPerformed

    /**
     * Allow to edit selected item
     * 
     * @param evt
     */
    
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        int index = basketList.getSelectedIndex();

        //if a item is selected
        if (validSelected() == true) {
            OrderCardboard listOrder = orderList.get(index);
            NewCardboard listCardboard = listOrder.getCardboard();

            lengthTextField.setText(Double.toString(listCardboard.getCardboardLength()));
            widthTextField.setText(Double.toString(listCardboard.getCardboardWidth()));
            heightTextField.setText(Double.toString(listCardboard.getCardboardHeight()));
            quantityTextField.setText(Integer.toString(listOrder.getQuantity()));

            comboGrade.setSelectedIndex(listCardboard.getCardboardGrade() - 1);

            switch (listCardboard.getCardboardColour()) {
                case 0:
                    noColour.setSelected(true);
                    break;
                case 1:
                    oneColour.setSelected(true);
                default:
                    twoColour.setSelected(true);
                    break;
            }

        }
    }//GEN-LAST:event_editBtnActionPerformed

    /**
     * Resets by clearing all input fields
     * 
     * @param evt
     */
    
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog(null, "Order placed"
                + " Are you sure you want to reset", "Reset",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            resetInput();

            basketList.removeAll();
            orderList.clear();

            priceInTotal.setText("0");
            totalPrice();
        }
    }//GEN-LAST:event_resetBtnActionPerformed

    /**
     * Deletes the selected order
     * 
     * @param evt
     */
    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int index = basketList.getSelectedIndex();
        if (validSelected() == true) {
            basketList.remove(index);
            orderList.remove(index);
            totalPrice();

        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    
    /**
     * Checks for valid input  
     */
    private boolean validInput() {

        boolean lengthChecker, widthChecker, heightChecker, quantityChecker;

        //returns true if within range
        lengthChecker = rangeChecker("Length", newLength, 0.1, 100);
        widthChecker = rangeChecker("Width", newWidth, 0.1, 100);
        heightChecker = rangeChecker("Height", newHeight, 0.1, 100);
        quantityChecker = rangeChecker("Quantity", quantity, 1, 100);

        return(lengthChecker & widthChecker & heightChecker & quantityChecker);
        
    }

    /**
     * Checks for numbers within range
     * 
     * @param name length, width, height, quantity
     * @param testValue input
     * @param min minimum value
     * @param max maximum value 
     */
    private boolean rangeChecker(String name, double testValue, double min, double max) {

        String errorMsg = name + " ";
        if (testValue < min) {
            errorMsg += "is too small. Must be at least " + min;

        } else if (testValue > max) {
            errorMsg += "is too big. Must be less than " + max;
        } else {
            return true;
        }

        //display message
        msg(errorMsg);
        return false;
    }
    
    
    /**
     * Calculate the total price
     */
    private void totalPrice() {

        total = 0;

        //each cardboard in list add price
        for (OrderCardboard xOrder : orderList) {
            total += xOrder.getOrderPrice();
        }

        //update cost
        String totalCost = new DecimalFormat("0.00").format(total);
        priceInTotal.setText(totalCost);
    }

    /**
     * Add items to basket
     */
    private void addToBasket() {

        newOrder = new OrderCardboard(currentCardboard, quantity);
        orderList.add(newOrder);

        //updateTotal();
        String firstItem;                                                               
        firstItem = ("Type:" + typeOfCardboard + " " + newOrder.valuesToString());
        basketList.add(firstItem);                                                      
        resetInput();
    }

    /**
     * Get input if valid 
     */
    private boolean getInputs() {

        double boardLength = 0, boardWidth = 0, boardHeight = 0;
        int boardQuantity = 0;

        //gets values. Catches and display error if invalid
        boolean numberFormats = true;
        try {
            boardLength = Double.parseDouble(lengthTextField.getText());
        } catch (NumberFormatException e) {
            msg("Length should be a number");
            numberFormats = false;
        }
        try {
            boardWidth = Double.parseDouble(widthTextField.getText());
        } catch (NumberFormatException e) {
            msg("Width Should be a number");
            numberFormats = false;
        }
        try {
            boardHeight = Double.parseDouble(heightTextField.getText());
        } catch (NumberFormatException e) {
            msg("Height should be a number");
            numberFormats = false;
        }
        try {
            boardQuantity = Integer.parseInt(quantityTextField.getText());
        } catch (NumberFormatException e) {
            msg("Quantity should be whole numbers");
            numberFormats = false;
        }

        if (numberFormats) {

            //sets attributes to valid mumbers
            newLength = boardLength;
            newWidth = boardWidth;
            newHeight = boardHeight;
            quantity = boardQuantity;

            //get cardboard grade
            numOfGrade = comboGrade.getSelectedIndex() + 1;

            //get button values
            if (noColour.isSelected()) {
                numOfColour = 0;
            } else if (oneColour.isSelected()) {
                numOfColour = 1;
            } else {
                numOfColour = 2;
            }

            //get check box value
            reinforcedBottom = bottomBox.isSelected();
            reinforcedCornor = cornorBox.isSelected();
            sealableTop = sealableTopBox.isSelected();
            return true;

        } else {
            return false;
        }
    }

    /**
     * @param tpyeOfCardboard type of cardboard
     * 
     *  Initialize cardboard 
     */
    private void chooseCardboard(int typeOfCardboard) {

        switch (typeOfCardboard) {
            case 1:
                currentCardboard = new CardboardTypeI(newLength, newWidth, newHeight, numOfGrade, sealableTop);
                break;
            case 2:
                currentCardboard = new CardboardTypeII(newLength, newWidth, newHeight, numOfGrade, sealableTop);
                break;
            case 3:
                currentCardboard = new CardboardTypeIII(newLength, newWidth, newHeight, numOfGrade, sealableTop);
                break;
            case 4:
                currentCardboard = new CardboardTypeIV(newLength, newWidth, newHeight, numOfGrade, sealableTop);
                break;
            case 5:
                currentCardboard = new CardboardTypeV(newLength, newWidth, newHeight, numOfGrade, sealableTop);
                break;
        }
    }

    /**
     * Display message box  
     */
    private void msg(String str) {
        //display message box
        JOptionPane.showMessageDialog(null, str);
    }

    /**
     * Select valid order   
     */
    private boolean validSelected() {

        boolean valid = false;
        int index = basketList.getSelectedIndex();

        if (index != -1) {
            valid = true;
        } else if (orderList.isEmpty()) {
            msg("You don't have any items on your list");
        } else {
            msg("Plese select an item");
        }
        return valid;
    }

    /**
     * Resets every fields to default
     */
    private void resetInput() {

        //sets to default value
        comboGrade.setSelectedIndex(0);
        lengthTextField.setText("");
        widthTextField.setText("");
        heightTextField.setText("");
        quantityTextField.setText("");

        //
        bottomBox.setSelected(false);
        cornorBox.setSelected(false);
        sealableTopBox.setSelected(false);

        //sets it to default
        noColour.setSelected(true);
    }

    /**
     * select for colour 
     */
    private void radioButton() {
        ButtonGroup group = new ButtonGroup();
        group.add(noColour);
        group.add(oneColour);
        group.add(twoColour);
    }

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
            java.util.logging.Logger.getLogger(CardboradUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardboradUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardboradUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardboradUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardboradUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List basketList;
    private javax.swing.JCheckBox bottomBox;
    private javax.swing.JComboBox<String> comboGrade;
    private javax.swing.JCheckBox cornorBox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JButton helpBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lengthTextField;
    private javax.swing.JRadioButton noColour;
    private javax.swing.JRadioButton oneColour;
    private javax.swing.JLabel priceInTotal;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JCheckBox sealableTopBox;
    private javax.swing.JButton totalBtn;
    private javax.swing.JRadioButton twoColour;
    private javax.swing.JTextField widthTextField;
    // End of variables declaration//GEN-END:variables
}
