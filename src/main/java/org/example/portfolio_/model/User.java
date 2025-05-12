package org.example.portfolio_.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lastName", length = 45)
    private String lastName;

    @Column(name = "firstName", length = 45)
    private String firstName;

    @Column(name = "email", length = 45)
    private String email;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "address", length = 45)
    private String address;

    @Column(name = "skill", length = 45)
    private String skill;

    @Column(name = "photo", length = 45)
    private String photo;

}