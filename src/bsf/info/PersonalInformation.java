/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bsf.info;

<<<<<<< HEAD
import bsf.conn.DBMS;
import bsf.conn.JavaConnector;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
=======
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
/**
 *
 * @author rajat_000
 */
public class PersonalInformation extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInformation
     */
<<<<<<< HEAD
     private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    
    public PersonalInformation() {
        initComponents();
        con = JavaConnector.connectionDb();
        if (jOperation.getText().equals("update"))
            update();
    }
    
    private void update()
    {
        try{
           String sql =  "Select * from PersonalInformation where RegimentalNo=?";
           ps = con.prepareStatement(sql);
           ps.setInt(1, Integer.parseInt(jTRegimentalNo.getText()));
           rs = ps.executeQuery();
           
           if(rs.next())
           {
            this.jTFirstName.setText(rs.getString(2));
            this.jTMiddleName.setText(rs.getString(3));
            this.jTLastName.setText(rs.getString(4));
            this.jTPan.setText(rs.getString(5));
            this.jTRank.setText(rs.getString(6));
            this.jCSEX.setSelectedItem(rs.getString(7));
            this.jTPhoneNo.setText(rs.getString(8));
            this.jTPranNo.setText(rs.getString(9));
            this.jTBankAccountNo.setText(rs.getString(10));
            this.jIdCardno.setText(rs.getString(11));
            this.jTAdharNo.setText(rs.getString(12));
            this.jCDrivingLicense.setSelectedItem(rs.getString(13));
            this.jDDateOfBirth.setDate(rs.getDate(14));
            this.jDGovtServ.setDate(rs.getDate(15));
            this.jDBattalion.setDate(rs.getDate(16));
               
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Record Not Found");
           }
           sql =  "Select * from LeaveDetails where RegimentalNo=?";
           ps = con.prepareStatement(sql);
           ps.setInt(1, Integer.parseInt(jTRegimentalNo.getText()));
           rs = ps.executeQuery();
                      if(rs.next())
           {
            this.jDELFrom1.setDate(rs.getDate(2));
            this.jDELTo1.setDate(rs.getDate(3));
            this.jLEarn1.setText(rs.getString(4));
            this.jDELFrom2.setDate(rs.getDate(5));
            this.jDELTo2.setDate(rs.getDate(6));
            this.jLEarn2.setText(rs.getString(7));
            this.jDELFrom3.setDate(rs.getDate(8));
            this.jDELTo3.setDate(rs.getDate(9));
            this.jLEarn3.setText(rs.getString(10));
            this.jDCLFrom1.setDate(rs.getDate(11));
            this.jDCLTO1.setDate(rs.getDate(12));
            this.jLCLNoOFDays1.setText(rs.getString(13));
            this.jDCLFrom2.setDate(rs.getDate(14));
            this.jDCLTO2.setDate(rs.getDate(15));
            this.jLCLNoOFDays2.setText(rs.getString(16));
            this.jDCLFrom3.setDate(rs.getDate(17));
            this.jDCLTO3.setDate(rs.getDate(18));
            this.jLCLNoOFDays3.setText(rs.getString(19));
            this.jLTotal.setText(rs.getString(20));
               
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Record Not Found");
           }
                      
           sql =  "Select * from Running where RegimentalNo=?";
           ps = con.prepareStatement(sql);
           ps.setInt(1, Integer.parseInt(jTRegimentalNo.getText()));
           rs = ps.executeQuery();
           if(rs.next())
           {
            this.jCFPET.setSelectedItem(rs.getString(2));
            this.jCFPET2.setSelectedItem(rs.getString(3));
            this.jTFRemark.setText(rs.getString(4));
            this.jCAMC.setSelectedItem(rs.getString(5));
            this.jTAMCRemark.setText(rs.getString(6));
            this.jCARFC.setSelectedItem(rs.getString(7));
            this.jTARFCRemark.setText(rs.getString(8));
          
               
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Record Not Found");
           }
           ps.close();
           rs.close();
           FamilyInformation.jOperation.setText("update");

        }
        catch(Exception ex)
        {
            
        }
    }
    
=======
    public PersonalInformation() {
        initComponents();
    }

>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        Leave = new javax.swing.JPanel();
=======
        jLabel39 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jDELFrom1 = new com.toedter.calendar.JDateChooser();
        jDELTo1 = new com.toedter.calendar.JDateChooser();
        jDELFrom2 = new com.toedter.calendar.JDateChooser();
        jDELTo2 = new com.toedter.calendar.JDateChooser();
        jDELFrom3 = new com.toedter.calendar.JDateChooser();
        jDELTo3 = new com.toedter.calendar.JDateChooser();
        jLEarn2 = new javax.swing.JLabel();
        jLEarn3 = new javax.swing.JLabel();
        jDCLFrom1 = new com.toedter.calendar.JDateChooser();
        jDCLFrom2 = new com.toedter.calendar.JDateChooser();
        jDCLFrom3 = new com.toedter.calendar.JDateChooser();
        jDCLTO1 = new com.toedter.calendar.JDateChooser();
        jDCLTO2 = new com.toedter.calendar.JDateChooser();
        jDCLTO3 = new com.toedter.calendar.JDateChooser();
        jLCLNoOFDays1 = new javax.swing.JLabel();
        jLCLNoOFDays2 = new javax.swing.JLabel();
        jLCLNoOFDays3 = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jLEarn1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DateOfJoining = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDGovtServ = new com.toedter.calendar.JDateChooser();
        jDBattalion = new com.toedter.calendar.JDateChooser();
        Running = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jCFPET2 = new javax.swing.JComboBox();
        jCAMC = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jTFRemark = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jCFPET = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTARFCRemark = new javax.swing.JTextField();
        jCARFC = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jTAMCRemark = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PersonalInfo = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jIdCardno = new javax.swing.JTextField();
