package com.example.demo.model;


import com.azure.core.annotation.Get;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {


      @Id
//      @GeneratedValue( strategy = GenerationType.AUTO)
//      @GeneratedValue(strategy = GenerationType.IDENTITY)
              @GeneratedValue(strategy = GenerationType.SEQUENCE)
//              @GeneratedValue(strategy = GenerationType.TABLE)
      int id;

      String firstName;
      String lastName;
      String email;
      int phoneNumber;
}
