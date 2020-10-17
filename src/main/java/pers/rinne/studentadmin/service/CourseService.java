package pers.rinne.studentadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.rinne.studentadmin.bean.Course;
import pers.rinne.studentadmin.mapper.CourseMapper;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    /*
     * 查询所有
     */
    public List<Course> courseList() {
        List<Course> list = courseMapper.courseList();
        return list;
    }

    /*
     * 增加保存
     */
    public void save(Course course) {
        courseMapper.save(course);
    }

    /*
     * 根据id删除
     */
    public int delete(Integer linkId) {
        return courseMapper.delete(linkId);
    }

    /*
     * 根据选课id查找
     */
    public Course findCourseById(int linkId) {
        return courseMapper.findCourseById(linkId);
    }

    /*
     * 根据学生id查找
     */
    public Course findCourseByStudentId(int studentId) {
        return courseMapper.findCourseByStudentId(studentId);
    }

    /*
     * 根据教师id查找
     */
    public Course findCourseByTeacherId(int teacherId) {
        return courseMapper.findCourseByTeacherId(teacherId);
    }

    /*
     * 根据课程id查找
     */
    public Course findCourseByCourseId(int courseId) {
        return courseMapper.findCourseByCourseId(courseId);
    }

    /*
     * 更改信息
     */
    public int update(Course course) {
        return courseMapper.update(course);
    }
}
