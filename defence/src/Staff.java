public class Staff extends Person {
    private int staffId;
    private String role;
    public Staff(String name, int age, int staffId, String role){
        super(name, age);
        setStaffId(staffId);
        setRole(role);
    };
    public int getStaffId(){
        return staffId;
    };
    public String getRole(){
        return role;
    };
    public void setStaffId(int staffId){
        this.staffId = staffId;
    };
    public void setRole(String role){
        this.role = role;
    };
    @Override public void displayInfo(){
        System.out.println("name: " + name + "\nage: " + age + "\nstaff Id: " + staffId + "\nrole: " + role );
    };



}
