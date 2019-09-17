package ar.com.batalla.naval.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
	@JsonIgnore
	@OneToMany(mappedBy="gamePlayerbarcos", fetch=FetchType.LAZY)
	Set<Ship> ships = new HashSet<>();
	
	/**
	 * constructor, getters y setters
	 */
	
	public GamePlayer() {
		
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	 

	public Set<Ship> getShips() {
		return ships;
	}

	public void setShips(Set<Ship> ships) {
		this.ships = ships;
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
