package com.example.ServiPeru.ServiPeru.Repository;

import com.example.ServiPeru.ServiPeru.Model.Empresas;
import com.example.ServiPeru.ServiPeru.Model.Materiales;
import com.example.ServiPeru.ServiPeru.Patters.ConexionBD;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Repository
public class IRepositoryMaterialImpl implements IRepositoryMaterial{
    @Override
    public List<Materiales> Listar() {
        String SQL = "select * from Material";

        List<Materiales> materiales = new ArrayList<>();
        //Da error pero si funcion OJO
        try(Connection con = ConexionBD.getConexion();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while (rs.next()){
                Materiales mats = new Materiales();
                mats.setCodigo(rs.getInt(1));
                mats.setNombre(rs.getString(2));
                mats.setCant(rs.getInt(3));
                mats.setFechaComp(rs.getString(4));
                mats.setFechaRev(rs.getString(5));

                materiales.add(mats);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return materiales;
    }

    @Override
    public int crear(Materiales Objeto) {
        return 0;
    }


}
