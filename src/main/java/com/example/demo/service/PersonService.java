package com.example.demo.service;



import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.entity.Person;



@Service

public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	//SaveAll
	public Iterable<Person> saveAllPersons(Iterable<Person> personsData){
		return personDao.saveAll(personsData);
	}
	
	//FindAllById
	public Iterable<Person> findMultiplePersons(List<Integer> personIds){
		return personDao.findAllById(personIds);
	}
	
	public Iterable<Person> findByLastNameOrFirstName(String lastName, String firstName){
		return personDao.findByLastNameOrFirstName(lastName, firstName);
	}
	
	public Iterable<Person> findByAgeLessThanEqual(Integer age){
		return personDao.findByAgeLessThanEqual(age);
	}
	
	public Iterable<Person> findByNameOrderByCreatedDateDesc(String lastName){
		return personDao.findByLastNameOrderByCreatedDateDesc(lastName);
	}
	
	public Iterable<Person> findByLastNameLike(String lastName){
		return personDao.findByLastNameLike(lastName);
	}
	
	public Iterable<Person> findByLastNameAndAgeLessThanEqual(String lastName, Integer age){
		return personDao.findByLastNameAndAgeLessThanEqual(lastName, age);
	}
	
	public Iterable<Person> findByCreatedDatesBetween(Date startdate, Date enddate){
		return personDao.findByCreatedDateBetween(startdate, enddate);
	}
	
}
