package pers.rinne.studentadmin.mapper;

import pers.rinne.studentadmin.bean.Teacher;

import java.util.List;

public interface TeacherMapper {

    /*
     * 查询所有
     */
    List<Teacher> teacherList();

    /*
     * 增加保存
     */
    void save(Teacher teacher);

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
    int update(Teacher teacher);
}
