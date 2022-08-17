package com.tyss.Hotel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.Hotel.dto.Room;

public class RoomDao {
	public void saveRoom(Room room) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		 entityTransaction.begin();
		 entityManager.persist(room);
		 entityTransaction.commit();
		 System.out.println("Data saved");
	}

}
