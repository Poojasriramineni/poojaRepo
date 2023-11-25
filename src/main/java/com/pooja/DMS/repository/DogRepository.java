package com.pooja.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.pooja.DMS.Models.Dog;


/*
 * @author - Pooja Sri Ramineni
 */

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);
}
