package com.example.siva.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity(name = "Users")
public class User {

    @Id
   // @Column(name = "id")
    private Long id;
//@Column(name = "firstName")
    private String firstName;
//@Column(name = "lastName")
    private String lastName;
//@Column(name = "email")
    private String email;

}