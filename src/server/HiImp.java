package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import stubs.Hi;

public class HiImp extends UnicastRemoteObject implements Hi {
    private static final long serialVersionUID = 0L;
    
	public HiImp() throws RemoteException {
		super();
	}

	@Override
	public String sayHi() throws RemoteException {
		return "Hi";
	}

}
