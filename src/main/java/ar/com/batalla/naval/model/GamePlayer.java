package ar.com.batalla.naval.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class GamePlayer implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gamePlayer_id", unique = true, nullable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="GAME_ID")
	private Game game;


	@ManyToOne(fetch = FetchType.LAZY)
	private Player player;
	
	@JsonIgnore
	private Date joinDate;

	@OneToMany(mappedBy="gamePlayerbarcos", fetch=FetchType.LAZY)
	private List<Ship> ships ;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	@JsonIgnore
	public void setGame(Game game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public List<Ship> getShips() {
		return ships;
	}

	public void setShips(List<Ship> ships) {
		this.ships = ships;
	}
}
