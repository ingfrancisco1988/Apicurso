package ar.com.batalla.naval.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Date;

@Entity
public class GamePlayer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gamePlayer_id", unique = true, nullable = false)
	private Long id;
	
	@ManyToOne
    private Game gameId;
	
	@ManyToOne
	private Player playerId;
	
	private Date joinDate;
	
	/**
	 * constructor, getters y setters
	 */
	
	public GamePlayer() {
		
	}

	public GamePlayer(Long id, Game gameId, Player playerId, Date joinDate) {
		this.id = id;
		this.gameId = gameId;
		this.playerId = playerId;
		this.joinDate = joinDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Game getGameId() {
		return gameId;
	}

	public void setGameId(Game gameId) {
		this.gameId = gameId;
	}

	public Player getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Player playerId) {
		this.playerId = playerId;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	


	

}
