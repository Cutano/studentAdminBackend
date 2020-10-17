package pers.rinne.studentadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.rinne.studentadmin.bean.Teacher;
import pers.rinne.studentadmin.service.TeacherService;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/teacher")
    public Teacher findTeacher(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "name", required = false) String name) {
        if (name != null) {
            return teacherService.findTeacherByName(name);
        } else return teacherService.findTeacherById(id);
    }

    @RequestMapping("/teacher/list")
    public List<Teacher> listAllTeachers() {
        return teacherService.teacherList();
    }

    @RequestMapping("/teacher/add")
    public void addTeacher(@RequestParam(value = "name") String name, @RequestParam(value = "sex") String sex) {
        teacherService.save(new Teacher(name, sex));
    }

    @RequestMapping("/teacher/del")
    public int deleteTeacher(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "name", required = false) String name) {
        if (name != null) {
            return teacherService.deleteTeacherByName(name);
        } else return teacherService.deleteTeacherById(id);
    }

    @RequestMapping("/teacher/update")
    public void updateTeacher(@RequestParam(value = "id") int id, @RequestParam(value = "name") String name, @RequestParam(value = "sex") String sex) {
        teacherService.update(new Teacher(id, name, sex));
    }
}
