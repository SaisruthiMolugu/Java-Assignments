package com.sruthi.hibernate.entity;

public class Book 
{
     private String bookId;
     private String bookTitle;
     private String bookAuthor;
     private String bookCategory;
     private double bookPrice;
     private int copies;  
	public Book() {}
	public Book(String bookId, String bookTitle, String bookAuthor,  double bookPrice, int copies,String bookCategory) 
	{
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		
		this.bookPrice = bookPrice;
		this.copies = copies;
		this.bookCategory = bookCategory;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
     
     
     
}
