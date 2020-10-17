package pers.rinne.studentadmin.mapper;

import pers.rinne.studentadmin.bean.Student;

import java.util.List;

public interface StudentMapper {
    /*
     * 根据id查询
     */
    Student select(int id);

    /*
     * 查询所有
     */
    List<Student> studentList();

    /*
     * 增加保存
     */
    void save(Student user);

    /*
     * 根据id删除
     */
    int deleteStudentById(Integer id);

    /*
     * 根据id删除
     */
    int deleteStudentByName(String name);

    /*
     * 根据id查找
     */
    Student findStudentById(int id);

    /*
     * 根据name查找
     */
    Student findStudentByName(String name);

    /*
     * 更改信息
     */
    int update(Student user);
}
