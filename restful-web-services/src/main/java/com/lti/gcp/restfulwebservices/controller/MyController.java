package com.lti.gcp.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gcp.restfulwebservices.exception.UserUnderstoodException;
import com.lti.gcp.restfulwebservices.model.Movie;
import com.lti.gcp.restfulwebservices.service.MovieService;

@RestController
public class MyController {
	@Autowired
	private MovieService mService;

	@RequestMapping(method = RequestMethod.GET, value = "/movie")
	public String getMovieRate() {
		return "4.5 Stars";
	}

	@GetMapping(path = "/movie/detail/{id}")
	public Movie getDetail(@PathVariable int id) {		
		   Movie movie=mService.getMovie(id);
		   if(movie.getName()==null) {
			   throw new UserUnderstoodException("========>No movie Found<=======");
		   }
		   return movie;
	}

	@GetMapping( path = "/movie/detail") 
	public List<Movie> getList(){
		return mService.getAll();
	}

	@PostMapping(value = "/movie/add" /*consumes = "application/json"*/)
	public String addMovie(@RequestBody Movie m) {
		
		return mService.addMovie(m);		
	}
	/*@ExceptionHandler
	public String mapEmptyRecordFoundException() {
		return null;		
	}*/

}
