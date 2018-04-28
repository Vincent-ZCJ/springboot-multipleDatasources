package com.zcj977.engineMultipleDatasource.model;

/**
 * create by zcj on 2017/12/5.
 */
public class Course {
    private Integer id;
    private String courseName;
    private String courseDesc;
    public Course(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
}
