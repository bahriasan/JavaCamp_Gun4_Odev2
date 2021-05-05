package odev4Gun2;

import java.rmi.RemoteException;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws RemoteException;

}

