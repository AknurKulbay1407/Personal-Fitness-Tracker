import java.util.Objects;

public class FitnessUser extends User {
    private String status;

    public FitnessUser(String name, String surname, String status) {
        super(name, surname);
        this.status = status;
    }

    // Getter & Setter
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getInfo() {
        return getName() + " " + getSurname() + " (" + status + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof FitnessUser)) return false;
        FitnessUser u = (FitnessUser) o;
        return Objects.equals(status, u.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status);
    }
}
