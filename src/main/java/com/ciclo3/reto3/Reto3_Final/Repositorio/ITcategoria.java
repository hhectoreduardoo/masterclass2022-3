/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo3.reto3.Reto3_Final.Repositorio;

import com.ciclo3.reto3.Reto3_Final.modelo.Tcategoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hhectoreduardoo96
 */
public interface ITcategoria extends JpaRepository<Tcategoria, Integer>{

    public Tcategoria findByName(String name);
    
}
