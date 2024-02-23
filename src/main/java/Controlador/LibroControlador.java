/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Libro;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class LibroControlador {
    
    private Libro libro;

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
   
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    ////////////////////////////////////////////////////////////////////////////////////////////////
    
 public ArrayList<Object[]> DatosLibros() {
    ArrayList<Object[]> listaDatos = new ArrayList<>();
    String sql = "{CALL DatosLibro()}"; 

    try (CallableStatement statement = conectar.prepareCall(sql);
         ResultSet resultSet = statement.executeQuery()) {
        int cont = 1;
        while (resultSet.next()) {
            Object[] fila = new Object[8]; 
            fila[0] = cont;
            fila[1] = resultSet.getString("titulo");
            fila[2] = resultSet.getString("autor");
            fila[3] = resultSet.getString("ISBN");
            fila[4] = resultSet.getInt("paginas");
            fila[5] = resultSet.getInt("edicion");
            fila[6] = resultSet.getString("editorial");
            fila[7] = resultSet.getString("lugar");
            fila[8] = resultSet.getDate("fecha_edicion");
            listaDatos.add(fila);

            cont++;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaDatos;
}


 
 
   ///////////////////////////////////////////////////////////DATOS DE MANTENIMIENTO POR PLACA/////////////////////////////////////////////////////////////////////7
    
     public ArrayList<Object[]> datosMantenimiento() {
        ArrayList<Object[]> listaDatos = new ArrayList<>();
        String sql = "SELECT  v.NUMPLACA, m.CAMBIOSACEITE, m.CAMBIOSFILTRO, m.FECHA, m.KILOMETRAJE " +
                     "FROM MANTENIMIENTO m " +
                     "JOIN VEHICULO v ON m.IDVEHICULO = v.IDVEHICULO";
        
        try (PreparedStatement statement = conectar.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            int cont = 1;
            while (resultSet.next()) {
                Object[] fila = new Object[6];
                fila[0] = cont;
                fila[1] = resultSet.getString("NUMPLACA");
                fila[2] = resultSet.getString("CAMBIOSACEITE");
                fila[3] = resultSet.getString("CAMBIOSFILTRO");
                fila[4] = resultSet.getDate("FECHA");
                fila[5] = resultSet.getInt("KILOMETRAJE");
                listaDatos.add(fila);
                
                cont++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaDatos;
    }

    ////////////////////////////////////////////////////OBTENER LISTA DE PLACAS///////////////////////////////////////////////////////////
     
    public List<String> obtenerListaPlacasVehiculos() {
        List<String> placas = new ArrayList<>();
        String sql = "SELECT NUMPLACA FROM VEHICULO";

        try (PreparedStatement statement = conectar.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String numPlaca = resultSet.getString("NUMPLACA");
                placas.add(numPlaca);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de placas de vehículos: " + e.getMessage());
        }
        return placas;
    }
   
  /////////////////////////////////////////////////////////////CREAR MANTENIMENTO///////////////////////////////////////////////////////////////////7  
    
//public void agregarMantenimiento(Mantenimiento mantenimiento, VehiculoControlador vehiculoControlador) {
//    try {
//        String sql = "CALL CrearMantenimiento(?, ?, ?, ?, ?)";
//        CallableStatement cs = conectar.prepareCall(sql);
//        cs.setString(1, mantenimiento.getIdvehiculo());
//        cs.setString(2, mantenimiento.getCambiosDeAceite());
//        cs.setString(3, mantenimiento.getCambiosDeFiltro());
//        cs.setDate(4, new java.sql.Date(mantenimiento.getFecha().getTime()));
//        cs.setInt(5, mantenimiento.getKilometraje());
//        cs.execute();
//        
//        Vehiculo vehiculo = vehiculoControlador.obtenerVehiculoPorPlaca(mantenimiento.getIdvehiculo());
//        if (vehiculo != null) {
//            vehiculo.setKilometraje(mantenimiento.getKilometraje()); 
//            vehiculoControlador.editarVehiculo(vehiculo, vehiculo.getNumPlaca());
//        }
//        
//     
//    } catch (SQLException e) {
//        System.out.println("Error al agregar mantenimiento: " + e.getMessage());
//    }
//}


//////////////////////////////////////////////////////////////////EDITAR MANTENIMIENTO///////////////////////////////////////////////////////////////

//public void editarMantenimiento(Mantenimiento mantenimiento) {
//    CallableStatement cs = null;
//
//    try {
//        String sql = "CALL ModificarMantenimiento(?, ?, ?, ?, ?)";
//        cs = conectar.prepareCall(sql);
//        cs.setString(1, mantenimiento.getIdvehiculo());
//        cs.setDate(2, new java.sql.Date(mantenimiento.getFecha().getTime()));
//        cs.setString(3, mantenimiento.getCambiosDeAceite());
//        cs.setString(4, mantenimiento.getCambiosDeFiltro());
//        cs.setInt(5, mantenimiento.getKilometraje());
//
//        int resultado = cs.executeUpdate();
//        if (resultado > 0) {
//            JOptionPane.showMessageDialog(null, "Mantenimiento editado con éxito");
//        } else {
//            JOptionPane.showMessageDialog(null, "Error al editar mantenimiento");
//        }
//    } catch (SQLException e) {
//        System.out.println("Error al editar mantenimiento: " + e.getMessage());
//    } finally {
//        try {
//            // Cerrar el CallableStatement
//            if (cs != null) {
//                cs.close();
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error al cerrar el CallableStatement: " + ex.getMessage());
//        }
//    }
//}





    //////////////////////////////////////////////////////////////////BUSCAR MANTENIMIENTO POR PLACA//////////////////////////////////////////////////////////////////////////////
    
    
public ArrayList<Object[]> buscarMantenimientosPorPlaca(String numPlaca) {
    ArrayList<Object[]> listaMantenimientos = new ArrayList<>();

    try {
        String sql = "CALL BuscarMantenimientoPorPlaca(?)";
        CallableStatement cs = conectar.prepareCall(sql);
        cs.setString(1, numPlaca);

        ResultSet rs = cs.executeQuery();

        int cont = 1; 

        while (rs.next()) {
            Object[] obMantenimiento = new Object[6]; 
            obMantenimiento[0] = cont;
            obMantenimiento[1] = rs.getObject("NUMPLACA");
            obMantenimiento[2] = rs.getObject("CAMBIOSACEITE");
            obMantenimiento[3] = rs.getObject("CAMBIOSFILTRO");
            obMantenimiento[4] = rs.getObject("FECHA");
            obMantenimiento[5] = rs.getObject("KILOMETRAJE");

            listaMantenimientos.add(obMantenimiento);

            cont++;
        }

        cs.close();
        return listaMantenimientos;
    } catch (SQLException e) {
        System.out.println("Error al buscar mantenimientos por número de placa: " + e.getMessage());
    }

    return null;
}
   //////////////////////////////////////////////////////////////////////ELIMINAR MANTENIMIENTO//////////////////////////////////////////////////////////////////////////// 
    
public void eliminarLibro(String numPlaca, Date fecha) {
    try {
        String sql = "CALL EliminarMantenimiento(?, ?)";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setString(1, numPlaca);
        ps.setDate(2, new java.sql.Date(fecha.getTime()));
        ps.executeUpdate();
        ps.close();
        
        System.out.println("Mantenimiento eliminado con éxito.");
    } catch (SQLException e) {
        System.out.println("Error al eliminar mantenimiento: " + e.getMessage());
    }
}



}
