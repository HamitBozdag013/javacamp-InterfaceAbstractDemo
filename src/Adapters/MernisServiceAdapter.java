package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService  {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		boolean control;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			control = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} 
		
		
		catch (RemoteException e) {
			control = false;
			e.printStackTrace();
		}
		
		
		return control;
	}

}
