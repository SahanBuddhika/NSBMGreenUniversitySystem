/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmcourseenrollmentsystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sahan Buddhika
 */
public class UndergraduateStudentsChooseDetails extends AbstractTableModel {
    
    private static final String[] COLUMN_NAMES = {"Student ID","First Name","Last Name","E-Mail"};
    private static ArrayList<UndergraduateStudentDetails> list;
    
    UndergraduateStudentsChooseDetails(ArrayList<UndergraduateStudentDetails> stList){
        list = stList;}

    @Override
    public int getRowCount() {
        return list.size(); 
    }
    
    public String getColumnName(int columnIndex){   // set column names to the table
        return COLUMN_NAMES[columnIndex];
    
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getStudentid();
            case 1:
                return list.get(rowIndex).getFirstname();
            case 2:
                return list.get(rowIndex).getLastname();
            case 3:
                return list.get(rowIndex).getEmailaddress();
            default:
                return "Error";
        }
    }
    
}
