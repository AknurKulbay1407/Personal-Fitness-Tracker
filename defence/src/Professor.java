public class Professor extends Person {
    private int professorId;
    private String department;
    public Professor(String name, int age, int professorId, String department){
        super(name, age);
        setProfessorId(professorId);
        setDepartment(department);
    };
    public int getProfessorId(){
        return professorId;
    };
    public String getDepartment(){
        return department;
    };
    public void setProfessorId(int professorId){
        this.professorId = professorId;
    };
    public void setDepartment(String department){
        this.department = department;
    };
    @Override public void displayInfo(){
        System.out.println("name: " + name + "\nage: " + age + "\nprofessor ID: " + professorId + "\ndepartment: " + department);
    };

}
