package less5.Model.Impl;

public class Teacher extends User {
    private Integer teacherId;

    
    public Teacher(Integer teacherId, String name, String lastname) {
        super(name, lastname);
        this.teacherId = teacherId;
    }
  

    public Integer getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "name='" + super.getName() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                '}';
    }
   
}
