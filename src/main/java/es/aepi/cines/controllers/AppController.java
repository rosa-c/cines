/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.aepi.cines.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rosa_
 */
@Controller
public class AppController implements ErrorController{
    
    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        System.out.println("[AppController] request: "+request.getServletPath());
        return "index";
    }

    @Override
    public String getErrorPath() {
         System.out.println("[AppController] error: ");
        return "error";
    }
}
