package com.example.ServiPeru.ServiPeru.Repository;

import com.example.ServiPeru.ServiPeru.Model.Servicio;

import java.util.List;

public interface IRepositoryServicio {
    List<Servicio> Listar();
    int crear(Servicio Objeto);

}
