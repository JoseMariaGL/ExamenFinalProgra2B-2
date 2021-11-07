package Logic;

import Setting.Conect;
import Data.aModelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class bModelos {
    
    private Conect mysql = new Conect();
    private Connection conect = mysql.ConectS();
    private String sSql = "";
    public Integer TotalRecords;
    
    public DefaultTableModel Show (String Search){
        DefaultTableModel model;
        String [] Titles = {"ID", "Modelo"};
        String [] Register = new String [2];
        TotalRecords = 0;
        model = new DefaultTableModel (null, Titles);
        if(Search.equals("")){
            sSql = "SELECT * FROM modelos";
        } else {
            sSql = "SELECT *FROM modelos WHERE NombreModelos LIKE '%"+Search+"%'";
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
    
    public boolean Insert (aModelos dts){
        sSql = "INSERT INTO modelos (NombreModelos) VALUES(?)";
        try {
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setString(1, dts.getNombreModelo());
            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos "+e);
            return false;
        }
    }
    
    public boolean Edit (aModelos dts){
        sSql = "UPDATE modelos SET NombreModelos=? WHERE IDModelos=?";
        try{
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setString(1, dts.getNombreModelo());
            pst.setInt(2, dts.getIDModelo());
            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar datos "+e);
            return false;
        }
    }
    
    public boolean Delete (aModelos dts){
        sSql = "DELETE FROM modelos WHERE IDModelos=?";
        try{
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setInt(1, dts.getIDModelo());
            int n = pst.executeUpdate();
            return n!=0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar datos " +e);
            return false;
        }
    }
    
}