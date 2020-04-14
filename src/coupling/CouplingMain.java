package coupling;

import services.CoffeService;

public class CouplingMain {

	public static void main(String[] args) {
		CoffeService coffiService =new CoffeService();
		
		String service = coffiService.OrederCoffe(10);

		System.out.println(service);
	}

}
