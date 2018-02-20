/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.aepi.cines.model.dao;

import es.aepi.cines.model.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author rosa_
 */
public interface AdminDAO extends CrudRepository<Admin, Long>{
    
}
