package ar.com.batalla.naval.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ShipLocation {
	  
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JsonIgnore
	private Ship ship;
    private String cell;
    

    //Empty Constructor
    public ShipLocation() {
    }

    //Constructor with parameters
    public ShipLocation(Ship ship, String cell) {
        this.ship = ship;
        this.cell = cell;
    }

    //Getters and Setters
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship shipId) {
        this.ship = shipId;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }    

}
