package com.example.foroapi.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public CharSequence getPassword() {
        return null;
    }

    public void setPassword(String encode) {
    }

    public String getEmail() {
        return null;
    }

    public String getUsername() {
        return null;
    }

    public Long getId() {
        return null;
    }

    // Getters and setters
}

