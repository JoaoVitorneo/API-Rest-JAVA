package com.project.gamesdb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Gender() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
}
