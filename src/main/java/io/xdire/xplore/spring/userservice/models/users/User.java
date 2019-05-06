package io.xdire.xplore.spring.userservice.models.users;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "login")
    private String login;

    @Column(name = "pass")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private String role;

}
