package ar.com.batalla.naval.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ShipLocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
    private String cell;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ship_id")
    private Ship ship;

    //Empty Constructor
    public ShipLocation() {
    }

     public ShipLocation(Ship ship, String cell) {
        this.ship = ship;
        this.cell = cell;
    }

    public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}
	
    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }    

}
