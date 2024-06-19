package com.example.ServiPeru.ServiPeru.Controllers;

import com.example.ServiPeru.ServiPeru.Model.Empresas;
import com.example.ServiPeru.ServiPeru.Service.IServiceEmpresasImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controladores {
    @Autowired
    private IServiceEmpresasImpl serviceEmpresas;
    @GetMapping("/Empresas")
    public String Listar(Model model){
        List<Empresas> empresa = new ArrayList<>();
        empresa = serviceEmpresas.Listar();

        model.addAttribute("listado",empresa);

        return "Empresas";
    }
    @GetMapping("/Login")
    public String Login(){
        return "Login";
    }
    @GetMapping("/inicio")
    public String Inicio(){
        return "inicio";
    }
    @GetMapping("/inicioEmp")
    public  String inicioEmp(){
        return "inicioEmp";
    }

}
