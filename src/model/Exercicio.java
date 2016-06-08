package model;

public abstract class Exercicio {
	
	private String bookName/*a ideia de que o nome do livro, página e capítulo sejam
	da subclasse*/, chapterNumber, pageNumber, exerciseNumber;
	
	public Exercicio(String exerciseNumber) {
		this.exerciseNumber = exerciseNumber;
	}
}
