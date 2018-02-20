/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.aepi.cines.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author rosa_
 */

@Entity
@Table(name = "cine")
public class Cine implements Serializable {
    
    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;
    private String nombre;
    private String direccion;
    
    public Cine(){
        
    }
    
    public Cine(Long id){
        this.id = id;
    }

    public Cine(Long id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cine{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
}