=======
        jTextField24 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
<<<<<<< HEAD
        jTLastName = new javax.swing.JTextField();
        jTBankAccountNo = new javax.swing.JTextField();
        jTPan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTPranNo = new javax.swing.JTextField();
        jTRank = new javax.swing.JTextField();
        jTAdharNo = new javax.swing.JTextField();
        jCBloodGroup = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTMiddleName = new javax.swing.JTextField();
        jTPhoneNo = new javax.swing.JTextField();
        jTFirstName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jCSEX = new javax.swing.JComboBox();
        jDDateOfBirth = new com.toedter.calendar.JDateChooser();
        jCDrivingLicense = new javax.swing.JComboBox();
        Submit = new javax.swing.JPanel();
        jBReset = new javax.swing.JButton();
        jBSubmit = new javax.swing.JButton();
=======
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField9 = new javax.swing.JTextField();

        jLabel39.setText("jLabel39");
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

<<<<<<< HEAD
        jScrollPane1.setPreferredSize(new java.awt.Dimension(631, 513));

        jPanel5.setPreferredSize(new java.awt.Dimension(720, 1000));

        Leave.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
=======
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35

        jLabel31.setText("2");

        jLabel30.setText("1");

        jLabel33.setText("2");

        jLabel23.setText("From");

        jLabel28.setText("To");

        jLabel25.setText("No Of Days");

<<<<<<< HEAD
        jLabel22.setText("Earn Leave :");

        jLabel27.setText("From");

        jLabel26.setText("Common Leave:");

        jLabel29.setText("No Of Days");

        jLabel34.setText("3");

        jLabel24.setText("To");

        jLabel35.setText("3");

        jLabel32.setText("1");

        jLabel40.setText("Remark :");

        jLabel41.setText("Total No Of Leave:");

        jDELFrom1.setDateFormatString("dd.MM.yyyy");

        jDELTo1.setDateFormatString("dd.MM.yyyy");
        jDELTo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDELTo1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDELTo1FocusLost(evt);
            }
        });
        jDELTo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDELTo1MouseClicked(evt);
            }
        });
        jDELTo1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDELTo1InputMethodTextChanged(evt);
            }
        });
        jDELTo1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDELTo1PropertyChange(evt);
            }
        });
        jDELTo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDELTo1KeyPressed(evt);
            }
        });

        jDELFrom2.setDateFormatString("dd.MM.yyyy");

        jDELTo2.setDateFormatString("dd.MM.yyyy");
        jDELTo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDELTo2FocusGained(evt);
            }
        });
        jDELTo2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDELTo2PropertyChange(evt);
            }
        });

        jDELFrom3.setDateFormatString("dd.MM.yyyy");

        jDELTo3.setDateFormatString("dd.MM.yyyy");
        jDELTo3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDELTo3PropertyChange(evt);
            }
        });

        jLEarn2.setForeground(new java.awt.Color(153, 153, 153));
        jLEarn2.setText("total");

        jLEarn3.setForeground(new java.awt.Color(153, 153, 153));
        jLEarn3.setText("total");

        jDCLFrom1.setDateFormatString("dd.MM.yyyy");

        jDCLFrom2.setDateFormatString("dd.MM.yyyy");

        jDCLFrom3.setDateFormatString("dd.MM.yyyy");

        jDCLTO1.setDateFormatString("dd.MM.yyyy");
        jDCLTO1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCLTO1PropertyChange(evt);
            }
        });

        jDCLTO2.setDateFormatString("dd.MM.yyyy");
        jDCLTO2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCLTO2PropertyChange(evt);
            }
        });

        jDCLTO3.setDateFormatString("dd.MM.yyyy");
        jDCLTO3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCLTO3PropertyChange(evt);
            }
        });

        jLCLNoOFDays1.setForeground(new java.awt.Color(153, 153, 153));
        jLCLNoOFDays1.setText("total");

        jLCLNoOFDays2.setForeground(new java.awt.Color(153, 153, 153));
        jLCLNoOFDays2.setText("total");

        jLCLNoOFDays3.setForeground(new java.awt.Color(153, 153, 153));
        jLCLNoOFDays3.setText("total");

        jLTotal.setForeground(new java.awt.Color(153, 153, 153));
        jLTotal.setText("total");

        jLEarn1.setForeground(new java.awt.Color(102, 102, 102));
        jLEarn1.setText("total");

        javax.swing.GroupLayout LeaveLayout = new javax.swing.GroupLayout(Leave);
        Leave.setLayout(LeaveLayout);
        LeaveLayout.setHorizontalGroup(
            LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeaveLayout.createSequentialGroup()
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeaveLayout.createSequentialGroup()
                                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDELFrom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDELFrom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDELFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeaveLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDELTo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDELTo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDELTo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLEarn3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(jLEarn2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(jLEarn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel25)))
                .addGap(29, 29, 29)
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(LeaveLayout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addGap(18, 18, 18)
                            .addComponent(jDCLFrom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(LeaveLayout.createSequentialGroup()
                            .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDCLFrom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDCLFrom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel27)))
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDCLTO2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDCLTO3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDCLTO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41))
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeaveLayout.createSequentialGroup()
                                .addComponent(jLCLNoOFDays2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLCLNoOFDays1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCLNoOFDays3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
            .addGroup(LeaveLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(80, 80, 80))
        );
        LeaveLayout.setVerticalGroup(
            LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeaveLayout.createSequentialGroup()
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeaveLayout.createSequentialGroup()
                        .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel41)))
                            .addComponent(jLabel25)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel32)
                                .addComponent(jDELFrom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDELTo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLEarn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel30)
                            .addComponent(jDCLFrom1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCLTO1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLCLNoOFDays1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(jLEarn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDELTo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDELFrom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCLFrom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCLTO2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCLNoOFDays2)
                        .addComponent(jLTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jLEarn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jDELFrom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDELTo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDCLFrom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDCLTO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLCLNoOFDays3)))
