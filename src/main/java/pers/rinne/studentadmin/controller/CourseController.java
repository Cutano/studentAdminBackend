package pers.rinne.studentadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.rinne.studentadmin.bean.Course;
import pers.rinne.studentadmin.service.CourseService;

import java.util.LinkedList;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/course")
    public List<Course> findCourse(@RequestParam(value = "linkId", required = false) Integer linkId,
                                   @RequestParam(value = "studentId", required = false) Integer studentId,
                                   @RequestParam(value = "teacherId", required = false) Integer teacherId,
                                   @RequestParam(value = "courseId", required = false) Integer courseId) {
        if (linkId != null) {
            return courseService.findCourseById(linkId);
        } else if (studentId != null) {
            return courseService.findCourseByStudentId(studentId);
        } else if (teacherId != null) {
            return courseService.findCourseByTeacherId(teacherId);
        } else if (courseId != null) {
            return courseService.findCourseByCourseId(courseId);
        } else return new LinkedList<>();
    }

    @RequestMapping("/course/list")
    public List<Course> listAllCourses() {
        return courseService.courseList();
    }

    @RequestMapping("/course/add")
    public void addCourse(@RequestParam(value = "studentId") Integer studentId,
                          @RequestParam(value = "courseId") Integer courseId,
                          @RequestParam(value = "courseName") String courseName,
                          @RequestParam(value = "teacherId") Integer teacherId,
                          @RequestParam(value = "grade") Integer grade){
        courseService.save(new Course(studentId, courseId, courseName, teacherId, grade));
    }

    @RequestMapping("/course/del")
    public int deleteCourse(@RequestParam(value = "linkId") Integer linkId) {
        return courseService.delete(linkId);
    }

    @RequestMapping("/course/update")
    public int updateCourse(@RequestParam(value = "linkId") Integer linkId,
                            @RequestParam(value = "studentId") Integer studentId,
                            @RequestParam(value = "courseId") Integer courseId,
                            @RequestParam(value = "courseName") String courseName,
                            @RequestParam(value = "teacherId") Integer teacherId,
                            @RequestParam(value = "grade") Integer grade) {
        return courseService.update(new Course(linkId, studentId, courseId, courseName, teacherId, grade));
    }
}
