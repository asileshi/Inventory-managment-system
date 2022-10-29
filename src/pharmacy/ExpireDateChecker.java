package pharmacy;

import java.sql.*;
import javax.swing.*;
import java.util.StringTokenizer;

public class ExpireDateChecker extends parentClass {

    ExpireDateChecker() {
     
        String query = "select * from medicine_list";
        try {
            int count = 0;
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                String tempExpireDate = result.getString("expire_date");
                StringTokenizer st = new StringTokenizer(tempExpireDate, "-");
                String date[] = new String[3];

                int i = 0;
                while (st.hasMoreTokens()) {
                    date[i] = st.nextToken();
                    i++;
                }
                String tempid = result.getString("id");
                String queryDelete = "delete from medicine_list where id=" + "\"" + tempid + "\"";
                PreparedStatement prepared = con.prepareStatement(queryDelete);
                
                if (currentYear > (Integer.parseInt(date[0]))) {

                    prepared.executeUpdate();
                   // admin note = new admin();
                    count++;
                   // note.notificatioin();

                } else if (currentYear == (Integer.parseInt(date[0]))) {
                    if (currentMonth > (Integer.parseInt(date[1]))) {
                        prepared.execute();
                         count++;

                    }
                } else if (currentYear == (Integer.parseInt(date[0]))) {
                    if (currentMonth == (Integer.parseInt(date[1]))) {
                        if (currentDay >= (Integer.parseInt(date[2]))) {
                            prepared.execute();
                             count++;

                        }
                    }

                }

            }
           JOptionPane.showMessageDialog(null,"deleted "+count+" messages");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error occured!");

        }
    }

    public static void main(String[] args) {
       
    }

}
