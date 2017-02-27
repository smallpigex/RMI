package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import stubs.Hi;

public class Clent {

	public static void main(String[] args) {
		try {
			Hi hi = (Hi)Naming.lookup("rmi://localhost:1099/sayHi");
			System.out.println(hi.sayHi());
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}

	}

}
