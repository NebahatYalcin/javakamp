package Entity;

public class Game {

	private int gameId;
	private String gameName;
	private int gamePrice;
	
	public Game(int gameId, String gameName, int gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
}
