/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.aepi.cines.controllers;

import es.aepi.cines.model.Cine;
import es.aepi.cines.model.dao.CineDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.persistence.internal.core.helper.CoreClassConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author rosa_
 */

@Controller
public class CineController {
    
    @Autowired
    private CineDAO cineDAO;
    
    @RequestMapping(value = "cines")
    public String getAllCines(Model model){
        ArrayList<Cine> cines = (ArrayList<Cine>) cineDAO.findAll();

        model.addAttribute("cines", cines);
        return "cines";
    }
    
    @RequestMapping(value = "cines/{id}")
    public String getCineId(Model model, @PathVariable(value = "id") Long id){
        Cine cine = cineDAO.findOne(id);
        
        model.addAttribute("cine", cine);
        return "cine";
    }
    
 

    public CineDAO getCineDAO() {
        return cineDAO;
    }

    public void setCineDAO(CineDAO cineDAO) {
        this.cineDAO = cineDAO;
    }
    
    
}
