package com.lti.gcp.restfulwebservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gcp.restfulwebservices.dao.MovieDao;
import com.lti.gcp.restfulwebservices.model.Movie;

@Service
public class MovieService {
	
	@Autowired
	private MovieDao dao;
	
	// specific movie
	public Movie getMovie(int id) {		
		return dao.getMovie(id);
		
	}
	//List of mvie
	 public List<Movie> getAll(){
		return  dao.getMovieList().stream().map(s->new Movie(s.getId(),s.getName(),s.getRate(),s.getPrice())).collect(Collectors.toList());
	 }
	 //add movie
	 public String addMovie(Movie movie) {
		 String c;
		c =dao.save(movie);
		movie.toString();
		 return c;
	 }
}
