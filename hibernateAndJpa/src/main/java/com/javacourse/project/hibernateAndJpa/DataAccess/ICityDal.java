package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.*;


public interface ICityDal {
	
	List<City> getAll();
	void Add (City city);
	void update (City city);
	void delete (City city);
	City getById(int id);
}
