package ar.com.batalla.naval.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	private GamePlayer gamePlayerbarcos;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "ship")
	List<ShipLocation> shipLocation ;
	// Getters and Setters

	public List<ShipLocation> getShipsLocation() {
		return shipLocation;
	}

	public void setShipsLocation(List<ShipLocation> shipLocation) {
		this.shipLocation = shipLocation;
	}

	public Long getId() {
		return id;
	}

/*	public List<ShipLocation> getShipLocation() {
		return shipLocation;
	}

	public void setShipLocation(List<ShipLocation> shipLocation) {
		this.shipLocation = shipLocation;
	}*/

	public void setId(Long id) {
		this.id = id;
	}

	public GamePlayer getGamePlayerbarcos() {
		return gamePlayerbarcos;
	}

	public void setGamePlayerbarcos(GamePlayer gamePlayerbarcos) {
		this.gamePlayerbarcos = gamePlayerbarcos;
	}

	 
}
