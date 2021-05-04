
public class GameManager implements GameService {

	@Override
	public void register(Game game) {
		System.out.println("Oyun kaydedildi : "+ game.gameName);
		
	}

	@Override
	public void update(Game game) {
	   System.out.println("Oyun güncellendi : "+ game.gameName);
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : "+ game.gameName);
		
	}

}
