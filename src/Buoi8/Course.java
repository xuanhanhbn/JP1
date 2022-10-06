package Buoi8;

public class Course {
    String code, courseName, hours;

    public Course(String code, String courseName, String hours) {
        this.code = code;
        this.courseName = courseName;
        this.hours = hours;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
    public String toString(){
        return getCode()+" - "+getCourseName()+" - "+getHours();
    }
}
