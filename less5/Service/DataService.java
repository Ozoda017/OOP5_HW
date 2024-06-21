package less5.Service;

import less5.Model.Impl.Student;
import less5.Model.Impl.Teacher;
import less5.Model.Impl.User;
import less5.Model.Impl.Type;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> userList =new ArrayList<>();
    public void create(Type type, String name, String lastname){
        Integer id = getFreeId(type);
        if (type == Type.STUDENT) {
            Student student = new Student(id, name, lastname);
            userList.add(student);
        }
        if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(id, name, lastname);
            userList.add(teacher);
        }
    }
    public User getUserById(Type type, Integer id){
        boolean isTeacher = type == Type.TEACHER;
        for (User user:userList) {
            if (isTeacher && user instanceof Teacher && ((Teacher)user).getTeacherId() == id){
                return user;
            }
            if (!isTeacher && user instanceof Student && ((Student)user).getStudentId() == id){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userList;
    }
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        for (User user:userList) {
            if (user instanceof Student){
                students.add((Student) user);
            }
        }
        return students;
    }
    public List<Teacher> getAllTeachers(){
        List<Teacher> teachers = new ArrayList<>();
        for (User user:userList) {
            if (user instanceof Teacher){
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }
    private Integer getFreeId(Type type){
        Integer maxId = 0;
        Integer currentId = 0;
        boolean isTeacher = type == Type.TEACHER;
        for (User user: userList) {
            if (isTeacher && user instanceof Teacher) {
                currentId = ((Teacher) user).getTeacherId();
            }
            if (!isTeacher && user instanceof Student) {
                currentId = ((Student) user).getStudentId();
            }
            if (maxId < currentId) {
                maxId = currentId;
            }
        }
        return maxId + 1;
    }
}
