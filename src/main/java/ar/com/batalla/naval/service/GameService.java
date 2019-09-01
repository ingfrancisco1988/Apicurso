package ar.com.batalla.naval.service;

import ar.com.batalla.naval.model.Game;

public interface GameService {

    public Game findById(Long id);
    public Game findAll();
    public Game save();
    public Game deleteById();

}
