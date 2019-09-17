package ar.com.batalla.naval.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="gamePlayerbarcos_id")
	private GamePlayer gamePlayerbarcos;
	@JsonIgnore
	@OneToMany(mappedBy="ship", fetch=FetchType.LAZY)
	Set<ShipLocation> shipLocation = new HashSet<>();
	// Getters and Setters

	public Set<ShipLocation> getShipsLocation() {
		return shipLocation;
	}

	public void setShipsLocation(Set<ShipLocation> shipLocation) {
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
