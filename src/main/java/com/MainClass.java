package com;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {


		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();

        Author a1=new Author("sunita");  //java
        Author a2=new Author("anita");//java +python
        
        Author a3=new Author("raj");  //c +python
        Author a4=new Author("binita"); //java

        
        // creating empty  set of authers...

   Set<Author> javaAuthers= new HashSet<>();
   Set<Author> cAuthers= new HashSet<>();
   Set<Author> pythonAuthers= new HashSet<>();


         javaAuthers.add(a1);
          javaAuthers.add(a2);
          javaAuthers.add(a4);
   
   
           cAuthers.add(a3);
           
  
               pythonAuthers.add(a2);
                pythonAuthers.add(a3);
  
   //creating the object of book
   
   Book book1=new Book("java",javaAuthers);
   Book book2=new Book("c",cAuthers);
   Book book3=new Book("python",pythonAuthers);
   
       session.save(book1);
       session.save(book2);
       session.save(book3);
      
        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------  

	}

}
