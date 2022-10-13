/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo3.reto3.Reto3_Final.service;



import com.ciclo3.reto3.Reto3_Final.Repositorio.ITcategoria;
import com.ciclo3.reto3.Reto3_Final.modelo.Tcategoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author hhectoreduardoo96
 */
@Service
public class ServicioCategoria {
    
    @Autowired
    private ITcategoria repository;
    
    public Tcategoria saveCategoria(Tcategoria categoria){
        return repository.save(categoria);
    }
    
       public List <Tcategoria> getcategorias(){
        return (List <Tcategoria>) repository.findAll();
    } 
    
       public Tcategoria getCategoriaById (int id){
        return repository.findById(id).orElse(null);
    } 
       public Tcategoria getCategoriaByName(String name) {
            return repository.findByName(name);
    } 
       public String deleteCategoria (int id){
         repository.deleteById(id);
         return "producto removido" + id;
    } 
       public Tcategoria updateCategoria (Tcategoria categoria){
           Tcategoria existingCategoria = repository.
            findById(categoria.getId()).orElse(null);
           existingCategoria.setNomcategoria(categoria.getNomcategoria());
           return repository.save(existingCategoria);
    } 

    public List<Tcategoria> getCategorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
       
    
}
