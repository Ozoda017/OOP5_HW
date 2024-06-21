package less5;

import less5.Controller.TeacherController;
import less5.Model.Impl.Student;
import less5.Model.Impl.StudentGroup;
import less5.Model.Impl.Teacher;

public class Main {
    
    public static void main(String[] args) {
       
        TeacherController teacherController  =  new TeacherController();
        Student s1_gr1 = TeacherController.createStudent(new Student(1, "Петр", "Иванов"));
        Student s2_gr1 = TeacherController.createStudent(new Student(2, "Василий",  "Сорокин"));
        Student s3_gr1 = TeacherController.createStudent(new Student(3, "Павел", "Воронин"));

        Teacher t_gr1 = TeacherController.createTeacher(new Teacher(4, "Анастасия", "Романова"));

      
        StudentGroup gr1 = TeacherController.createGroup(1, t_gr1, s1_gr1, s2_gr1, s3_gr1);

        Student s1_gr2 = TeacherController.createStudent(new Student(5, "Мария", "Огурцова"));
        Student s2_gr2 = TeacherController.createStudent(new Student(6, "Евгения", "Николавева"));
        Student s3_gr2 = TeacherController.createStudent(new Student(7, "Михаил", "Уткин"));

        Teacher t_gr2 = TeacherController.createTeacher(new Teacher(8, "Ольга", "Петрова"));

        StudentGroup gr2 = TeacherController.createGroup(2, t_gr1, s1_gr2, s2_gr2, s3_gr2);

        System.out.println(gr1.toString());
        System.out.println(gr2.toString());

    }
}
