package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_1Vo> req1 = new ArrayList<Requerimiento_1Vo>();
        String sql = "SELECT l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Salario FROM Lider l WHERE l.Salario > (SELECT AVG(l.Salario) FROM Lider l) ORDER BY l.Salario DESC";
        try(Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setIdLider(rs.getInt("ID_Lider"));
                requerimiento1.setNombre(rs.getString("Nombre"));
                requerimiento1.setPrimerApellido(rs.getString("Primer_Apellido"));
                requerimiento1.setSalario(rs.getInt("Salario"));
                req1.add(requerimiento1);
                
            }

        }
        return req1;
    }
}