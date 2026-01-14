import java.sql.Connection;
import java.sql.PreparedStatement;

public class FitnessUserDAO {

    public static void addUser(FitnessUser user) {
        String sql = "INSERT INTO fitness_users(name, surname, status) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getSurname());
            ps.setString(3, user.getStatus());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
