package ar.com.batalla.naval.model;

public class ShipLocation {
	
	
	
    private String cell;
    

    //Empty Constructor
    public ShipLocation() {
    }

    //Constructor with parameters
   /* public ShipLocation(Ship ship, String cell) {
        this.ship = ship;
        this.cell = cell;
    }*/

    //Getters and Setters
   /* public Ship getShip() {
        return ship;
    }

    public void setShip(Ship shipId) {
        this.ship = shipId;
    }
*/
    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }    

}
