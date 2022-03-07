package com.example.test;

import java.net.InetAddress;

/**
 * @Author: zw
 * @Date: 2021/8/8 11:13
 */
public class BiuBiu {
	public static void main(String[] args) {

		InetAddress ip;
		String hostname;
		try {
			ip = InetAddress.getLocalHost();
			System.out.println();
			hostname = ip.getHostName();
			System.out.println("Your current IP address : " + ip);
			System.out.println("Your current Hostname : " + hostname);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