=======
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel22.setText("Earn Leave :");

        jLabel27.setText("From");

        jLabel26.setText("Common Leave:");

        jLabel29.setText("No Of Days");

        jLabel34.setText("3");

        jLabel24.setText("To");

        jLabel35.setText("3");

        jLabel32.setText("1");

        jLabel40.setText("Remark :");

        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });

        jLabel41.setText("Total No Of Leave:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel31))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField16)
                                    .addComponent(jTextField22)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField17)
                                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel28)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField24))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(jTextField31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(jTextField32)
                                    .addComponent(jTextField19)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel41))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23)
                                .addComponent(jLabel25)
                                .addComponent(jLabel26)
                                .addComponent(jLabel27)
                                .addComponent(jLabel28)
                                .addComponent(jLabel29))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)
                        .addComponent(jLabel32)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Personal Information");

<<<<<<< HEAD
        DateOfJoining.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date Of Joining", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
=======
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date Of Joining", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35

        jLabel19.setText("Govt. Serv. :");

        jLabel18.setText("Battalion :");

<<<<<<< HEAD
        javax.swing.GroupLayout DateOfJoiningLayout = new javax.swing.GroupLayout(DateOfJoining);
        DateOfJoining.setLayout(DateOfJoiningLayout);
        DateOfJoiningLayout.setHorizontalGroup(
            DateOfJoiningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DateOfJoiningLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDGovtServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jDBattalion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DateOfJoiningLayout.setVerticalGroup(
            DateOfJoiningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DateOfJoiningLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DateOfJoiningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBattalion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jDGovtServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Running.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Running", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel38.setText("ARFC:");

        jCFPET2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Done", "Not Done", " " }));

        jCAMC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Done", "Not Done", " " }));
        jCAMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAMCActionPerformed(evt);
=======
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel19)
                .addGap(28, 28, 28)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Running", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel38.setText("ARFC:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Done", "Not Done", " " }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Done", "Not Done", " " }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
            }
        });

        jLabel36.setText("FPET :");

        jLabel37.setText("AMC :");

<<<<<<< HEAD
        jCFPET.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Done", "Not Done", " " }));
        jCFPET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCFPETActionPerformed(evt);
=======
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Done", "Not Done", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
            }
        });

        jLabel17.setText("First Cycle :");

        jLabel20.setText("Second Cycle :");

<<<<<<< HEAD
        jCARFC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Done", "Not Done", " " }));
        jCARFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCARFCActionPerformed(evt);
=======
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Done", "Not Done", " " }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
            }
        });

        jLabel21.setText("Remark :");

<<<<<<< HEAD
        javax.swing.GroupLayout RunningLayout = new javax.swing.GroupLayout(Running);
        Running.setLayout(RunningLayout);
        RunningLayout.setHorizontalGroup(
            RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RunningLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addGap(101, 101, 101)
                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCAMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RunningLayout.createSequentialGroup()
                        .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RunningLayout.createSequentialGroup()
                                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jCFPET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jCFPET2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCARFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RunningLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFRemark, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(jTAMCRemark)
                                    .addComponent(jTARFCRemark)))
                            .addGroup(RunningLayout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel21)))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        RunningLayout.setVerticalGroup(
            RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RunningLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addComponent(jLabel17))
                .addGap(15, 15, 15)
                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCFPET2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCFPET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jTFRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCAMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jTAMCRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCARFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTARFCRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
=======
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(101, 101, 101)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(101, 101, 101)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(101, 101, 101)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel21))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Regimental No :");

<<<<<<< HEAD
        PersonalInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
