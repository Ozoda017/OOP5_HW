package less5.Controller;

import less5.Model.Impl.Student;
import less5.Model.Impl.StudentGroup;
import less5.Model.Impl.Type;
import less5.Service.DataService;
import less5.Service.StudentGroupService;
import less5.Model.Impl.Teacher;
import less5.View.StudentGroupView;
import less5.View.StudentView;
import less5.View.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class TeacherController {
    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudentGroupView studentGroupView = new StudentGroupView();
    public void createStudent(String name, String lastname){
        dataService.create(Type.STUDENT,name,lastname);
    }
    public void createTeacher(String name, String lastname){
        dataService.create(Type.TEACHER,name,lastname);
    }
    public void getAllStudents(){
        studentView.sendOnConsole(dataService.getAllStudents());
    }
    public void getAllTeachers(){
        teacherView.sendOnConsole(dataService.getAllTeachers());
    }
    public void createStudentGroup(Integer teacherId, List<Integer> studentIdList){
        Teacher teacher = (Teacher) dataService.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id:studentIdList) {
            studentList.add((Student) dataService.getUserById(Type.STUDENT, id));
        }
        studentGroupService.createStudentGroup(teacher,studentList);
    }
    public void printStudentGroup(){
        studentGroupView.sendOnConsole(studentGroupService.getStudentGroup());
    }
	public void sendOnConsole(List<Teacher> of) {
        teacherView.sendOnConsole(of);
	}
    public static Student createStudent(Student student) {
        throw new UnsupportedOperationException("Unimplemented method 'createStudent'");
    }
    public static Teacher createTeacher(Teacher teacher) {
        throw new UnsupportedOperationException("Unimplemented method 'createTeacher'");
    }
    public static StudentGroup createGroup(int i, Teacher t_gr1, Student s1_gr1, Student s2_gr1, Student s3_gr1) {
        throw new UnsupportedOperationException("Unimplemented method 'createGroup'");
    }
}
