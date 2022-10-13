package com.reto3.proyectoReto3;

import com.ciclo3.reto3.Reto3_Final.modelo.usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@Slf4j
public class controladorInicial {
    /* 
    @GetMapping("/disfraz") //Ruta para construir la URL
    public String saludar() {
        return "saludos desde Spring Boot";
    }
    */
    @Value("${index.mensaje}")
    String dato;
    
    @GetMapping("/hola")
    public String mensajeDeInicioSpringBoot(Model modelo) {
        String mensaje ="Estoy pasando informacion a la plantilla html";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        
         usuario us = new usuario();
        us.setCedula("1023011999");
        us.setClave("2022");
        us.setNombre("Hector eduardo montenegro rojas  ");
        us.setEmail("hector.montenegro.mt@usa.edu.co");
        modelo.addAttribute("unUsuario",us);
        
        
        log.info("iniciando MVC");
        return "index";
    }

}
