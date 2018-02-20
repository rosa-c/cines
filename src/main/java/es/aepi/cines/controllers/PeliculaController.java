/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.aepi.cines.controllers;

import es.aepi.cines.model.Pelicula;
import es.aepi.cines.model.Sesion;
import es.aepi.cines.model.dao.PeliculaDAO;
import es.aepi.cines.model.dao.SesionDAO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rosa_
 */

@Controller
public class PeliculaController {
    @Autowired
    private PeliculaDAO peliculaDAO;
    @Autowired 
    private SesionDAO sesionDAO;

    @RequestMapping(value = "cines/{idcine}/peliculas")
    public String getAllPeliculas(Model model, @PathVariable(value = "idcine") Long idcine){
     //   List<Pelicula> peliculas = peliculaDAO.findByCineId(id);
        List<Sesion> sesions = sesionDAO.findByidCine(idcine);
        List<Long> idPelis = new ArrayList<>();
        for(Sesion s:sesions)
            idPelis.add(s.getIdPelicula());
        
        List<Pelicula> peliculas = (List<Pelicula>) peliculaDAO.findAll(idPelis);
        System.out.println("sesions:: "+sesions);
        model.addAttribute("peliculas", peliculas);
        return "peliculas";
    }
    
    @RequestMapping(value = "cines/{idcine}/peliculas/{idpelicula}")
    public String getAllPeliculas(Model model, @PathVariable(value = "idcine") Long idcine, @PathVariable(value = "idpelicula") Long idpelicula){
        Pelicula pelicula = peliculaDAO.findOne(idpelicula);
        
        model.addAttribute("pelicula", pelicula);
        return "pelicula";
    }
    
    public PeliculaDAO getPeliculaDAO() {
        return peliculaDAO;
    }

    public void setPeliculaDAO(PeliculaDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }

    public SesionDAO getSesionDAO() {
        return sesionDAO;
    }

    public void setSesionDAO(SesionDAO sesionDAO) {
        this.sesionDAO = sesionDAO;
    }
    
    
    
}
