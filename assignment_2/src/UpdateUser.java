import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateUser {

    public static void updateStatus(int id, String status) {
        String sql = "UPDATE fitness_users SET status = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, status);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
