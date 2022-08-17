package com.tyss.Hotel.Controller;

import com.tyss.Hotel.dao.HotelDao;
import com.tyss.Hotel.dao.RoomDao;
import com.tyss.Hotel.dto.Hotel;
import com.tyss.Hotel.dto.Room;

public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel h = new Hotel();
		h.setName("Marriot");
		
	    HotelDao hd = new HotelDao();
	    Room r = new Room();
	    r.setType("Non-AC");
	    r.setCapacity(500);
	    r.setHotel(h);
	    hd.saveHotel(h);
	    RoomDao rd = new RoomDao();
	    rd.saveRoom(r);
	    

	}

}
