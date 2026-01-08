public class Student {
    private int StudentId;
    private String name;
    private double Grade;
    public Student (int id, String name, double grade) {
        setStudentId(id);
        setName(name);
        setGrade(grade);
    }
    public int getStudentId() {
        return StudentId;
    }
    public void setStudentId (int id) {
        this.StudentId = id;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public double getGrade () {
        return Grade;
    }
    public void setGrade (double grade) {
        if (Grade > 100 || Grade < 0) {
            System.out.println("Error");
            this.Grade = 0;
        }
        this.Grade = grade;
    }
}
