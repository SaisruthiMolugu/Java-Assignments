package com.sruthi.hibernatedmo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sruthi.hibernate.dao.BookDAO;
import com.sruthi.hibernate.entity.Book;
import com.sruthi.hibernate.util.HibernateUtil;

public class AppTest {
public static void main (String[] args)
{
	SessionFactory factory = HibernateUtil.buildSessionFactory();
    Session session=factory.openSession();
    //Transaction trans = session.beginTransaction();
    BookDAO bdao = new BookDAO(factory);
   /* Book b1 = new Book("HFC","Head Fist C","David",700,10,"C");// to insert values
    session.save(b1);*/
   /* Book b= session.get(Book.class,"HFJ");
    if(b!=null)
 	   b.setBookAuthor("Herbert");
    System.out.println("is Session dirty "+session.isDirty());
    trans.commit();
    System.out.println("is Session dirty "+session.isDirty());*/// updating values
   
    Book b = bdao.getBook("LUC");
    if(b!=null)
    	System.out.println(b.getBookAuthor()+"  "+b.getBookCategory()+" "+b.getBookTitle()+" "+b.getBookPrice()+" "+b.getCopies());
    bdao.modifyBook(new Book("C","The Complete C","Yeshwanth",800,10,"C"));
  // bdao.DeleteBook(new Book("HFC"," "," ",0,0," "));
	Query qry = session.createSQLQuery("select * from Book"); // to get all entries
    	  List<Object[]> list =qry.getResultList();
    	  for(Object[] obj:list)
    	  {
    		  for(Object o:obj)
    			  System.out.print(o+"  ");
    		  System.out.println();
    	  }
    	  System.out.println(list);
    session.close(); 

    HibernateUtil.shutdown();
}
}
