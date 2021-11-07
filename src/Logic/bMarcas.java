package Logic;

import Setting.Conect;
import Data.aMarcas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class bMarcas {
    
    private Conect mysql = new Conect();
    private Connection conect = mysql.ConectS();
    private String sSql = "";
    public Integer TotalRecords;
    
    public DefaultTableModel Show (String Search){
        DefaultTableModel model;
        String [] Titles = {"ID", "Marca"};
        String [] Register = new String [2];
        TotalRecords = 0;
        model = new DefaultTableModel (null, Titles);
        if(Search.equals("")){
            sSql = "SELECT * FROM marcas";
        } else {
            sSql = "SELECT *FROM marcas WHERE NombreMarcas LIKE '%"+Search+"%'";
        }
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            while(rs.next()){
                Register[0] = rs.getString(1);
                Register[1] = rs.getString(2);
                TotalRecords++;
                model.addRow(Register);
            }
            return model;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public boolean Insert (aMarcas dts){
        sSql = "INSERT INTO marcas (NombreMarcas) VALUES(?)";
        try {
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setString(1, dts.getNombreMarcas());
            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos "+e);
            return false;
        }
    }
    
    public boolean Edit (aMarcas dts){
        sSql = "UPDATE marcas SET NombreMarcas=? WHERE IDMarcas=?";
        try{
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setString(1, dts.getNombreMarcas());
            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar datos "+e);
            return false;
        }
    }
    
    public boolean Delete (aMarcas dts){
        sSql = "DELETE FROM marcas WHERE IDMarcas=?";
        try{
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setInt(1, dts.getIDMarcas());
            int n = pst.executeUpdate();
            return n!=0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar datos " +e);
            return false;
        }
    }
    
}