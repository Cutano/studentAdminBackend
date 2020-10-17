package pers.rinne.studentadmin.mapper;

import pers.rinne.studentadmin.bean.Teacher;

import java.util.List;

public interface TeacherMapper {
    /*
     * 根据id查询
     */
    Teacher select(int id);

    /*
     * 查询所有
     */
    List<Teacher> teacherList();

    /*
     * 增加保存
     */
    void save(Teacher user);

    /*
     * 根据id删除
     */
    int deleteTeacherById(Integer id);

    /*
     * 根据id删除
     */
    int deleteTeacherByName(String name);

    /*
     * 根据id查找
     */
    Teacher findTeacherById(int id);

    /*
     * 根据name查找
     */
    Teacher findTeacherByName(String name);

    /*
     * 更改信息
     */
    int update(Teacher user);
}
