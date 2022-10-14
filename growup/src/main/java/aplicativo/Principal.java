package aplicativo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Paciente;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
	
		// Adicionando pacientes na base de dados; 
		
		/*
		Paciente p1 = new Paciente(null, "Evertânia", sdf.parse("10/12/1988"), "123.456.789-13", "000000000000000", "(81)91111-1111", "evertania@gmail.com", "PE"
				, "Olinda", "Rio Doce",  "007" );
		
		Paciente p2 = new Paciente(null, "Juanita", sdf.parse("04/01/1993"), "987.654.321-18", "111111111111111", "(81)90000-0000", "Juanita@gmail.com", "PE"
				, "Recife", "Espinheiro",  "666" );
		
		Paciente p3 = new Paciente(null, "Clodovilda", sdf.parse("06/07/1967"), "456.123.789-47", "222222222222222", "(81)95555-5555", "Clodovilda@gmail.com", "PE"
				, "Recife", "Ibura",  "2000" );
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		*/
		
		// Procurando e removendo um paciente da base de dados;
		
		/*
		em.getTransaction().begin();
		Paciente p = em.find(Paciente.class, 3);
		em.remove(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
		*/
		
		// Atualizando um paciente da base de dados;
		
		/*
		em.getTransaction().begin();
		Paciente p = em.find(Paciente.class,2);
		p.setEmail("Juanita02@ig.com.br");
		em.getTransaction().commit();
		em.close();
		emf.close();
		*/
		
		}
}
