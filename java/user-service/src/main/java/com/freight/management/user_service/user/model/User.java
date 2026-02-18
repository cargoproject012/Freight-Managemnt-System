package com.freight.management.user_service.user.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "app_user")
@Data                   // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor      // Generates no-args constructor
@AllArgsConstructor     // Generates all-args constructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String name;
    private String email;
    
    public User() {} public String getName() { return name; } 
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; } 
    public void setEmail(String email) { this.email = email; } 
}
