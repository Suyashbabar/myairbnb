package com.blogapp1.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;
    private String username;
    private String email;
    private String password;

    @ManyToMany
            @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id" , referencedColumnName = "id") ,
            inverseJoinColumns = @JoinColumn(name = "role_id" , referencedColumnName = "id")
            )
    private Set<Role> roles;
//    we used set because the role should not be repetitive
}
