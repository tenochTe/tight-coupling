package services;

public class CoffeService {
	
	public String OrederCoffe(int glasses) {

		/** 
		   START Coupling classes by functional method of  class
		
		
		HotCoffe hotCoffe =new HotCoffe();
		String coffe = hotCoffe.Dispatch();

		**/
		
		IceCoffe iceCoffe =new IceCoffe();
		String coffe = iceCoffe.Dispatch();
		
		/**
		    END Coupling class
		**/
		
		return String.valueOf(glasses).concat(" - ").concat(coffe);
		
	}

}
