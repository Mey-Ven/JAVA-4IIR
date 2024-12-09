package ex2;

import java.util.ArrayList;

public class Reservation {
	
	public Client client;
	public Room room;
	public ArrayList <Client> clients;
	public int ReservID;
	public String DateReserv;

	//CONSTRUCTEUR 
	public Reservation(Client client, Room room, ArrayList<Client> clients, int reservID, String dateReserv) {
		super();
		this.client = client;
		this.room = room;
		this.clients = clients;
		ReservID = reservID;
		DateReserv = dateReserv;
	}
	
	
}
