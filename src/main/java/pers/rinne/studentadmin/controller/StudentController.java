package pers.rinne.studentadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.rinne.studentadmin.bean.Student;
import pers.rinne.studentadmin.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public Student findStudent(@RequestParam(value = "id") int id) {
        return studentService.findStudentById(id);
    }
}
