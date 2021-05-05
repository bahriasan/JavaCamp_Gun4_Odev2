package odev4Gun2;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException, Exception{
		Customer customer = new Customer(1,"Bahri","Asan",1985,"28682177056");
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.addCustomer(customer);		


	}

}