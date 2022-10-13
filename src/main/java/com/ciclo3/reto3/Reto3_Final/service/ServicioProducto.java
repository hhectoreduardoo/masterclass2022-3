/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo3.reto3.Reto3_Final.service;

/**
 *
 * @author hhectoreduardoo96
 */
import com.ciclo3.reto3.Reto3_Final.Repositorio.ITproducto;
import com.ciclo3.reto3.Reto3_Final.modelo.Tproducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioProducto {
    
    @Autowired
    private ITproducto repository;
    
    public Tproducto saveCategoria(Tproducto product){
        return repository.save(product);
    }
    
       public List <Tproducto> getProducts(){
        return (List <Tproducto>) repository.findAll();
    } 
    
       public Tproducto getCategoriaById (int id){
        return repository.findById(id).orElse(null);
    } 
   
       public String deleteProduct (int id){
         repository.deleteById(id);
         return "producto removido" + id;
    } 
       public Tproducto updateProduct (Tproducto product){
           Tproducto existingProduct = repository.
                findById(product.getId()).orElse(null);
           existingProduct.setNombre(product.getNombre());
           existingProduct.setInventario(product.getInventario());
           existingProduct.setPrecio(product.getPrecio());
           return repository.save(existingProduct);
    }       

    public Tproducto getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void saveProduct(Tproducto product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
