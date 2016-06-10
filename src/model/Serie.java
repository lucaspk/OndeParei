package model;

import exceptions.*;

public class Serie {
	
	private String serieName, seasonNumber, episodeNumber;
		
	public Serie(String serieName, String seasonNumber, String episodeNumber) throws Exception {
		
		if(ChecagemDados.checkIfStringIsNullOrEmpty(serieName))
			throw new InvalidNameException();
		
		if(ChecagemDados.checkIfStringIsNullOrEmpty(seasonNumber) ||
				!ValidacaoDados.checkNumbersOnlyStringFormat(seasonNumber))
			throw new InvalidSerieDataException(seasonNumber,ValidacaoDados.getNumbersOnlyRegex());
		
		if(ChecagemDados.checkIfStringIsNullOrEmpty(episodeNumber) || 
				!ValidacaoDados.checkNumbersOnlyStringFormat(episodeNumber))
			throw new InvalidSerieDataException(episodeNumber,ValidacaoDados.getNumbersOnlyRegex());
		
		this.serieName = serieName;
		this.seasonNumber = seasonNumber;
		this.episodeNumber = episodeNumber;
	}
		
	public String getSerieName() {
		return serieName;
	}

	public void setSerieName(String serieName) {
		this.serieName = serieName;
	}

	public String getSeason() {
		return seasonNumber;
	}

	public void setSeason(String season) {
		this.seasonNumber = season;
	}

	public String getEpisode() {
		return episodeNumber;
	}

	public void setEpisode(String episode) {
		this.episodeNumber = episode;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Serie)){
			return false; 
		}
		Serie serie = (Serie) obj;
		return this.getSerieName().equals(serie.getSerieName()) &&
				this.getSeason().equals(serie.getSeason()) &&
				this.getEpisode().equals(getEpisode());
	}
	
	
}
