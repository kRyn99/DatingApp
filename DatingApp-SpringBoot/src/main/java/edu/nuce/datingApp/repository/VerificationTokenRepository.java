/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuce.datingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.nuce.datingApp.model.VerificationToken;
import java.util.Optional;

/**
 *
 * @author duckh
 */
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    Optional<VerificationToken> findByToken(String token);

}
