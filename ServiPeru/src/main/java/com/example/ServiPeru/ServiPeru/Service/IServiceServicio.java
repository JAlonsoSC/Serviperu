package com.example.ServiPeru.ServiPeru.Service;

import com.example.ServiPeru.ServiPeru.Model.Servicio;

import java.util.List;

public interface IServiceServicio {
    List<Servicio> Listar();
    Servicio crear(int cod);

}
