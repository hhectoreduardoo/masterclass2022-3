/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo3.reto3.Reto3_Final.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 *
 * @author hector
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "producto")

public class Tproducto implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private double precio;
    private int inventario;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Tcategoria categoria;
    
}