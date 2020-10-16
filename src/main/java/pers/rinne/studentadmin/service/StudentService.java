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
     * 根据id查询用户
     */
    public Student select(int id){
        return studentMapper.select(id);
    }

    /*
     * 查询所有用户
     */
    public List<Student> userList(){
        return studentMapper.studentList();
    }

    /*
     * 增加保存用户
     */
    public void save(Student user){
        studentMapper.save(user);
    }

    /*
     * 根据id删除用户
     */
    public int delete(Integer id){
        return studentMapper.delete(id);
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
    public int update(Student user){
        return studentMapper.update(user);
    }
}
