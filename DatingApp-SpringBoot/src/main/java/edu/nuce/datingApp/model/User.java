/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuce.datingApp.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

/**
 *
 * @author duckh
 */
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Role role;
    private String fullname;
    private Date dateOfBirth;
    private int gender;
    private String address;
    private String email;
    private String phoneNumber;
    private String description;
    private String facebookLink;
    private String instagramLink;
    private String tweeterLink;
    private String username;
    private String passwordHash;
    private int status; //0- disabled, 1- enabled
    private Instant createdDate;
}
