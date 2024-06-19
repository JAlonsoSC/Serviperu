package com.example.ServiPeru.ServiPeru.Repository;

import com.example.ServiPeru.ServiPeru.Model.Materiales;

import java.util.List;

public interface IRepositoryMaterial {
    List<Materiales> Listar();
    int crear(Materiales Objeto);
}
