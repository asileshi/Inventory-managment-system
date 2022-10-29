package pharmacy;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

abstract class parentClass extends JFrame {

    static Connection con = null;
    Statement statement = null;
    static String url = "jdbc:mysql://localhost/user";
    static String username = "root";
    static String password = "root";
    DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");
    DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
    DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
    LocalDateTime currentDate = LocalDateTime.now();
    int currentYear = Integer.parseInt(year.format(currentDate));
    int currentMonth = Integer.parseInt(month.format(currentDate));
    int currentDay = Integer.parseInt(day.format(currentDate));

    parentClass() {
        try {
            con = DriverManager.getConnection(url, username, password);
            statement = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    static void exitMethod() {

        if (JOptionPane.showConfirmDialog(null, "are you sure you want to exit ?", "confirm window",
                 JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }

}
