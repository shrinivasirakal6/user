package com.example.user.demo.user.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Setter
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;
}
