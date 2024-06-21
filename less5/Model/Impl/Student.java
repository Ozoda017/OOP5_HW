package less5.Model.Impl;

public class Student extends User {
    private Integer studentId;

    public Student(Integer studentId, String name, String lastname) {
        super(name, lastname);
        this.studentId = studentId;
    }
   
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacherId=" + studentId +
                "name='" + super.getName() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                '}';
    }


  
}
