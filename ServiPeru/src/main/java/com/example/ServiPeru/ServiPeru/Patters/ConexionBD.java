package com.example.ServiPeru.ServiPeru.Patters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static String url="jdbc:sqlserver://localhost:1433;databaseName=ServiPeru;TrustServerCertificate=true";
    private static String userName = "JCarlos";
    private static String password = "1234";
    private static Connection con;

    public static Connection getConexion() throws SQLException {

        try{
            con = DriverManager.getConnection(url,userName, password);

            if(con !=null && !con.isClosed()){
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Conexión nula");
            }
        }catch(SQLException e){
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            throw e;
        }

        return con;
    }

    public static void main(String[] args) {

        try {
            // Intenta obtener una conexión
            Connection conexion = getConexion();

            // Si llega hasta aquí, la conexión fue exitosa
            // Puedes realizar más operaciones con la conexión si es necesario

            // Por ejemplo, puedes cerrar la conexión después de usarla
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            // Maneja cualquier excepción que pueda ocurrir durante la conexión
            e.printStackTrace();
        }

    }
}

