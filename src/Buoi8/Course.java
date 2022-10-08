package Buoi8;

public class Course {
    String code, courseName;
    Integer hours;

    public Course(String code, String courseName, Integer hours) {
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

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String toString(){
        return getCode()+" - "+getCourseName()+" - "+getHours();
    }
}
