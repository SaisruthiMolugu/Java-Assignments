package com.sruthi.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sruthi.hibernate.entity.Book;
public class BookDAO
{
    SessionFactory factory =null;
    public BookDAO(SessionFactory factory)
    {
    	this.factory=factory;
    }
    public void insertBook(Book book)
    {
    	Session session = factory.openSession();
    	Transaction trans = session.beginTransaction();
    	try
    	{
    		session.save(book);
    		trans.commit();
    	}
    	catch(Exception ex)
    	{
    		trans.rollback();
    		ex.printStackTrace();
    	}
    }
    public void DeleteBook(Book book)
    {
    	Session session = factory.openSession();
    	Transaction trans = session.beginTransaction();
    	try
    	{
    		session.delete(book);
    		trans.commit();
    	}
    	catch(Exception ex)
    	{
    		trans.rollback();
    		ex.printStackTrace();
    	}
    }
    public void modifyBook(Book book)
    {
    	Session session = factory.openSession();
    	Transaction trans = session.beginTransaction();
    	try
    	{
    		session.update(book);
    		trans.commit();
    	}
    	catch(Exception ex)
    	{
    		trans.rollback();
    		ex.printStackTrace();
    	}
    }
    public Book getBook(String bookid)
    {
    	Session session = factory.openSession();
    	return session.get(Book.class, bookid);
    			}
    
}