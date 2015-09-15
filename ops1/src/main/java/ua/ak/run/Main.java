package ua.ak.run;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) throws IOException {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Primary");
		EntityManager em = factory.createEntityManager();
		em.close();
		factory.close();
	}
}
