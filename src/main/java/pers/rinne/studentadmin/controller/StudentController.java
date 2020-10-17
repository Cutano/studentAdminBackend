package pers.rinne.studentadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.rinne.studentadmin.bean.Student;
import pers.rinne.studentadmin.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public Student findTeacher(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "name", required = false) String name) {
        if (name != null) {
            return studentService.findStudentByName(name);
        } else return studentService.findStudentById(id);
    }

    @RequestMapping("/student/list")
    public List<Student> listAllTeachers() {
        return studentService.studentList();
    }

    @RequestMapping("/student/add")
    public void addTeacher(@RequestParam(value = "name") String name, @RequestParam(value = "sex") String sex) {
        studentService.save(new Student(name, sex));
    }

    @RequestMapping("/student/del")
    public int deleteTeacher(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "name", required = false) String name) {
        if (name != null) {
            return studentService.deleteStudentByName(name);
        } else return studentService.deleteStudentById(id);
    }

    @RequestMapping("/student/update")
    public void updateTeacher(@RequestParam(value = "id") int id, @RequestParam(value = "name") String name, @RequestParam(value = "sex") String sex) {
        studentService.update(new Student(id, name, sex));
    }
}
