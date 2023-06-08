package org.example.DataBase;

import org.example.Modelo.Volcan;
import org.example.Ventana;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VolcanesDAO implements InterfazDAO {

    public VolcanesDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Volcanes (Nombre,Cantidad de Erupciones,Clasificacion,Periodicidad,Ubicacion,URL) VALUES(?, ?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("VolcanesDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Volcan) obj).getNombre());
        pstm.setInt(2, ((Volcan) obj).getCantidaddeErupciones());
        pstm.setString(3, ((Volcan) obj).getClasificacion());
        pstm.setInt(4, ((Volcan) obj).getPeriodicidad());
        pstm.setString(5, ((Volcan) obj).getUbicacion());
        pstm.setString(6, ((Volcan) obj).getUrl());

        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Volcanes SET Nombre = ?, CantidaddeErupciones = ?, Clasificacion = ?, Periodicidad = ?, Ubicacion = ?, URL = ? WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("VolcanesDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Volcan) obj).getNombre());
        pstm.setInt(2, ((Volcan) obj).getCantidaddeErupciones());
        pstm.setString(3, ((Volcan) obj).getClasificacion());
        pstm.setInt(4, ((Volcan) obj).getPeriodicidad());
        pstm.setString(5, ((Volcan) obj).getUbicacion());
        pstm.setString(6, ((Volcan) obj).getUrl());
        pstm.setInt(7, ((Volcan)obj).getID());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Volcanes WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("VolcanesDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Volcanes";
        ArrayList<Ventana> resultado = new ArrayList<>();

        Statement stm = ConexionSQL.getInstance("VolcanesDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            resultado.add(new Ventana(rst.getString(2)));

        }
        return resultado;
    }
    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Volcanes WHERE id = ? ;";
        Volcan volcan  = null;

        PreparedStatement pstm = ConexionSQL.getInstance("VolcanesDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){

            volcan =new Volcan(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getInt(5), rst.getString(6), rst.getString(7));


            return volcan;
        }
        return null;
    }


}