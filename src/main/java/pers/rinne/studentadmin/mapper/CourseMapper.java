package pers.rinne.studentadmin.mapper;

import pers.rinne.studentadmin.bean.Course;

import java.util.List;

public interface CourseMapper {

    /*
     * 查询所有
     */
    List<Course> courseList();

    /*
     * 增加保存
     */
    void save(Course course);

    /*
     * 根据id删除
     */
    int delete(Integer linkId);

    /*
     * 根据选课id查找
     */
    Course findCourseById(int linkId);

    /*
     * 根据学生id查找
     */
    Course findCourseByStudentId(int studentId);

    /*
     * 根据教师id查找
     */
    Course findCourseByTeacherId(int teacherId);

    /*
     * 根据课程id查找
     */
    Course findCourseByCourseId(int linkId);

    /*
     * 更改信息
     */
    int update(Course course);
}
