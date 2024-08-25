package com.springboot.springboot.entity;
import com.springboot.springboot.model.RoleType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="logintable")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email_id",nullable=false,unique=true)
    private String email;

    @Column(name = "password", nullable=false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private RoleType role;

}
