import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteUser {

    public static void deleteUser(int id) {
        String sql = "DELETE FROM fitness_users WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
