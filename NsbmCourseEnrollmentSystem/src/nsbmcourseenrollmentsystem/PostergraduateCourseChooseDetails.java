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
public class PostergraduateCourseChooseDetails extends AbstractTableModel{
     private static final String[] COLUMN_NAMES = {"Student ID","Course ID","Faculty","Year Of Registration"};
    private static ArrayList<PostergraduateStudentsCourseRegDetails> list;
    
    PostergraduateCourseChooseDetails(ArrayList<PostergraduateStudentsCourseRegDetails> stList){
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
                return list.get(rowIndex).getStudentID();
            case 1:
                return list.get(rowIndex).getCourseID();
            case 2:
                return list.get(rowIndex).getFaculty();
            case 3:
                return list.get(rowIndex).getYearOfReg();
            default:
                return "Error";
        }
    }
}
