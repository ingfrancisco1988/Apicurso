package ar.com.batalla.naval.controller;

import ar.com.batalla.naval.model.Game;
import ar.com.batalla.naval.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/game")
@RestController
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping("/{id}")
  public Game getGame(@PathVariable("id") Long id){
    return gameService.findById(id);
  }


}
