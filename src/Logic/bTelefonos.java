package Logic;

import Setting.Conect;
import Data.aTelefonos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class bTelefonos {
    
    private Conect mysql = new Conect();
    private Connection conect = mysql.ConectS();
    private String sSql = "";
    public Integer TotalRecords;
    
    public DefaultTableModel Show (String Search){
        DefaultTableModel model;
        String [] Titles = {"ID", "IMEI", "Modelo", "Marca", "MACAdress"};
        String [] Register = new String [5];
        TotalRecords = 0;
        model = new DefaultTableModel (null, Titles);
        if(Search.equals("")){
            sSql = "SELECT * FROM telefonos";
        } else {
            sSql = "SELECT *FROM telefonos WHERE IMEI LIKE '%"+Search+"%'";
        }
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            while(rs.next()){
                Register[0] = rs.getString(1);
                Register[1] = rs.getString(2);
                Register[2] = rs.getString(3);
                Register[3] = rs.getString(4);
                Register[4] = rs.getString(5);
                TotalRecords++;
                model.addRow(Register);
            }
            return model;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public boolean Insert (aTelefonos dts){
        sSql = "INSERT INTO telefonos (IMEI,Modelo,Marca,MACAdress) VALUES(?,?,?,?)";
        try {
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setString(1, dts.getIMEI());
            pst.setString(2, dts.getModelo());
            pst.setString(3, dts.getMarca());
            pst.setString(4, dts.getMACAdress());
            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos "+e);
            return false;
        }
    }
    
    public boolean Edit (aTelefonos dts){
        sSql = "UPDATE telefonos SET IMEI=?,Modelo=?,Marca=?,MACAdress=? WHERE IDTelefono=?";
        try{
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setString(1, dts.getIMEI());
            pst.setString(2, dts.getModelo());
            pst.setString(3, dts.getMarca());
            pst.setString(4, dts.getMACAdress());
            pst.setInt(5, dts.getIDTelefono());
            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar datos "+e);
            return false;
        }
    }
    
    public boolean Delete (aTelefonos dts){
        sSql = "DELETE FROM telefonos WHERE IDTelefono=?";
        try{
            PreparedStatement pst = conect.prepareStatement(sSql);
            pst.setInt(1, dts.getIDTelefono());
            int n = pst.executeUpdate();
            return n!=0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar datos " +e);
            return false;
        }
    }
    
}