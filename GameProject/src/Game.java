
public class Game {
  public int gameId;
  public int systemrequirement;
  public String gameName;
  public double price;
  
 public Game(int gameId, int systemrequirement, String gameName, double price) {
	super();
	this.gameId = gameId;
	this.systemrequirement = systemrequirement;
	this.gameName = gameName;
	this.price = price;
}

public Game() {
	// TODO Auto-generated constructor stub
}

public int getGameId() {
	return gameId;
}

public void setGameId(int gameId) {
	this.gameId = gameId;
}

public int getSystemrequirement() {
	return systemrequirement;
}

public void setSystemrequirement(int systemrequirement) {
	this.systemrequirement = systemrequirement;
}

public String getGameName() {
	return gameName;
}

public void setGameName(String gameName) {
	this.gameName = gameName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public void setSystemrequirement(String string) {
	// TODO Auto-generated method stub
	
}


	  
  }

