package p06.textbook.exercise.ex18;

public class ShopService {
	
	 static ShopService shopService = new ShopService();
	
	 ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return shopService;		
	}
}
