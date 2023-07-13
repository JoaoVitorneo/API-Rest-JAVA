package com.project.gamesdb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String platform;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    public Game(){
    }

    public Long getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform() {
        this.platform = platform;
    }
}
