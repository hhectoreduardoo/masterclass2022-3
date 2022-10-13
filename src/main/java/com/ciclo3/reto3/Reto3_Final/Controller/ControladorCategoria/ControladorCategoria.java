/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo3.reto3.Reto3_Final.Controller.ControladorCategoria;


import com.ciclo3.reto3.Reto3_Final.Repositorio.ITcategoria;
import com.ciclo3.reto3.Reto3_Final.modelo.Tcategoria;
import com.ciclo3.reto3.Reto3_Final.service.ServicioCategoria;
import com.ciclo3.reto3.Reto3_Final.modelo.Tproducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categoria/")
/**
 *
 * @author hhectoreduardoo96
 */
public class ControladorCategoria {
     @Autowired
    private ServicioCategoria service;
     
    @GetMapping("/all")    
       public List<Tcategoria> findAllCategorias(){
       return service.getCategorias();
    } 
       
    @GetMapping("/categorias/{id}")  
    public Tcategoria findCategoriasId(@PathVariable int id){
        return service.getCategoriaById(id);
    }
    @PostMapping("/save")
       public ResponseEntity addCategoria(@RequestBody Tcategoria categoria){
           service.saveCategoria(categoria);
        return ResponseEntity.status(201).build();
    } 
    @PutMapping("/update")
       public ResponseEntity updateCategoria(@RequestBody Tcategoria categoria){
           service.updateCategoria(categoria);
        return ResponseEntity.status(201).build();
    } 
       
    @DeleteMapping("/delete")
       public ResponseEntity deleteCategoria(@RequestBody Tcategoria categoria){
           service.deleteCategoria(categoria.getId());
        return ResponseEntity.status(204).build();
    }  
       
}
