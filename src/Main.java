import java.time.LocalDate;


import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	
	
	public static void main(String[] args) throws Exception {
		
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1= new Customer(1,"Hamit","Bozdað",LocalDate.of(1989, 10, 2),"52516400508"); 		//Mernis kontrolü sadece yýl bilgisine göre yapar.
		customerManager.save(customer1);
		
		
		
	
		
		
	

	}

}
