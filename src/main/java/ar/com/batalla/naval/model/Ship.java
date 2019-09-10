package ar.com.batalla.naval.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private GamePlayer gamePlayerId;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "ship")
	private List<ShipLocation> shipLocation = new ArrayList<>();;
	// Getters and Setters

	public Long getId() {
		return id;
	}

	public List<ShipLocation> getShipLocation() {
		return shipLocation;
	}

	public void setShipLocation(List<ShipLocation> shipLocation) {
		this.shipLocation = shipLocation;
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
