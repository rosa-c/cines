/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.aepi.cines.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author rosa_
 */

@Entity
@Table(name = "sesion")
@NamedQuery(name = "findByidCine", query = "FROM Sesion WHERE idCine = ?1")
public class Sesion implements Serializable {
    
    @Id  @GeneratedValue
    private Long id;
    @Column(name = "idpelicula")
    private Long idPelicula;
    @Column(name = "idcine")
    private Long idCine;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;

    public Sesion() {
        
    }
    
    public Sesion (Long id){
        this.id = id;
    }

    public Sesion(Long id, Long idPelicula, Long idCine, Date fecha) {
        this.id = id;
        this.idPelicula = idPelicula;
        this.idCine = idCine;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public Long getId() {
        return id;
    }

    public Long getIdCine() {
        return idCine;
    }

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdCine(Long idCine) {
        this.idCine = idCine;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    @Override
    public String toString() {
        return "Sesion{" + "id=" + id + ", idPelicula=" + idPelicula + ", idCine=" + idCine + ", fecha=" + fecha + '}';
    }

  
    
}
