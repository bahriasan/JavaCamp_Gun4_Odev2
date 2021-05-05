package odev4Gun2;

import java.rmi.RemoteException;

public interface ICustomerService {
	void addCustomer(Customer customer) throws RemoteException, Exception;

}
