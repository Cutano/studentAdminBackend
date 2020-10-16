package pers.rinne.studentadmin.mapper;

import pers.rinne.studentadmin.bean.Course;

import java.util.List;

public interface CourseMapper {
    /*
     * 根据id查询
     */
    Course select(int id);

    /*
     * 查询所有
     */
    List<Course> userList();

    /*
     * 增加保存
     */
    void save(Course user);

    /*
     * 根据id删除
     */
    int delete(Integer id);

    /*
     * 根据id查找
     */
    Course findCourseById(int id);

    /*
     * 更改信息
     */
    int update(Course user);
}
