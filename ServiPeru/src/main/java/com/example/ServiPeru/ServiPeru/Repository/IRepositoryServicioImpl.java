package com.example.ServiPeru.ServiPeru.Repository;

import com.example.ServiPeru.ServiPeru.Model.Servicio;
import com.example.ServiPeru.ServiPeru.Patters.ConexionBD;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Repository
public class IRepositoryServicioImpl implements IRepositoryServicio{
    @Override
    public List<Servicio> Listar() {
        String SQL = "select * from Servicio";

        List<Servicio> services = new ArrayList<>();

        try(Connection con = ConexionBD.getConexion();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while (rs.next()){
                Servicio serv = new Servicio();
                serv.setCodigo(rs.getInt(1));
                serv.setCodEmpresa(rs.getInt(2));
                serv.setTypServicio(rs.getString(3));
                serv.setFecha(rs.getString(4));
                serv.setLugar(rs.getString(5));
                serv.setSupervisor(rs.getString(6));
                serv.setTelSupervisor(rs.getString(7));
                serv.setMaterial(rs.getString(8));
                serv.setHInicio(rs.getString(9));
                serv.setHFinal(rs.getString(10));
                serv.setNumOperarios(rs.getInt(11));
                serv.setDistancia(rs.getInt(12));
                serv.setAccidentes(rs.getInt(13));
                serv.setTarifa(rs.getInt(14));

                services.add(serv);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return services;
    }

    @Override
    public int crear(Servicio Objeto) {
        return 0;
    }

}
