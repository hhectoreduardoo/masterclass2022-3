/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo3.reto3.Reto3_Final.Controller.ControladorCategoria;


import com.ciclo3.reto3.Reto3_Final.modelo.Tproducto;
import com.ciclo3.reto3.Reto3_Final.service.ServicioProducto;
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
@RequestMapping("/api/producto/")
/**
 *
 * @author hhectoreduardoo96
 */
public class ControladorProducto {
     @Autowired
    private ServicioProducto service;
     
    @GetMapping("/all")    
       public List<Tproducto> findAllCategorias(){
       return service.getProducts();
    } 
       
    @GetMapping("/products/{id}")  
    public Tproducto findProductsId(@PathVariable int id){
        return service.getProductById(id);
    }
    @PostMapping("/save")
       public ResponseEntity addProduct(@RequestBody Tproducto product){
           service.saveProduct(product);
        return ResponseEntity.status(201).build();
    } 
    @PutMapping("/update")
       public ResponseEntity updateProduct(@RequestBody Tproducto product){
           service.updateProduct(product);
        return ResponseEntity.status(201).build();
    } 
       
    @DeleteMapping("/delete")
       public ResponseEntity deleteProduct(@RequestBody Tproducto product){
           service.deleteProduct(product.getId());
        return ResponseEntity.status(204).build();
    }  
       
}
