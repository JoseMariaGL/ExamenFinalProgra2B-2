package Setting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conect {
    public String conect = "examenfinalprogra2b-2";
    public String url = "jdbc:mysql://localhost:3306/"+conect;
    public String user = "root";
    public String pass = "";
    
    public Conect(){
        
    }
    
    public Connection ConectS(){
        Connection link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos "+e);
        }
        return link;
    }
    
    }