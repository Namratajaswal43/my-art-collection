




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Type4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "namrata@123");
            Statement stmt = con.createStatement();

            System.out.println("The entries of student table are:");
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next())
                System.out.println(rs.getString(1) + "," + rs.getInt(2) + "," + rs.getString(3));

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
