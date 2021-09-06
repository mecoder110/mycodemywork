package com.lti.gcp.restfulwebservices.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lti.gcp.restfulwebservices.exception.UserUnderstoodException;
import com.lti.gcp.restfulwebservices.model.Movie;
import com.lti.gcp.restfulwebservices.model.MovieDetail;

@Component
public class MovieDao {

	private static List<MovieDetail> movies = new ArrayList<>();
	private int count=3;
	static {
		
		movies.add(new MovieDetail(1, "3 idiot", 9.5f, 350));
		movies.add(new MovieDetail(2, "PK", 9.7f, 450));
		movies.add(new MovieDetail(3, "Tare Zameen Pey", 9.0f, 175));
	}
	
	//add new movie
	public String save(Movie movie) {
		int id=0;
		String status=null;
		if(movie.getId()==0)
			id=++count;
		else
			id=movie.getId();
		
		for(MovieDetail m : movies) {
			if(m.getName()!=movie.getName()) {
				status=m.getName()+" is already found, Dublicate is not allowed";
			}
		}
		
		movies.add(new MovieDetail(id, movie.getName(), movie.getRate(), movie.getPrice()));
	
		return status;
	}
	//list all movie
	public List<MovieDetail> getMovieList(){
		return movies;
	}
	
	
	//get specific movie
	public Movie getMovie(int id) {
		Movie movie=new Movie();
		for(MovieDetail m : movies) {
			if(m.getId()==id) {
				movie.setId(m.getId());
				movie.setName(m.getName());
				movie.setRate(m.getRate());
				movie.setPrice(m.getPrice());
			}
			else{
				//throw new UserUnderstoodException("Movie does not exist");
			}
			
		}			
				
		return movie;
	}
			
}
