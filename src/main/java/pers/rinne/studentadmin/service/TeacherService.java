package pers.rinne.studentadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.rinne.studentadmin.bean.Teacher;
import pers.rinne.studentadmin.mapper.TeacherMapper;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    /*
     * 查询所有用户
     */
    public List<Teacher> teacherList(){
        return teacherMapper.teacherList();
    }

    /*
     * 增加保存用户
     */
    public void save(Teacher teacher){
        teacherMapper.save(teacher);
    }

    /*
     * 根据id删除用户
     */
    public int deleteTeacherById(Integer id){
        return teacherMapper.deleteTeacherById(id);
    }

    /*
     * 根据name删除用户
     */
    public int deleteTeacherByName(String name){
        return teacherMapper.deleteTeacherByName(name);
    }

    /*
     * 根据id查找用户
     */
    public Teacher findTeacherById(int id){
        return teacherMapper.findTeacherById(id);
    }

    /*
     * 根据name查找用户
     */
    public Teacher findTeacherByName(String name){
        return teacherMapper.findTeacherByName(name);
    }

    /*
     * 更改用户信息
     */
    public int update(Teacher teacher){
        return teacherMapper.update(teacher);
    }
}
