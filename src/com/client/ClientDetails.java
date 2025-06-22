package com.client;

public class ClientDetails {
	private void clientName() {
		System.out.println("clientname:rajiv");
	}

	private void clientId() {
		System.out.println("clientid:789");

	}

	private void clientLocation() {
		System.out.println("clientlocation:kovai");

	}

	public static void main(String[] args) {
		ClientDetails client = new ClientDetails();
		client.clientName();
		client.clientId();
		client.clientLocation();

	}
}
