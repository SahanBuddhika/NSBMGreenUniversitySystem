/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmcourseenrollmentsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahan Buddhika
 */
public class UndergraduateResultEnter extends javax.swing.JFrame {
     DBOperation DBop = new DBOperation(); 

    /**
     * Creates new form UndergraduateResultEnter
     */
    public UndergraduateResultEnter() {
        initComponents();
    }
     public void clearFeilds(){
                txtsub1.setText("");
                txtsub2.setText("");
                txtsub3.setText("");
                txtsub4.setText("");
                txtsub5.setText("");
                txtsub6.setText("");
                ddsub1.setToolTipText("");
                ddsub2.setToolTipText("");
                ddsub3.setToolTipText("");
                ddsub4.setToolTipText("");
                ddsub5.setToolTipText("");
                ddsub6.setToolTipText("");
                txtsearch.setText("");
                txtcourseid.setText("");
                txtgpa.setText("");
                
                }
    
    void calResult(){
        String sub1="0"; String sub2="0"; String sub3="0"; String sub4="0";
        String sub5="0"; String sub6="0";
        
        if("A+".equals(ddsub1.getSelectedItem())){
            sub1="4.25";
        }
        else if("A".equals(ddsub1.getSelectedItem())){
            sub1="4";
        }
        else if("A-".equals(ddsub1.getSelectedItem())){
            sub1="3.75";
        }
        else if("B+".equals(ddsub1.getSelectedItem())){
            sub1="3.25";
        }
        else if("B".equals(ddsub1.getSelectedItem())){
            sub1="3";
        }
        else if("B-".equals(ddsub1.getSelectedItem())){
            sub1="2.75";
        }
        else if("C+".equals(ddsub1.getSelectedItem())){
            sub1="2.25";
        }
        else if("C".equals(ddsub1.getSelectedItem())){
            sub1="2";
        }
        else if("C-".equals(ddsub1.getSelectedItem())){
            sub1="1.75";
        }
        else if("D+".equals(ddsub1.getSelectedItem())){
            sub1="1.25";
        }
        else if("D".equals(ddsub1.getSelectedItem())){
            sub1="1";
        }
        else if("D-".equals(ddsub1.getSelectedItem())){
            sub1="O.75";
        }
        else if("E".equals(ddsub1.getSelectedItem())){
            sub1="0";
        }
        else if("F".equals(ddsub1.getSelectedItem())){
            sub1="0";
        }
        
        
        if("A+".equals(ddsub2.getSelectedItem())){
            sub2="4.25";
        }
        else if("A".equals(ddsub2.getSelectedItem())){
            sub2="4";
        }
        else if("A-".equals(ddsub2.getSelectedItem())){
            sub2="3.75";
        }
        else if("B+".equals(ddsub2.getSelectedItem())){
            sub2="3.25";
        }
        else if("B".equals(ddsub2.getSelectedItem())){
            sub2="3";
        }
        else if("B-".equals(ddsub2.getSelectedItem())){
            sub2="2.75";
        }
        else if("C+".equals(ddsub2.getSelectedItem())){
            sub2="2.25";
        }
        else if("C".equals(ddsub2.getSelectedItem())){
            sub2="2";
        }
        else if("C-".equals(ddsub2.getSelectedItem())){
            sub2="1.75";
        }
        else if("D+".equals(ddsub2.getSelectedItem())){
            sub2="1.25";
        }
        else if("D".equals(ddsub2.getSelectedItem())){
            sub2="1";
        }
        else if("D-".equals(ddsub2.getSelectedItem())){
            sub2="O.75";
        }
        else if("E".equals(ddsub2.getSelectedItem())){
            sub2="0";
        }
        else if("F".equals(ddsub2.getSelectedItem())){
            sub2="0";
        }
        
        
        if("A+".equals(ddsub3.getSelectedItem())){
            sub3="4.25";
        }
        else if("A".equals(ddsub3.getSelectedItem())){
            sub3="4";
        }
        else if("A-".equals(ddsub3.getSelectedItem())){
            sub3="3.75";
        }
        else if("B+".equals(ddsub3.getSelectedItem())){
            sub3="3.25";
        }
        else if("B".equals(ddsub3.getSelectedItem())){
            sub3="3";
        }
        else if("B-".equals(ddsub3.getSelectedItem())){
            sub3="2.75";
        }
        else if("C+".equals(ddsub3.getSelectedItem())){
            sub3="2.25";
        }
        else if("C".equals(ddsub3.getSelectedItem())){
            sub3="2";
        }
        else if("C-".equals(ddsub3.getSelectedItem())){
            sub3="1.75";
        }
        else if("D+".equals(ddsub3.getSelectedItem())){
            sub3="1.25";
        }
        else if("D".equals(ddsub3.getSelectedItem())){
            sub3="1";
        }
        else if("D-".equals(ddsub3.getSelectedItem())){
            sub3="O.75";
        }
        else if("E".equals(ddsub3.getSelectedItem())){
            sub3="0";
        }
        else if("F".equals(ddsub3.getSelectedItem())){
            sub3="0";
        }
        
        
        
        if("A+".equals(ddsub4.getSelectedItem())){
            sub4="4.25";
        }
        else if("A".equals(ddsub4.getSelectedItem())){
            sub4="4";
        }
        else if("A-".equals(ddsub4.getSelectedItem())){
            sub4="3.75";
        }
        else if("B+".equals(ddsub4.getSelectedItem())){
            sub4="3.25";
        }
        else if("B".equals(ddsub4.getSelectedItem())){
            sub4="3";
        }
        else if("B-".equals(ddsub4.getSelectedItem())){
            sub4="2.75";
        }
        else if("C+".equals(ddsub4.getSelectedItem())){
            sub4="2.25";
        }
        else if("C".equals(ddsub4.getSelectedItem())){
            sub4="2";
        }
        else if("C-".equals(ddsub4.getSelectedItem())){
            sub4="1.75";
        }
        else if("D+".equals(ddsub4.getSelectedItem())){
            sub4="1.25";
        }
        else if("D".equals(ddsub4.getSelectedItem())){
            sub4="1";
        }
        else if("D-".equals(ddsub4.getSelectedItem())){
            sub4="O.75";
        }
        else if("E".equals(ddsub4.getSelectedItem())){
            sub4="0";
        }
        else if("F".equals(ddsub4.getSelectedItem())){
            sub4="0";
        }
        
        
        if("A+".equals(ddsub5.getSelectedItem())){
            sub5="4.25";
        }
        else if("A".equals(ddsub5.getSelectedItem())){
            sub5="4";
        }
        else if("A-".equals(ddsub5.getSelectedItem())){
            sub5="3.75";
        }
        else if("B+".equals(ddsub5.getSelectedItem())){
            sub5="3.25";
        }
        else if("B".equals(ddsub5.getSelectedItem())){
            sub5="3";
        }
        else if("B-".equals(ddsub5.getSelectedItem())){
            sub5="2.75";
        }
        else if("C+".equals(ddsub5.getSelectedItem())){
            sub5="2.25";
        }
        else if("C".equals(ddsub5.getSelectedItem())){
            sub5="2";
        }
        else if("C-".equals(ddsub5.getSelectedItem())){
            sub5="1.75";
        }
        else if("D+".equals(ddsub5.getSelectedItem())){
            sub5="1.25";
        }
        else if("D".equals(ddsub5.getSelectedItem())){
            sub5="1";
        }
        else if("D-".equals(ddsub5.getSelectedItem())){
            sub5="O.75";
        }
        else if("E".equals(ddsub5.getSelectedItem())){
            sub5="0";
        }
        else if("F".equals(ddsub5.getSelectedItem())){
            sub5="0";
        }
        
        
        if("A+".equals(ddsub6.getSelectedItem())){
            sub6="4.25";
        }
        else if("A".equals(ddsub6.getSelectedItem())){
            sub6="4";
        }
        else if("A-".equals(ddsub6.getSelectedItem())){
            sub6="3.75";
        }
        else if("B+".equals(ddsub6.getSelectedItem())){
            sub6="3.25";
        }
        else if("B".equals(ddsub6.getSelectedItem())){
            sub6="3";
        }
        else if("B-".equals(ddsub6.getSelectedItem())){
            sub6="2.75";
        }
        else if("C+".equals(ddsub6.getSelectedItem())){
            sub6="2.25";
        }
        else if("C".equals(ddsub6.getSelectedItem())){
            sub6="2";
        }
        else if("C-".equals(ddsub6.getSelectedItem())){
            sub6="1.75";
        }
        else if("D+".equals(ddsub6.getSelectedItem())){
            sub6="1.25";
        }
        else if("D".equals(ddsub6.getSelectedItem())){
            sub6="1";
        }
        else if("D-".equals(ddsub6.getSelectedItem())){
            sub6="O.75";
        }
        else if("E".equals(ddsub6.getSelectedItem())){
            sub6="0";
        }
        else if("F".equals(ddsub6.getSelectedItem())){
            sub6="0";
        }
        
   
        double Sub1=Double.parseDouble(sub1);
        double Sub2=Double.parseDouble(sub2);
        double Sub3=Double.parseDouble(sub3);
        double Sub4=Double.parseDouble(sub4);
        double Sub5=Double.parseDouble(sub5);
        double Sub6=Double.parseDouble(sub6);
        
        double gpa=((Sub1*3)+(Sub2*3)+(Sub3*3)+(Sub4*2)+(Sub5*2)+(Sub6*2))/15;
        String numberAsString = String.format ("%.3f", gpa);
        txtgpa.setText(numberAsString);
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
        txtsearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtsub1 = new javax.swing.JTextField();
        txtsub2 = new javax.swing.JTextField();
        txtsub3 = new javax.swing.JTextField();
        txtsub5 = new javax.swing.JTextField();
        txtsub4 = new javax.swing.JTextField();
        txtsub6 = new javax.swing.JTextField();
        btnproceed = new javax.swing.JButton();
        ddsub6 = new javax.swing.JComboBox<>();
        ddsub2 = new javax.swing.JComboBox<>();
        ddsub3 = new javax.swing.JComboBox<>();
        ddsub4 = new javax.swing.JComboBox<>();
        ddsub5 = new javax.swing.JComboBox<>();
        ddsub1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        txtgpa = new javax.swing.JTextField();
        GPA = new javax.swing.JLabel();
        txtclearFeilds = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcourseid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("RESULT ENTER");

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2), "Marks Enter"));

        txtsub1.setEditable(false);

        txtsub2.setEditable(false);
        txtsub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsub2ActionPerformed(evt);
            }
        });

        txtsub3.setEditable(false);

        txtsub5.setEditable(false);

        txtsub4.setEditable(false);
        txtsub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsub4ActionPerformed(evt);
            }
        });

        txtsub6.setEditable(false);
        txtsub6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsub6ActionPerformed(evt);
            }
        });

        btnproceed.setText("Proceed");
        btnproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproceedActionPerformed(evt);
            }
        });

        ddsub6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        ddsub2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        ddsub3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        ddsub4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        ddsub5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        ddsub1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnproceed)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtsub5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtsub3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub4)
                            .addComponent(txtsub6))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ddsub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddsub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddsub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddsub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddsub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddsub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddsub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddsub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddsub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddsub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddsub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddsub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnproceed)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2), "Results"));

        txtgpa.setEditable(false);

        GPA.setText("GPA");

        txtclearFeilds.setText("Clear Fields");
        txtclearFeilds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclearFeildsActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SEND MAIL");

        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtclearFeilds)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GPA))
                    .addComponent(btnsubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtclearFeilds, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Student ID");

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Undergraduate Student's");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Course ID");

        txtcourseid.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtcourseid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcourseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsub2ActionPerformed

    private void txtsub6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsub6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsub6ActionPerformed

    private void txtsub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsub4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsub4ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        ResultSet rs = null;
        String sub1 = "mainsub1";
        String sub2 = "mainsub2";
        String sub3 = "choosesub1";
        String sub4 = "choosesub2";
        String sub5 = "choosesub3";
        String sub6 = "choosesub4";
        String courseid = "courseId";
        
        rs = DBop.LoadUndergraduateSubjects(txtsearch.getText());
        
        try{
            if(rs.next()){
                txtsub1.setText(rs.getString(sub1));
                txtsub2.setText(rs.getString(sub2));
                txtsub3.setText(rs.getString(sub3));
                txtsub4.setText(rs.getString(sub4));
                txtsub5.setText(rs.getString(sub5));
                txtsub6.setText(rs.getString(sub6));
                txtcourseid.setText(rs.getString(courseid));
            }else{
                JOptionPane.showMessageDialog(null,"NO DATA FOR THIS ID");
            }
        
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproceedActionPerformed
            calResult();
            JOptionPane.showMessageDialog(this, "Successfully Calculated");
            
        /* if(ddsub1.getSelectedItem().toString()=="A+"){
            ddsub1.setToolTipText("85");
         }
         else if(ddsub1.getSelectedItem().toString()=="A"){
            ddsub1.setToolTipText("80");
         }
         else if(ddsub1.getSelectedItem().toString()=="A-"){
            ddsub1.setToolTipText("75");
         }
         else if(ddsub1.getSelectedItem().toString()=="B+"){
            ddsub1.setToolTipText("70");
         }
         else if(ddsub1.getSelectedItem().toString()=="B"){
            ddsub1.setToolTipText("65");
         }
         else if(ddsub1.getSelectedItem().toString()=="B-"){
            ddsub1.setToolTipText("60");
         }
         else if(ddsub1.getSelectedItem().toString()=="C+"){
            ddsub1.setToolTipText("55");
         }
         else if(ddsub1.getSelectedItem().toString()=="C"){
            ddsub1.setToolTipText("50");
         }
         else if(ddsub1.getSelectedItem().toString()=="C-"){
            ddsub1.setToolTipText("45");
         }
         else if(ddsub1.getSelectedItem().toString()=="D+"){
            ddsub1.setToolTipText("40");
         }
         else if(ddsub1.getSelectedItem().toString()=="D"){
            ddsub1.setToolTipText("35");
         }
         else if(ddsub1.getSelectedItem().toString()=="D-"){
            ddsub1.setToolTipText("30");
         }
         else if(ddsub1.getSelectedItem().toString()=="F"){
            ddsub1.setToolTipText("80");
         }
         
         
        if(txtcourseid.getText().substring(0, 3).toString() == "UC1"){
        }*/
    }//GEN-LAST:event_btnproceedActionPerformed

    private void txtclearFeildsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclearFeildsActionPerformed
       clearFeilds();
    }//GEN-LAST:event_txtclearFeildsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UndergraduateStudentsMarksAndResults s = new UndergraduateStudentsMarksAndResults();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        try {
            UndergraduateResultDetails posd = new UndergraduateResultDetails();

            posd.setStudentid(txtsearch.getText());                              //get the we entered text feilds details and fill(set) them in to UndergraduateStudentDetails object
            posd.setCourseid(txtcourseid.getText());
            posd.setSub1(txtsub1.getText());
            posd.setSub2(txtsub2.getText());
            posd.setSub3(txtsub3.getText());
            posd.setSub4(txtsub4.getText());
            posd.setSub5(txtsub5.getText());
            posd.setSub6(txtsub6.getText());
            posd.setSub1re(ddsub1.getSelectedItem().toString());
            posd.setSub2re(ddsub2.getSelectedItem().toString());
            posd.setSub3re(ddsub3.getSelectedItem().toString());
            posd.setSub4re(ddsub4.getSelectedItem().toString());
            posd.setSub5re(ddsub5.getSelectedItem().toString());
            posd.setSub6re(ddsub6.getSelectedItem().toString());
            posd.setGpa(txtgpa.getText());
           
         

            boolean result = DBop.addUndergradauateResults(posd);  // parse add UndergraduateStudentDetails to add employee method
            // addundergraduatestudentdetails method return true or false.result get that

            if (result) {
                JOptionPane.showMessageDialog(this, "Successfully inserted !");

            } else {
                JOptionPane.showMessageDialog(this, "OOPS Error Occured While Inserting");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Fill The Form ");
        }


    }//GEN-LAST:event_btnsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(UndergraduateResultEnter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UndergraduateResultEnter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UndergraduateResultEnter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UndergraduateResultEnter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UndergraduateResultEnter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GPA;
    private javax.swing.JButton btnproceed;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> ddsub1;
    private javax.swing.JComboBox<String> ddsub2;
    private javax.swing.JComboBox<String> ddsub3;
    private javax.swing.JComboBox<String> ddsub4;
    private javax.swing.JComboBox<String> ddsub5;
    private javax.swing.JComboBox<String> ddsub6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton txtclearFeilds;
    private javax.swing.JTextField txtcourseid;
    private javax.swing.JTextField txtgpa;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsub1;
    private javax.swing.JTextField txtsub2;
    private javax.swing.JTextField txtsub3;
    private javax.swing.JTextField txtsub4;
    private javax.swing.JTextField txtsub5;
    private javax.swing.JTextField txtsub6;
    // End of variables declaration//GEN-END:variables
}
