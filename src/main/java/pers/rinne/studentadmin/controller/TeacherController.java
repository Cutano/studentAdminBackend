package pers.rinne.studentadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.rinne.studentadmin.bean.Teacher;
import pers.rinne.studentadmin.service.TeacherService;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/teacher")
    public Teacher findTeacher(@RequestParam(value = "id") int id) {
        return teacherService.findTeacherById(id);
    }
}
