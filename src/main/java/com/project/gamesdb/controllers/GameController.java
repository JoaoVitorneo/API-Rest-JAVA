package com.project.gamesdb.controllers;

import com.project.gamesdb.entities.Game;
import com.project.gamesdb.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameRepository repository;

    @GetMapping
    public List<Game> showAll() {
      List<Game> result = repository.findAll();
      return result;

    }
    @GetMapping(value = "/{id}")
    public Game findById(@PathVariable Long id) {
        Game result = repository.findById(id).get();
        return result;
    }

    @PostMapping(value = "/games")
    public Game insert(@RequestBody Game game) {
        Game result = repository.save(game);
        return result;
    }
}