=======
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35

        jLabel14.setText("Adhar No :");

        jLabel5.setText("PAN :");

        jLabel11.setText("Bank Acount No :");

        jLabel6.setText("Rank :");

        jLabel13.setText("ID Card No:");

        jLabel4.setText("Last Name :");

        jLabel16.setText("Date Of Birth :");

        jLabel7.setText("SEX :");

<<<<<<< HEAD
        jTLastName.setToolTipText("Enter Last Name");
        jTLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLastNameActionPerformed(evt);
            }
        });
        jTLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTLastNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTLastNameKeyTyped(evt);
            }
        });

        jTBankAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBankAccountNoActionPerformed(evt);
            }
        });
        jTBankAccountNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBankAccountNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTBankAccountNoKeyTyped(evt);
=======
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
            }
        });

        jLabel3.setText("Middle Name :");

        jLabel8.setText("Phone No :");

<<<<<<< HEAD
        jLabel2.setText("First Name :");

        jCBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jCBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBloodGroupActionPerformed(evt);
            }
        });

=======
        jRadioButton1.setText("YES");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("NO");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
        jLabel9.setText("Blood Group :");

        jLabel10.setText("PRAN No :");

<<<<<<< HEAD
        jTMiddleName.setToolTipText("Enter Middle Name");
        jTMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMiddleNameActionPerformed(evt);
            }
        });
        jTMiddleName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTMiddleNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTMiddleNameKeyTyped(evt);
            }
        });

        jTPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPhoneNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPhoneNoKeyTyped(evt);
            }
        });

        jTFirstName.setToolTipText("Enter First Name");
        jTFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFirstNameFocusLost(evt);
            }
        });
        jTFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFirstNameActionPerformed(evt);
            }
        });
        jTFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFirstNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFirstNameKeyTyped(evt);
=======
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
            }
        });

        jLabel15.setText("Driving License:");

<<<<<<< HEAD
        jCSEX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female", " " }));
        jCSEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSEXActionPerformed(evt);
            }
        });

        jCDrivingLicense.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Yes", "No" }));

        javax.swing.GroupLayout PersonalInfoLayout = new javax.swing.GroupLayout(PersonalInfo);
        PersonalInfo.setLayout(PersonalInfoLayout);
        PersonalInfoLayout.setHorizontalGroup(
            PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInfoLayout.createSequentialGroup()
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(34, 34, 34)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIdCardno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PersonalInfoLayout.createSequentialGroup()
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTRank)
                            .addComponent(jTFirstName)
                            .addComponent(jTLastName)
                            .addComponent(jTPhoneNo)
                            .addComponent(jTPranNo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(138, 138, 138)
                .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PersonalInfoLayout.createSequentialGroup()
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
=======
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField10))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField5)
                                .addComponent(jTextField1)
                                .addComponent(jTextField3)
                                .addComponent(jTextField6)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
<<<<<<< HEAD
                        .addGap(52, 52, 52)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTPan, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jTMiddleName)
                            .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCSEX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTBankAccountNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PersonalInfoLayout.createSequentialGroup()
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(36, 36, 36)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jTAdharNo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PersonalInfoLayout.setVerticalGroup(
            PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInfoLayout.createSequentialGroup()
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jCSEX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jCBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTBankAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTAdharNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jDDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PersonalInfoLayout.createSequentialGroup()
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTPranNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jIdCardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jCDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jBReset.setText("Reset");

        jBSubmit.setText("Submit ");
        jBSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubmitLayout = new javax.swing.GroupLayout(Submit);
        Submit.setLayout(SubmitLayout);
        SubmitLayout.setHorizontalGroup(
            SubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jBSubmit)
                .addGap(58, 58, 58)
                .addComponent(jBReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubmitLayout.setVerticalGroup(
            SubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSubmit)
                    .addComponent(jBReset))
                .addContainerGap())
        );

        jTRegimentalNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jOperation.setFont(new java.awt.Font("Serif", 0, 3)); // NOI18N
        jOperation.setForeground(new java.awt.Color(240, 240, 240));
=======
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8)
                            .addComponent(jTextField11)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel16)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateOfJoining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Leave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Running, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTRegimentalNo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(jOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(644, 644, 644))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTRegimentalNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateOfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Leave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Running, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(791, 791, 791))
