package globalda.xyz.user;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory();
         Session session = sessionFactory.openSession();  
         Transaction t = session.beginTransaction();  
       
       
         
         User usr = new User();
         usr.setFirstName("KKKK");    
         usr.setLastName("YYYY");  
         usr.setEmail("kk@gmail.com");
         session.save(usr);
         
         
         
         t.commit();
         session.close();  
	     sessionFactory.close();  
	      
	
		

	}

}
