public class User1 {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private String status;

    public User1 ( String name, String surname, String status) {
        setId();
        setName(name);
        setSurname(surname);
        setStatus(status);
    }
    public String smth () {return id + ". " + name + " " + surname + " status: " + status;}
    public int getId () {return id;}
    public void setId () {this.id = id_gen++;}
    public String getName () {return name;}
    public void setName (String name) {this.name = name;}
    public String getSurname () {return surname;}
    public void setSurname (String surname) {this.surname = surname;}
    public String getStatus () {return status;}
    public void setStatus (String status) {this.status = status;}
}