=======
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
        );

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void jBSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmitActionPerformed
        // TODO add your handling code here:
        /*
        "RegimentalNo" INTEGER PRIMARY KEY  NOT NULL ,"First Name" CHAR,"Middle Name" CHAR,"Last Name" CHAR,"PAN" VARCHAR,"Rank " VARCHAR DEFAULT (null) ,"SEX" VARCHAR DEFAULT (null) ,"Phone No " INTEGER,"Blood Group " VARCHAR,"PRAN No " INTEGER,"Bank Acount No " VARCHAR DEFAULT (null) ,"ID Card No" INTEGER
        ,"Adhar No " VARCHAR,"Driving License" BOOL,"Date Of Birth " DATETIME,"Govt. Serv. " DATETIME,"Battalion " DATETIME)
INSERT INTO "main"."PersonalInformation" SELECT "RegimentalNo","First Name","Middle Name","Last Name","PAN","Rank ","SEX","Phone No ","Blood Group ","PRAN No ","Bank Acount No ","ID Card No","Adhar No ","Driving License","Date Of Birth ","Govt. Serv. ","Battalion 
        */
        try{
            String st = "Insert into PersonalInformation (RegimentalNo,First_Name,Middle_Name,Last_Name,PAN,Rank,SEX,Phone NO,Blood_Group,PRAN_NO,Bank_Account_No,ID_Card_No,Adhar_No,Driving_License,Date_Of_Birth,Govt._Serv.,Battalion) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(st);
            ps.setInt(1, Integer.parseInt(jTRegimentalNo.getText()));
            ps.setString(2, jTFirstName.getText());
            ps.setString(3, jTMiddleName.getText());
            ps.setString(4, jTLastName.getText());
            ps.setString(5, jTPan.getText());
            ps.setString(6, jTRank.getText());
            ps.setString(7, jCSEX.getSelectedItem().toString());
            ps.setInt(8, Integer.parseInt(jTPhoneNo.getText()));
            ps.setString(9, jTPranNo.getText());
            ps.setString(10, jTBankAccountNo.getText());
            ps.setInt(11, Integer.parseInt(jIdCardno.getText()));
            ps.setString(12, jTAdharNo.getText());
            ps.setString(13, jCDrivingLicense.getSelectedItem().toString());
            ps.setDate(14,Date.valueOf( jDDateOfBirth.getDate().toString()));
            ps.setDate(15,Date.valueOf( jDGovtServ.getDate().toString()));
            ps.setDate(16,Date.valueOf( jDBattalion.getDate().toString()));
            rs= ps.executeQuery();

            st = "Insert into LeaveDetails (RegimentalNo,EarnleaveFrom1,EarnleaveTo,ElNoOfDays1,EarnleaveFrom2,EarnleaveTO2,ELNoOfDays2,EarnleaveFrom3,EarnleaveTo3,ELNoOfDays3,CommonleaveFrom1,CommonleaveTo1,CLNoOfDays1,CommonleaveFrom2, CommonleaveTo2,CLNoOfDays2,CommonleaveFrom3,CommonleaveTo3,CLNoOfDays3,TotalNoOfDays) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(st);
            
            ps.setInt(1, Integer.parseInt(jTRegimentalNo.getText()));
            ps.setDate(2,Date.valueOf( jDELFrom1.getDate().toString()));
            ps.setDate(3,Date.valueOf( jDELTo1.getDate().toString()));
            ps.setInt(4,Integer.parseInt(jLEarn1.getText()));
            ps.setDate(5,Date.valueOf( jDELFrom2.getDate().toString()));
            ps.setDate(6,Date.valueOf( jDELTo2.getDate().toString()));
            ps.setInt(7,Integer.parseInt(jLEarn2.getText()));
            ps.setDate(8,Date.valueOf( jDELFrom3.getDate().toString()));
            ps.setDate(9,Date.valueOf( jDELTo3.getDate().toString()));
            ps.setInt(10,Integer.parseInt(jLEarn3.getText()));
            ps.setDate(11,Date.valueOf( jDCLFrom1.getDate().toString()));
            ps.setDate(12,Date.valueOf( jDCLTO1.getDate().toString()));
            ps.setInt(13,Integer.parseInt(jLCLNoOFDays1.getText()));
            ps.setDate(14,Date.valueOf( jDCLFrom2.getDate().toString()));
            ps.setDate(15,Date.valueOf( jDCLTO2.getDate().toString()));
            ps.setInt(16,Integer.parseInt(jLCLNoOFDays2.getText()));
            ps.setDate(17,Date.valueOf( jDCLFrom3.getDate().toString()));
            ps.setDate(18,Date.valueOf( jDCLTO3.getDate().toString()));
            ps.setInt(19,Integer.parseInt(jLCLNoOFDays3.getText()));
            ps.setInt(20,Integer.parseInt(jLTotal.getText()));
            
            rs= ps.executeQuery();

            st = "Insert into Running (RegimentalNo,FPETFirstCycle,FPETSecondCycle,FPETRemark,AMCFirstCycle,AMCRemark,ARFCFirstCycle,ARFCRemark) values (?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(st);
            ps.setInt(1, Integer.parseInt(jTRegimentalNo.getText()));
            ps.setString(2, jCFPET.getSelectedItem().toString());
            ps.setString(3, jCFPET2.getSelectedItem().toString());
            ps.setString(4, jTFRemark.getText());
            ps.setString(5, jCAMC.getSelectedItem().toString());
            ps.setString(6, jTAMCRemark.getText());
            ps.setString(7, jCARFC.getSelectedItem().toString());
            ps.setString(8, jTARFCRemark.getText());
          
            ps.close();
            rs.close();
            new FamilyInformation().setVisible(true);
            FamilyInformation.jTRegimentalNo.setText(this.jTRegimentalNo.getText());
         this.setVisible(false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jBSubmitActionPerformed

    private void jCSEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSEXActionPerformed

    private void jTFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFirstNameActionPerformed

    private void jTMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMiddleNameActionPerformed

    private void jCARFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCARFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCARFCActionPerformed

    private void jCFPETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCFPETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCFPETActionPerformed

    private void jCAMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCAMCActionPerformed

    private void jCBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBloodGroupActionPerformed

    private void jTBankAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBankAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBankAccountNoActionPerformed

    private void jTFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFirstNameFocusGained
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jTFirstNameFocusGained

    private void jTFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFirstNameFocusLost
        // TODO add your handling code here:
             
    }//GEN-LAST:event_jTFirstNameFocusLost

    private void jTFirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFirstNameKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if((key >= evt.VK_0 && key <= evt.VK_9)|| key == evt.VK_SPACE)
            JOptionPane.showMessageDialog(null,"DIGITS/WIDE SPACE not Allowed");
    }//GEN-LAST:event_jTFirstNameKeyTyped

    private void jTMiddleNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMiddleNameKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if((key >= evt.VK_0 && key <= evt.VK_9)|| key == evt.VK_SPACE)
            JOptionPane.showMessageDialog(null,"DIGITS/WIDE SPACE not Allowed");
    }//GEN-LAST:event_jTMiddleNameKeyTyped

    private void jTLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLastNameKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if((key >= evt.VK_0 && key <= evt.VK_9)|| key == evt.VK_SPACE)
            JOptionPane.showMessageDialog(null,"DIGITS/WIDE SPACE not Allowed");
    }//GEN-LAST:event_jTLastNameKeyTyped

    private void jTPhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPhoneNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPhoneNoKeyTyped

    private void jTBankAccountNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBankAccountNoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if ( ( key >= evt.VK_0 && key <= evt.VK_9 ) || ( key == evt.VK_SPACE  ) )
            JOptionPane.showMessageDialog(null,"Please Enter Bank account no");
    }//GEN-LAST:event_jTBankAccountNoKeyTyped

    private void jDELTo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDELTo1FocusGained
        // TODO add your handling code here:
        try{
            int datefrom = Integer.parseInt(jDELFrom1.getDate().toString());
        JOptionPane.showMessageDialog(null,""+datefrom);
        int dateto = Integer.parseInt(jDELTo1.getDate().toString());
            
        int d = 0;
        d = dateto - datefrom;
        jLEarn1.setText("" +d);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELTo1FocusGained

    private void jDELTo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDELTo2FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jDELTo2FocusGained

    private void jTFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFirstNameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if((key >= evt.VK_0 && key <= evt.VK_9)|| key == evt.VK_SPACE && key != evt.VK_BACK_SPACE )
            JOptionPane.showMessageDialog(null,"DIGITS/WIDE SPACE not Allowed");
    }//GEN-LAST:event_jTFirstNameKeyPressed

    private void jTMiddleNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMiddleNameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if((key >= evt.VK_0 && key <= evt.VK_9)|| key == evt.VK_SPACE && key != evt.VK_BACK_SPACE )
            JOptionPane.showMessageDialog(null,"DIGITS/WIDE SPACE not Allowed");
    }//GEN-LAST:event_jTMiddleNameKeyPressed

    private void jTLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLastNameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if((key >= evt.VK_0 && key <= evt.VK_9)|| key == evt.VK_SPACE && key != evt.VK_BACK_SPACE )
            JOptionPane.showMessageDialog(null,"DIGITS/WIDE SPACE not Allowed");
    }//GEN-LAST:event_jTLastNameKeyPressed

    private void jTPhoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPhoneNoKeyPressed
        // TODO add your handling code here:
                       int key = evt.getKeyCode();
        
        if( !( key >= evt.VK_0 && key <= evt.VK_9 )|| key == evt.VK_SPACE || key != evt.VK_BACK_SPACE )
            JOptionPane.showMessageDialog(null,"Please Enter 10 digits No.");

    }//GEN-LAST:event_jTPhoneNoKeyPressed

    private void jTBankAccountNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBankAccountNoKeyPressed
        // TODO add your handling code here:
         int key = evt.getKeyCode();
        
        if(!(key >= evt.VK_0 && key <= evt.VK_9)|| key == evt.VK_SPACE || key != evt.VK_BACK_SPACE )
            JOptionPane.showMessageDialog(null,"Please Enter proper Bank account no");
    }//GEN-LAST:event_jTBankAccountNoKeyPressed

    private void jDELTo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDELTo1FocusLost
        // TODO add your handling code here:
        try{
            int datefrom = Integer.parseInt(jDELFrom1.getDate().toString());
        
        int dateto = Integer.parseInt(jDELTo1.getDate().toString());
            
        int d = 0;
        d = dateto - datefrom;
        jLEarn1.setText("" +d);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELTo1FocusLost

    private void jDELTo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDELTo1MouseClicked
        // TODO add your handling code here:
        try{
            int datefrom = Integer.parseInt(jDELFrom1.getDate().toString());
        JOptionPane.showMessageDialog(null,""+datefrom);
        
        int dateto = Integer.parseInt(jDELTo1.getDate().toString());
            
        int d = 0;
        d = dateto - datefrom;
        jLEarn1.setText("" +d);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELTo1MouseClicked

    private void jTLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLastNameActionPerformed

    private void jDELTo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDELTo1KeyPressed
        // TODO add your handling code here:
         try{
            int datefrom = Integer.parseInt(jDELFrom1.getDate().toString());
        JOptionPane.showMessageDialog(null,""+datefrom);
        
        int dateto = Integer.parseInt(jDELTo1.getDate().toString());
            
        int d = 0;
        d = dateto - datefrom;
        jLEarn1.setText("" +d);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELTo1KeyPressed

    private void jDELTo1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDELTo1InputMethodTextChanged
        // TODO add your handling code here:
         try{
        int datefrom = Integer.parseInt(jDELFrom1.getDate().toString());
        JOptionPane.showMessageDialog(null,""+datefrom);
        
        int dateto = Integer.parseInt(jDELTo1.getDate().toString());
            
        int d = 0;
        d = dateto - datefrom;
        jLEarn1.setText("" +d);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELTo1InputMethodTextChanged

    private void jDELTo1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDELTo1PropertyChange
        // TODO add your handling code here:
           try{
               Instant dfrom = jDELFrom1.getDate().toInstant();
               Instant dto = jDELTo1.getDate().toInstant();
               
               long d = Duration.between(dfrom, dto).toDays();
               if ( d> 0)
               {
                   jLEarn1.setText(""+d);
                   jLTotal.setText((Integer.parseInt(jLEarn1.getText()))+"");
                     
                   if ( jLEarn2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn2.getText()))+"");
           
                   if ( jLEarn3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn3.getText()))+"");
           
                   if ( jLCLNoOFDays1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays1.getText()))+"");
           
                   if ( jLCLNoOFDays2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays2.getText()))+"");
           
                   if ( jLCLNoOFDays3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays3.getText()))+"");
               
               }
               else
                   JOptionPane.showMessageDialog(null,"please choose correct Date");
        
           }
           catch(NullPointerException ex)
           {
               
           }
           
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELTo1PropertyChange

    private void jDELTo2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDELTo2PropertyChange
        // TODO add your handling code here:
         try{
               Instant dfrom = jDELFrom2.getDate().toInstant();
               Instant dto = jDELTo2.getDate().toInstant();
               
               long d = Duration.between(dfrom, dto).toDays();
               
               if ( d> 0)
               {
                   jLEarn2.setText(""+d);
                   jLTotal.setText((Integer.parseInt(jLEarn2.getText()))+"");
                     
                   if ( jLEarn1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn1.getText()))+"");
           
                   if ( jLEarn3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn3.getText()))+"");
           
                   if ( jLCLNoOFDays1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays1.getText()))+"");
           
                   if ( jLCLNoOFDays2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays2.getText()))+"");
           
                   if ( jLCLNoOFDays3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays3.getText()))+"");
               
               }
               else
                   JOptionPane.showMessageDialog(null,"please choose correct Date");
        
           }
           catch(NullPointerException ex)
           {
               
           }
           
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELTo2PropertyChange

    private void jDELTo3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDELTo3PropertyChange
        // TODO add your handling code here:
         try{
               Instant dfrom = jDELFrom3.getDate().toInstant();
               Instant dto = jDELTo3.getDate().toInstant();
               
               long d = Duration.between(dfrom, dto).toDays();
               if ( d> 0)
               {
                   jLEarn3.setText(""+d);
                   jLTotal.setText((Integer.parseInt(jLEarn3.getText()))+"");
                     
                   if ( jLEarn1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn1.getText()))+"");
           
                   if ( jLEarn2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn2.getText()))+"");
           
                   if ( jLCLNoOFDays1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays1.getText()))+"");
           
                   if ( jLCLNoOFDays2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays2.getText()))+"");
           
                   if ( jLCLNoOFDays3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays3.getText()))+"");
               
               }
               else
                   JOptionPane.showMessageDialog(null,"please choose correct Date");
        
           }
           catch(NullPointerException ex)
           {
               
           }
           
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELTo3PropertyChange

    private void jDCLTO1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCLTO1PropertyChange
        // TODO add your handling code here:
         try{
               Instant dfrom = jDCLFrom1.getDate().toInstant();
               Instant dto = jDCLTO1.getDate().toInstant();
               
               long d = Duration.between(dfrom, dto).toDays();
               if ( d> 0)
               {
                   jLCLNoOFDays1.setText(""+d);
                   jLTotal.setText((Integer.parseInt(jLCLNoOFDays1.getText()))+"");
                     
                   if ( jLEarn1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn1.getText()))+"");
           
                   if ( jLEarn3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn3.getText()))+"");
           
                   if ( jLEarn2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn2.getText()))+"");
           
                   if ( jLCLNoOFDays2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays2.getText()))+"");
           
                   if ( jLCLNoOFDays3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays3.getText()))+"");
               
               }
               else
                   JOptionPane.showMessageDialog(null,"please choose correct Date");
           }
           catch(NullPointerException ex)
           {
               
           }
           
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDCLTO1PropertyChange

    private void jDCLTO2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCLTO2PropertyChange
        // TODO add your handling code here:
        try{
               Instant dfrom = jDCLFrom2.getDate().toInstant();
               Instant dto = jDCLTO2.getDate().toInstant();
               
               long d = Duration.between(dfrom, dto).toDays();
               if ( d> 0)
               {
                   jLCLNoOFDays2.setText(""+d);
                   jLTotal.setText((Integer.parseInt(jLCLNoOFDays2.getText()))+"");
                     
                   if ( jLEarn1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn1.getText()))+"");
           
                   if ( jLEarn3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn3.getText()))+"");
           
                   if ( jLEarn2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn2.getText()))+"");
           
                   if ( jLCLNoOFDays1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays1.getText()))+"");
           
                   if ( jLCLNoOFDays3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays3.getText()))+"");
               
               }
               else
                   JOptionPane.showMessageDialog(null,"please choose correct Date");
               
           }
           catch(NullPointerException ex)
           {
               
           }
           
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDCLTO2PropertyChange

    private void jDCLTO3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCLTO3PropertyChange
        // TODO add your handling code here:
        try{
               Instant dfrom = jDCLFrom3.getDate().toInstant();
               Instant dto = jDCLTO3.getDate().toInstant();
               
               long d = Duration.between(dfrom, dto).toDays();
               if ( d> 0)
               {
                   jLCLNoOFDays3.setText(""+d);
                  jLTotal.setText((Integer.parseInt(jLCLNoOFDays3.getText()))+"");
                     
                   if ( jLEarn1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn1.getText()))+"");
           
                   if ( jLEarn3.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn3.getText()))+"");
           
                   if ( jLEarn2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLEarn2.getText()))+"");
           
                   if ( jLCLNoOFDays2.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays2.getText()))+"");
           
                   if ( jLCLNoOFDays1.getText() != null )
                     jLTotal.setText((Integer.parseInt(jLTotal.getText())+Integer.parseInt(jLCLNoOFDays1.getText()))+"");
               }
               else
                   JOptionPane.showMessageDialog(null,"please choose correct Date");
        
           }
           catch(NullPointerException ex)
           {
               
           }
           
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDCLTO3PropertyChange
=======
    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35

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
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JPanel DateOfJoining;
    private javax.swing.JPanel Leave;
    private javax.swing.JPanel PersonalInfo;
    private javax.swing.JPanel Running;
    private javax.swing.JPanel Submit;
    private javax.swing.JButton jBReset;
    private javax.swing.JButton jBSubmit;
    public javax.swing.JComboBox jCAMC;
    public javax.swing.JComboBox jCARFC;
    public javax.swing.JComboBox jCBloodGroup;
    public javax.swing.JComboBox jCDrivingLicense;
    public javax.swing.JComboBox jCFPET;
    public javax.swing.JComboBox jCFPET2;
    public javax.swing.JComboBox jCSEX;
    private com.toedter.calendar.JCalendar jCalendar1;
    public com.toedter.calendar.JDateChooser jDBattalion;
    public com.toedter.calendar.JDateChooser jDCLFrom1;
    public com.toedter.calendar.JDateChooser jDCLFrom2;
    public com.toedter.calendar.JDateChooser jDCLFrom3;
    public com.toedter.calendar.JDateChooser jDCLTO1;
    public com.toedter.calendar.JDateChooser jDCLTO2;
    public com.toedter.calendar.JDateChooser jDCLTO3;
    public com.toedter.calendar.JDateChooser jDDateOfBirth;
    public com.toedter.calendar.JDateChooser jDELFrom1;
    public com.toedter.calendar.JDateChooser jDELFrom2;
    public com.toedter.calendar.JDateChooser jDELFrom3;
    public com.toedter.calendar.JDateChooser jDELTo1;
    public com.toedter.calendar.JDateChooser jDELTo2;
    public com.toedter.calendar.JDateChooser jDELTo3;
    public com.toedter.calendar.JDateChooser jDGovtServ;
    public javax.swing.JTextField jIdCardno;
    public javax.swing.JLabel jLCLNoOFDays1;
    public javax.swing.JLabel jLCLNoOFDays2;
    public javax.swing.JLabel jLCLNoOFDays3;
    private javax.swing.JLabel jLEarn1;
    public javax.swing.JLabel jLEarn2;
    public javax.swing.JLabel jLEarn3;
    public javax.swing.JLabel jLTotal;
=======
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabel39;
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
<<<<<<< HEAD
    public static final javax.swing.JLabel jOperation = new javax.swing.JLabel();
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTAMCRemark;
    public javax.swing.JTextField jTARFCRemark;
    public javax.swing.JTextField jTAdharNo;
    public javax.swing.JTextField jTBankAccountNo;
    public javax.swing.JTextField jTFRemark;
    public javax.swing.JTextField jTFirstName;
    public javax.swing.JTextField jTLastName;
    public javax.swing.JTextField jTMiddleName;
    public javax.swing.JTextField jTPan;
    public javax.swing.JTextField jTPhoneNo;
    private javax.swing.JTextField jTPranNo;
    public javax.swing.JTextField jTRank;
    public static final javax.swing.JLabel jTRegimentalNo = new javax.swing.JLabel();
=======
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
>>>>>>> a8fee7df1a23f0ccd90e67e18f60cd92053cbc35
    // End of variables declaration//GEN-END:variables
}