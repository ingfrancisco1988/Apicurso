package ar.com.batalla.naval.service.serviceimpl;

import ar.com.batalla.naval.model.Game;
import ar.com.batalla.naval.repository.GameRepository;
import ar.com.batalla.naval.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

  @Autowired
  private GameRepository gameRepository;

  @Override
  public Game findById() {
    return null;
  }

  @Override
  public Game findAll() {
    return null;
  }

  @Override
  public Game save() {
    return null;
  }

  @Override
  public Game deleteById() {
    return null;
  }
}
