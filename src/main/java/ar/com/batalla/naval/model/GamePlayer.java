package ar.com.batalla.naval.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

@Entity
public class GamePlayer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gamePlayer_id", unique = true, nullable = false)
	private Long id;
	
	@JsonIgnore
	@ManyToOne
    private Game game;
	
	@ManyToOne
	private Player player;
	
	@JsonIgnore
	private Date joinDate;
	
	/**
	 * constructor, getters y setters
	 */
	
	public GamePlayer() {
		
	}

	public GamePlayer(Long id, Game game, Player player, Date joinDate) {
		this.id = id;
		this.game = game;
		this.player = player;
		this.joinDate = joinDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Game getGameId() {
		return game;
	}

	public void setGameId(Game game) {
		this.game= game;
	}

	public Player getPlayerId() {
		return player;
	}

	public void setPlayerId(Player player) {
		this.player = player;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	


	

}
