package server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import stubs.Hi;

public class Server {
	public static void main(String[] args) {
		try {
			Hi hi = new HiImp();
			LocateRegistry.createRegistry(1099);
			Naming.bind("rmi://localhost:1099/sayHi", hi);
			System.out.print("Server startup");
		} catch (MalformedURLException | RemoteException | AlreadyBoundException e) {
			e.printStackTrace();
		}

	}
}
