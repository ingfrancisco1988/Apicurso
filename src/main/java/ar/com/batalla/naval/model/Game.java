package ar.com.batalla.naval.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id", unique = true, nullable = false)
	private Long id;
	private Date creationDate;
	
	/**
	 * creacion de metodos getters y setters, constructor
	 * @param game 
	 * @return
	 */
	
public Game() {
		
	}
	
	public Game(Game game) {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
