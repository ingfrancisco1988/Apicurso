package ar.com.batalla.naval.model;

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
	private Long Id;
	private String creationDate;
	
	/**
	 * creacion de metodos getters y setters, constructor
	 * @return
	 */
	
	public Game() {
		
	}
	
	public Long getId() {
		return Id;
	}
	
	public void setId(Long id) {
		Id = id;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
