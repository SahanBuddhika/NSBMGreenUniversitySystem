package nsbmcourseenrollmentsystem;

import static java.awt.Event.DELETE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBOperation {   // this class is communicate with the database

    //give informations to communicate with the database
    String url = "jdbc:mysql://localhost:3306/nsbmstudentenrollmentsystem";
    String usename = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    
    /******************************************ADD UNDERGRADUATE STUDENTS*******************************************************************************/
     
    //when return type as boolean we can retrn true or false end of this. then we can generate msg box using that
    boolean addUndergraduateStudentDetails(UndergraduateStudentDetails unD) {  // get the values add parse them into sql query
        try { // use try catch to stop the parse  SQLException

            System.out.println("add student 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO undergraduatestudents VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("add student 2");

            pst.setString(1, unD.getStudentid());//add values to the sql query
            pst.setString(2, unD.getFirstname());
            pst.setString(3, unD.getLastname());
            pst.setInt(4, unD.getAge());
            pst.setString(5, unD.getGender());
            pst.setString(6, unD.getEmailaddress());
            pst.setString(7, unD.getAddress());
            pst.setString(8, unD.getPhonenumber());
            pst.setInt(9, unD.getYearofregistration());
            pst.setString(10, unD.getAlresults());
            pst.setInt(11, unD.getDistrictrank());

            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("add student 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

/*******************************GET UNDERGRADUATDE STUSENT'S DETAILS*******************************************/
    
    ArrayList<UndergraduateStudentDetails> getUndergraduateStudentDetails() {
        try {

            ArrayList<UndergraduateStudentDetails> list = new ArrayList<UndergraduateStudentDetails>();

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "SELECT * FROM undergraduatestudents";
            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                UndergraduateStudentDetails und = new UndergraduateStudentDetails();

                und.setStudentid(rs.getString(1));//add values to the sql query
                und.setFirstname(rs.getString(2));
                und.setLastname(rs.getString(3));
                und.setAge(rs.getInt(4));
                und.setGender(rs.getString(5));
                und.setEmailaddress(rs.getString(6));
                und.setAddress(rs.getString(7));
                und.setPhonenumber(rs.getString(8));
                und.setYearofregistration(rs.getInt(9));
                und.setAlresults(rs.getString(10));
                und.setDistrictrank(rs.getInt(11));

                list.add(und);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return null; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }

    }

   
/** *********************************GET UNDERGRADUATDE COURSE DETAILS *******************************************************************/
    
    ArrayList<UndergraduateStudetsCourseRegDetails> getUndergraduateCourseDetails() {
        try {

            ArrayList<UndergraduateStudetsCourseRegDetails> list = new ArrayList<UndergraduateStudetsCourseRegDetails>();

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "SELECT * FROM undergraduatestudentscourseregistration";
            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                UndergraduateStudetsCourseRegDetails und = new UndergraduateStudetsCourseRegDetails();

                und.setStudentID(rs.getString(1));//add values to the sql query
                und.setFaculty(rs.getString(2));
                und.setYearOfReg(rs.getInt(3));
                und.setMainsub1(rs.getString(4));
                und.setMainsubID1(rs.getString(5));
                und.setMainsub1Payment(rs.getInt(6));
                und.setMainsub2(rs.getString(7));
                und.setMainsubID2(rs.getString(8));
                und.setMainsub2Payment(rs.getInt(9));
                und.setChoosesub1(rs.getString(10));
                und.setChoosesubID1(rs.getString(11));
                und.setChoosesub1Payment(rs.getInt(12));
                und.setChoosesub2(rs.getString(13));
                und.setChoosesubID2(rs.getString(14));
                und.setChoosesub2Payment(rs.getInt(15));
                und.setChoosesub3(rs.getString(16));
                und.setChoosesubID3(rs.getString(17));
                und.setChoosesub3Payment(rs.getInt(18));
                und.setChoosesub4(rs.getString(19));
                und.setChoosesubID4(rs.getString(20));
                und.setChoosesub4Payment(rs.getInt(21));
                und.setCourseID(rs.getString(22));

                list.add(und);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return null; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }

    }

    
/*****************************UPDATE UNDERGRADUATE COURSES*******************************************************/
     
    public boolean updateUndergraduateCourse(UndergraduateStudetsCourseRegDetails unsd) {
        try {
            System.out.println("update curse 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type

            String query = "UPDATE undergraduatestudentscourseregistration SET faculty = '" + unsd.getFaculty()
                    + "',yearOfReg =" + unsd.getYearOfReg() + ",mainSub1 ='" + unsd.getMainsub1() + "' ,mainSubID1= '"
                    + unsd.getMainsubID1() + "',mainSub1Payment=" + unsd.getMainsub1Payment() + ",mainSub2='"
                    + unsd.getMainsub2() + "',mainSubID2='" + unsd.getMainsubID2() + "',mainSub2Payment ="
                    + unsd.getMainsub2Payment() + " ,chooseSub1='" + unsd.getChoosesub1() + "',chooseSubID1 = '"
                    + unsd.getChoosesubID1() + "',chooseSub1Payment=" + unsd.getChoosesub1Payment() + ",chooseSub2='" + unsd.getChoosesub2() + "',chooseSubID2='" + unsd.getChoosesubID2()
                    + "',chooseSub2Payment=" + unsd.getChoosesub2Payment() + ",chooseSub3='" + unsd.getChoosesub3() + "',chooseSub3ID='" + unsd.getChoosesubID3()
                    + "',chooseSub3Payment=" + unsd.getChoosesub3Payment() + ",chooseSub4='" + unsd.getChoosesub4() + "',chooseSub4ID='" + unsd.getChoosesubID4()
                    + "',chooseSub4Payment=" + unsd.getChoosesub4Payment() + ",courseId='" + unsd.getCourseID() + "'WHERE studentid ='" + unsd.getStudentID() + "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update course 2");

            pst.executeUpdate();
            System.out.println("update course 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this
            return false; //*** if have a exception return false 
        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public boolean updateUndergraduateStudent(UndergraduateStudentDetails unsd) {
        try {
            System.out.println("update student 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type

            String query = "UPDATE undergraduatestudents SET firstname = '" + unsd.getFirstname()
                    + "',lastname ='" + unsd.getLastname() + "',age =" + unsd.getAge() + " ,gender='"
                    + unsd.getGender() + "',emailaddress='" + unsd.getEmailaddress() + "',address='"
                    + unsd.getAddress() + "',phonenumber='" + unsd.getPhonenumber() + "',yearofregistration ="
                    + unsd.getYearofregistration() + " ,alresults='" + unsd.getAlresults() + "',districtrank = "
                    + unsd.getDistrictrank() + " WHERE studentid ='" + unsd.getStudentid() + "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update student 2");

            pst.executeUpdate();
            System.out.println("update student 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this
            return false; //*** if have a exception return false 
        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public boolean deleteUndergraduateStudent(UndergraduateStudentDetails unsd) {
        try {
            System.out.println("delete student 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "DELETE FROM undergraduatestudents WHERE studentid = '" + unsd.getStudentid() + "'";
            pst = con.prepareStatement(query);
            System.out.println("delete student 2");

            pst.executeUpdate();
            System.out.println("delete student 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    /*** **********************************ADD UNDERGRADUATE COURSES*****************************************************************/
     
    boolean UndergraduatecourseRegistration(UndergraduateStudetsCourseRegDetails cor) {
        try { // use try catch to stop the parse  SQLException

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO undergraduatestudentscourseregistration VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);

            pst.setString(1, cor.getStudentID());//add values to the sql query
            pst.setString(2, cor.getFaculty());
            pst.setInt(3, cor.getYearOfReg());
            pst.setString(4, cor.getMainsub1());
            pst.setString(5, cor.getMainsubID1());
            pst.setInt(6, cor.getMainsub1Payment());
            pst.setString(7, cor.getMainsub2());
            pst.setString(8, cor.getMainsubID2());
            pst.setInt(9, cor.getMainsub2Payment());
            pst.setString(10, cor.getChoosesub1());
            pst.setString(11, cor.getChoosesubID1());
            pst.setInt(12, cor.getChoosesub1Payment());
            pst.setString(13, cor.getChoosesub2());
            pst.setString(14, cor.getChoosesubID2());
            pst.setInt(15, cor.getChoosesub2Payment());
            pst.setString(16, cor.getChoosesub3());
            pst.setString(17, cor.getChoosesubID3());
            pst.setInt(18, cor.getChoosesub3Payment());
            pst.setString(19, cor.getChoosesub4());
            pst.setString(20, cor.getChoosesubID4());
            pst.setInt(21, cor.getChoosesub4Payment());
            pst.setString(22, cor.getCourseID());

            pst.executeUpdate();  //execute the sql query and insert the values to the db table

            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    /******************************LOAD UNDERGRADUATE SUBJECTS********************************************************************/
    
    public ResultSet LoadUndergraduateSubjects(String s) {

        try { // use try catch to stop the parse  SQLException

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            pst = con.prepareStatement("SELECT mainsub1,mainsub2,choosesub1,choosesub2,choosesub3,choosesub4,courseId FROM undergraduatestudentscourseregistration WHERE studentID = ?");
            pst.setString(1, s);
            rs = pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

        }
        return rs;
    }

/**********************************LOAD UNDERGRADUATE SUBJECTS********************************************************/
    
    public ResultSet LoadUndergraduateCourses(String s) {

        try { // use try catch to stop the parse  SQLException

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            pst = con.prepareStatement("SELECT faculty,yearOfReg,mainSub1,mainSubID1,mainSub1Payment,mainSub2,mainSubID2,mainSub2Payment,chooseSub1,chooseSubID1,chooseSub1Payment,chooseSub2,chooseSubID2,chooseSub2Payment,chooseSub3,chooseSub3ID,chooseSub3Payment,chooseSub4,chooseSub4ID,chooseSub4Payment,courseId FROM undergraduatestudentscourseregistration WHERE studentID = ?");
            pst.setString(1, s);
            rs = pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

        }
        return rs;
    }

    /********************************ADD UNDERGRADUATE ASSIGNMENTS****************************************************/
    
     boolean addUndergraduateAssignments(UndergraduateAssignmentDetails unD) {  // get the values add parse them into sql query
        try { // use try catch to stop the parse  SQLException

            System.out.println("add ass 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO undergraduateassignments VALUES(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("add ass 2");

            pst.setString(1, unD.getTxtstudentid());//add values to the sql query
            pst.setString(2, unD.getTxtsubjectcode());
            pst.setString(3, unD.getDdin1());
            pst.setString(4, unD.getDdin2());
            pst.setString(5, unD.getDdin3());
            pst.setString(6, unD.getDdin4());
            pst.setString(7, unD.getDdta1());
            pst.setString(8, unD.getDdta2());
            

            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("add ass 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
     
/*******************************ADD UNDERGRADUATE RESULTS**************************************************/
     
      boolean addUndergradauateResults(UndergraduateResultDetails unD) {  // get the values add parse them into sql query
        try { // use try catch to stop the parse  SQLException

            System.out.println("add result 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO undergraduateresults VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("add result 2");

            pst.setString(1, unD.getStudentid());//add values to the sql query
            pst.setString(2, unD.getCourseid());
            pst.setString(3, unD.getSub1());
            pst.setString(4, unD.getSub2());
            pst.setString(5, unD.getSub3());
            pst.setString(6, unD.getSub4());
            pst.setString(7, unD.getSub5());
            pst.setString(8, unD.getSub6());
            pst.setString(9, unD.getSub1re());
            pst.setString(10, unD.getSub2re());
            pst.setString(11, unD.getSub3re());
            pst.setString(12, unD.getSub4re());
            pst.setString(13, unD.getSub5re());
            pst.setString(14, unD.getSub6re());
            pst.setString(15, unD.getGpa());

            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("add ass 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
 /*******************************LOAD UNDERGRADUATE RESULTS***********************************************/
      
     public ResultSet LoadUndergraduateResults(String s) {

        try { // use try catch to stop the parse  SQLException

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            pst = con.prepareStatement("SELECT courseid,sub1,sub2,sub3,sub4,sub5,sub6,sub1re,sub2re,sub3re,sub4re,sub5re,sub6re,gpa FROM undergraduateresults WHERE studentid = ?");
            pst.setString(1, s);
            rs = pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

        }
        return rs;
    }
     
/******************************UPDATE UNDERGRADUATE RESULTS***********************************************/
     
     public boolean updateUndergraduateResult(UndergraduateResultDetails unsd) {
        try {
            System.out.println("update res 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type

            String query = "UPDATE undergraduateresults SET courseid = '" + unsd.getCourseid()
                    + "',sub1 ='" + unsd.getSub1() + "',sub2 ='" + unsd.getSub2() + "' ,sub3= '"
                    + unsd.getSub3() + "',sub4='" + unsd.getSub4() + "',sub5='"
                    + unsd.getSub5() + "',sub6='" + unsd.getSub6() + "',sub1re ='"
                    + unsd.getSub1re() + "' ,sub2re='" + unsd.getSub2re() + "',sub3re = '"
                    + unsd.getSub3re() + "',sub4re='" + unsd.getSub4re() + "',sub5re='" + unsd.getSub5re() + "',sub6re='" + unsd.getSub6re()
                    + "',gpa='" + unsd.getGpa() + "'WHERE studentid ='" + unsd.getStudentid() + "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update res 2");

            pst.executeUpdate();
            System.out.println("update res 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this
            return false; //*** if have a exception return false 
        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    
    
    /*+++++++++++++++++++++++++++++++++Postergraduate Details+++++++++++++++++++++++++++++++++++++++++++++++++++*/
     
     
     
     
     
    /**********************************ADD POSTERGRADUATE STUDENTS******************************************/
    
    boolean addPostergraduateStudentDetails(PostergraduateStudentDetails poD) {
        try { // use try catch to stop the parse  SQLException
            System.out.println("addPOstd 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO postergraduatestudents VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("addPOstd 2");

            pst.setString(1, poD.getStudentid());//add values to the sql query
            pst.setString(2, poD.getFirstname());
            pst.setString(3, poD.getLastname());
            pst.setInt(4, poD.getAge());
            pst.setString(5, poD.getGender());
            pst.setString(6, poD.getEmailaddress());
            pst.setString(7, poD.getAddress());
            pst.setString(8, poD.getPhonenumber());
            pst.setInt(9, poD.getYearofregistration());
            pst.setString(10, poD.getQualificationtypes());
            pst.setString(11, poD.getInstitution());
            pst.setInt(12, poD.getYearofcompletion());

            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("addPOstd 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    /***************************ADD POSTERGRADUATE COURSES**************************************************/
    
    boolean PostergraduatecourseRegistration(PostergraduateStudentsCourseRegDetails cor) {
        try { // use try catch to stop the parse  SQLException

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO postergraduatestudentscourseregistration VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("addPOSTcourse 1");

            pst.setString(1, cor.getStudentID());//add values to the sql query
            pst.setString(2, cor.getFaculty());
            pst.setInt(3, cor.getYearOfReg());
            pst.setString(4, cor.getMainsub1());
            pst.setString(5, cor.getMainsubID1());
            pst.setInt(6, cor.getMainsub1Payment());
            pst.setString(7, cor.getMainsub2());
            pst.setString(8, cor.getMainsubID2());
            pst.setInt(9, cor.getMainsub2Payment());
            pst.setString(10, cor.getChoosesub1());
            pst.setString(11, cor.getChoosesubID1());
            pst.setInt(12, cor.getChoosesub1Payment());
            pst.setString(13, cor.getChoosesub2());
            pst.setString(14, cor.getChoosesubID2());
            pst.setInt(15, cor.getChoosesub2Payment());
            pst.setString(16, cor.getChoosesub3());
            pst.setString(17, cor.getChoosesubID3());
            pst.setInt(18, cor.getChoosesub3Payment());
            pst.setString(19, cor.getChoosesub4());
            pst.setString(20, cor.getChoosesubID4());
            pst.setInt(21, cor.getChoosesub4Payment());
            pst.setString(22, cor.getCourseID());

            System.out.println("addPOSTcourse 2");
            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("addPOSTcourse 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    
/*********************************GET POSTERGRADUATE STUDENT DETAILS*****************************************************/
    
    ArrayList<PostergraduateStudentDetails> getPostergraduateStudentDetails() {
        try {

            ArrayList<PostergraduateStudentDetails> list = new ArrayList<PostergraduateStudentDetails>();

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "SELECT * FROM postergraduatestudents";
            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                PostergraduateStudentDetails und = new PostergraduateStudentDetails();

                und.setStudentid(rs.getString(1));//add values to the sql query
                und.setFirstname(rs.getString(2));
                und.setLastname(rs.getString(3));
                und.setAge(rs.getInt(4));
                und.setGender(rs.getString(5));
                und.setEmailaddress(rs.getString(6));
                und.setAddress(rs.getString(7));
                und.setPhonenumber(rs.getString(8));
                und.setYearofregistration(rs.getInt(9));
                und.setQualificationtypes(rs.getString(10));
                und.setInstitution(rs.getString(11));
                und.setYearofcompletion(rs.getInt(12));

                list.add(und);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return null; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }

    }

    /*******************************GET POSTERGRADUATE COURSE DETAILS******************************************/
    
    ArrayList<PostergraduateStudentsCourseRegDetails> getPostergraduateCourseDetails() {
        try {

            ArrayList<PostergraduateStudentsCourseRegDetails> list = new ArrayList<PostergraduateStudentsCourseRegDetails>();

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "SELECT * FROM postergraduatestudentscourseregistration";
            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                PostergraduateStudentsCourseRegDetails und = new PostergraduateStudentsCourseRegDetails();

                und.setStudentID(rs.getString(1));//add values to the sql query
                und.setFaculty(rs.getString(2));
                und.setYearOfReg(rs.getInt(3));
                und.setMainsub1(rs.getString(4));
                und.setMainsubID1(rs.getString(5));
                und.setMainsub1Payment(rs.getInt(6));
                und.setMainsub2(rs.getString(7));
                und.setMainsubID2(rs.getString(8));
                und.setMainsub2Payment(rs.getInt(9));
                und.setChoosesub1(rs.getString(10));
                und.setChoosesubID1(rs.getString(11));
                und.setChoosesub1Payment(rs.getInt(12));
                und.setChoosesub2(rs.getString(13));
                und.setChoosesubID2(rs.getString(14));
                und.setChoosesub2Payment(rs.getInt(15));
                und.setChoosesub3(rs.getString(16));
                und.setChoosesubID3(rs.getString(17));
                und.setChoosesub3Payment(rs.getInt(18));
                und.setChoosesub4(rs.getString(19));
                und.setChoosesubID4(rs.getString(20));
                und.setChoosesub4Payment(rs.getInt(21));
                und.setCourseID(rs.getString(22));

                list.add(und);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return null; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }

    }

/******************************UPDATE POSTERGRADUATE COURSES*********************************************************/
    
    public boolean updatePostergraduateCourse(PostergraduateStudentsCourseRegDetails unsd) {
        try {
            System.out.println("update curse 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type

            String query = "UPDATE postergraduatestudentscourseregistration SET faculty = '" + unsd.getFaculty()
                    + "',yearOfReg =" + unsd.getYearOfReg() + ",mainSub1 ='" + unsd.getMainsub1() + "' ,mainSubID1= '"
                    + unsd.getMainsubID1() + "',mainSub1Payment=" + unsd.getMainsub1Payment() + ",mainSub2='"
                    + unsd.getMainsub2() + "',mainSubID2='" + unsd.getMainsubID2() + "',mainSub2Payment ="
                    + unsd.getMainsub2Payment() + " ,chooseSub1='" + unsd.getChoosesub1() + "',chooseSubID1 = '"
                    + unsd.getChoosesubID1() + "',chooseSub1Payment=" + unsd.getChoosesub1Payment() + ",chooseSub2='" + unsd.getChoosesub2() + "',chooseSubID2='" + unsd.getChoosesubID2()
                    + "',chooseSub2Payment=" + unsd.getChoosesub2Payment() + ",chooseSub3='" + unsd.getChoosesub3() + "',chooseSub3ID='" + unsd.getChoosesubID3()
                    + "',chooseSub3Payment=" + unsd.getChoosesub3Payment() + ",chooseSub4='" + unsd.getChoosesub4() + "',chooseSub4ID='" + unsd.getChoosesubID4()
                    + "',chooseSub4Payment=" + unsd.getChoosesub4Payment() + ",courseId='" + unsd.getCourseID() + "'WHERE studentid ='" + unsd.getStudentID() + "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update course 2");

            pst.executeUpdate();
            System.out.println("update course 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this
            return false; //*** if have a exception return false 
        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    /*********************************LOAD POSTERGRADUATE SUBJECTS****************************************/
    
    public ResultSet LoadPostergraduateSubjects(String s) {

        try { // use try catch to stop the parse  SQLException

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            pst = con.prepareStatement("SELECT mainsub1,mainsub2,choosesub1,choosesub2,choosesub3,choosesub4,courseId FROM postergraduatestudentscourseregistration WHERE studentID = ?");
            pst.setString(1, s);
            rs = pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

        }
        return rs;
    }

    
/*********************************LOAD POSTERGRADUATE COURSES***********************************************/
    
    public ResultSet LoadPostergraduateCourses(String s) {

        try { // use try catch to stop the parse  SQLException

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            pst = con.prepareStatement("SELECT faculty,yearOfReg,mainSub1,mainSubID1,mainSub1Payment,mainSub2,mainSubID2,mainSub2Payment,chooseSub1,chooseSubID1,chooseSub1Payment,chooseSub2,chooseSubID2,chooseSub2Payment,chooseSub3,chooseSub3ID,chooseSub3Payment,chooseSub4,chooseSub4ID,chooseSub4Payment,courseId FROM postergraduatestudentscourseregistration WHERE studentID = ?");
            pst.setString(1, s);
            rs = pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

        }
        return rs;
    }

/*******************************UPDATE POSTERGRADUATE STUDENTS**************************************************/
    
    public boolean updatePostergraduateStudent(PostergraduateStudentDetails unsd) {
        try {
            System.out.println("update student 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type

            String query = "UPDATE postergraduatestudents SET firstname = '" + unsd.getFirstname()
                    + "',lastname ='" + unsd.getLastname() + "',age =" + unsd.getAge() + " ,gender='"
                    + unsd.getGender() + "',emailaddress='" + unsd.getEmailaddress() + "',address='"
                    + unsd.getAddress() + "',phonenumber='" + unsd.getPhonenumber() + "',yearofregistration ="
                    + unsd.getYearofregistration() + " ,qualificationtypes='" + unsd.getQualificationtypes() + "',institution = '"
                    + unsd.getInstitution() + "',yearofcompletion=" + unsd.getYearofcompletion() + " WHERE studentid ='" + unsd.getStudentid() + "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update student 2");

            pst.executeUpdate();
            System.out.println("update student 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this
            return false; //*** if have a exception return false 
        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

/*************************DELETE POSTERGRADUATE STUDENT****************************************************/
    
    public boolean deletePostergraduateStudent(PostergraduateStudentDetails unsd) {
        try {
            System.out.println("delete student 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "DELETE FROM postergraduatestudents WHERE studentid = '" + unsd.getStudentid() + "'";
            pst = con.prepareStatement(query);
            System.out.println("delete student 2");

            pst.executeUpdate();
            System.out.println("delete student 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    
/****************************************ADD POSTERGRADUATE ASSIGNMENTS************************************/
    
    boolean addPostergraduateAssignments(PostergraduateAssignmentDetails unD) {  // get the values add parse them into sql query
        try { // use try catch to stop the parse  SQLException

            System.out.println("add ass 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO postergraduateassignments VALUES(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("add ass 2");

            pst.setString(1, unD.getTxtstudentid());//add values to the sql query
            pst.setString(2, unD.getTxtstudentid());
            pst.setString(3, unD.getDdin1());
            pst.setString(4, unD.getDdin2());
            pst.setString(5, unD.getDdin3());
            pst.setString(6, unD.getDdin4());
            pst.setString(7, unD.getDdta5());
            pst.setString(8, unD.getDdta6());
            

            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("add ass 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    /********************************ADD LECTURE DETAILS**********************************************************/
    
      boolean addLecturerDetails(LectureRegDetails poD) {
        try { // use try catch to stop the parse  SQLException
            System.out.println("addl 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO lectures VALUES(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("addl 2");

            pst.setString(1, poD.getLectureid());//add values to the sql query
            pst.setString(2, poD.getFirstName());
            pst.setString(3, poD.getLastname());
            pst.setString(4, poD.getNationalid());
            pst.setInt(5, poD.getAge());
            pst.setString(6, poD.getEmail());
            pst.setString(7, poD.getFaculty());
            pst.setString(8, poD.getQualification());
            

            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("addl 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
 
      /*************************ADD INSTRUCTERS**************************************************/
      
       boolean addInstructerDetails(InstructerDetails poD) {
        try { // use try catch to stop the parse  SQLException
            System.out.println("addl 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO instructers VALUES(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("addl 2");

            pst.setString(1, poD.getLectureid());//add values to the sql query
            pst.setString(2, poD.getFirstName());
            pst.setString(3, poD.getLastname());
            pst.setString(4, poD.getNationalid());
            pst.setInt(5, poD.getAge());
            pst.setString(6, poD.getEmail());
            pst.setString(7, poD.getFaculty());
            pst.setString(8, poD.getQualification());
            

            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("addl 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
      
     
      
/****************************ADD POSTERGRADUATE RESULTS*****************************************************/
      
      boolean addPostergradauateResults(PostergraduateResultDetails unD) {  // get the values add parse them into sql query
        try { // use try catch to stop the parse  SQLException

            System.out.println("add result 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "INSERT INTO postergraduateresults VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            System.out.println("add result 2");

            pst.setString(1, unD.getStudentid());//add values to the sql query
            pst.setString(2, unD.getCourseid());
            pst.setString(3, unD.getSub1());
            pst.setString(4, unD.getSub2());
            pst.setString(5, unD.getSub3());
            pst.setString(6, unD.getSub4());
            pst.setString(7, unD.getSub5());
            pst.setString(8, unD.getSub6());
            pst.setString(9, unD.getSub1re());
            pst.setString(10, unD.getSub2re());
            pst.setString(11, unD.getSub3re());
            pst.setString(12, unD.getSub4re());
            pst.setString(13, unD.getSub5re());
            pst.setString(14, unD.getSub6re());
            pst.setString(15, unD.getGpa());

            pst.executeUpdate();  //execute the sql query and insert the values to the db table
            System.out.println("add ass 3");
            return true; //*** above these no exception return true

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
/******************************LOAD POSTERGRADUATE RESULTS***************************************************/
      
    public ResultSet LoadPostergraduateResults(String s) {

        try { // use try catch to stop the parse  SQLException

            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            pst = con.prepareStatement("SELECT courseid,sub1,sub2,sub3,sub4,sub5,sub6,sub1re,sub2re,sub3re,sub4re,sub5re,sub6re,gpa FROM postergraduateresults WHERE studentid = ?");
            pst.setString(1, s);
            rs = pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

        }
        return rs;
    }
    
    /******************************UPDATE UNDERGRADUATE RESULTS***********************************************/
     
     public boolean updatePostergraduateResult(PostergraduateResultDetails unsd) {
        try {
            System.out.println("update res 1");
            con = (Connection) DriverManager.getConnection(url, usename, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type

            String query = "UPDATE postergraduateresults SET courseid = '" + unsd.getCourseid()
                    + "',sub1 ='" + unsd.getSub1() + "',sub2 ='" + unsd.getSub2() + "' ,sub3= '"
                    + unsd.getSub3() + "',sub4='" + unsd.getSub4() + "',sub5='"
                    + unsd.getSub5() + "',sub6='" + unsd.getSub6() + "',sub1re ='"
                    + unsd.getSub1re() + "' ,sub2re='" + unsd.getSub2re() + "',sub3re = '"
                    + unsd.getSub3re() + "',sub4re='" + unsd.getSub4re() + "',sub5re='" + unsd.getSub5re() + "',sub6re='" + unsd.getSub6re()
                    + "',gpa='" + unsd.getGpa() + "'WHERE studentid ='" + unsd.getStudentid() + "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update res 2");

            pst.executeUpdate();
            System.out.println("update res 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this
            return false; //*** if have a exception return false 
        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }


}



