package com.eoi.demoLayoutFragments.controllers;

import com.eoi.demoLayoutFragments.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("")
    public String getIndex()
    {
        return "index";
    }

    @GetMapping("/usuarios")
    public String getUsuarios(Model model)
    {
        Usuario usuario = new Usuario("pepe","pepe se define como un usuario comun");
        Usuario usuario2 = new Usuario("Juan","Juan se define como un usuario diferente a pepe");

        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(usuario2);
        listaUsuarios.add(usuario);
        model.addAttribute("usuarios",listaUsuarios);
        model.addAttribute("titulo","PAGINA DE USUARIOS");
        return "usuarios";
    }

    @GetMapping("/login")
    public String getUsuarios()
    {
        return "login";
    }

}
