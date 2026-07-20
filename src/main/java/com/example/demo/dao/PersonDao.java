package com.example.demo.dao;


import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Person;


@Repository
public interface PersonDao  extends JpaRepository<Person, Integer>{

	//saveAll and findAllById avaialble in JpaRepository
	
	//And KeyWord
	public Person findByLastNameAndFirstName(String lastName,  String firstName);
	//select * from tbl_person where last_name = lastName and first_name = firstName 
	//ResultSet will be converted into Person class 
	
	//OR KeyWord 
	public Iterable<Person> findByLastNameOrFirstName(String lastName, String firstName);
	//select * from tbl_person where last_name = lastName and first_name = firsName;
	//ResultSet will be converted into Iterable<Person> Class
	
	//OrderBy KeyWord == sorts the data
	public Iterable<Person> findByLastNameOrderByCreatedDatesDesc(String lastName);
	// select * from tbl_person where last_name = lastName order by created_date desc
	
	//LessThanEquel KeWord 
	public Iterable<Person> findByAgeLessThanEqual(Integer age);
	//select * from tbl_person where age<=age
	
	//WildCard Search ==> '%input%';
	//Input String should contain % symbol based on the requirement
	public Iterable<Person> findByLastNameLike(String lastName);
	//select * from tbl_person where last_name = '%lastName%'
	
	public Iterable<Person> findByLastNameAndAgeLessThanEqual(String lastName, Integer age);
	
	
	//By Dates ===> Comparison between Dates
	public Iterable<Person> findByCreatedDatesBetween(Date startdate, Date endDate);
	
	
	
}
