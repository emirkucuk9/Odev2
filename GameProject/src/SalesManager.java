public class SalesManager implements SalesService {

    
	@Override
    public void compaignSale(Gamer gamer, Campaign campaign, Game game) {
        String campaignSale = null;
        System.out.println(gamer.getFirstName() + "isimli kullacýya" + game.gameName + "adlý oyun" + campaignSale + "kampanyalý satýþ yapýldý");

    }

    @Override
    public void withoutCampaignSale(Gamer gamer, Game game) {
        String withoutCampaignSale = null;
        System.out.println(gamer.getFirstName() + "isimli kullacýya" + game.gameName + "adlý oyun" + withoutCampaignSale + "kampanyasýz satýþý yapýldý");


    }

    @Override
    public void returnOfSale(Gamer gamer, Game game) {
        String returnOfSale = null;
        System.out.println(gamer.getFirstName() + "isimli kullacý tarafýndan" + game.gameName + "adlý oyun" + returnOfSale + "iade edildi ");

    }


}