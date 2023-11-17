//5 Steps in JDB Connection (Java- DataBase Connection)
//1. Register the Driver
//2. Create Connection
//3.Create Statement
//4. Execute Query
//5. Close Connection

package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Hayabusa2002!");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
