/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bsf.conn;

import bsf.info.*;
import bsf.main.info;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import  java.text.*;
import java.awt.print.*;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.*;
import javax.print.attribute.standard.PrinterStateReasons;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rajat_000
 */
public class DBMS {
    
    
  private static  Connection con = null;
  private static  ResultSet rs = null;
  private static  PreparedStatement ps = null;
  private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
      Font.BOLD);
 
  private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
      Font.NORMAL, BaseColor.RED);
  private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
      Font.BOLD);
  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
      Font.BOLD);

  
  
  static
    {
       con = JavaConnector.connectionDb();
    }
   
    public static void updateTable(javax.swing.JTable table,String s,int reg)
    {
        try {
        String  sql =  "Select * from "+s+" where RegimentalNo =?";
        ps = con.prepareStatement(sql);
        ps.setInt(1, reg);
        rs = ps.executeQuery();

        table.setModel(DbUtils.resultSetToTableModel(rs));
        
            ps.close();
            rs.close();
        
        }
        catch(Exception ex)
        {
            
        }
    }
    public static void updateTable(javax.swing.JTable table,String s)
    {
        try {
        String  sql =  "Select * from "+s;
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        table.setModel(DbUtils.resultSetToTableModel(rs));
        
            ps.close();
            rs.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }
    
    
    public static void deleteRecord(int reg,String file)
    {
         try{
               
                String sql = "delete from "+ file + " where RegimentalNo=?";
                ps = con.prepareStatement(sql);
                ps.setInt(1,reg);
                int val = ps.executeUpdate();
                
                if(val == 0)
                    JOptionPane.showMessageDialog(null,"No record Found");
                else
                    JOptionPane.showMessageDialog(null,"Deleted");
                rs.close();
                ps.close();
            
            } 
         catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"Enter Numeric Value");
        }

        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }

    }
    public static void printTable(javax.swing.JTable table1,javax.swing.JTable table2,javax.swing.JTable table3,javax.swing.JTable table4,javax.swing.JTable table5)
    {
        MessageFormat header = new MessageFormat("BSF DataBase");
        MessageFormat footer = new MessageFormat("@copyrightReserved BSF");
      try {         
          table1.print(JTable.PrintMode.NORMAL, header, footer);
          table2.print(JTable.PrintMode.NORMAL, header, footer);
          table3.print(JTable.PrintMode.NORMAL, header, footer);
          table4.print(JTable.PrintMode.NORMAL, header, footer);
          table5.print(JTable.PrintMode.NORMAL, header, footer);
      } 
      catch (PrinterException ex) {
          Logger.getLogger(DBMS.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    public static String[][] getTable(javax.swing.JTable table)
    {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        
        int nRow = dtm.getRowCount();
        int nCol = dtm.getColumnCount();
        
        String[][] tableData = new String[nRow][nCol];

        for (int i = 0; i< nRow;  i++)
        {
            for (int j = 0; j < nCol; j++)
            {
                tableData[i][j] = ""+ dtm.getValueAt(i, j);
            }
        }
        return tableData;
    }
    public static String[] getTableHeader(javax.swing.JTable table)
    {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        
        int nCol = dtm.getColumnCount();
        
        String[] tableData = new String[nCol];

            for (int j = 0; j < nCol; j++)
            {
                tableData[j] = ""+ dtm.getColumnName(j);
            }
        return tableData;
    }
    public static void pdfConvertor(javax.swing.JTable table,String path)
    {      try {
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream(path));
      document.open();
      addTitlePage(document);
      addContent(document);
      document.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    }
  
  private static void addTitlePage(Document document)
      throws DocumentException {
    Paragraph preface = new Paragraph();
    // We add one empty line
    addEmptyLine(preface, 1);
    // Lets write a big header
    catFont.setColor(BaseColor.BLUE);
    preface.add(new Paragraph("BSF DATABASE", catFont));

    addEmptyLine(preface, 1);
    // Will create: Report generated by: _name, _date
    preface.add(new Paragraph("Report generated by: " + System.getProperty("user.name") + ", " + new java.util.Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        smallBold));
    addEmptyLine(preface, 3);
    preface.add(new Paragraph("This document gives Database of BSF ",
        smallBold));

    addEmptyLine(preface, 20);

    preface.add(new Paragraph("@copyright BSF",
        redFont));

    document.add(preface);
    // Start a new page
    document.newPage();
  }

  private static void addContent(Document document) throws DocumentException {
    Anchor anchor = new Anchor("Personal Info", catFont);
    anchor.setName("Personal Info");

    // Second parameter is the number of the chapter
    Chapter catPart = new Chapter(new Paragraph(anchor), 1);

    Paragraph subPara = new Paragraph(null, smallBold);
    Section subCatPart = catPart.addSection(subPara);
    // add a table
    subPara.setAlignment(Element.ALIGN_LEFT);
    createTable(subCatPart,info.personalInfo);

    // now add all this to the document
    document.add(catPart);

    // Next section
    anchor = new Anchor("Personal Information", catFont);
    anchor.setName("Personal Information");

    // Second parameter is the number of the chapter
     catPart = new Chapter(new Paragraph(anchor), 1);

     subPara = new Paragraph("Running Details", smallBold);
     subPara.setAlignment(Element.ALIGN_LEFT);
    
     subCatPart = catPart.addSection(subPara);
    // add a table
      addEmptyLine(subPara, 3);
    createTable(subCatPart,info.runningDetails);

    // now add all this to the document
    document.add(catPart);

    // Next section
    anchor = new Anchor("Personal Information", catFont);
    anchor.setName("Personal Information");

    // Thrd parameter is the number of the chapter
     catPart = new Chapter(new Paragraph(anchor), 1);

     subPara = new Paragraph("Leave Details", smallBold);
     subCatPart = catPart.addSection(subPara);
    // add a table
      addEmptyLine(subPara, 3);
      subPara.setAlignment(Element.ALIGN_LEFT);
      
      createTable(subCatPart,info.leaveDetails);

    // now add all this to the document
    document.add(catPart);

    // Next section
    anchor = new Anchor("Family Information", catFont);
    anchor.setName("Family Information");

    // Fourth parameter is the number of the chapter
     catPart = new Chapter(new Paragraph(anchor), 1);

     subPara = new Paragraph(null, smallBold);
     subCatPart = catPart.addSection(subPara);
    // add a table
     subPara.setAlignment(Element.ALIGN_LEFT);
     
     addEmptyLine(subPara, 3);
    createTable(subCatPart,info.familyInfo);

    // now add all this to the document
    document.add(catPart);

    // Next section
    anchor = new Anchor("Course Information", catFont);
    anchor.setName("Course Information");

    // Fifth parameter is the number of the chapter
     catPart = new Chapter(new Paragraph(anchor), 1);

     subPara = new Paragraph(null, smallBold);
     subCatPart = catPart.addSection(subPara);
    // add a table
     subPara.setAlignment(Element.ALIGN_LEFT);
     
     addEmptyLine(subPara, 3);
    createTable(subCatPart,info.courseDetails);

    // now add all this to the document
    document.add(catPart);

  }

  private static void createTable(Section subCatPart, javax.swing.JTable table)
       {
    try
    {
        PdfPTable ptable = new PdfPTable(table.getColumnCount());
            
    // t.setBorderColor(BaseColor.GRAY);
    // t.setPadding(4);
    // t.setSpacing(4);
    // t.setBorderWidth(1);
      
        for (String col : DBMS.getTableHeader(table))
                    ptable.addCell(col) ;
        
    String[][] row = DBMS.getTable(table) ;    
        for (String[] col : row)
            for (String cell : col)
                if(!(cell.equals("null")))
                    ptable.addCell(cell) ;
                else
                    ptable.addCell(" ") ;
               
    
        subCatPart.add(ptable);
    }
    catch(Exception ex)
    {
         JOptionPane.showMessageDialog(null,ex);
     }
 }


  private static void addEmptyLine(Paragraph paragraph, int number) {
    for (int i = 0; i < number; i++) {
      paragraph.add(new Paragraph(" "));
    }
  }
}
