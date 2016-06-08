package model;

public class Livro {
	
	private String bookName, chapterNumber, pageNumber;
	
	public Livro(String bookName, String chapterNumber, String pageNumber) {
		this.bookName = bookName;
		this.chapterNumber = chapterNumber;
		this.pageNumber = pageNumber;
	}
	
	public Livro(String bookName, String pageNumber){
		this.bookName = bookName;
		this.pageNumber = pageNumber;
	}
	
	
}
