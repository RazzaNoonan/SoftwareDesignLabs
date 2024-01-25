package ie.atu.sw;

import java.rmi.*;

public interface RemoteMessage extends Remote {
	public String message() throws RemoteException;
}