package curso.Spring.curso.controllers;

import models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usu = new Usuario();
        usu.setId(id);
        usu.setNombre("Sebastian");
        usu.setApellido("Diaz");
        usu.setEmail("sebastiandiaz28001@gmail.com");
        usu.setTelefono("3227254103");
        usu.setPassword("contra");

        return usu;

    }

    @RequestMapping(value = "usuario12")
    public Usuario modificarUsuario(){
        Usuario usu = new Usuario();
        usu.setNombre("Sebastian");
        usu.setApellido("Diaz");
        usu.setEmail("sebastiandiaz28001@gmail.com");
        usu.setTelefono("3227254103");
        usu.setPassword("contra");

        return usu;

    }

    @RequestMapping(value = "usuario123")
    public Usuario eliminarUsuario(){
        Usuario usu = new Usuario();
        usu.setNombre("Sebastian");
        usu.setApellido("Diaz");
        usu.setEmail("sebastiandiaz28001@gmail.com");
        usu.setTelefono("3227254103");
        usu.setPassword("contra");

        return usu;

    }

    @RequestMapping(value = "usuario4125")
    public Usuario buscarUsuario(){
        Usuario usu = new Usuario();
        usu.setNombre("Sebastian");
        usu.setApellido("Diaz");
        usu.setEmail("sebastiandiaz28001@gmail.com");
        usu.setTelefono("3227254103");
        usu.setPassword("contra");

        return usu;

    }


}
