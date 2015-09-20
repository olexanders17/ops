package ua.ak.run;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.ak.dao.FieldOperationDao;
import ua.ak.domain.FieldOperation;
import ua.ak.service.FieldOperationService;
import ua.ak.service.impl.FieldOperationServiceImpl;
import ua.ak.utils.ExcelReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("META-INF/appContext.xml");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();		
		
		ExcelReader excelReader = new ExcelReader();
		List<FieldOperation> list = excelReader.getAllOperations();		
		
		for (FieldOperation fieldOperation : list) {
		em.persist(fieldOperation);
		
	
		}

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
