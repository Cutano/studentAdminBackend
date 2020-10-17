package pers.rinne.studentadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.rinne.studentadmin.bean.Student;
import pers.rinne.studentadmin.mapper.StudentMapper;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /*
     * 查询所有用户
     */
    public List<Student> studentList(){
        return studentMapper.studentList();
    }

    /*
     * 增加保存用户
     */
    public void save(Student student){
        studentMapper.save(student);
    }

    /*
     * 根据id删除用户
     */
    public int deleteStudentById(Integer id){
        return studentMapper.deleteStudentById(id);
    }

    /*
     * 根据name删除用户
     */
    public int deleteStudentByName(String name){
        return studentMapper.deleteStudentByName(name);
    }

    /*
     * 根据id查找用户
     */
    public Student findStudentById(int id){
        return studentMapper.findStudentById(id);
    }

    /*
     * 根据name查找用户
     */
    public Student findStudentByName(String name){
        return studentMapper.findStudentByName(name);
    }

    /*
     * 更改用户信息
     */
    public int update(Student student){
        return studentMapper.update(student);
    }
}
