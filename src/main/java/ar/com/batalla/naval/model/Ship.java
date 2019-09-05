package ar.com.batalla.naval.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private GamePlayer gamePlayerId;

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GamePlayer getGamePlayerId() {
		return gamePlayerId;
	}

	public void setGamePlayerId(GamePlayer gamePlayerId) {
			this.gamePlayerId = gamePlayerId;
		}
}
