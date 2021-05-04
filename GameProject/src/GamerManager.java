
public class GamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		System.out.println("Kullanýcý Kaydoldu : "+ gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanýcý güncellendi : "+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý silindi : "+ gamer.getFirstName());
		
	}

}
