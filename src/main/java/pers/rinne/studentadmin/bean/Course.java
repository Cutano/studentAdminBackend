package pers.rinne.studentadmin.bean;

public class Course {
    private int link_id;

    private int stu_id;

    private int course_id;

    private String course_name;

    private int teacher_id;

    private int grade;

    public Course() {
    }

    public Course(int studentId, int courseId, String courseName, int teacherId, int grade) {
        this.stu_id = studentId;
        this.course_id = courseId;
        this.course_name = courseName;
        this.teacher_id = teacherId;
        this.grade = grade;
    }

    public Course(int linkId, int studentId, int courseId, String courseName, int teacherId, int grade) {
        this.link_id = linkId;
        this.stu_id = studentId;
        this.course_id = courseId;
        this.course_name = courseName;
        this.teacher_id = teacherId;
        this.grade = grade;
    }

    public int getLink_id() {
        return link_id;
    }

    public void setLink_id(int link_id) {
        this.link_id = link_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
