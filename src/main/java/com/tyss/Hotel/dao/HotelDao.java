package com.tyss.Hotel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.Hotel.dto.Hotel;

public class HotelDao {
	public void saveHotel(Hotel hotel) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hotel);
		entityTransaction.commit();
		System.out.println("Data saved");
		
	}

}
