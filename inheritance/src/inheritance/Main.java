package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer muhammed = new IndividualCustomer();
		muhammed.CustomerNumber = "12345"; 
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.CustomerNumber = "78910";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(muhammed);
		
		Customer[] customers = {muhammed,hepsiBurada};
		customerManager.addMultiple(customers);
		
	}

}
