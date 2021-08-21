package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_3Vo;
import util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3Vo> requerimiento3() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_3Vo> req3 = new ArrayList<Requerimiento_3Vo>();        
        String sql = "SELECT * FROM Lider ";
        try(Statement stmt = connection.createStatement(); ResultSet rs= stmt.executeQuery(sql)){
            while (rs.next()) {
                Requerimiento_3Vo requerimiento3 = new Requerimiento_3Vo();
                requerimiento3.setIdLider(rs.getInt("ID_Lider"));
                requerimiento3.setNombre(rs.getString("Nombre"));
                requerimiento3.setPrimer_Apellido(rs.getString("Primer_Apellido"));
                requerimiento3.setSegundo_Apellido(rs.getString("Segundo_Apellido"));
                requerimiento3.setSalario(rs.getInt("Salario"));
                requerimiento3.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                requerimiento3.setCargo(rs.getString("Cargo"));
                requerimiento3.setClasificacion(rs.getFloat("Clasificacion"));
                requerimiento3.setDocumento_Identidad(rs.getString("Documento_Identidad"));
                requerimiento3.setFecha_Nacimiento(rs.getString("Fecha_Nacimiento"));
                req3.add(requerimiento3);
                
            }
        }
        return req3;
    }

    public boolean insertar() throws SQLException{
        Connection connection = JDBCUtilities.getConnection();        
        String sql = "INSERT into Lider (Nombre, Primer_Apellido, Segundo_Apellido,Salario,Ciudad_Residencia,Cargo,Clasificacion,Documento_Identidad,Fecha_Nacimiento) values ('Marcela','Patiño', 'Ardila', 2342, 'Colombia', 'Desarrollo', 5.0, '01JH78', '1897-09-12' )";
        Statement stmt = connection.createStatement(); 
        int rs = stmt.executeUpdate(sql);
        if (rs>0) {
            System.out.println("Nuevo departamento creado. Se inserto "+ rs+ "filas");
            return true;
        }
        return false;

    }
}