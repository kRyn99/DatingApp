/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuce.datingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.nuce.datingApp.model.Role;

/**
 *
 * @author duckh
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
