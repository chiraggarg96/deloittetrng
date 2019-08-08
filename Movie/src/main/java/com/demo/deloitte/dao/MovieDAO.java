package com.demo.deloitte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.deloitte.model.Movie;
public interface MovieDAO extends CrudRepository<Movie, Integer> {


}
