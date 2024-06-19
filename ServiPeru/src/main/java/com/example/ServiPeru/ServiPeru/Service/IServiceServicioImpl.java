package com.example.ServiPeru.ServiPeru.Service;

import com.example.ServiPeru.ServiPeru.Model.Servicio;
import com.example.ServiPeru.ServiPeru.Repository.IRepositoryServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IServiceServicioImpl implements IServiceServicio{
    @Autowired
    private IRepositoryServicio repositoryServicio;

    @Override
    public List<Servicio> Listar() {
        return repositoryServicio.Listar();
    }

    @Override
    public Servicio crear(int cod) {
        return null;
    }


}
