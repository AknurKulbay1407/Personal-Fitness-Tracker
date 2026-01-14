import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadUsers {

    public static void readUsers() {
        String sql = "SELECT * FROM fitness_users";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("surname") + " " +
                                rs.getString("status")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
