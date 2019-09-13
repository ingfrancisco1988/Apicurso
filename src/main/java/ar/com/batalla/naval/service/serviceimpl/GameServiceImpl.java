package ar.com.batalla.naval.service.serviceimpl;

import ar.com.batalla.naval.model.Game;
import ar.com.batalla.naval.repository.GameRepository;
import ar.com.batalla.naval.service.GameService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

  @Autowired
  private GameRepository gameRepository;

  @Override
  public Game findById(Long id) {
	  Game game = gameRepository.findById(id).orElseThrow(()-> new RuntimeException());
    return game;
  }

  @Override
  public List<Game> findAll() {
    return gameRepository.findAll();
  }

  @Override
  public Game save(Game game) {
	    
    return gameRepository.save(game);
  }

  @Override
  public Game deleteById() {
    return null;
  }


}
