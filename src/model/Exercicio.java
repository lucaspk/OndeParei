package model;

public abstract class Exercicio {
	
	private String bookName/*a ideia de que o nome do livro, p�gina e cap�tulo sejam
	da subclasse*/, chapterNumber, pageNumber, exerciseNumber;
	
	public Exercicio(String exerciseNumber) {
		this.exerciseNumber = exerciseNumber;
	}
}
