package com.example.demolog4j;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {

	public Server() {}


	@Override
	public String sayHello() {
		return "Hello, world!";
	}

	public static void main(String args[]) {

		try {
			Server obj = new Server();
			Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 5099);

			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello", stub);

			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}