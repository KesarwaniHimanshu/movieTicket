package com.app.service;

import com.app.exception.TheatreNotFoundException;
import com.app.pojo.Theatre;

import java.util.List;

public interface TheatreService {
	public List<Theatre> getAllTheatres() throws TheatreNotFoundException;

	public Theatre findTheatres(int theatreId);

	public Theatre addTheatre(Theatre t) throws TheatreNotFoundException;

	public List<Theatre> updateTheatre(Theatre t);

	public List<Theatre> deleteTheatreById(int theatreId);
	
	public List<Theatre> findTheatresByMovie(Integer movieId) throws TheatreNotFoundException;
}
