package ar.com.batalla.naval.service;

import org.springframework.stereotype.Service;

import ar.com.batalla.naval.model.Player;

@Service
public interface PlayerService {
	
	public Player save(Player player);
}
