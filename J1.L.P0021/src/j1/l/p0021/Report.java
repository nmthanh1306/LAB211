/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.l.p0021;

/**
 *
 * @author Minh Thanh
 */
public class Report {

    private String nameStudent;
    private String courseName;
    private int totalCourse;

    public Report() {
    }

    public Report(String nameStudent, String courseName, int totalCourse) {
        this.nameStudent = nameStudent;
        this.courseName = courseName;
        this.totalCourse = totalCourse;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(int totalCourse) {
        this.totalCourse = totalCourse;
    }
}
