package DatabaeOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import org.sqlite.*;

public class DataBaseConnection {
    
    public static Connection connectTODB() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:hotel.sqlite");
          //  JOptionPane.showMessageDialog(null, "Connection Establishment");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
}
